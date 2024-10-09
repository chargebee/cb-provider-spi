import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class JsonSchemaValidator {
    private static int index = 0;
    private static String json;

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java JsonSchemaValidator <schema_file> <json_file>");
            System.exit(1);
        }

        String schemaFile = args[0];
        String jsonFile = args[1];

        try {
            String schemaContent = readFile(schemaFile);
            String jsonContent = readFile(jsonFile);

            Map<String, Object> schema = parseJson(schemaContent);
            Map<String, Object> json = parseJson(jsonContent);

            List<String> errors = validateJson(schema, json, "$");
            if (errors.isEmpty()) {
                System.out.println("Success: The JSON content is valid against the schema.");
            } else {
                System.out.println("Validation Error(s):");
                for (String error : errors) {
                    System.out.println("- " + error);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (JsonParseException e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
        }
        return content.toString();
    }

    private static Map<String, Object> parseJson(String jsonStr) throws JsonParseException {
        json = jsonStr.trim();
        index = 0;
        if (!json.startsWith("{") || !json.endsWith("}")) {
            throw new JsonParseException("Invalid JSON object");
        }
        return parseObject();
    }

    private static Map<String, Object> parseObject() throws JsonParseException {
        Map<String, Object> result = new HashMap<>();
        index++; // Skip opening '{'
        skipWhitespace();

        while (index < json.length() && json.charAt(index) != '}') {
            String key = parseString();
            skipWhitespace();

            if (index >= json.length() || json.charAt(index) != ':') {
                throw new JsonParseException("Expected ':' after key in object");
            }
            index++; // Skip ':'
            skipWhitespace();

            Object value = parseValue();
            result.put(key, value);

            skipWhitespace();
            if (index < json.length() && json.charAt(index) == ',') {
                index++;
                skipWhitespace();
            }
        }

        if (index >= json.length() || json.charAt(index) != '}') {
            throw new JsonParseException("Unterminated object");
        }
        index++; // Skip closing '}'
        return result;
    }

    private static Object parseValue() throws JsonParseException {
        skipWhitespace();
        char c = json.charAt(index);
        if (c == '"') {
            return parseString();
        } else if (c == '{') {
            return parseObject();
        } else if (c == '[') {
            return parseArray();
        } else if (c == 't' && json.startsWith("true", index)) {
            index += 4;
            return true;
        } else if (c == 'f' && json.startsWith("false", index)) {
            index += 5;
            return false;
        } else if (c == 'n' && json.startsWith("null", index)) {
            index += 4;
            return null;
        } else if (c == '-' || (c >= '0' && c <= '9')) {
            return parseNumber();
        }
        throw new JsonParseException("Unexpected character in JSON: " + c);
    }

    private static String parseString() throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        index++; // Skip opening quote
        while (index < json.length()) {
            char c = json.charAt(index++);
            if (c == '"') {
                return sb.toString();
            } else if (c == '\\') {
                if (index >= json.length()) {
                    throw new JsonParseException("Unterminated string");
                }
                c = json.charAt(index++);
                switch (c) {
                    case '"':
                    case '\\':
                    case '/':
                        sb.append(c);
                        break;
                    case 'b':
                        sb.append('\b');
                        break;
                    case 'f':
                        sb.append('\f');
                        break;
                    case 'n':
                        sb.append('\n');
                        break;
                    case 'r':
                        sb.append('\r');
                        break;
                    case 't':
                        sb.append('\t');
                        break;
                    default:
                        throw new JsonParseException("Invalid escape sequence: \\" + c);
                }
            } else {
                sb.append(c);
            }
        }
        throw new JsonParseException("Unterminated string");
    }

    private static List<Object> parseArray() throws JsonParseException {
        List<Object> result = new ArrayList<>();
        index++; // Skip opening '['
        skipWhitespace();

        while (index < json.length() && json.charAt(index) != ']') {
            result.add(parseValue());
            skipWhitespace();
            if (index < json.length() && json.charAt(index) == ',') {
                index++;
                skipWhitespace();
            }
        }

        if (index >= json.length() || json.charAt(index) != ']') {
            throw new JsonParseException("Unterminated array");
        }
        index++; // Skip closing ']'
        return result;
    }

    private static Double parseNumber() throws JsonParseException {
        int start = index;
        while (index < json.length()) {
            char c = json.charAt(index);
            if ((c >= '0' && c <= '9') || c == '-' || c == '+' || c == '.' || c == 'e' || c == 'E') {
                index++;
            } else {
                break;
            }
        }
        try {
            return Double.parseDouble(json.substring(start, index));
        } catch (NumberFormatException e) {
            throw new JsonParseException("Invalid number format");
        }
    }

    private static void skipWhitespace() {
        while (index < json.length() && Character.isWhitespace(json.charAt(index))) {
            index++;
        }
    }

    private static List<String> validateJson(Map<String, Object> schema, Map<String, Object> json, String path) {
        List<String> errors = new ArrayList<>();

        if (schema.containsKey("additionalProperties") && !(boolean)schema.get("additionalProperties")) {
            Set<String> allowedProperties = ((Map<String, Object>) schema.get("properties")).keySet();
            for (String key : json.keySet()) {
                if (!allowedProperties.contains(key)) {
                    errors.add(path + ": Additional property '" + key + "' is not allowed");
                }
            }
        }

        for (Map.Entry<String, Object> entry : schema.entrySet()) {
            String key = entry.getKey();
            Object schemaValue = entry.getValue();

            if (schemaValue instanceof Map) {
                Map<String, Object> schemaObject = (Map<String, Object>) schemaValue;
                String type = (String) schemaObject.get("type");
                Object jsonValue = json.get(key);

                String currentPath = path + "." + key;

                if (jsonValue == null) {
                    if (schemaObject.containsKey("required") && (boolean) schemaObject.get("required")) {
                        errors.add(currentPath + ": Required field is missing");
                    }
                    continue;
                }

                switch (type) {
                    case "string":
                        if (!(jsonValue instanceof String)) {
                            errors.add(currentPath + ": Expected string, got " + jsonValue.getClass().getSimpleName());
                        } else {
                            String stringValue = (String) jsonValue;
                            if (schemaObject.containsKey("pattern")) {
                                String pattern = (String) schemaObject.get("pattern");
                                if (!Pattern.matches(pattern, stringValue)) {
                                    errors.add(currentPath + ": Does not match pattern " + pattern);
                                }
                            }
                            if (schemaObject.containsKey("minLength")) {
                                int minLength = (int) schemaObject.get("minLength");
                                if (stringValue.length() < minLength) {
                                    errors.add(currentPath + ": String length is less than minLength " + minLength);
                                }
                            }
                            if (schemaObject.containsKey("maxLength")) {
                                int maxLength = (int) schemaObject.get("maxLength");
                                if (stringValue.length() > maxLength) {
                                    errors.add(currentPath + ": String length is greater than maxLength " + maxLength);
                                }
                            }
                            if (schemaObject.containsKey("enum")) {
                                List<String> enumValues = (List<String>) schemaObject.get("enum");
                                if (!enumValues.contains(stringValue)) {
                                    errors.add(currentPath + ": Value is not in enum " + enumValues);
                                }
                            }
                        }
                        break;
                    case "number":
                        if (!(jsonValue instanceof Number)) {
                            errors.add(currentPath + ": Expected number, got " + jsonValue.getClass().getSimpleName());
                        }
                        break;

                    case "integer":
                        if (!(jsonValue instanceof Number)) {
                            errors.add(currentPath + ": Expected number, got " + jsonValue.getClass().getSimpleName());
                        } else {
                            double numberValue = ((Number) jsonValue).doubleValue();
                            if (schemaObject.containsKey("minimum")) {
                                double minimum = ((Number) schemaObject.get("minimum")).doubleValue();
                                if (numberValue < minimum) {
                                    errors.add(currentPath + ": Value is less than minimum " + minimum);
                                }
                            }
                            if (schemaObject.containsKey("maximum")) {
                                double maximum = ((Number) schemaObject.get("maximum")).doubleValue();
                                if (numberValue > maximum) {
                                    errors.add(currentPath + ": Value is greater than maximum " + maximum);
                                }
                            }
                        }
                        break;
                    case "boolean":
                        if (!(jsonValue instanceof Boolean)) {
                            errors.add(currentPath + ": Expected boolean, got " + jsonValue.getClass().getSimpleName());
                        }
                        break;
                    case "object":
                        if (!(jsonValue instanceof Map)) {
                            errors.add(currentPath + ": Expected object, got " + jsonValue.getClass().getSimpleName());
                        } else if (schemaObject.containsKey("properties")) {
                            Map<String, Object> properties = (Map<String, Object>) schemaObject.get("properties");
                            errors.addAll(validateJson(properties, (Map<String, Object>) jsonValue, currentPath));
                        }
                        break;
                    case "array":
                        if (!(jsonValue instanceof List)) {
                            errors.add(currentPath + ": Expected array, got " + jsonValue.getClass().getSimpleName());
                        } else {
                            List<Object> jsonArray = (List<Object>) jsonValue;
                            if (schemaObject.containsKey("items")) {
                                Map<String, Object> itemsSchema = (Map<String, Object>) schemaObject.get("items");
                                for (int i = 0; i < jsonArray.size(); i++) {
                                    if (itemsSchema.containsKey("type") && itemsSchema.get("type").equals("object")) {
                                        errors.addAll(validateJson(itemsSchema, (Map<String, Object>) jsonArray.get(i), currentPath + "[" + i + "]"));
                                    }
                                }
                            }
                            if (schemaObject.containsKey("minItems")) {
                                int minItems = (int) schemaObject.get("minItems");
                                if (jsonArray.size() < minItems) {
                                    errors.add(currentPath + ": Array has fewer than minItems " + minItems);
                                }
                            }
                            if (schemaObject.containsKey("maxItems")) {
                                int maxItems = (int) schemaObject.get("maxItems");
                                if (jsonArray.size() > maxItems) {
                                    errors.add(currentPath + ": Array has more than maxItems " + maxItems);
                                }
                            }
                            if (schemaObject.containsKey("uniqueItems") && (boolean) schemaObject.get("uniqueItems")) {
                                Set<Object> uniqueItems = new HashSet<>(jsonArray);
                                if (uniqueItems.size() != jsonArray.size()) {
                                    errors.add(currentPath + ": Array contains non-unique items");
                                }
                            }
                        }
                        break;
                }
            }
        }

        return errors;
    }

    private static class JsonParseException extends Exception {
        public JsonParseException(String message) {
            super(message);
        }
    }
}

package com.example.model.openapilocationvalidationyml;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FieldItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:38.152028+05:30[Asia/Kolkata]")
public class FieldItem {

  private String id;

  private String value;

  public FieldItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldItem(String id, String value) {
    this.id = id;
    this.value = value;
  }

  public FieldItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the field.
   * @return id
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "id", description = "The id of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the field.
   * @return value
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "value", description = "The value of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldItem fieldItem = (FieldItem) o;
    return Objects.equals(this.id, fieldItem.id) &&
        Objects.equals(this.value, fieldItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


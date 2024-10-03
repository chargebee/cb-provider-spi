package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.ErrorCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ValidationErrorResponseErrorsInner
 */

@JsonTypeName("ValidationErrorResponse_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class ValidationErrorResponseErrorsInner {

  private String entity;

  private String entityField;

  private ErrorCode code;

  private String message;

  private URI helpUrl;

  public ValidationErrorResponseErrorsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidationErrorResponseErrorsInner(ErrorCode code, String message) {
    this.code = code;
    this.message = message;
  }

  public ValidationErrorResponseErrorsInner entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The target entity that has the invalid field or value.
   * @return entity
  */
  @Size(max = 20) 
  @Schema(name = "entity", example = "customer", description = "The target entity that has the invalid field or value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public ValidationErrorResponseErrorsInner entityField(String entityField) {
    this.entityField = entityField;
    return this;
  }

  /**
   * The field of an entity that has the invalid value.
   * @return entityField
  */
  @Size(max = 250) 
  @Schema(name = "entityField", example = "lineItems[0].taxIdentifiers[0].value", description = "The field of an entity that has the invalid value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityField")
  public String getEntityField() {
    return entityField;
  }

  public void setEntityField(String entityField) {
    this.entityField = entityField;
  }

  public ValidationErrorResponseErrorsInner code(ErrorCode code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @NotNull @Valid 
  @Schema(name = "code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public ErrorCode getCode() {
    return code;
  }

  public void setCode(ErrorCode code) {
    this.code = code;
  }

  public ValidationErrorResponseErrorsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A short message describing the reason for the error.
   * @return message
  */
  @NotNull @Size(max = 250) 
  @Schema(name = "message", example = "Invalid tax code provided.", description = "A short message describing the reason for the error.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationErrorResponseErrorsInner helpUrl(URI helpUrl) {
    this.helpUrl = helpUrl;
    return this;
  }

  /**
   * The link to the documentation for more information about the error and the corrective action.
   * @return helpUrl
  */
  @Valid 
  @Schema(name = "helpUrl", example = "https://apidocs.chargebee.com#Authentication", description = "The link to the documentation for more information about the error and the corrective action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpUrl")
  public URI getHelpUrl() {
    return helpUrl;
  }

  public void setHelpUrl(URI helpUrl) {
    this.helpUrl = helpUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorResponseErrorsInner validationErrorResponseErrorsInner = (ValidationErrorResponseErrorsInner) o;
    return Objects.equals(this.entity, validationErrorResponseErrorsInner.entity) &&
        Objects.equals(this.entityField, validationErrorResponseErrorsInner.entityField) &&
        Objects.equals(this.code, validationErrorResponseErrorsInner.code) &&
        Objects.equals(this.message, validationErrorResponseErrorsInner.message) &&
        Objects.equals(this.helpUrl, validationErrorResponseErrorsInner.helpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, entityField, code, message, helpUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorResponseErrorsInner {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    entityField: ").append(toIndentedString(entityField)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    helpUrl: ").append(toIndentedString(helpUrl)).append("\n");
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


package com.example.model.openapilocationvalidationyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapilocationvalidationyml.ErrorCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LocationValidateErrorResponseErrorsInner
 */

@JsonTypeName("LocationValidateErrorResponse_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:38.152028+05:30[Asia/Kolkata]")
public class LocationValidateErrorResponseErrorsInner {

  private String entity;

  private String entityField;

  private ErrorCode code;

  private String message;

  private String helpUrl;

  public LocationValidateErrorResponseErrorsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationValidateErrorResponseErrorsInner(ErrorCode code, String message) {
    this.code = code;
    this.message = message;
  }

  public LocationValidateErrorResponseErrorsInner entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The target entity that has the invalid field or value.
   * @return entity
  */
  @Size(max = 250) 
  @Schema(name = "entity", example = "Evidence", description = "The target entity that has the invalid field or value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public LocationValidateErrorResponseErrorsInner entityField(String entityField) {
    this.entityField = entityField;
    return this;
  }

  /**
   * The field of an entity that has the invalid value.
   * @return entityField
  */
  @Size(max = 250) 
  @Schema(name = "entityField", example = "Evidence", description = "The field of an entity that has the invalid value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityField")
  public String getEntityField() {
    return entityField;
  }

  public void setEntityField(String entityField) {
    this.entityField = entityField;
  }

  public LocationValidateErrorResponseErrorsInner code(ErrorCode code) {
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

  public LocationValidateErrorResponseErrorsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A short message describing the reason for the error.
   * @return message
  */
  @NotNull @Size(max = 250) 
  @Schema(name = "message", example = "Could not resolve location from the given evidences. Address is in FR, IP is in US, phone is in India.", description = "A short message describing the reason for the error.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LocationValidateErrorResponseErrorsInner helpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
    return this;
  }

  /**
   * The link to the documentation for more information about the error and the corrective action.
   * @return helpUrl
  */
  
  @Schema(name = "helpUrl", example = "https://apidocs.chargebee.com#Location", description = "The link to the documentation for more information about the error and the corrective action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpUrl")
  public String getHelpUrl() {
    return helpUrl;
  }

  public void setHelpUrl(String helpUrl) {
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
    LocationValidateErrorResponseErrorsInner locationValidateErrorResponseErrorsInner = (LocationValidateErrorResponseErrorsInner) o;
    return Objects.equals(this.entity, locationValidateErrorResponseErrorsInner.entity) &&
        Objects.equals(this.entityField, locationValidateErrorResponseErrorsInner.entityField) &&
        Objects.equals(this.code, locationValidateErrorResponseErrorsInner.code) &&
        Objects.equals(this.message, locationValidateErrorResponseErrorsInner.message) &&
        Objects.equals(this.helpUrl, locationValidateErrorResponseErrorsInner.helpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, entityField, code, message, helpUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationValidateErrorResponseErrorsInner {\n");
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


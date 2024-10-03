package com.example.model.openapitrnyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitrnyml.ErrorCode;
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
 * TrnValidateErrorResponseErrorsInner
 */

@JsonTypeName("TrnValidateErrorResponse_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class TrnValidateErrorResponseErrorsInner {

  private String field;

  private ErrorCode code;

  private String message;

  private String helpUrl;

  public TrnValidateErrorResponseErrorsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrnValidateErrorResponseErrorsInner(ErrorCode code, String message) {
    this.code = code;
    this.message = message;
  }

  public TrnValidateErrorResponseErrorsInner field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field of an entity that has the invalid value.
   * @return field
  */
  @Size(max = 250) 
  @Schema(name = "field", example = "trn", description = "The field of an entity that has the invalid value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public TrnValidateErrorResponseErrorsInner code(ErrorCode code) {
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

  public TrnValidateErrorResponseErrorsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A short message describing the reason for the error.
   * @return message
  */
  @NotNull @Size(max = 250) 
  @Schema(name = "message", example = "Tax registration number is missing.", description = "A short message describing the reason for the error.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TrnValidateErrorResponseErrorsInner helpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
    return this;
  }

  /**
   * The link to the documentation for more information about the error and the corrective action.
   * @return helpUrl
  */
  
  @Schema(name = "helpUrl", example = "https://apidocs.chargebee.com#Authentication", description = "The link to the documentation for more information about the error and the corrective action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TrnValidateErrorResponseErrorsInner trnValidateErrorResponseErrorsInner = (TrnValidateErrorResponseErrorsInner) o;
    return Objects.equals(this.field, trnValidateErrorResponseErrorsInner.field) &&
        Objects.equals(this.code, trnValidateErrorResponseErrorsInner.code) &&
        Objects.equals(this.message, trnValidateErrorResponseErrorsInner.message) &&
        Objects.equals(this.helpUrl, trnValidateErrorResponseErrorsInner.helpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, code, message, helpUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnValidateErrorResponseErrorsInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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


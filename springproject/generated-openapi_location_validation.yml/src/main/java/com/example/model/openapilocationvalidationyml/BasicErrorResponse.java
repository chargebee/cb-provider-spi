package com.example.model.openapilocationvalidationyml;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The basic error response containing the error message and the help documentation link.
 */

@Schema(name = "BasicErrorResponse", description = "The basic error response containing the error message and the help documentation link.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:38.152028+05:30[Asia/Kolkata]")
public class BasicErrorResponse {

  private String message;

  private URI helpUrl;

  public BasicErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BasicErrorResponse(String message) {
    this.message = message;
  }

  public BasicErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The description of the error with details about it's cause.
   * @return message
  */
  @NotNull @Size(max = 250) 
  @Schema(name = "message", example = "Invalid Credentials", description = "The description of the error with details about it's cause.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BasicErrorResponse helpUrl(URI helpUrl) {
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
    BasicErrorResponse basicErrorResponse = (BasicErrorResponse) o;
    return Objects.equals(this.message, basicErrorResponse.message) &&
        Objects.equals(this.helpUrl, basicErrorResponse.helpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, helpUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicErrorResponse {\n");
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


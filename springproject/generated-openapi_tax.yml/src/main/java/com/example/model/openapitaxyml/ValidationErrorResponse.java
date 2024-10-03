package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.ValidationErrorResponseErrorsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The error response for validation errors with the respective entity and its field information.
 */

@Schema(name = "ValidationErrorResponse", description = "The error response for validation errors with the respective entity and its field information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class ValidationErrorResponse {

  @Valid
  private List<@Valid ValidationErrorResponseErrorsInner> errors = new ArrayList<>();

  public ValidationErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidationErrorResponse(List<@Valid ValidationErrorResponseErrorsInner> errors) {
    this.errors = errors;
  }

  public ValidationErrorResponse errors(List<@Valid ValidationErrorResponseErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationErrorResponse addErrorsItem(ValidationErrorResponseErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ValidationErrorResponseErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ValidationErrorResponseErrorsInner> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorResponse validationErrorResponse = (ValidationErrorResponse) o;
    return Objects.equals(this.errors, validationErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


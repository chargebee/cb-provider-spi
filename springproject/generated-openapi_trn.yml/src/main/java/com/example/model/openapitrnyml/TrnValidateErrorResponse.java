package com.example.model.openapitrnyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitrnyml.TrnValidateErrorResponseErrorsInner;
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
 * Defined the structure for validation error of tax registration number validation.
 */

@Schema(name = "TrnValidateErrorResponse", description = "Defined the structure for validation error of tax registration number validation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class TrnValidateErrorResponse {

  @Valid
  private List<@Valid TrnValidateErrorResponseErrorsInner> errors = new ArrayList<>();

  public TrnValidateErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrnValidateErrorResponse(List<@Valid TrnValidateErrorResponseErrorsInner> errors) {
    this.errors = errors;
  }

  public TrnValidateErrorResponse errors(List<@Valid TrnValidateErrorResponseErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public TrnValidateErrorResponse addErrorsItem(TrnValidateErrorResponseErrorsInner errorsItem) {
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
  public List<@Valid TrnValidateErrorResponseErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid TrnValidateErrorResponseErrorsInner> errors) {
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
    TrnValidateErrorResponse trnValidateErrorResponse = (TrnValidateErrorResponse) o;
    return Objects.equals(this.errors, trnValidateErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnValidateErrorResponse {\n");
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


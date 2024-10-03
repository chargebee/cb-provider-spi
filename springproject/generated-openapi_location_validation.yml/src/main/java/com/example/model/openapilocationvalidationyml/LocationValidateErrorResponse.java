package com.example.model.openapilocationvalidationyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapilocationvalidationyml.LocationValidateErrorResponseErrorsInner;
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
 * Defined the structure for validation error of location validation.
 */

@Schema(name = "LocationValidateErrorResponse", description = "Defined the structure for validation error of location validation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:38.152028+05:30[Asia/Kolkata]")
public class LocationValidateErrorResponse {

  @Valid
  private List<@Valid LocationValidateErrorResponseErrorsInner> errors = new ArrayList<>();

  public LocationValidateErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationValidateErrorResponse(List<@Valid LocationValidateErrorResponseErrorsInner> errors) {
    this.errors = errors;
  }

  public LocationValidateErrorResponse errors(List<@Valid LocationValidateErrorResponseErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public LocationValidateErrorResponse addErrorsItem(LocationValidateErrorResponseErrorsInner errorsItem) {
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
  public List<@Valid LocationValidateErrorResponseErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid LocationValidateErrorResponseErrorsInner> errors) {
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
    LocationValidateErrorResponse locationValidateErrorResponse = (LocationValidateErrorResponse) o;
    return Objects.equals(this.errors, locationValidateErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationValidateErrorResponse {\n");
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


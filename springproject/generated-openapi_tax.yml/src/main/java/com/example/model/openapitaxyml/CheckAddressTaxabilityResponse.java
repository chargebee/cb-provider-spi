package com.example.model.openapitaxyml;

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
 * CheckAddressTaxabilityResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class CheckAddressTaxabilityResponse {

  private Boolean isTaxable;

  public CheckAddressTaxabilityResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CheckAddressTaxabilityResponse(Boolean isTaxable) {
    this.isTaxable = isTaxable;
  }

  public CheckAddressTaxabilityResponse isTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
    return this;
  }

  /**
   * The taxability of the address.
   * @return isTaxable
  */
  @NotNull 
  @Schema(name = "isTaxable", description = "The taxability of the address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isTaxable")
  public Boolean getIsTaxable() {
    return isTaxable;
  }

  public void setIsTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckAddressTaxabilityResponse checkAddressTaxabilityResponse = (CheckAddressTaxabilityResponse) o;
    return Objects.equals(this.isTaxable, checkAddressTaxabilityResponse.isTaxable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTaxable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckAddressTaxabilityResponse {\n");
    sb.append("    isTaxable: ").append(toIndentedString(isTaxable)).append("\n");
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


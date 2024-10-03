package com.example.model.openapilocationvalidationyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapilocationvalidationyml.EvidenceOrigin;
import com.example.model.openapilocationvalidationyml.LocationValidationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the required properties for location validation response
 */

@Schema(name = "LocationValidateResponse", description = "Contains the required properties for location validation response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:38.152028+05:30[Asia/Kolkata]")
public class LocationValidateResponse {

  private LocationValidationStatus status;

  private String sourceCountry;

  private EvidenceOrigin evidenceOrigin;

  public LocationValidateResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationValidateResponse(LocationValidationStatus status, EvidenceOrigin evidenceOrigin) {
    this.status = status;
    this.evidenceOrigin = evidenceOrigin;
  }

  public LocationValidateResponse status(LocationValidationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public LocationValidationStatus getStatus() {
    return status;
  }

  public void setStatus(LocationValidationStatus status) {
    this.status = status;
  }

  public LocationValidateResponse sourceCountry(String sourceCountry) {
    this.sourceCountry = sourceCountry;
    return this;
  }

  /**
   * SIngle country identified as location of Customer
   * @return sourceCountry
  */
  
  @Schema(name = "sourceCountry", description = "SIngle country identified as location of Customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceCountry")
  public String getSourceCountry() {
    return sourceCountry;
  }

  public void setSourceCountry(String sourceCountry) {
    this.sourceCountry = sourceCountry;
  }

  public LocationValidateResponse evidenceOrigin(EvidenceOrigin evidenceOrigin) {
    this.evidenceOrigin = evidenceOrigin;
    return this;
  }

  /**
   * Get evidenceOrigin
   * @return evidenceOrigin
  */
  @NotNull @Valid 
  @Schema(name = "evidenceOrigin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evidenceOrigin")
  public EvidenceOrigin getEvidenceOrigin() {
    return evidenceOrigin;
  }

  public void setEvidenceOrigin(EvidenceOrigin evidenceOrigin) {
    this.evidenceOrigin = evidenceOrigin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationValidateResponse locationValidateResponse = (LocationValidateResponse) o;
    return Objects.equals(this.status, locationValidateResponse.status) &&
        Objects.equals(this.sourceCountry, locationValidateResponse.sourceCountry) &&
        Objects.equals(this.evidenceOrigin, locationValidateResponse.evidenceOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, sourceCountry, evidenceOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationValidateResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sourceCountry: ").append(toIndentedString(sourceCountry)).append("\n");
    sb.append("    evidenceOrigin: ").append(toIndentedString(evidenceOrigin)).append("\n");
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


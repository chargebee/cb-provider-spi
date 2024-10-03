package com.example.model.openapitrnyml;

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
 * Contains required properties for batch request
 */

@Schema(name = "BatchRequest", description = "Contains required properties for batch request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class BatchRequest {

  private String batchName;

  private String externalId;

  public BatchRequest batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

  /**
   * Name of the batch
   * @return batchName
  */
  
  @Schema(name = "batchName", description = "Name of the batch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchName")
  public String getBatchName() {
    return batchName;
  }

  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }

  public BatchRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Way to relate the request for future reference. Hold the reference value passed in request, expecting the same would be returned in response.
   * @return externalId
  */
  
  @Schema(name = "externalId", description = "Way to relate the request for future reference. Hold the reference value passed in request, expecting the same would be returned in response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequest batchRequest = (BatchRequest) o;
    return Objects.equals(this.batchName, batchRequest.batchName) &&
        Objects.equals(this.externalId, batchRequest.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchName, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequest {\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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


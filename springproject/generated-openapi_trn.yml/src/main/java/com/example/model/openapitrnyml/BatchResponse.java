package com.example.model.openapitrnyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitrnyml.Status;
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
 * Contains the required properties for response of batch request.
 */

@Schema(name = "BatchResponse", description = "Contains the required properties for response of batch request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class BatchResponse {

  private String batchId;

  private String batchName;

  private Status status;

  private Integer limit;

  private Integer offset;

  private Integer completionPercentage;

  private String externalId;

  public BatchResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BatchResponse(String batchId, Status status, Integer limit, Integer offset) {
    this.batchId = batchId;
    this.status = status;
    this.limit = limit;
    this.offset = offset;
  }

  public BatchResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Id of the batch request.
   * @return batchId
  */
  @NotNull 
  @Schema(name = "batchId", description = "Id of the batch request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public BatchResponse batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

  /**
   * Name of the batch request.
   * @return batchName
  */
  
  @Schema(name = "batchName", description = "Name of the batch request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchName")
  public String getBatchName() {
    return batchName;
  }

  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }

  public BatchResponse status(Status status) {
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
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public BatchResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Use for the pagination for batch request, limit indicates the maximum number of records to be returned in the response.
   * @return limit
  */
  @NotNull 
  @Schema(name = "limit", description = "Use for the pagination for batch request, limit indicates the maximum number of records to be returned in the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public BatchResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Use for the pagination for batch request, offset indicates the starting point of records to be returned in the response.
   * @return offset
  */
  @NotNull 
  @Schema(name = "offset", description = "Use for the pagination for batch request, offset indicates the starting point of records to be returned in the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public BatchResponse completionPercentage(Integer completionPercentage) {
    this.completionPercentage = completionPercentage;
    return this;
  }

  /**
   * Percentage of batch request processing.
   * @return completionPercentage
  */
  
  @Schema(name = "completionPercentage", description = "Percentage of batch request processing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completionPercentage")
  public Integer getCompletionPercentage() {
    return completionPercentage;
  }

  public void setCompletionPercentage(Integer completionPercentage) {
    this.completionPercentage = completionPercentage;
  }

  public BatchResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The externalId passed in request.
   * @return externalId
  */
  
  @Schema(name = "externalId", description = "The externalId passed in request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BatchResponse batchResponse = (BatchResponse) o;
    return Objects.equals(this.batchId, batchResponse.batchId) &&
        Objects.equals(this.batchName, batchResponse.batchName) &&
        Objects.equals(this.status, batchResponse.status) &&
        Objects.equals(this.limit, batchResponse.limit) &&
        Objects.equals(this.offset, batchResponse.offset) &&
        Objects.equals(this.completionPercentage, batchResponse.completionPercentage) &&
        Objects.equals(this.externalId, batchResponse.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchName, status, limit, offset, completionPercentage, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponse {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
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


package com.example.model.openapitrnyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitrnyml.Status;
import com.example.model.openapitrnyml.TrnValidateResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * TrnValidateBatchResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class TrnValidateBatchResponse {

  private String batchId;

  private String batchName;

  private Status status;

  private Integer limit;

  private Integer offset;

  private Integer completionPercentage;

  private String externalId;

  @Valid
  private List<@Valid TrnValidateResponse> trns = new ArrayList<>();

  public TrnValidateBatchResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrnValidateBatchResponse(String batchId, Status status, Integer limit, Integer offset, List<@Valid TrnValidateResponse> trns) {
    this.batchId = batchId;
    this.status = status;
    this.limit = limit;
    this.offset = offset;
    this.trns = trns;
  }

  public TrnValidateBatchResponse batchId(String batchId) {
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

  public TrnValidateBatchResponse batchName(String batchName) {
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

  public TrnValidateBatchResponse status(Status status) {
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

  public TrnValidateBatchResponse limit(Integer limit) {
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

  public TrnValidateBatchResponse offset(Integer offset) {
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

  public TrnValidateBatchResponse completionPercentage(Integer completionPercentage) {
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

  public TrnValidateBatchResponse externalId(String externalId) {
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

  public TrnValidateBatchResponse trns(List<@Valid TrnValidateResponse> trns) {
    this.trns = trns;
    return this;
  }

  public TrnValidateBatchResponse addTrnsItem(TrnValidateResponse trnsItem) {
    if (this.trns == null) {
      this.trns = new ArrayList<>();
    }
    this.trns.add(trnsItem);
    return this;
  }

  /**
   * List of tax registration numbers
   * @return trns
  */
  @NotNull @Valid 
  @Schema(name = "trns", description = "List of tax registration numbers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trns")
  public List<@Valid TrnValidateResponse> getTrns() {
    return trns;
  }

  public void setTrns(List<@Valid TrnValidateResponse> trns) {
    this.trns = trns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrnValidateBatchResponse trnValidateBatchResponse = (TrnValidateBatchResponse) o;
    return Objects.equals(this.batchId, trnValidateBatchResponse.batchId) &&
        Objects.equals(this.batchName, trnValidateBatchResponse.batchName) &&
        Objects.equals(this.status, trnValidateBatchResponse.status) &&
        Objects.equals(this.limit, trnValidateBatchResponse.limit) &&
        Objects.equals(this.offset, trnValidateBatchResponse.offset) &&
        Objects.equals(this.completionPercentage, trnValidateBatchResponse.completionPercentage) &&
        Objects.equals(this.externalId, trnValidateBatchResponse.externalId) &&
        Objects.equals(this.trns, trnValidateBatchResponse.trns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchName, status, limit, offset, completionPercentage, externalId, trns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnValidateBatchResponse {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    trns: ").append(toIndentedString(trns)).append("\n");
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


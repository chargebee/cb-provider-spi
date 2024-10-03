package com.example.model.openapitrnyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitrnyml.TrnValidateRequest;
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
 * TrnValidateBatchRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class TrnValidateBatchRequest {

  private String batchName;

  private String externalId;

  @Valid
  private List<@Valid TrnValidateRequest> trns = new ArrayList<>();

  public TrnValidateBatchRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrnValidateBatchRequest(List<@Valid TrnValidateRequest> trns) {
    this.trns = trns;
  }

  public TrnValidateBatchRequest batchName(String batchName) {
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

  public TrnValidateBatchRequest externalId(String externalId) {
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

  public TrnValidateBatchRequest trns(List<@Valid TrnValidateRequest> trns) {
    this.trns = trns;
    return this;
  }

  public TrnValidateBatchRequest addTrnsItem(TrnValidateRequest trnsItem) {
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
  public List<@Valid TrnValidateRequest> getTrns() {
    return trns;
  }

  public void setTrns(List<@Valid TrnValidateRequest> trns) {
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
    TrnValidateBatchRequest trnValidateBatchRequest = (TrnValidateBatchRequest) o;
    return Objects.equals(this.batchName, trnValidateBatchRequest.batchName) &&
        Objects.equals(this.externalId, trnValidateBatchRequest.externalId) &&
        Objects.equals(this.trns, trnValidateBatchRequest.trns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchName, externalId, trns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnValidateBatchRequest {\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
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


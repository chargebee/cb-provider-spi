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
 * TrnValidateBatchDeleteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class TrnValidateBatchDeleteResponse {

  private String batchId;

  private String message;

  public TrnValidateBatchDeleteResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrnValidateBatchDeleteResponse(String batchId) {
    this.batchId = batchId;
  }

  public TrnValidateBatchDeleteResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Id of the batch request
   * @return batchId
  */
  @NotNull 
  @Schema(name = "batchId", description = "Id of the batch request", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public TrnValidateBatchDeleteResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message about deleting of batch request
   * @return message
  */
  
  @Schema(name = "message", description = "Message about deleting of batch request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrnValidateBatchDeleteResponse trnValidateBatchDeleteResponse = (TrnValidateBatchDeleteResponse) o;
    return Objects.equals(this.batchId, trnValidateBatchDeleteResponse.batchId) &&
        Objects.equals(this.message, trnValidateBatchDeleteResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnValidateBatchDeleteResponse {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


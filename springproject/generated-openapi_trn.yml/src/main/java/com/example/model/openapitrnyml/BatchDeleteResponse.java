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
 * Response to delete the batch request
 */

@Schema(name = "BatchDeleteResponse", description = "Response to delete the batch request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class BatchDeleteResponse {

  private String batchId;

  private String message;

  public BatchDeleteResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BatchDeleteResponse(String batchId) {
    this.batchId = batchId;
  }

  public BatchDeleteResponse batchId(String batchId) {
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

  public BatchDeleteResponse message(String message) {
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
    BatchDeleteResponse batchDeleteResponse = (BatchDeleteResponse) o;
    return Objects.equals(this.batchId, batchDeleteResponse.batchId) &&
        Objects.equals(this.message, batchDeleteResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDeleteResponse {\n");
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


package com.example.model.openapitrnyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitrnyml.HealthCheckComponent;
import com.example.model.openapitrnyml.HealthStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HealthCheckResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class HealthCheckResponse {

  private String version;

  private String description;

  private HealthStatus status;

  @Valid
  private List<@Valid HealthCheckComponent> components = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  public HealthCheckResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HealthCheckResponse(HealthStatus status, List<@Valid HealthCheckComponent> components, OffsetDateTime time) {
    this.status = status;
    this.components = components;
    this.time = time;
  }

  public HealthCheckResponse version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @Size(min = 1) 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public HealthCheckResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the health status returned by the Service Adapter.
   * @return description
  */
  @Size(max = 250) 
  @Schema(name = "description", description = "The description of the health status returned by the Service Adapter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HealthCheckResponse status(HealthStatus status) {
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
  public HealthStatus getStatus() {
    return status;
  }

  public void setStatus(HealthStatus status) {
    this.status = status;
  }

  public HealthCheckResponse components(List<@Valid HealthCheckComponent> components) {
    this.components = components;
    return this;
  }

  public HealthCheckResponse addComponentsItem(HealthCheckComponent componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * List of health status details for each component reported by the Service Adapter.
   * @return components
  */
  @NotNull @Valid 
  @Schema(name = "components", description = "List of health status details for each component reported by the Service Adapter.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("components")
  public List<@Valid HealthCheckComponent> getComponents() {
    return components;
  }

  public void setComponents(List<@Valid HealthCheckComponent> components) {
    this.components = components;
  }

  public HealthCheckResponse time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The timestamp of the health status reported by the Service Adapter.
   * @return time
  */
  @NotNull @Valid 
  @Schema(name = "time", description = "The timestamp of the health status reported by the Service Adapter.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResponse healthCheckResponse = (HealthCheckResponse) o;
    return Objects.equals(this.version, healthCheckResponse.version) &&
        Objects.equals(this.description, healthCheckResponse.description) &&
        Objects.equals(this.status, healthCheckResponse.status) &&
        Objects.equals(this.components, healthCheckResponse.components) &&
        Objects.equals(this.time, healthCheckResponse.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, description, status, components, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResponse {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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


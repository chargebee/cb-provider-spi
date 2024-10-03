package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.HealthStatus;
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
 * The health status details of a specific component reported by the Service Adapter.
 */

@Schema(name = "HealthCheckComponent", description = "The health status details of a specific component reported by the Service Adapter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class HealthCheckComponent {

  private String id;

  private String name;

  /**
   * The type of component affected when `status` is `WARN` or `DOWN`. The possible values are: - `ADAPTER`: The reported status is for the Service Adapter. - `API`: The reported status is for the Service Provider. - `DATABASE`: The reported status is for a database dependency of the Service Provider. - `SYSTEM`: The reported status is for any other known system component such as cache or gateway. - `OTHER`: The reported status is either for a component that does not belong to the types described above or the source of the issue is unknown. 
   */
  public enum TypeEnum {
    OTHER("OTHER"),
    
    SYSTEM("SYSTEM"),
    
    API("API"),
    
    ADAPTER("ADAPTER"),
    
    DATABASE("DATABASE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String description;

  private HealthStatus status;

  @Valid
  private List<String> endpoints;

  public HealthCheckComponent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HealthCheckComponent(String id, String name, TypeEnum type, HealthStatus status) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.status = status;
  }

  public HealthCheckComponent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the component.
   * @return id
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "id", description = "The id of the component.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HealthCheckComponent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the component.
   * @return name
  */
  @NotNull @Size(max = 150) 
  @Schema(name = "name", description = "The name of the component.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HealthCheckComponent type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of component affected when `status` is `WARN` or `DOWN`. The possible values are: - `ADAPTER`: The reported status is for the Service Adapter. - `API`: The reported status is for the Service Provider. - `DATABASE`: The reported status is for a database dependency of the Service Provider. - `SYSTEM`: The reported status is for any other known system component such as cache or gateway. - `OTHER`: The reported status is either for a component that does not belong to the types described above or the source of the issue is unknown. 
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of component affected when `status` is `WARN` or `DOWN`. The possible values are: - `ADAPTER`: The reported status is for the Service Adapter. - `API`: The reported status is for the Service Provider. - `DATABASE`: The reported status is for a database dependency of the Service Provider. - `SYSTEM`: The reported status is for any other known system component such as cache or gateway. - `OTHER`: The reported status is either for a component that does not belong to the types described above or the source of the issue is unknown. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public HealthCheckComponent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The detailed status of the component.
   * @return description
  */
  @Size(max = 250) 
  @Schema(name = "description", description = "The detailed status of the component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HealthCheckComponent status(HealthStatus status) {
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

  public HealthCheckComponent endpoints(List<String> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public HealthCheckComponent addEndpointsItem(String endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

  /**
   * When the `status` of the component is not `UP`, then the list of endpoints affected.
   * @return endpoints
  */
  
  @Schema(name = "endpoints", description = "When the `status` of the component is not `UP`, then the list of endpoints affected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpoints")
  public List<String> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<String> endpoints) {
    this.endpoints = endpoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckComponent healthCheckComponent = (HealthCheckComponent) o;
    return Objects.equals(this.id, healthCheckComponent.id) &&
        Objects.equals(this.name, healthCheckComponent.name) &&
        Objects.equals(this.type, healthCheckComponent.type) &&
        Objects.equals(this.description, healthCheckComponent.description) &&
        Objects.equals(this.status, healthCheckComponent.status) &&
        Objects.equals(this.endpoints, healthCheckComponent.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, description, status, endpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckComponent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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


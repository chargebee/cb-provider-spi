package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.TaxJurisdictionType;
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
 * The tax jurisdiction details.
 */

@Schema(name = "TaxJurisdiction", description = "The tax jurisdiction details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class TaxJurisdiction {

  private String code;

  private TaxJurisdictionType type;

  private String name;

  public TaxJurisdiction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxJurisdiction(String code, TaxJurisdictionType type, String name) {
    this.code = code;
    this.type = type;
    this.name = name;
  }

  public TaxJurisdiction code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The jurisdiction code.
   * @return code
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "code", description = "The jurisdiction code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TaxJurisdiction type(TaxJurisdictionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TaxJurisdictionType getType() {
    return type;
  }

  public void setType(TaxJurisdictionType type) {
    this.type = type;
  }

  public TaxJurisdiction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The jurisdiction name.
   * @return name
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "name", description = "The jurisdiction name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxJurisdiction taxJurisdiction = (TaxJurisdiction) o;
    return Objects.equals(this.code, taxJurisdiction.code) &&
        Objects.equals(this.type, taxJurisdiction.type) &&
        Objects.equals(this.name, taxJurisdiction.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxJurisdiction {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


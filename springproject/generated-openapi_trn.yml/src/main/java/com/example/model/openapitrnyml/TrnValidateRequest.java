package com.example.model.openapitrnyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitrnyml.Country;
import com.example.model.openapitrnyml.TrnType;
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
 * Contains the required properties for tax registration number validation request
 */

@Schema(name = "TrnValidateRequest", description = "Contains the required properties for tax registration number validation request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class TrnValidateRequest {

  private String trn;

  private Country country;

  private TrnType trnType;

  private String name;

  private String validOn;

  private String requesterTrn;

  private String taxOfficeCode;

  private String externalId;

  public TrnValidateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrnValidateRequest(String trn, Country country) {
    this.trn = trn;
    this.country = country;
  }

  public TrnValidateRequest trn(String trn) {
    this.trn = trn;
    return this;
  }

  /**
   * Tax registration number
   * @return trn
  */
  @NotNull 
  @Schema(name = "trn", description = "Tax registration number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trn")
  public String getTrn() {
    return trn;
  }

  public void setTrn(String trn) {
    this.trn = trn;
  }

  public TrnValidateRequest country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @NotNull @Valid 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public TrnValidateRequest trnType(TrnType trnType) {
    this.trnType = trnType;
    return this;
  }

  /**
   * Get trnType
   * @return trnType
  */
  @Valid 
  @Schema(name = "trnType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trnType")
  public TrnType getTrnType() {
    return trnType;
  }

  public void setTrnType(TrnType trnType) {
    this.trnType = trnType;
  }

  public TrnValidateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the tag registration number owner
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the tag registration number owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrnValidateRequest validOn(String validOn) {
    this.validOn = validOn;
    return this;
  }

  /**
   * Validate tax registration number on given date
   * @return validOn
  */
  
  @Schema(name = "validOn", description = "Validate tax registration number on given date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validOn")
  public String getValidOn() {
    return validOn;
  }

  public void setValidOn(String validOn) {
    this.validOn = validOn;
  }

  public TrnValidateRequest requesterTrn(String requesterTrn) {
    this.requesterTrn = requesterTrn;
    return this;
  }

  /**
   * Tax registration number of the entity or person who is requesting validation
   * @return requesterTrn
  */
  
  @Schema(name = "requesterTrn", description = "Tax registration number of the entity or person who is requesting validation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requesterTrn")
  public String getRequesterTrn() {
    return requesterTrn;
  }

  public void setRequesterTrn(String requesterTrn) {
    this.requesterTrn = requesterTrn;
  }

  public TrnValidateRequest taxOfficeCode(String taxOfficeCode) {
    this.taxOfficeCode = taxOfficeCode;
    return this;
  }

  /**
   * Code of the tax office, some country need it to validate tax registration number
   * @return taxOfficeCode
  */
  
  @Schema(name = "taxOfficeCode", description = "Code of the tax office, some country need it to validate tax registration number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxOfficeCode")
  public String getTaxOfficeCode() {
    return taxOfficeCode;
  }

  public void setTaxOfficeCode(String taxOfficeCode) {
    this.taxOfficeCode = taxOfficeCode;
  }

  public TrnValidateRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Way to relate the request and response, if passed then the same value should be returned in response
   * @return externalId
  */
  
  @Schema(name = "externalId", description = "Way to relate the request and response, if passed then the same value should be returned in response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TrnValidateRequest trnValidateRequest = (TrnValidateRequest) o;
    return Objects.equals(this.trn, trnValidateRequest.trn) &&
        Objects.equals(this.country, trnValidateRequest.country) &&
        Objects.equals(this.trnType, trnValidateRequest.trnType) &&
        Objects.equals(this.name, trnValidateRequest.name) &&
        Objects.equals(this.validOn, trnValidateRequest.validOn) &&
        Objects.equals(this.requesterTrn, trnValidateRequest.requesterTrn) &&
        Objects.equals(this.taxOfficeCode, trnValidateRequest.taxOfficeCode) &&
        Objects.equals(this.externalId, trnValidateRequest.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trn, country, trnType, name, validOn, requesterTrn, taxOfficeCode, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnValidateRequest {\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    trnType: ").append(toIndentedString(trnType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validOn: ").append(toIndentedString(validOn)).append("\n");
    sb.append("    requesterTrn: ").append(toIndentedString(requesterTrn)).append("\n");
    sb.append("    taxOfficeCode: ").append(toIndentedString(taxOfficeCode)).append("\n");
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


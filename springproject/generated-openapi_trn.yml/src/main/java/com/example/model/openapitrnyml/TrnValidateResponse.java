package com.example.model.openapitrnyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitrnyml.BusinessStatus;
import com.example.model.openapitrnyml.Country;
import com.example.model.openapitrnyml.TrnStatus;
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
 * Contains the required properties for tax registration number validation response
 */

@Schema(name = "TrnValidateResponse", description = "Contains the required properties for tax registration number validation response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
public class TrnValidateResponse {

  private String requestId;

  private String trn;

  private Country country;

  private String name;

  private String address;

  private TrnStatus trnStatus;

  private Boolean isBusiness;

  private Boolean isRegistered;

  private BusinessStatus businessStatus;

  private String validationDataSource;

  private String externalId;

  private String message;

  public TrnValidateResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrnValidateResponse(String trn, Country country) {
    this.trn = trn;
    this.country = country;
  }

  public TrnValidateResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Unique id of the request, this is to refer later to fetch the response.
   * @return requestId
  */
  
  @Schema(name = "requestId", description = "Unique id of the request, this is to refer later to fetch the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public TrnValidateResponse trn(String trn) {
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

  public TrnValidateResponse country(Country country) {
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

  public TrnValidateResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the entity(may be an individual or a business company) who owns the tax registration number
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the entity(may be an individual or a business company) who owns the tax registration number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrnValidateResponse address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address of the entity(may be an individual or a business company) who owns the tax registration number
   * @return address
  */
  
  @Schema(name = "address", description = "Address of the entity(may be an individual or a business company) who owns the tax registration number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public TrnValidateResponse trnStatus(TrnStatus trnStatus) {
    this.trnStatus = trnStatus;
    return this;
  }

  /**
   * Get trnStatus
   * @return trnStatus
  */
  @Valid 
  @Schema(name = "trnStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trnStatus")
  public TrnStatus getTrnStatus() {
    return trnStatus;
  }

  public void setTrnStatus(TrnStatus trnStatus) {
    this.trnStatus = trnStatus;
  }

  public TrnValidateResponse isBusiness(Boolean isBusiness) {
    this.isBusiness = isBusiness;
    return this;
  }

  /**
   * Indicates that tax registration number belong to a business entity or not.
   * @return isBusiness
  */
  
  @Schema(name = "isBusiness", description = "Indicates that tax registration number belong to a business entity or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBusiness")
  public Boolean getIsBusiness() {
    return isBusiness;
  }

  public void setIsBusiness(Boolean isBusiness) {
    this.isBusiness = isBusiness;
  }

  public TrnValidateResponse isRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
    return this;
  }

  /**
   * Indicates that tax registration number is registered or not
   * @return isRegistered
  */
  
  @Schema(name = "isRegistered", description = "Indicates that tax registration number is registered or not", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRegistered")
  public Boolean getIsRegistered() {
    return isRegistered;
  }

  public void setIsRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
  }

  public TrnValidateResponse businessStatus(BusinessStatus businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

  /**
   * Get businessStatus
   * @return businessStatus
  */
  @Valid 
  @Schema(name = "businessStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessStatus")
  public BusinessStatus getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(BusinessStatus businessStatus) {
    this.businessStatus = businessStatus;
  }

  public TrnValidateResponse validationDataSource(String validationDataSource) {
    this.validationDataSource = validationDataSource;
    return this;
  }

  /**
   * Indicates name of the source of tax registration number validation (like database, vies)
   * @return validationDataSource
  */
  
  @Schema(name = "validationDataSource", description = "Indicates name of the source of tax registration number validation (like database, vies)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationDataSource")
  public String getValidationDataSource() {
    return validationDataSource;
  }

  public void setValidationDataSource(String validationDataSource) {
    this.validationDataSource = validationDataSource;
  }

  public TrnValidateResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The externalId passed in the request
   * @return externalId
  */
  
  @Schema(name = "externalId", description = "The externalId passed in the request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public TrnValidateResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Any message about tax registration number validation request
   * @return message
  */
  
  @Schema(name = "message", description = "Any message about tax registration number validation request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TrnValidateResponse trnValidateResponse = (TrnValidateResponse) o;
    return Objects.equals(this.requestId, trnValidateResponse.requestId) &&
        Objects.equals(this.trn, trnValidateResponse.trn) &&
        Objects.equals(this.country, trnValidateResponse.country) &&
        Objects.equals(this.name, trnValidateResponse.name) &&
        Objects.equals(this.address, trnValidateResponse.address) &&
        Objects.equals(this.trnStatus, trnValidateResponse.trnStatus) &&
        Objects.equals(this.isBusiness, trnValidateResponse.isBusiness) &&
        Objects.equals(this.isRegistered, trnValidateResponse.isRegistered) &&
        Objects.equals(this.businessStatus, trnValidateResponse.businessStatus) &&
        Objects.equals(this.validationDataSource, trnValidateResponse.validationDataSource) &&
        Objects.equals(this.externalId, trnValidateResponse.externalId) &&
        Objects.equals(this.message, trnValidateResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, trn, country, name, address, trnStatus, isBusiness, isRegistered, businessStatus, validationDataSource, externalId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnValidateResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    trnStatus: ").append(toIndentedString(trnStatus)).append("\n");
    sb.append("    isBusiness: ").append(toIndentedString(isBusiness)).append("\n");
    sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    validationDataSource: ").append(toIndentedString(validationDataSource)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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


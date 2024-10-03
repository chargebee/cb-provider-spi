package com.example.model.openapilocationvalidationyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapilocationvalidationyml.Address;
import com.example.model.openapilocationvalidationyml.FieldItem;
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
 * Contains the required properties for location validation response
 */

@Schema(name = "LocationValidationEvidence", description = "Contains the required properties for location validation response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:38.152028+05:30[Asia/Kolkata]")
public class LocationValidationEvidence {

  private String name;

  private String customerCode;

  private String taxRegistrationNumber;

  private String ip;

  private String bin;

  private String phone;

  private Address address;

  @Valid
  private List<@Valid FieldItem> taxIdentifiers;

  public LocationValidationEvidence() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationValidationEvidence(String customerCode, Address address) {
    this.customerCode = customerCode;
    this.address = address;
  }

  public LocationValidationEvidence name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the customer.
   * @return name
  */
  @Size(max = 50) 
  @Schema(name = "name", description = "Name of the customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocationValidationEvidence customerCode(String customerCode) {
    this.customerCode = customerCode;
    return this;
  }

  /**
   * Chargebee customer code.
   * @return customerCode
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "customerCode", description = "Chargebee customer code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerCode")
  public String getCustomerCode() {
    return customerCode;
  }

  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }

  public LocationValidationEvidence taxRegistrationNumber(String taxRegistrationNumber) {
    this.taxRegistrationNumber = taxRegistrationNumber;
    return this;
  }

  /**
   * Tax registration number of the customer.
   * @return taxRegistrationNumber
  */
  @Size(max = 50) 
  @Schema(name = "taxRegistrationNumber", description = "Tax registration number of the customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxRegistrationNumber")
  public String getTaxRegistrationNumber() {
    return taxRegistrationNumber;
  }

  public void setTaxRegistrationNumber(String taxRegistrationNumber) {
    this.taxRegistrationNumber = taxRegistrationNumber;
  }

  public LocationValidationEvidence ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * IP address of the customer.
   * @return ip
  */
  @Size(max = 10) 
  @Schema(name = "ip", description = "IP address of the customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public LocationValidationEvidence bin(String bin) {
    this.bin = bin;
    return this;
  }

  /**
   * BIN of primary card.
   * @return bin
  */
  @Size(max = 6) 
  @Schema(name = "bin", description = "BIN of primary card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bin")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  public LocationValidationEvidence phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the customer.
   * @return phone
  */
  @Size(max = 15) 
  @Schema(name = "phone", description = "Phone number of the customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public LocationValidationEvidence address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @NotNull @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public LocationValidationEvidence taxIdentifiers(List<@Valid FieldItem> taxIdentifiers) {
    this.taxIdentifiers = taxIdentifiers;
    return this;
  }

  public LocationValidationEvidence addTaxIdentifiersItem(FieldItem taxIdentifiersItem) {
    if (this.taxIdentifiers == null) {
      this.taxIdentifiers = new ArrayList<>();
    }
    this.taxIdentifiers.add(taxIdentifiersItem);
    return this;
  }

  /**
   * The tax code fields of the product used for tax calculation.
   * @return taxIdentifiers
  */
  @Valid 
  @Schema(name = "taxIdentifiers", description = "The tax code fields of the product used for tax calculation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxIdentifiers")
  public List<@Valid FieldItem> getTaxIdentifiers() {
    return taxIdentifiers;
  }

  public void setTaxIdentifiers(List<@Valid FieldItem> taxIdentifiers) {
    this.taxIdentifiers = taxIdentifiers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationValidationEvidence locationValidationEvidence = (LocationValidationEvidence) o;
    return Objects.equals(this.name, locationValidationEvidence.name) &&
        Objects.equals(this.customerCode, locationValidationEvidence.customerCode) &&
        Objects.equals(this.taxRegistrationNumber, locationValidationEvidence.taxRegistrationNumber) &&
        Objects.equals(this.ip, locationValidationEvidence.ip) &&
        Objects.equals(this.bin, locationValidationEvidence.bin) &&
        Objects.equals(this.phone, locationValidationEvidence.phone) &&
        Objects.equals(this.address, locationValidationEvidence.address) &&
        Objects.equals(this.taxIdentifiers, locationValidationEvidence.taxIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, customerCode, taxRegistrationNumber, ip, bin, phone, address, taxIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationValidationEvidence {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
    sb.append("    taxRegistrationNumber: ").append(toIndentedString(taxRegistrationNumber)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxIdentifiers: ").append(toIndentedString(taxIdentifiers)).append("\n");
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


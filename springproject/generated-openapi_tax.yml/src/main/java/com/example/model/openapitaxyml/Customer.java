package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.Address;
import com.example.model.openapitaxyml.CustomerLocationEvidence;
import com.example.model.openapitaxyml.FieldItem;
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
 * The details of the Customer.
 */

@Schema(name = "Customer", description = "The details of the Customer.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class Customer {

  private String name;

  private String customerCode;

  private Address address;

  private String taxRegistrationNumber;

  @Valid
  private List<@Valid FieldItem> taxIdentifiers;

  private Boolean hasNexus;

  private CustomerLocationEvidence locationEvidence;

  public Customer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Customer(String customerCode, Address address) {
    this.customerCode = customerCode;
    this.address = address;
  }

  public Customer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Customer in Chargebee.
   * @return name
  */
  @Size(max = 50) 
  @Schema(name = "name", description = "The name of the Customer in Chargebee.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer customerCode(String customerCode) {
    this.customerCode = customerCode;
    return this;
  }

  /**
   * The unique identifier for the Customer in Chargebee.
   * @return customerCode
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "customerCode", description = "The unique identifier for the Customer in Chargebee.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerCode")
  public String getCustomerCode() {
    return customerCode;
  }

  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }

  public Customer address(Address address) {
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

  public Customer taxRegistrationNumber(String taxRegistrationNumber) {
    this.taxRegistrationNumber = taxRegistrationNumber;
    return this;
  }

  /**
   * The tax registration number of a business in a country. For example, this is the GSTIN for India or the VAT number for EU or Australia.
   * @return taxRegistrationNumber
  */
  @Size(max = 30) 
  @Schema(name = "taxRegistrationNumber", description = "The tax registration number of a business in a country. For example, this is the GSTIN for India or the VAT number for EU or Australia.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxRegistrationNumber")
  public String getTaxRegistrationNumber() {
    return taxRegistrationNumber;
  }

  public void setTaxRegistrationNumber(String taxRegistrationNumber) {
    this.taxRegistrationNumber = taxRegistrationNumber;
  }

  public Customer taxIdentifiers(List<@Valid FieldItem> taxIdentifiers) {
    this.taxIdentifiers = taxIdentifiers;
    return this;
  }

  public Customer addTaxIdentifiersItem(FieldItem taxIdentifiersItem) {
    if (this.taxIdentifiers == null) {
      this.taxIdentifiers = new ArrayList<>();
    }
    this.taxIdentifiers.add(taxIdentifiersItem);
    return this;
  }

  /**
   * It represents the information related to the customer's tax identifiers. This includes details such as exemption status etc.
   * @return taxIdentifiers
  */
  @Valid @Size(max = 10) 
  @Schema(name = "taxIdentifiers", description = "It represents the information related to the customer's tax identifiers. This includes details such as exemption status etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxIdentifiers")
  public List<@Valid FieldItem> getTaxIdentifiers() {
    return taxIdentifiers;
  }

  public void setTaxIdentifiers(List<@Valid FieldItem> taxIdentifiers) {
    this.taxIdentifiers = taxIdentifiers;
  }

  public Customer hasNexus(Boolean hasNexus) {
    this.hasNexus = hasNexus;
    return this;
  }

  /**
   * Determines whether a tax nexus exists between the Seller and the tax authority at the address provided.
   * @return hasNexus
  */
  
  @Schema(name = "hasNexus", description = "Determines whether a tax nexus exists between the Seller and the tax authority at the address provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasNexus")
  public Boolean getHasNexus() {
    return hasNexus;
  }

  public void setHasNexus(Boolean hasNexus) {
    this.hasNexus = hasNexus;
  }

  public Customer locationEvidence(CustomerLocationEvidence locationEvidence) {
    this.locationEvidence = locationEvidence;
    return this;
  }

  /**
   * Get locationEvidence
   * @return locationEvidence
  */
  @Valid 
  @Schema(name = "locationEvidence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationEvidence")
  public CustomerLocationEvidence getLocationEvidence() {
    return locationEvidence;
  }

  public void setLocationEvidence(CustomerLocationEvidence locationEvidence) {
    this.locationEvidence = locationEvidence;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.name, customer.name) &&
        Objects.equals(this.customerCode, customer.customerCode) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.taxRegistrationNumber, customer.taxRegistrationNumber) &&
        Objects.equals(this.taxIdentifiers, customer.taxIdentifiers) &&
        Objects.equals(this.hasNexus, customer.hasNexus) &&
        Objects.equals(this.locationEvidence, customer.locationEvidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, customerCode, address, taxRegistrationNumber, taxIdentifiers, hasNexus, locationEvidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxRegistrationNumber: ").append(toIndentedString(taxRegistrationNumber)).append("\n");
    sb.append("    taxIdentifiers: ").append(toIndentedString(taxIdentifiers)).append("\n");
    sb.append("    hasNexus: ").append(toIndentedString(hasNexus)).append("\n");
    sb.append("    locationEvidence: ").append(toIndentedString(locationEvidence)).append("\n");
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


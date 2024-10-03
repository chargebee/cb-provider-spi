package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.Address;
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
 * The details of the seller involved in the transaction including company code and address.
 */

@Schema(name = "Seller", description = "The details of the seller involved in the transaction including company code and address.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class Seller {

  private String taxRegistrationNumber;

  private Address address;

  private Boolean hasNexus;

  public Seller() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Seller(Address address) {
    this.address = address;
  }

  public Seller taxRegistrationNumber(String taxRegistrationNumber) {
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

  public Seller address(Address address) {
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

  public Seller hasNexus(Boolean hasNexus) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seller seller = (Seller) o;
    return Objects.equals(this.taxRegistrationNumber, seller.taxRegistrationNumber) &&
        Objects.equals(this.address, seller.address) &&
        Objects.equals(this.hasNexus, seller.hasNexus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRegistrationNumber, address, hasNexus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seller {\n");
    sb.append("    taxRegistrationNumber: ").append(toIndentedString(taxRegistrationNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    hasNexus: ").append(toIndentedString(hasNexus)).append("\n");
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


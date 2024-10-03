package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.TaxJurisdiction;
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
 * The details of tax applied under a specific jurisdiction.
 */

@Schema(name = "TaxLineItem", description = "The details of tax applied under a specific jurisdiction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class TaxLineItem {

  private Integer number;

  private TaxJurisdiction jurisdiction;

  private String name;

  private Double rate;

  private Double taxableAmount;

  private Double taxAmount;

  public TaxLineItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxLineItem(Integer number, TaxJurisdiction jurisdiction, String name, Double rate, Double taxableAmount, Double taxAmount) {
    this.number = number;
    this.jurisdiction = jurisdiction;
    this.name = name;
    this.rate = rate;
    this.taxableAmount = taxableAmount;
    this.taxAmount = taxAmount;
  }

  public TaxLineItem number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Index or serial number of this tax line item.
   * minimum: 1
   * @return number
  */
  @NotNull @Min(1) 
  @Schema(name = "number", description = "Index or serial number of this tax line item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public TaxLineItem jurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  /**
   * Get jurisdiction
   * @return jurisdiction
  */
  @NotNull @Valid 
  @Schema(name = "jurisdiction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jurisdiction")
  public TaxJurisdiction getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public TaxLineItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the tax applied.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "GST", description = "The name of the tax applied.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxLineItem rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The tax rate expressed in percentage.
   * maximum: 100
   * @return rate
  */
  @NotNull @DecimalMax("100") 
  @Schema(name = "rate", description = "The tax rate expressed in percentage.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public TaxLineItem taxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * The part of the line item's `subtotal` that is taxable under this jurisdiction.
   * @return taxableAmount
  */
  @NotNull 
  @Schema(name = "taxableAmount", description = "The part of the line item's `subtotal` that is taxable under this jurisdiction.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxableAmount")
  public Double getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public TaxLineItem taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * The tax payable for the line item under this jurisdiction.
   * @return taxAmount
  */
  @NotNull 
  @Schema(name = "taxAmount", description = "The tax payable for the line item under this jurisdiction.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxAmount")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxLineItem taxLineItem = (TaxLineItem) o;
    return Objects.equals(this.number, taxLineItem.number) &&
        Objects.equals(this.jurisdiction, taxLineItem.jurisdiction) &&
        Objects.equals(this.name, taxLineItem.name) &&
        Objects.equals(this.rate, taxLineItem.rate) &&
        Objects.equals(this.taxableAmount, taxLineItem.taxableAmount) &&
        Objects.equals(this.taxAmount, taxLineItem.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, jurisdiction, name, rate, taxableAmount, taxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxLineItem {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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


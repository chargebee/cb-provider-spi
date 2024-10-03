package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.FieldItem;
import com.example.model.openapitaxyml.TaxExemptType;
import com.example.model.openapitaxyml.TaxLineItem;
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
 * The details of a line item.
 */

@Schema(name = "InvoiceLineItem", description = "The details of a line item.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class InvoiceLineItem {

  private Integer number;

  private String itemCode;

  private String description;

  private Double quantity;

  private Double unitPrice;

  private Double amount;

  private Double subtotal;

  private Boolean isTaxInclusive;

  private Boolean isTaxable;

  @Valid
  private List<@Valid FieldItem> taxIdentifiers;

  private TaxExemptType taxExemptType;

  private String taxExemptReason;

  private Double exemptAmount;

  private Double discountAmount;

  private Double taxableAmount;

  private Double taxAmount;

  private Double total;

  private Boolean isPartialTax;

  @Valid
  private List<@Valid TaxLineItem> taxes = new ArrayList<>();

  public InvoiceLineItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InvoiceLineItem(Integer number, Double amount, Double subtotal, Boolean isTaxInclusive, Boolean isTaxable, Double exemptAmount, Double discountAmount, Double taxableAmount, Double taxAmount, Double total, List<@Valid TaxLineItem> taxes) {
    this.number = number;
    this.amount = amount;
    this.subtotal = subtotal;
    this.isTaxInclusive = isTaxInclusive;
    this.isTaxable = isTaxable;
    this.exemptAmount = exemptAmount;
    this.discountAmount = discountAmount;
    this.taxableAmount = taxableAmount;
    this.taxAmount = taxAmount;
    this.total = total;
    this.taxes = taxes;
  }

  public InvoiceLineItem number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Index or serial number of the line item.
   * minimum: 1
   * @return number
  */
  @NotNull @Min(1) 
  @Schema(name = "number", description = "Index or serial number of the line item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public InvoiceLineItem itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

  /**
   * The unique identifier (in Chargebee) of the product corresponding to the line item. If the line item corresponds to a one-off charge, then this identifier is not present.
   * @return itemCode
  */
  @Size(max = 50) 
  @Schema(name = "itemCode", description = "The unique identifier (in Chargebee) of the product corresponding to the line item. If the line item corresponds to a one-off charge, then this identifier is not present.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCode")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public InvoiceLineItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the line item.
   * @return description
  */
  @Size(max = 250) 
  @Schema(name = "description", description = "The description of the line item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InvoiceLineItem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity associated with this line item.
   * minimum: 0
   * @return quantity
  */
  @DecimalMin("0") 
  @Schema(name = "quantity", description = "The quantity associated with this line item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public InvoiceLineItem unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * The unit price for this line item. In case of [tiered pricing](https://www.chargebee.com/docs/1.0/plans.html#tiered-pricing) where the unit price varies for each quantity tier, this is the average unit price.
   * minimum: 0
   * @return unitPrice
  */
  @DecimalMin("0") 
  @Schema(name = "unitPrice", description = "The unit price for this line item. In case of [tiered pricing](https://www.chargebee.com/docs/1.0/plans.html#tiered-pricing) where the unit price varies for each quantity tier, this is the average unit price.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unitPrice")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public InvoiceLineItem amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount for this line item. This is `unitPrice` × `quantity`.
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", description = "The amount for this line item. This is `unitPrice` × `quantity`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public InvoiceLineItem subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

  /**
   * The amount after discounts for this line item. This is `amount` - `discountAmount`.
   * @return subtotal
  */
  @NotNull 
  @Schema(name = "subtotal", description = "The amount after discounts for this line item. This is `amount` - `discountAmount`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subtotal")
  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  public InvoiceLineItem isTaxInclusive(Boolean isTaxInclusive) {
    this.isTaxInclusive = isTaxInclusive;
    return this;
  }

  /**
   * Indicates whether the `subtotal` for this line item is inclusive of taxes.
   * @return isTaxInclusive
  */
  @NotNull 
  @Schema(name = "isTaxInclusive", description = "Indicates whether the `subtotal` for this line item is inclusive of taxes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isTaxInclusive")
  public Boolean getIsTaxInclusive() {
    return isTaxInclusive;
  }

  public void setIsTaxInclusive(Boolean isTaxInclusive) {
    this.isTaxInclusive = isTaxInclusive;
  }

  public InvoiceLineItem isTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
    return this;
  }

  /**
   * Indicates whether this line item is taxable.
   * @return isTaxable
  */
  @NotNull 
  @Schema(name = "isTaxable", description = "Indicates whether this line item is taxable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isTaxable")
  public Boolean getIsTaxable() {
    return isTaxable;
  }

  public void setIsTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
  }

  public InvoiceLineItem taxIdentifiers(List<@Valid FieldItem> taxIdentifiers) {
    this.taxIdentifiers = taxIdentifiers;
    return this;
  }

  public InvoiceLineItem addTaxIdentifiersItem(FieldItem taxIdentifiersItem) {
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
  @Valid @Size(max = 10) 
  @Schema(name = "taxIdentifiers", description = "The tax code fields of the product used for tax calculation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxIdentifiers")
  public List<@Valid FieldItem> getTaxIdentifiers() {
    return taxIdentifiers;
  }

  public void setTaxIdentifiers(List<@Valid FieldItem> taxIdentifiers) {
    this.taxIdentifiers = taxIdentifiers;
  }

  public InvoiceLineItem taxExemptType(TaxExemptType taxExemptType) {
    this.taxExemptType = taxExemptType;
    return this;
  }

  /**
   * Get taxExemptType
   * @return taxExemptType
  */
  @Valid 
  @Schema(name = "taxExemptType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxExemptType")
  public TaxExemptType getTaxExemptType() {
    return taxExemptType;
  }

  public void setTaxExemptType(TaxExemptType taxExemptType) {
    this.taxExemptType = taxExemptType;
  }

  public InvoiceLineItem taxExemptReason(String taxExemptReason) {
    this.taxExemptReason = taxExemptReason;
    return this;
  }

  /**
   * The reason due to which a line item is exempted from tax. This is a mandatory parameter while applying tax exemption on any line-item.
   * @return taxExemptReason
  */
  @Size(max = 250) 
  @Schema(name = "taxExemptReason", example = "The customer is exempt from taxes.", description = "The reason due to which a line item is exempted from tax. This is a mandatory parameter while applying tax exemption on any line-item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxExemptReason")
  public String getTaxExemptReason() {
    return taxExemptReason;
  }

  public void setTaxExemptReason(String taxExemptReason) {
    this.taxExemptReason = taxExemptReason;
  }

  public InvoiceLineItem exemptAmount(Double exemptAmount) {
    this.exemptAmount = exemptAmount;
    return this;
  }

  /**
   * The part of this line item's `subtotal` that is exempted from tax.
   * @return exemptAmount
  */
  @NotNull 
  @Schema(name = "exemptAmount", description = "The part of this line item's `subtotal` that is exempted from tax.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exemptAmount")
  public Double getExemptAmount() {
    return exemptAmount;
  }

  public void setExemptAmount(Double exemptAmount) {
    this.exemptAmount = exemptAmount;
  }

  public InvoiceLineItem discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * The discount applied to this line item.
   * @return discountAmount
  */
  @NotNull 
  @Schema(name = "discountAmount", description = "The discount applied to this line item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("discountAmount")
  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public InvoiceLineItem taxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * The part of this line item's `subtotal` that is taxable.
   * @return taxableAmount
  */
  @NotNull 
  @Schema(name = "taxableAmount", description = "The part of this line item's `subtotal` that is taxable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxableAmount")
  public Double getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public InvoiceLineItem taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * The tax payable for this line item. This is the sum of all `taxes.taxAmount` for this line item.
   * @return taxAmount
  */
  @NotNull 
  @Schema(name = "taxAmount", description = "The tax payable for this line item. This is the sum of all `taxes.taxAmount` for this line item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxAmount")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public InvoiceLineItem total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * The total for this line item after discounts and taxes. This is the same as `subtotal` if it is tax inclusive; otherwise it is `subtotal` + `taxAmount`. `total` can also be expressed as `exemptAmount` + `taxableAmount` + `taxAmount`.
   * @return total
  */
  @NotNull 
  @Schema(name = "total", description = "The total for this line item after discounts and taxes. This is the same as `subtotal` if it is tax inclusive; otherwise it is `subtotal` + `taxAmount`. `total` can also be expressed as `exemptAmount` + `taxableAmount` + `taxAmount`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public InvoiceLineItem isPartialTax(Boolean isPartialTax) {
    this.isPartialTax = isPartialTax;
    return this;
  }

  /**
   * Indicates if taxes were applied only partially for this line item.
   * @return isPartialTax
  */
  
  @Schema(name = "isPartialTax", description = "Indicates if taxes were applied only partially for this line item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPartialTax")
  public Boolean getIsPartialTax() {
    return isPartialTax;
  }

  public void setIsPartialTax(Boolean isPartialTax) {
    this.isPartialTax = isPartialTax;
  }

  public InvoiceLineItem taxes(List<@Valid TaxLineItem> taxes) {
    this.taxes = taxes;
    return this;
  }

  public InvoiceLineItem addTaxesItem(TaxLineItem taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

  /**
   * List of taxes applied for this line item under each jurisdiction.
   * @return taxes
  */
  @NotNull @Valid @Size(min = 0, max = 10) 
  @Schema(name = "taxes", description = "List of taxes applied for this line item under each jurisdiction.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxes")
  public List<@Valid TaxLineItem> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<@Valid TaxLineItem> taxes) {
    this.taxes = taxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceLineItem invoiceLineItem = (InvoiceLineItem) o;
    return Objects.equals(this.number, invoiceLineItem.number) &&
        Objects.equals(this.itemCode, invoiceLineItem.itemCode) &&
        Objects.equals(this.description, invoiceLineItem.description) &&
        Objects.equals(this.quantity, invoiceLineItem.quantity) &&
        Objects.equals(this.unitPrice, invoiceLineItem.unitPrice) &&
        Objects.equals(this.amount, invoiceLineItem.amount) &&
        Objects.equals(this.subtotal, invoiceLineItem.subtotal) &&
        Objects.equals(this.isTaxInclusive, invoiceLineItem.isTaxInclusive) &&
        Objects.equals(this.isTaxable, invoiceLineItem.isTaxable) &&
        Objects.equals(this.taxIdentifiers, invoiceLineItem.taxIdentifiers) &&
        Objects.equals(this.taxExemptType, invoiceLineItem.taxExemptType) &&
        Objects.equals(this.taxExemptReason, invoiceLineItem.taxExemptReason) &&
        Objects.equals(this.exemptAmount, invoiceLineItem.exemptAmount) &&
        Objects.equals(this.discountAmount, invoiceLineItem.discountAmount) &&
        Objects.equals(this.taxableAmount, invoiceLineItem.taxableAmount) &&
        Objects.equals(this.taxAmount, invoiceLineItem.taxAmount) &&
        Objects.equals(this.total, invoiceLineItem.total) &&
        Objects.equals(this.isPartialTax, invoiceLineItem.isPartialTax) &&
        Objects.equals(this.taxes, invoiceLineItem.taxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, itemCode, description, quantity, unitPrice, amount, subtotal, isTaxInclusive, isTaxable, taxIdentifiers, taxExemptType, taxExemptReason, exemptAmount, discountAmount, taxableAmount, taxAmount, total, isPartialTax, taxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceLineItem {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    isTaxInclusive: ").append(toIndentedString(isTaxInclusive)).append("\n");
    sb.append("    isTaxable: ").append(toIndentedString(isTaxable)).append("\n");
    sb.append("    taxIdentifiers: ").append(toIndentedString(taxIdentifiers)).append("\n");
    sb.append("    taxExemptType: ").append(toIndentedString(taxExemptType)).append("\n");
    sb.append("    taxExemptReason: ").append(toIndentedString(taxExemptReason)).append("\n");
    sb.append("    exemptAmount: ").append(toIndentedString(exemptAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isPartialTax: ").append(toIndentedString(isPartialTax)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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


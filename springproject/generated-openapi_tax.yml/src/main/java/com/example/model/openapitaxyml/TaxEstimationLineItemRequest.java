package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
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
 * Represents the details of a line item in a tax estimation request.
 */

@Schema(name = "TaxEstimationLineItemRequest", description = "Represents the details of a line item in a tax estimation request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class TaxEstimationLineItemRequest {

  private Integer number;

  private String itemCode;

  private String description;

  private Double quantity;

  private Double unitPrice;

  private Double amount;

  private Double discountAmount;

  private Boolean isTaxInclusive;

  @Valid
  private List<@Valid FieldItem> taxIdentifiers;

  public TaxEstimationLineItemRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxEstimationLineItemRequest(Integer number, Double amount, Boolean isTaxInclusive) {
    this.number = number;
    this.amount = amount;
    this.isTaxInclusive = isTaxInclusive;
  }

  public TaxEstimationLineItemRequest number(Integer number) {
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

  public TaxEstimationLineItemRequest itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

  /**
   * The unique identifier (in Chargebee) of the product corresponding to the line item. If the line item corresponds to a one-off charge, then this identifier is not provided.
   * @return itemCode
  */
  @Size(max = 50) 
  @Schema(name = "itemCode", description = "The unique identifier (in Chargebee) of the product corresponding to the line item. If the line item corresponds to a one-off charge, then this identifier is not provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCode")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public TaxEstimationLineItemRequest description(String description) {
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

  public TaxEstimationLineItemRequest quantity(Double quantity) {
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

  public TaxEstimationLineItemRequest unitPrice(Double unitPrice) {
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

  public TaxEstimationLineItemRequest amount(Double amount) {
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

  public TaxEstimationLineItemRequest discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * The discount applied to this line item.
   * @return discountAmount
  */
  
  @Schema(name = "discountAmount", description = "The discount applied to this line item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountAmount")
  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public TaxEstimationLineItemRequest isTaxInclusive(Boolean isTaxInclusive) {
    this.isTaxInclusive = isTaxInclusive;
    return this;
  }

  /**
   * Indicates whether (`amount` - `discountAmount`)  is inclusive of taxes.
   * @return isTaxInclusive
  */
  @NotNull 
  @Schema(name = "isTaxInclusive", description = "Indicates whether (`amount` - `discountAmount`)  is inclusive of taxes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isTaxInclusive")
  public Boolean getIsTaxInclusive() {
    return isTaxInclusive;
  }

  public void setIsTaxInclusive(Boolean isTaxInclusive) {
    this.isTaxInclusive = isTaxInclusive;
  }

  public TaxEstimationLineItemRequest taxIdentifiers(List<@Valid FieldItem> taxIdentifiers) {
    this.taxIdentifiers = taxIdentifiers;
    return this;
  }

  public TaxEstimationLineItemRequest addTaxIdentifiersItem(FieldItem taxIdentifiersItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxEstimationLineItemRequest taxEstimationLineItemRequest = (TaxEstimationLineItemRequest) o;
    return Objects.equals(this.number, taxEstimationLineItemRequest.number) &&
        Objects.equals(this.itemCode, taxEstimationLineItemRequest.itemCode) &&
        Objects.equals(this.description, taxEstimationLineItemRequest.description) &&
        Objects.equals(this.quantity, taxEstimationLineItemRequest.quantity) &&
        Objects.equals(this.unitPrice, taxEstimationLineItemRequest.unitPrice) &&
        Objects.equals(this.amount, taxEstimationLineItemRequest.amount) &&
        Objects.equals(this.discountAmount, taxEstimationLineItemRequest.discountAmount) &&
        Objects.equals(this.isTaxInclusive, taxEstimationLineItemRequest.isTaxInclusive) &&
        Objects.equals(this.taxIdentifiers, taxEstimationLineItemRequest.taxIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, itemCode, description, quantity, unitPrice, amount, discountAmount, isTaxInclusive, taxIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxEstimationLineItemRequest {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    isTaxInclusive: ").append(toIndentedString(isTaxInclusive)).append("\n");
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


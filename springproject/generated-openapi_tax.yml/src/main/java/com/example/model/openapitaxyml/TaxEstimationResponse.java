package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.Customer;
import com.example.model.openapitaxyml.InvoiceLineItem;
import com.example.model.openapitaxyml.Seller;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The response sent by the Tax Service Adapter to Chargebee for a tax estimation request.
 */

@Schema(name = "TaxEstimationResponse", description = "The response sent by the Tax Service Adapter to Chargebee for a tax estimation request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class TaxEstimationResponse {

  private Seller seller;

  private Customer customer;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime estimateDateTime;

  private String currency;

  private Double subtotal;

  private Double exemptAmount;

  private Double discountAmount;

  private Double taxableAmount;

  private Double taxAmount;

  private Double total;

  @Valid
  private List<@Valid InvoiceLineItem> lineItems = new ArrayList<>();

  public TaxEstimationResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxEstimationResponse(Seller seller, Customer customer, OffsetDateTime estimateDateTime, String currency, Double subtotal, Double exemptAmount, Double discountAmount, Double taxableAmount, Double taxAmount, Double total, List<@Valid InvoiceLineItem> lineItems) {
    this.seller = seller;
    this.customer = customer;
    this.estimateDateTime = estimateDateTime;
    this.currency = currency;
    this.subtotal = subtotal;
    this.exemptAmount = exemptAmount;
    this.discountAmount = discountAmount;
    this.taxableAmount = taxableAmount;
    this.taxAmount = taxAmount;
    this.total = total;
    this.lineItems = lineItems;
  }

  public TaxEstimationResponse seller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  */
  @NotNull @Valid 
  @Schema(name = "seller", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("seller")
  public Seller getSeller() {
    return seller;
  }

  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  public TaxEstimationResponse customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @NotNull @Valid 
  @Schema(name = "customer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customer")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public TaxEstimationResponse estimateDateTime(OffsetDateTime estimateDateTime) {
    this.estimateDateTime = estimateDateTime;
    return this;
  }

  /**
   * The time as of which the tax estimation is to be calculated. This can be a value in the past. For example, if the value is provided as 2022-10-28T15:36:28.129+05:30, then the tax rates applicable on October 28, 2022, at 15:36:28.129, with an offset of +05:30 ahead of UTC/GMT are used for calculations. In case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the 'Z' indicating that the time is in UTC
   * @return estimateDateTime
  */
  @NotNull @Valid 
  @Schema(name = "estimateDateTime", description = "The time as of which the tax estimation is to be calculated. This can be a value in the past. For example, if the value is provided as 2022-10-28T15:36:28.129+05:30, then the tax rates applicable on October 28, 2022, at 15:36:28.129, with an offset of +05:30 ahead of UTC/GMT are used for calculations. In case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the 'Z' indicating that the time is in UTC", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("estimateDateTime")
  public OffsetDateTime getEstimateDateTime() {
    return estimateDateTime;
  }

  public void setEstimateDateTime(OffsetDateTime estimateDateTime) {
    this.estimateDateTime = estimateDateTime;
  }

  public TaxEstimationResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The [currency](https://en.wikipedia.org/wiki/Currency) in the [ISO-4217 format](https://www.iso.org/iso-4217-currency-codes.html).
   * @return currency
  */
  @NotNull @Size(min = 3, max = 3) 
  @Schema(name = "currency", description = "The [currency](https://en.wikipedia.org/wiki/Currency) in the [ISO-4217 format](https://www.iso.org/iso-4217-currency-codes.html).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TaxEstimationResponse subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

  /**
   * The amount after discounts. This is the sum of all `lineItems.subtotal`.
   * @return subtotal
  */
  @NotNull 
  @Schema(name = "subtotal", description = "The amount after discounts. This is the sum of all `lineItems.subtotal`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subtotal")
  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  public TaxEstimationResponse exemptAmount(Double exemptAmount) {
    this.exemptAmount = exemptAmount;
    return this;
  }

  /**
   * The part of the `subtotal` that is exempted from tax.
   * @return exemptAmount
  */
  @NotNull 
  @Schema(name = "exemptAmount", description = "The part of the `subtotal` that is exempted from tax.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exemptAmount")
  public Double getExemptAmount() {
    return exemptAmount;
  }

  public void setExemptAmount(Double exemptAmount) {
    this.exemptAmount = exemptAmount;
  }

  public TaxEstimationResponse discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * The total discount applied. This is the sum of all `lineItems.discount`.
   * @return discountAmount
  */
  @NotNull 
  @Schema(name = "discountAmount", description = "The total discount applied. This is the sum of all `lineItems.discount`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("discountAmount")
  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public TaxEstimationResponse taxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * The part of the `subtotal` that is taxable.
   * @return taxableAmount
  */
  @NotNull 
  @Schema(name = "taxableAmount", description = "The part of the `subtotal` that is taxable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxableAmount")
  public Double getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public TaxEstimationResponse taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * The total tax payable. This is the sum of all `lineItems.taxAmount`.
   * @return taxAmount
  */
  @NotNull 
  @Schema(name = "taxAmount", description = "The total tax payable. This is the sum of all `lineItems.taxAmount`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxAmount")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TaxEstimationResponse total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * The total after discounts and taxes. This is the same as `subtotal` if it is tax inclusive; otherwise it is `subtotal` + `taxAmount`. `total` can also be expressed as `exemptAmount` + `taxableAmount` + `taxAmount`.
   * @return total
  */
  @NotNull 
  @Schema(name = "total", description = "The total after discounts and taxes. This is the same as `subtotal` if it is tax inclusive; otherwise it is `subtotal` + `taxAmount`. `total` can also be expressed as `exemptAmount` + `taxableAmount` + `taxAmount`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public TaxEstimationResponse lineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public TaxEstimationResponse addLineItemsItem(InvoiceLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * List of line item details for the tax estimation response.
   * @return lineItems
  */
  @NotNull @Valid @Size(min = 1, max = 1250) 
  @Schema(name = "lineItems", description = "List of line item details for the tax estimation response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lineItems")
  public List<@Valid InvoiceLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxEstimationResponse taxEstimationResponse = (TaxEstimationResponse) o;
    return Objects.equals(this.seller, taxEstimationResponse.seller) &&
        Objects.equals(this.customer, taxEstimationResponse.customer) &&
        Objects.equals(this.estimateDateTime, taxEstimationResponse.estimateDateTime) &&
        Objects.equals(this.currency, taxEstimationResponse.currency) &&
        Objects.equals(this.subtotal, taxEstimationResponse.subtotal) &&
        Objects.equals(this.exemptAmount, taxEstimationResponse.exemptAmount) &&
        Objects.equals(this.discountAmount, taxEstimationResponse.discountAmount) &&
        Objects.equals(this.taxableAmount, taxEstimationResponse.taxableAmount) &&
        Objects.equals(this.taxAmount, taxEstimationResponse.taxAmount) &&
        Objects.equals(this.total, taxEstimationResponse.total) &&
        Objects.equals(this.lineItems, taxEstimationResponse.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seller, customer, estimateDateTime, currency, subtotal, exemptAmount, discountAmount, taxableAmount, taxAmount, total, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxEstimationResponse {\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    estimateDateTime: ").append(toIndentedString(estimateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    exemptAmount: ").append(toIndentedString(exemptAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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


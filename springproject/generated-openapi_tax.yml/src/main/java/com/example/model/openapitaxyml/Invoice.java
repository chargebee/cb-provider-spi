package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.Customer;
import com.example.model.openapitaxyml.DocumentStatus;
import com.example.model.openapitaxyml.InvoiceLineItem;
import com.example.model.openapitaxyml.Seller;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * The details of an invoice as returned by the Tax Service Adapter.
 */

@Schema(name = "Invoice", description = "The details of an invoice as returned by the Tax Service Adapter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class Invoice {

  private String invoiceId;

  private String invoiceCode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime documentDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime taxDateTime;

  private DocumentStatus status;

  private String currency;

  private Seller seller;

  private Customer customer;

  private Double subtotal;

  private Double exemptAmount;

  private Double discountAmount;

  private Double taxableAmount;

  private Double taxAmount;

  private Double total;

  @Valid
  private List<@Valid InvoiceLineItem> lineItems = new ArrayList<>();

  public Invoice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Invoice(String invoiceId, String invoiceCode, OffsetDateTime documentDateTime, DocumentStatus status, String currency, Seller seller, Customer customer, Double subtotal, Double exemptAmount, Double discountAmount, Double taxableAmount, Double taxAmount, Double total, List<@Valid InvoiceLineItem> lineItems) {
    this.invoiceId = invoiceId;
    this.invoiceCode = invoiceCode;
    this.documentDateTime = documentDateTime;
    this.status = status;
    this.currency = currency;
    this.seller = seller;
    this.customer = customer;
    this.subtotal = subtotal;
    this.exemptAmount = exemptAmount;
    this.discountAmount = discountAmount;
    this.taxableAmount = taxableAmount;
    this.taxAmount = taxAmount;
    this.total = total;
    this.lineItems = lineItems;
  }

  public Invoice invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * The unique identifier of the invoice in the Tax Service Adapter or the Tax Service Provider.
   * @return invoiceId
  */
  @NotNull 
  @Schema(name = "invoiceId", description = "The unique identifier of the invoice in the Tax Service Adapter or the Tax Service Provider.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invoiceId")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Invoice invoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
    return this;
  }

  /**
   * The unique identifier of the invoice in Chargebee.
   * @return invoiceCode
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "invoiceCode", description = "The unique identifier of the invoice in Chargebee.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invoiceCode")
  public String getInvoiceCode() {
    return invoiceCode;
  }

  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }

  public Invoice documentDateTime(OffsetDateTime documentDateTime) {
    this.documentDateTime = documentDateTime;
    return this;
  }

  /**
   * The date and time at which the invoice was generated in Chargebee. For example, if the value is 2022-10-28T15:36:28.129+05:30, then the timestamp represents October 28, 2022, at 15:36:28.129, with an offset of +05:30. This means that the time represented is 5 hours and 30 minutes ahead of UTC/GMT.In the case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the 'Z' indicating that the time is in UTC.
   * @return documentDateTime
  */
  @NotNull @Valid 
  @Schema(name = "documentDateTime", description = "The date and time at which the invoice was generated in Chargebee. For example, if the value is 2022-10-28T15:36:28.129+05:30, then the timestamp represents October 28, 2022, at 15:36:28.129, with an offset of +05:30. This means that the time represented is 5 hours and 30 minutes ahead of UTC/GMT.In the case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the 'Z' indicating that the time is in UTC.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documentDateTime")
  public OffsetDateTime getDocumentDateTime() {
    return documentDateTime;
  }

  public void setDocumentDateTime(OffsetDateTime documentDateTime) {
    this.documentDateTime = documentDateTime;
  }

  public Invoice taxDateTime(OffsetDateTime taxDateTime) {
    this.taxDateTime = taxDateTime;
    return this;
  }

  /**
   * The date and time at which the tax was applicable in Chargebee. For example, if the value is 2022-10-28T15:36:28.129+05:30, then the timestamp represents October 28, 2022, at 15:36:28.129, with an offset of +05:30. This means that the time represented is 5 hours and 30 minutes ahead of UTC/GMT.In the case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the 'Z' indicating that the time is in UTC.
   * @return taxDateTime
  */
  @Valid 
  @Schema(name = "taxDateTime", description = "The date and time at which the tax was applicable in Chargebee. For example, if the value is 2022-10-28T15:36:28.129+05:30, then the timestamp represents October 28, 2022, at 15:36:28.129, with an offset of +05:30. This means that the time represented is 5 hours and 30 minutes ahead of UTC/GMT.In the case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the 'Z' indicating that the time is in UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxDateTime")
  public OffsetDateTime getTaxDateTime() {
    return taxDateTime;
  }

  public void setTaxDateTime(OffsetDateTime taxDateTime) {
    this.taxDateTime = taxDateTime;
  }

  public Invoice status(DocumentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public DocumentStatus getStatus() {
    return status;
  }

  public void setStatus(DocumentStatus status) {
    this.status = status;
  }

  public Invoice currency(String currency) {
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

  public Invoice seller(Seller seller) {
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

  public Invoice customer(Customer customer) {
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

  public Invoice subtotal(Double subtotal) {
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

  public Invoice exemptAmount(Double exemptAmount) {
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

  public Invoice discountAmount(Double discountAmount) {
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

  public Invoice taxableAmount(Double taxableAmount) {
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

  public Invoice taxAmount(Double taxAmount) {
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

  public Invoice total(Double total) {
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

  public Invoice lineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Invoice addLineItemsItem(InvoiceLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Get lineItems
   * @return lineItems
  */
  @NotNull @Valid @Size(min = 1, max = 1250) 
  @Schema(name = "lineItems", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceId, invoice.invoiceId) &&
        Objects.equals(this.invoiceCode, invoice.invoiceCode) &&
        Objects.equals(this.documentDateTime, invoice.documentDateTime) &&
        Objects.equals(this.taxDateTime, invoice.taxDateTime) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.seller, invoice.seller) &&
        Objects.equals(this.customer, invoice.customer) &&
        Objects.equals(this.subtotal, invoice.subtotal) &&
        Objects.equals(this.exemptAmount, invoice.exemptAmount) &&
        Objects.equals(this.discountAmount, invoice.discountAmount) &&
        Objects.equals(this.taxableAmount, invoice.taxableAmount) &&
        Objects.equals(this.taxAmount, invoice.taxAmount) &&
        Objects.equals(this.total, invoice.total) &&
        Objects.equals(this.lineItems, invoice.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, invoiceCode, documentDateTime, taxDateTime, status, currency, seller, customer, subtotal, exemptAmount, discountAmount, taxableAmount, taxAmount, total, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    documentDateTime: ").append(toIndentedString(documentDateTime)).append("\n");
    sb.append("    taxDateTime: ").append(toIndentedString(taxDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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


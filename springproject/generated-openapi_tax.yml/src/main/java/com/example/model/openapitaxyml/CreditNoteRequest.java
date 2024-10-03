package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.CreditNoteType;
import com.example.model.openapitaxyml.Customer;
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
 * The details of a credit note sent to the Tax Service Adapter by Chargebee. A credit note is used to reduce the amount due on an invoice. If the credit note is issued after payments have been made for the invoice, refunds can be issued to the Customer.
 */

@Schema(name = "CreditNoteRequest", description = "The details of a credit note sent to the Tax Service Adapter by Chargebee. A credit note is used to reduce the amount due on an invoice. If the credit note is issued after payments have been made for the invoice, refunds can be issued to the Customer.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class CreditNoteRequest {

  private String creditNoteCode;

  private String invoiceCode;

  private String invoiceId;

  private CreditNoteType creditNoteType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime documentDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime taxDateTime;

  private String currency;

  private Seller seller;

  private Customer customer;

  private Double total;

  private Double exemptAmount;

  private Double discountAmount;

  private Double taxableAmount;

  private Double taxAmount;

  private Double roundingAmount;

  @Valid
  private List<@Valid InvoiceLineItem> lineItems;

  public CreditNoteRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreditNoteRequest(String creditNoteCode, CreditNoteType creditNoteType, OffsetDateTime documentDateTime, String currency, Seller seller, Customer customer, Double total, Double exemptAmount, Double discountAmount, Double taxableAmount, Double taxAmount) {
    this.creditNoteCode = creditNoteCode;
    this.creditNoteType = creditNoteType;
    this.documentDateTime = documentDateTime;
    this.currency = currency;
    this.seller = seller;
    this.customer = customer;
    this.total = total;
    this.exemptAmount = exemptAmount;
    this.discountAmount = discountAmount;
    this.taxableAmount = taxableAmount;
    this.taxAmount = taxAmount;
  }

  public CreditNoteRequest creditNoteCode(String creditNoteCode) {
    this.creditNoteCode = creditNoteCode;
    return this;
  }

  /**
   * The unique identifier of the credit note in Chargebee.
   * @return creditNoteCode
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "creditNoteCode", description = "The unique identifier of the credit note in Chargebee.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditNoteCode")
  public String getCreditNoteCode() {
    return creditNoteCode;
  }

  public void setCreditNoteCode(String creditNoteCode) {
    this.creditNoteCode = creditNoteCode;
  }

  public CreditNoteRequest invoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
    return this;
  }

  /**
   * The unique identifier of the invoice in Chargebee to which this credit note belongs.
   * @return invoiceCode
  */
  @Size(max = 50) 
  @Schema(name = "invoiceCode", description = "The unique identifier of the invoice in Chargebee to which this credit note belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceCode")
  public String getInvoiceCode() {
    return invoiceCode;
  }

  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }

  public CreditNoteRequest invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * The unique identifier of the invoice in the Tax Service Adapter or the Tax Service Provider.
   * @return invoiceId
  */
  
  @Schema(name = "invoiceId", description = "The unique identifier of the invoice in the Tax Service Adapter or the Tax Service Provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceId")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public CreditNoteRequest creditNoteType(CreditNoteType creditNoteType) {
    this.creditNoteType = creditNoteType;
    return this;
  }

  /**
   * Get creditNoteType
   * @return creditNoteType
  */
  @NotNull @Valid 
  @Schema(name = "creditNoteType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditNoteType")
  public CreditNoteType getCreditNoteType() {
    return creditNoteType;
  }

  public void setCreditNoteType(CreditNoteType creditNoteType) {
    this.creditNoteType = creditNoteType;
  }

  public CreditNoteRequest documentDateTime(OffsetDateTime documentDateTime) {
    this.documentDateTime = documentDateTime;
    return this;
  }

  /**
   * The date and time at which the credit note was created in Chargebee. For example, if the value is 2022-10-28T15:36:28.129+05:30, then the timestamp represents October 28, 2022, at 15:36:28.129, with an offset of +05:30. This means that the time represented is 5 hours and 30 minutes ahead of UTC/GMT. In the case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the 'Z' indicating that the time is in UTC.
   * @return documentDateTime
  */
  @NotNull @Valid 
  @Schema(name = "documentDateTime", description = "The date and time at which the credit note was created in Chargebee. For example, if the value is 2022-10-28T15:36:28.129+05:30, then the timestamp represents October 28, 2022, at 15:36:28.129, with an offset of +05:30. This means that the time represented is 5 hours and 30 minutes ahead of UTC/GMT. In the case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the 'Z' indicating that the time is in UTC.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documentDateTime")
  public OffsetDateTime getDocumentDateTime() {
    return documentDateTime;
  }

  public void setDocumentDateTime(OffsetDateTime documentDateTime) {
    this.documentDateTime = documentDateTime;
  }

  public CreditNoteRequest taxDateTime(OffsetDateTime taxDateTime) {
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

  public CreditNoteRequest currency(String currency) {
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

  public CreditNoteRequest seller(Seller seller) {
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

  public CreditNoteRequest customer(Customer customer) {
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

  public CreditNoteRequest total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * The total amount of the credit note. `total` can be expressed as `exemptAmount` + `taxableAmount` + `taxAmount`.
   * @return total
  */
  @NotNull 
  @Schema(name = "total", description = "The total amount of the credit note. `total` can be expressed as `exemptAmount` + `taxableAmount` + `taxAmount`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public CreditNoteRequest exemptAmount(Double exemptAmount) {
    this.exemptAmount = exemptAmount;
    return this;
  }

  /**
   * The amount exempted from tax.
   * @return exemptAmount
  */
  @NotNull 
  @Schema(name = "exemptAmount", description = "The amount exempted from tax.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exemptAmount")
  public Double getExemptAmount() {
    return exemptAmount;
  }

  public void setExemptAmount(Double exemptAmount) {
    this.exemptAmount = exemptAmount;
  }

  public CreditNoteRequest discountAmount(Double discountAmount) {
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

  public CreditNoteRequest taxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * The amount upon which the tax is calculated.
   * @return taxableAmount
  */
  @NotNull 
  @Schema(name = "taxableAmount", description = "The amount upon which the tax is calculated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxableAmount")
  public Double getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public CreditNoteRequest taxAmount(Double taxAmount) {
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

  public CreditNoteRequest roundingAmount(Double roundingAmount) {
    this.roundingAmount = roundingAmount;
    return this;
  }

  /**
   * The rounding amount added to the total amount to account for fractional correction.
   * @return roundingAmount
  */
  
  @Schema(name = "roundingAmount", description = "The rounding amount added to the total amount to account for fractional correction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roundingAmount")
  public Double getRoundingAmount() {
    return roundingAmount;
  }

  public void setRoundingAmount(Double roundingAmount) {
    this.roundingAmount = roundingAmount;
  }

  public CreditNoteRequest lineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CreditNoteRequest addLineItemsItem(InvoiceLineItem lineItemsItem) {
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
  @Valid @Size(min = 1, max = 1250) 
  @Schema(name = "lineItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CreditNoteRequest creditNoteRequest = (CreditNoteRequest) o;
    return Objects.equals(this.creditNoteCode, creditNoteRequest.creditNoteCode) &&
        Objects.equals(this.invoiceCode, creditNoteRequest.invoiceCode) &&
        Objects.equals(this.invoiceId, creditNoteRequest.invoiceId) &&
        Objects.equals(this.creditNoteType, creditNoteRequest.creditNoteType) &&
        Objects.equals(this.documentDateTime, creditNoteRequest.documentDateTime) &&
        Objects.equals(this.taxDateTime, creditNoteRequest.taxDateTime) &&
        Objects.equals(this.currency, creditNoteRequest.currency) &&
        Objects.equals(this.seller, creditNoteRequest.seller) &&
        Objects.equals(this.customer, creditNoteRequest.customer) &&
        Objects.equals(this.total, creditNoteRequest.total) &&
        Objects.equals(this.exemptAmount, creditNoteRequest.exemptAmount) &&
        Objects.equals(this.discountAmount, creditNoteRequest.discountAmount) &&
        Objects.equals(this.taxableAmount, creditNoteRequest.taxableAmount) &&
        Objects.equals(this.taxAmount, creditNoteRequest.taxAmount) &&
        Objects.equals(this.roundingAmount, creditNoteRequest.roundingAmount) &&
        Objects.equals(this.lineItems, creditNoteRequest.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditNoteCode, invoiceCode, invoiceId, creditNoteType, documentDateTime, taxDateTime, currency, seller, customer, total, exemptAmount, discountAmount, taxableAmount, taxAmount, roundingAmount, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteRequest {\n");
    sb.append("    creditNoteCode: ").append(toIndentedString(creditNoteCode)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    creditNoteType: ").append(toIndentedString(creditNoteType)).append("\n");
    sb.append("    documentDateTime: ").append(toIndentedString(documentDateTime)).append("\n");
    sb.append("    taxDateTime: ").append(toIndentedString(taxDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    exemptAmount: ").append(toIndentedString(exemptAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    roundingAmount: ").append(toIndentedString(roundingAmount)).append("\n");
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


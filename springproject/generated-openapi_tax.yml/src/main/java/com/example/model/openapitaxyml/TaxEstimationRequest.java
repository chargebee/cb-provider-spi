package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.example.model.openapitaxyml.Customer;
import com.example.model.openapitaxyml.Seller;
import com.example.model.openapitaxyml.TaxEstimationLineItemRequest;
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
 * Defines the parameters of a tax estimation request. This is sent to the Tax Service Adapter by Chargebee to estimate taxes for one or more line items.
 */

@Schema(name = "TaxEstimationRequest", description = "Defines the parameters of a tax estimation request. This is sent to the Tax Service Adapter by Chargebee to estimate taxes for one or more line items.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class TaxEstimationRequest {

  private Seller seller;

  private Customer customer;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime estimateDateTime;

  private String currency;

  @Valid
  private List<@Valid TaxEstimationLineItemRequest> lineItems = new ArrayList<>();

  public TaxEstimationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxEstimationRequest(Seller seller, Customer customer, OffsetDateTime estimateDateTime, String currency, List<@Valid TaxEstimationLineItemRequest> lineItems) {
    this.seller = seller;
    this.customer = customer;
    this.estimateDateTime = estimateDateTime;
    this.currency = currency;
    this.lineItems = lineItems;
  }

  public TaxEstimationRequest seller(Seller seller) {
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

  public TaxEstimationRequest customer(Customer customer) {
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

  public TaxEstimationRequest estimateDateTime(OffsetDateTime estimateDateTime) {
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

  public TaxEstimationRequest currency(String currency) {
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

  public TaxEstimationRequest lineItems(List<@Valid TaxEstimationLineItemRequest> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public TaxEstimationRequest addLineItemsItem(TaxEstimationLineItemRequest lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Contains the details of each line item in the tax estimation request.
   * @return lineItems
  */
  @NotNull @Valid @Size(min = 1, max = 1250) 
  @Schema(name = "lineItems", description = "Contains the details of each line item in the tax estimation request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lineItems")
  public List<@Valid TaxEstimationLineItemRequest> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<@Valid TaxEstimationLineItemRequest> lineItems) {
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
    TaxEstimationRequest taxEstimationRequest = (TaxEstimationRequest) o;
    return Objects.equals(this.seller, taxEstimationRequest.seller) &&
        Objects.equals(this.customer, taxEstimationRequest.customer) &&
        Objects.equals(this.estimateDateTime, taxEstimationRequest.estimateDateTime) &&
        Objects.equals(this.currency, taxEstimationRequest.currency) &&
        Objects.equals(this.lineItems, taxEstimationRequest.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seller, customer, estimateDateTime, currency, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxEstimationRequest {\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    estimateDateTime: ").append(toIndentedString(estimateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


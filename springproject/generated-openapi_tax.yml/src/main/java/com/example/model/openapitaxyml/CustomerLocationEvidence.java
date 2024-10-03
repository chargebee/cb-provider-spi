package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
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
 * Represent the properties for customer location evidence.
 */

@Schema(name = "CustomerLocationEvidence", description = "Represent the properties for customer location evidence.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public class CustomerLocationEvidence {

  private String ip;

  private String bin;

  private String paymentCountryCode;

  public CustomerLocationEvidence ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * The customer's IP to determine which country the customer belongs to.
   * @return ip
  */
  @Size(max = 50) 
  @Schema(name = "ip", description = "The customer's IP to determine which country the customer belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public CustomerLocationEvidence bin(String bin) {
    this.bin = bin;
    return this;
  }

  /**
   * The country associated with a card by using the first or last 6 digits of the Bank Identification Number.
   * @return bin
  */
  @Size(max = 15) 
  @Schema(name = "bin", description = "The country associated with a card by using the first or last 6 digits of the Bank Identification Number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bin")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  public CustomerLocationEvidence paymentCountryCode(String paymentCountryCode) {
    this.paymentCountryCode = paymentCountryCode;
    return this;
  }

  /**
   * Identifies the country code associated with the payment method.
   * @return paymentCountryCode
  */
  @Size(max = 5) 
  @Schema(name = "paymentCountryCode", description = "Identifies the country code associated with the payment method.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentCountryCode")
  public String getPaymentCountryCode() {
    return paymentCountryCode;
  }

  public void setPaymentCountryCode(String paymentCountryCode) {
    this.paymentCountryCode = paymentCountryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLocationEvidence customerLocationEvidence = (CustomerLocationEvidence) o;
    return Objects.equals(this.ip, customerLocationEvidence.ip) &&
        Objects.equals(this.bin, customerLocationEvidence.bin) &&
        Objects.equals(this.paymentCountryCode, customerLocationEvidence.paymentCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, bin, paymentCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLocationEvidence {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    paymentCountryCode: ").append(toIndentedString(paymentCountryCode)).append("\n");
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


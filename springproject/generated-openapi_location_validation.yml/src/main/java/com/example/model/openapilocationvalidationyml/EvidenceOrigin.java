package com.example.model.openapilocationvalidationyml;

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
 * Source country identified from each evidence
 */

@Schema(name = "EvidenceOrigin", description = "Source country identified from each evidence")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:38.152028+05:30[Asia/Kolkata]")
public class EvidenceOrigin {

  private String taxRegistrationNumber;

  private String ip;

  private String bin;

  private String phone;

  private String address;

  private String taxIdentifiers;

  public EvidenceOrigin taxRegistrationNumber(String taxRegistrationNumber) {
    this.taxRegistrationNumber = taxRegistrationNumber;
    return this;
  }

  /**
   * Source country from Tax registration number of the customer.
   * @return taxRegistrationNumber
  */
  @Size(max = 10) 
  @Schema(name = "taxRegistrationNumber", description = "Source country from Tax registration number of the customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxRegistrationNumber")
  public String getTaxRegistrationNumber() {
    return taxRegistrationNumber;
  }

  public void setTaxRegistrationNumber(String taxRegistrationNumber) {
    this.taxRegistrationNumber = taxRegistrationNumber;
  }

  public EvidenceOrigin ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Source country from IP address of the customer.
   * @return ip
  */
  @Size(max = 10) 
  @Schema(name = "ip", description = "Source country from IP address of the customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public EvidenceOrigin bin(String bin) {
    this.bin = bin;
    return this;
  }

  /**
   * Source country from BIN of primary card.
   * @return bin
  */
  @Size(max = 10) 
  @Schema(name = "bin", description = "Source country from BIN of primary card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bin")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  public EvidenceOrigin phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Source country from Phone number of customer.
   * @return phone
  */
  @Size(max = 10) 
  @Schema(name = "phone", description = "Source country from Phone number of customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public EvidenceOrigin address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Source country from address of customer.
   * @return address
  */
  @Size(max = 10) 
  @Schema(name = "address", description = "Source country from address of customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public EvidenceOrigin taxIdentifiers(String taxIdentifiers) {
    this.taxIdentifiers = taxIdentifiers;
    return this;
  }

  /**
   * Source country from Tax Identifiers of customer.
   * @return taxIdentifiers
  */
  @Size(max = 10) 
  @Schema(name = "taxIdentifiers", description = "Source country from Tax Identifiers of customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxIdentifiers")
  public String getTaxIdentifiers() {
    return taxIdentifiers;
  }

  public void setTaxIdentifiers(String taxIdentifiers) {
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
    EvidenceOrigin evidenceOrigin = (EvidenceOrigin) o;
    return Objects.equals(this.taxRegistrationNumber, evidenceOrigin.taxRegistrationNumber) &&
        Objects.equals(this.ip, evidenceOrigin.ip) &&
        Objects.equals(this.bin, evidenceOrigin.bin) &&
        Objects.equals(this.phone, evidenceOrigin.phone) &&
        Objects.equals(this.address, evidenceOrigin.address) &&
        Objects.equals(this.taxIdentifiers, evidenceOrigin.taxIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRegistrationNumber, ip, bin, phone, address, taxIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceOrigin {\n");
    sb.append("    taxRegistrationNumber: ").append(toIndentedString(taxRegistrationNumber)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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


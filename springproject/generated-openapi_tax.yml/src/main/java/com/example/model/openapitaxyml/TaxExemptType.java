package com.example.model.openapitaxyml;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The tax exemption type for a line item. This is a mandatory parameter while applying tax exemption on any line-item.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public enum TaxExemptType {
  
  PRODUCT_EXEMPT("PRODUCT_EXEMPT"),
  
  CUSTOMER_EXEMPT("CUSTOMER_EXEMPT"),
  
  REGION_EXEMPT("REGION_EXEMPT"),
  
  REVERSE_CHARGE("REVERSE_CHARGE"),
  
  ZERO_RATE_TAX("ZERO_RATE_TAX"),
  
  HIGH_VALUE_PHYSICAL_GOODS("HIGH_VALUE_PHYSICAL_GOODS"),
  
  EXPORT("EXPORT"),
  
  ZERO_VALUE_ITEM("ZERO_VALUE_ITEM"),
  
  TAX_NOT_CONFIGURED("TAX_NOT_CONFIGURED");

  private String value;

  TaxExemptType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TaxExemptType fromValue(String value) {
    for (TaxExemptType b : TaxExemptType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


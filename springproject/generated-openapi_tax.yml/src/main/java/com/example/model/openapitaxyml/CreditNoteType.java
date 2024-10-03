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
 * Whether the credit note was created for the full amount on the invoice or only for a part of the invoice amount.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:39.362065+05:30[Asia/Kolkata]")
public enum CreditNoteType {
  
  FULL("FULL"),
  
  PARTIAL("PARTIAL");

  private String value;

  CreditNoteType(String value) {
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
  public static CreditNoteType fromValue(String value) {
    for (CreditNoteType b : CreditNoteType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


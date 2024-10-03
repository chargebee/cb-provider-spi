package com.example.model.openapilocationvalidationyml;

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
 * The error codes classify the type of exception that occurred during processing the request.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:38.152028+05:30[Asia/Kolkata]")
public enum ErrorCode {
  
  INVALID_OPERATION("INVALID_OPERATION"),
  
  SERVICE_EXCEPTION("SERVICE_EXCEPTION"),
  
  SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE"),
  
  SERVICE_LIMIT_EXCEEDED("SERVICE_LIMIT_EXCEEDED"),
  
  MISSING_REQUIRED_DATA("MISSING_REQUIRED_DATA"),
  
  INVALID_DATA("INVALID_DATA"),
  
  INVALID_TYPE("INVALID_TYPE"),
  
  INVALID_FORMAT("INVALID_FORMAT"),
  
  INVALID_RANGE("INVALID_RANGE"),
  
  LOCATION_VALIDATION_FAILED("LOCATION_VALIDATION_FAILED");

  private String value;

  ErrorCode(String value) {
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
  public static ErrorCode fromValue(String value) {
    for (ErrorCode b : ErrorCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.api.openapitrnyml;

import com.example.model.openapitrnyml.BasicErrorResponse;
import com.example.model.openapitrnyml.HealthCheckResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T11:22:40.630770+05:30[Asia/Kolkata]")
@Validated
@Tag(name = "Health", description = "Endpoints to monitor the health of the Service Provider and the Service Adapter.")
public interface HealthApi {

    /**
     * GET /health : Fetch the health status of the Service Provider.
     * This endpoint is used to fetch the health status of the Service Provider.
     *
     * @return Service is healthy. (status code 200)
     *         or Too many requests. (status code 429)
     *         or Unexpected error while processing request. (status code 500)
     *         or Service is unhealthy. (status code 503)
     */
    @Operation(
        operationId = "fetchHealth",
        summary = "Fetch the health status of the Service Provider.",
        description = "This endpoint is used to fetch the health status of the Service Provider.",
        tags = { "Health" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Service is healthy.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HealthCheckResponse.class))
            }),
            @ApiResponse(responseCode = "429", description = "Too many requests."),
            @ApiResponse(responseCode = "500", description = "Unexpected error while processing request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BasicErrorResponse.class))
            }),
            @ApiResponse(responseCode = "503", description = "Service is unhealthy.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HealthCheckResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/health",
        produces = { "application/json" }
    )
    ResponseEntity<HealthCheckResponse> fetchHealth(
        
    );

}

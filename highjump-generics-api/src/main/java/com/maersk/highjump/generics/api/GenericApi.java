package com.maersk.highjump.generics.api;

import com.maersk.commons.component.dto.BaseResponseDto;
import com.maersk.highjump.generics.dto.AsnDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

@FeignClient(name = "highjump-generics")
public interface GenericApi {

  @Operation(summary = "Create a new ASN.", tags = {"Generic APIs"})
  @ApiResponses(value = {
      @ApiResponse(responseCode = "201", description = "Created",
          content = {@Content(
              schema = @Schema(implementation = BaseResponseDto.class))})
  })
  ResponseEntity createAsn(
      @Parameter(
          required = true,
          schema = @Schema(implementation = AsnDto.class)) AsnDto asnDto);

}
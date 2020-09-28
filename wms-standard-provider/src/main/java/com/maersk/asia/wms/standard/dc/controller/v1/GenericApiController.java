package com.maersk.asia.wms.standard.dc.controller.v1;

import com.maersk.commons.component.annotation.AutoLogging;
import com.maersk.commons.component.dto.BaseResponseDto;
import com.maersk.asia.wms.standard.dc.api.GenericApi;
import com.maersk.asia.wms.standard.dc.dto.AsnDto;
import com.maersk.asia.wms.standard.dc.service.AsnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("api/v1/dc")
public class GenericApiController implements GenericApi {

  private final AsnService asnService;

  public GenericApiController(AsnService asnService) {
    this.asnService = asnService;
  }

  @Override
  @GetMapping(value = "/asn", produces = MediaType.APPLICATION_JSON_VALUE)
  @AutoLogging
  public ResponseEntity<BaseResponseDto<AsnDto>> retrieveAsn(
      @RequestParam(name = "whId") String whId,
      @RequestParam(name = "shipmentNumber") String shipmentNumber) {
    AsnDto asnDto = asnService.retrieve(whId, shipmentNumber);
    return ResponseEntity.ok(BaseResponseDto.ok(asnDto));
  }

  @Override
  @PostMapping(value = "/asn", produces = MediaType.APPLICATION_JSON_VALUE)
  @AutoLogging
  public ResponseEntity<BaseResponseDto> createAsn(@Valid @RequestBody AsnDto asnDto) {
    asnService.create(asnDto);
    return ResponseEntity
        .created(null)
        .body(BaseResponseDto.ok());
  }

  @Override
  @PatchMapping(value = "/asn", produces = MediaType.APPLICATION_JSON_VALUE)
  @AutoLogging
  public ResponseEntity updateAsn(@Valid @RequestBody AsnDto asnDto) {
    asnService.update(asnDto);
    return ResponseEntity.ok(BaseResponseDto.ok());
  }

  @Override
  @PutMapping(value = "/asn", produces = MediaType.APPLICATION_JSON_VALUE)
  @AutoLogging
  public ResponseEntity<BaseResponseDto> mergeAsn(@Valid @RequestBody AsnDto asnDto) {
    asnService.merge(asnDto);
    return ResponseEntity.ok(BaseResponseDto.ok());
  }

  @Override
  @DeleteMapping(value = "/asn", produces = MediaType.APPLICATION_JSON_VALUE)
  @AutoLogging
  public ResponseEntity<BaseResponseDto> deleteAsn(
      @RequestParam(name = "whId") String whId,
      @RequestParam(name = "shipmentNumber") String shipmentNumber,
      @RequestParam(name = "clientCode") String clientCode) {
    asnService.delete(whId, shipmentNumber, clientCode);
    return ResponseEntity.noContent().build();
  }

  @Override
  @PutMapping(value = "/asn/renew", produces = MediaType.APPLICATION_JSON_VALUE)
  @AutoLogging
  public ResponseEntity<BaseResponseDto> renewAsn(@Valid @RequestBody AsnDto asnDto) {
    asnService.renew(asnDto);
    return ResponseEntity
        .created(null)
        .body(BaseResponseDto.ok());
  }
}
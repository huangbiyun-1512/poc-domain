package com.example.poc.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
public class PoDetailDto implements Serializable {

  @Schema(name = "detail_comment_list")
  private List<PoDetailCommentDto> detailCommentList;
  @Schema(name = "action_code")
  private String actionCode;
  @Schema(name = "line_number")
  private String lineNumber;
  @Schema(name = "item_number")
  private String itemNumber;
  @Schema(name = "schedule_number")
  private Integer scheduleNumber;
  @Schema(name = "qty")
  private BigDecimal qty;
  @Schema(name = "vendor_item_number")
  private String vendorItemNumber;
  @Schema(name = "delivery_date")
  private Instant deliveryDate;
  @Schema(name = "originator")
  private String originator;
  @Schema(name = "order_uom")
  private String orderUom;
  @Schema(name = "special_processing")
  private String specialProcessing;
  @Schema(name = "location_id")
  private String locationId;
  @Schema(name = "distro_process")
  private String distroProcess;
  @Schema(name = "vas_profile_id")
  private Integer vasProfileId;
  @Schema(name = "stored_attribute_id")
  private Integer storedAttributeId;
  @Schema(name = "order_cbm")
  private BigDecimal orderCbm;
  @Schema(name = "order_weight")
  private BigDecimal orderWeight;
  @Schema(name = "pcs")
  private Integer pcs;
  @Schema(name = "marks")
  private String marks;
  @Schema(name = "hs_code")
  private String hsCode;
  @Schema(name = "packing_type")
  private String packingType;
  @Schema(name = "color")
  private String color;
  @Schema(name = "size")
  private String size;
  @Schema(name = "pieces")
  private BigDecimal pieces;
  @Schema(name = "customer_reference_no")
  private String customerReferenceNo;
  @Schema(name = "customer_article_number")
  private String customerArticleNumber;
  @Schema(name = "customer_case_number")
  private String customerCaseNumber;
  @Schema(name = "new_flag")
  private String newFlag;
  @Schema(name = "customs_sheet_no")
  private String customsSheetNo;
  @Schema(name = "custsheetno_enter_dt")
  private Instant custsheetnoEnterDt;
  @Schema(name = "earliest_delivery_date")
  private Instant earliestDeliveryDate;
  @Schema(name = "latest_delivery_date")
  private Instant latestDeliveryDate;
  @Schema(name = "latest_ship_date")
  private Instant latestShipDate;
  @Schema(name = "cost_price")
  private BigDecimal costPrice;
  @Schema(name = "supplier_so")
  private String supplierSo;
  @Schema(name = "generic_field1")
  private String genericField1;
  @Schema(name = "generic_field2")
  private String genericField2;
  @Schema(name = "generic_field3")
  private String genericField3;
  @Schema(name = "edc_price")
  private BigDecimal edcPrice;
  @Schema(name = "inspection")
  private String inspection;
  @Schema(name = "shipment_flow")
  private String shipmentFlow;
  @Schema(name = "product_type")
  private String productType;
  @Schema(name = "filler")
  private String filler;
  @Schema(name = "pallet_dimension")
  private String palletDimension;
  @Schema(name = "max_load")
  private String maxLoad;
  @Schema(name = "pallet_load")
  private String palletLoad;
  @Schema(name = "lot_number")
  private String lotNumber;
  @Schema(name = "customs_sheet_code")
  private String customsSheetCode;
  @Schema(name = "origin_customs_code")
  private String originCustomsCode;
  @Schema(name = "o5")
  private String o5;
  @Schema(name = "p3")
  private String p3;
  @Schema(name = "l5")
  private String l5;
  @Schema(name = "o4")
  private String o4;
  @Schema(name = "o2")
  private String o2;
  @Schema(name = "l4")
  private String l4;
  @Schema(name = "price_usd")
  private String priceUsd;
  @Schema(name = "amount_usd")
  private String amountUsd;
  @Schema(name = "composition")
  private String composition;
  @Schema(name = "tariff_number")
  private String tariffNumber;
  @Schema(name = "remark")
  private String remark;
  @Schema(name = "generic_field4")
  private String genericField4;
  @Schema(name = "generic_field5")
  private String genericField5;
  @Schema(name = "generic_field6")
  private String genericField6;
  @Schema(name = "generic_field7")
  private String genericField7;
  @Schema(name = "generic_field8")
  private String genericField8;
  @Schema(name = "generic_field9")
  private String genericField9;
  @Schema(name = "generic_field10")
  private String genericField10;
  @Schema(name = "confirm_bonded")
  private BigDecimal confirmBonded;
  @Schema(name = "confirm_fee")
  private BigDecimal confirmFree;
  @Schema(name = "confirm_kit")
  private BigDecimal confirmKit;
  @Schema(name = "bonded_qty")
  private BigDecimal bondedQty;
  @Schema(name = "free_qty")
  private BigDecimal freeQty;
  @Schema(name = "asn_qty")
  private BigDecimal asnQty;
  @Schema(name = "pre_bonded_qty")
  private BigDecimal preBondedQty;
  @Schema(name = "pre_free_qty")
  private BigDecimal preFreeQty;
  @Schema(name = "is_rekit_item")
  private String isRekitItem;

}

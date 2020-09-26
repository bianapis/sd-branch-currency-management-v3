package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryAllocationUpdateInputModel
 */
public class BQInventoryAllocationUpdateInputModel   {
  private String branchCashAllocationInstanceReference = null;

  private String inventoryAllocationInstanceReference = null;

  private String inventoryAllocationPreconditions = null;

  private String inventoryAllocationAllocationSchedule = null;

  private String cashInventoryAllocation = null;

  private String cashInventoryAllocationServiceType = null;

  private String cashInventoryAllocationServiceDescription = null;

  private String cashInventoryAllocationServiceInputsandOuputs = null;

  private String cashInventoryAllocationServiceWorkProduct = null;

  private Object inventoryAllocationUpdateActionTaskRecord = null;

  private String inventoryAllocationUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Branch Cash Allocation instance 
   * @return branchCashAllocationInstanceReference
  **/

  public String getBranchCashAllocationInstanceReference() {
    return branchCashAllocationInstanceReference;
  }

  public void setBranchCashAllocationInstanceReference(String branchCashAllocationInstanceReference) {
    this.branchCashAllocationInstanceReference = branchCashAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inventory Allocation instance 
   * @return inventoryAllocationInstanceReference
  **/

  public String getInventoryAllocationInstanceReference() {
    return inventoryAllocationInstanceReference;
  }

  public void setInventoryAllocationInstanceReference(String inventoryAllocationInstanceReference) {
    this.inventoryAllocationInstanceReference = inventoryAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the allocation can be made 
   * @return inventoryAllocationPreconditions
  **/

  public String getInventoryAllocationPreconditions() {
    return inventoryAllocationPreconditions;
  }

  public void setInventoryAllocationPreconditions(String inventoryAllocationPreconditions) {
    this.inventoryAllocationPreconditions = inventoryAllocationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of allocation decisions 
   * @return inventoryAllocationAllocationSchedule
  **/

  public String getInventoryAllocationAllocationSchedule() {
    return inventoryAllocationAllocationSchedule;
  }

  public void setInventoryAllocationAllocationSchedule(String inventoryAllocationAllocationSchedule) {
    this.inventoryAllocationAllocationSchedule = inventoryAllocationAllocationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Branch Cash Allocation specific Business Service 
   * @return cashInventoryAllocation
  **/

  public String getCashInventoryAllocation() {
    return cashInventoryAllocation;
  }

  public void setCashInventoryAllocation(String cashInventoryAllocation) {
    this.cashInventoryAllocation = cashInventoryAllocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return cashInventoryAllocationServiceType
  **/

  public String getCashInventoryAllocationServiceType() {
    return cashInventoryAllocationServiceType;
  }

  public void setCashInventoryAllocationServiceType(String cashInventoryAllocationServiceType) {
    this.cashInventoryAllocationServiceType = cashInventoryAllocationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return cashInventoryAllocationServiceDescription
  **/

  public String getCashInventoryAllocationServiceDescription() {
    return cashInventoryAllocationServiceDescription;
  }

  public void setCashInventoryAllocationServiceDescription(String cashInventoryAllocationServiceDescription) {
    this.cashInventoryAllocationServiceDescription = cashInventoryAllocationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return cashInventoryAllocationServiceInputsandOuputs
  **/

  public String getCashInventoryAllocationServiceInputsandOuputs() {
    return cashInventoryAllocationServiceInputsandOuputs;
  }

  public void setCashInventoryAllocationServiceInputsandOuputs(String cashInventoryAllocationServiceInputsandOuputs) {
    this.cashInventoryAllocationServiceInputsandOuputs = cashInventoryAllocationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return cashInventoryAllocationServiceWorkProduct
  **/

  public String getCashInventoryAllocationServiceWorkProduct() {
    return cashInventoryAllocationServiceWorkProduct;
  }

  public void setCashInventoryAllocationServiceWorkProduct(String cashInventoryAllocationServiceWorkProduct) {
    this.cashInventoryAllocationServiceWorkProduct = cashInventoryAllocationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return inventoryAllocationUpdateActionTaskRecord
  **/

  public Object getInventoryAllocationUpdateActionTaskRecord() {
    return inventoryAllocationUpdateActionTaskRecord;
  }

  public void setInventoryAllocationUpdateActionTaskRecord(Object inventoryAllocationUpdateActionTaskRecord) {
    this.inventoryAllocationUpdateActionTaskRecord = inventoryAllocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return inventoryAllocationUpdateActionRequest
  **/

  public String getInventoryAllocationUpdateActionRequest() {
    return inventoryAllocationUpdateActionRequest;
  }

  public void setInventoryAllocationUpdateActionRequest(String inventoryAllocationUpdateActionRequest) {
    this.inventoryAllocationUpdateActionRequest = inventoryAllocationUpdateActionRequest;
  }


}


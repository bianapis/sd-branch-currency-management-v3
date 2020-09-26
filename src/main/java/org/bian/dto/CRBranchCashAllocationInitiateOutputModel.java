package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchCashAllocationInitiateOutputModel
 */
public class CRBranchCashAllocationInitiateOutputModel   {
  private String branchCashAllocationInstanceReference = null;

  private String branchCashAllocationInitiateActionReference = null;

  private Object branchCashAllocationInitiateActionRecord = null;

  private String branchCashAllocationInstanceStatus = null;

  private String branchCashAllocationParameterType = null;

  private String branchCashAllocationSelectedOption = null;

  private String branchCashAllocationRequest = null;

  private String branchCashAllocationSchedule = null;

  private String branchCashAllocationStatus = null;

  private String branchCashAllocationCustomerReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Branch Cash Allocation instance 
   * @return branchCashAllocationInstanceReference
  **/

  public String getBranchCashAllocationInstanceReference() {
    return branchCashAllocationInstanceReference;
  }

  public void setBranchCashAllocationInstanceReference(String branchCashAllocationInstanceReference) {
    this.branchCashAllocationInstanceReference = branchCashAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return branchCashAllocationInitiateActionReference
  **/

  public String getBranchCashAllocationInitiateActionReference() {
    return branchCashAllocationInitiateActionReference;
  }

  public void setBranchCashAllocationInitiateActionReference(String branchCashAllocationInitiateActionReference) {
    this.branchCashAllocationInitiateActionReference = branchCashAllocationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return branchCashAllocationInitiateActionRecord
  **/

  public Object getBranchCashAllocationInitiateActionRecord() {
    return branchCashAllocationInitiateActionRecord;
  }

  public void setBranchCashAllocationInitiateActionRecord(Object branchCashAllocationInitiateActionRecord) {
    this.branchCashAllocationInitiateActionRecord = branchCashAllocationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Branch Cash Allocation instance (e.g. initialised, pending, active) 
   * @return branchCashAllocationInstanceStatus
  **/

  public String getBranchCashAllocationInstanceStatus() {
    return branchCashAllocationInstanceStatus;
  }

  public void setBranchCashAllocationInstanceStatus(String branchCashAllocationInstanceStatus) {
    this.branchCashAllocationInstanceStatus = branchCashAllocationInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between allocation Options according to the optional business services defined within Branch Cash Allocation 
   * @return branchCashAllocationParameterType
  **/

  public String getBranchCashAllocationParameterType() {
    return branchCashAllocationParameterType;
  }

  public void setBranchCashAllocationParameterType(String branchCashAllocationParameterType) {
    this.branchCashAllocationParameterType = branchCashAllocationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service for which resources are allocated 
   * @return branchCashAllocationSelectedOption
  **/

  public String getBranchCashAllocationSelectedOption() {
    return branchCashAllocationSelectedOption;
  }

  public void setBranchCashAllocationSelectedOption(String branchCashAllocationSelectedOption) {
    this.branchCashAllocationSelectedOption = branchCashAllocationSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to allocate BranchCash 
   * @return branchCashAllocationRequest
  **/

  public String getBranchCashAllocationRequest() {
    return branchCashAllocationRequest;
  }

  public void setBranchCashAllocationRequest(String branchCashAllocationRequest) {
    this.branchCashAllocationRequest = branchCashAllocationRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to allocate BranchCash 
   * @return branchCashAllocationSchedule
  **/

  public String getBranchCashAllocationSchedule() {
    return branchCashAllocationSchedule;
  }

  public void setBranchCashAllocationSchedule(String branchCashAllocationSchedule) {
    this.branchCashAllocationSchedule = branchCashAllocationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Branch Cash Allocation 
   * @return branchCashAllocationStatus
  **/

  public String getBranchCashAllocationStatus() {
    return branchCashAllocationStatus;
  }

  public void setBranchCashAllocationStatus(String branchCashAllocationStatus) {
    this.branchCashAllocationStatus = branchCashAllocationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Branch Cash Allocation 
   * @return branchCashAllocationCustomerReference
  **/

  public String getBranchCashAllocationCustomerReference() {
    return branchCashAllocationCustomerReference;
  }

  public void setBranchCashAllocationCustomerReference(String branchCashAllocationCustomerReference) {
    this.branchCashAllocationCustomerReference = branchCashAllocationCustomerReference;
  }


}


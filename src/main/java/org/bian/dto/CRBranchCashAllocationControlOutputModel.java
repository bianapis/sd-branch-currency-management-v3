package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchCashAllocationControlOutputModel
 */
public class CRBranchCashAllocationControlOutputModel   {
  private String branchCashAllocationParameterType = null;

  private String branchCashAllocationSelectedOption = null;

  private String branchCashAllocationRequest = null;

  private String branchCashAllocationSchedule = null;

  private String branchCashAllocationStatus = null;

  private String branchCashAllocationCustomerReference = null;

  private String branchCashAllocationControlActionTaskReference = null;

  private Object branchCashAllocationControlActionTaskRecord = null;

  private String branchCashAllocationControlActionResponse = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Cash Allocation instance control processing service call 
   * @return branchCashAllocationControlActionTaskReference
  **/

  public String getBranchCashAllocationControlActionTaskReference() {
    return branchCashAllocationControlActionTaskReference;
  }

  public void setBranchCashAllocationControlActionTaskReference(String branchCashAllocationControlActionTaskReference) {
    this.branchCashAllocationControlActionTaskReference = branchCashAllocationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return branchCashAllocationControlActionTaskRecord
  **/

  public Object getBranchCashAllocationControlActionTaskRecord() {
    return branchCashAllocationControlActionTaskRecord;
  }

  public void setBranchCashAllocationControlActionTaskRecord(Object branchCashAllocationControlActionTaskRecord) {
    this.branchCashAllocationControlActionTaskRecord = branchCashAllocationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return branchCashAllocationControlActionResponse
  **/

  public String getBranchCashAllocationControlActionResponse() {
    return branchCashAllocationControlActionResponse;
  }

  public void setBranchCashAllocationControlActionResponse(String branchCashAllocationControlActionResponse) {
    this.branchCashAllocationControlActionResponse = branchCashAllocationControlActionResponse;
  }


}


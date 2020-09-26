package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchCashAllocationCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * CRBranchCashAllocationCaptureInputModel
 */
public class CRBranchCashAllocationCaptureInputModel   {
  private String branchCurrencyManagementServicingSessionReference = null;

  private String branchCashAllocationInstanceReference = null;

  private String branchCashAllocationParameterType = null;

  private String branchCashAllocationSelectedOption = null;

  private String branchCashAllocationSubjectAreaType = null;

  private String branchCashAllocationDescription = null;

  private String branchCashAllocationRequest = null;

  private String branchCashAllocationSchedule = null;

  private String branchCashAllocationStatus = null;

  private String branchCashAllocationReference = null;

  private String branchCashAllocationCustomerReference = null;

  private String branchCashAllocationCurrency = null;

  private String branchCashAllocationRegulationReference = null;

  private String branchCashAllocationRegulationType = null;

  private String branchCashAllocationJurisdiction = null;

  private String branchCashAllocationBookingLocation = null;

  private String branchCashAllocationAccountType = null;

  private String branchCashAllocationAccountReference = null;

  private Object branchCashAllocationCaptureActionTaskRecord = null;

  private CRBranchCashAllocationCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return branchCurrencyManagementServicingSessionReference
  **/

  public String getBranchCurrencyManagementServicingSessionReference() {
    return branchCurrencyManagementServicingSessionReference;
  }

  public void setBranchCurrencyManagementServicingSessionReference(String branchCurrencyManagementServicingSessionReference) {
    this.branchCurrencyManagementServicingSessionReference = branchCurrencyManagementServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value, that distinguishes between the the type of resource allocated withing the Branch Cash Allocation 
   * @return branchCashAllocationSubjectAreaType
  **/

  public String getBranchCashAllocationSubjectAreaType() {
    return branchCashAllocationSubjectAreaType;
  }

  public void setBranchCashAllocationSubjectAreaType(String branchCashAllocationSubjectAreaType) {
    this.branchCashAllocationSubjectAreaType = branchCashAllocationSubjectAreaType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Branch Cash Allocation 
   * @return branchCashAllocationDescription
  **/

  public String getBranchCashAllocationDescription() {
    return branchCashAllocationDescription;
  }

  public void setBranchCashAllocationDescription(String branchCashAllocationDescription) {
    this.branchCashAllocationDescription = branchCashAllocationDescription;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Branch Cash Allocation 
   * @return branchCashAllocationReference
  **/

  public String getBranchCashAllocationReference() {
    return branchCashAllocationReference;
  }

  public void setBranchCashAllocationReference(String branchCashAllocationReference) {
    this.branchCashAllocationReference = branchCashAllocationReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged/used for Branch Cash Allocation 
   * @return branchCashAllocationCurrency
  **/

  public String getBranchCashAllocationCurrency() {
    return branchCashAllocationCurrency;
  }

  public void setBranchCashAllocationCurrency(String branchCashAllocationCurrency) {
    this.branchCashAllocationCurrency = branchCashAllocationCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined for Branch Cash Allocation 
   * @return branchCashAllocationRegulationReference
  **/

  public String getBranchCashAllocationRegulationReference() {
    return branchCashAllocationRegulationReference;
  }

  public void setBranchCashAllocationRegulationReference(String branchCashAllocationRegulationReference) {
    this.branchCashAllocationRegulationReference = branchCashAllocationRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Branch Cash Allocation 
   * @return branchCashAllocationRegulationType
  **/

  public String getBranchCashAllocationRegulationType() {
    return branchCashAllocationRegulationType;
  }

  public void setBranchCashAllocationRegulationType(String branchCashAllocationRegulationType) {
    this.branchCashAllocationRegulationType = branchCashAllocationRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Branch Cash Allocation in case of legal dispute. 
   * @return branchCashAllocationJurisdiction
  **/

  public String getBranchCashAllocationJurisdiction() {
    return branchCashAllocationJurisdiction;
  }

  public void setBranchCashAllocationJurisdiction(String branchCashAllocationJurisdiction) {
    this.branchCashAllocationJurisdiction = branchCashAllocationJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement, are entered. 
   * @return branchCashAllocationBookingLocation
  **/

  public String getBranchCashAllocationBookingLocation() {
    return branchCashAllocationBookingLocation;
  }

  public void setBranchCashAllocationBookingLocation(String branchCashAllocationBookingLocation) {
    this.branchCashAllocationBookingLocation = branchCashAllocationBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Branch Cash Allocation 
   * @return branchCashAllocationAccountType
  **/

  public String getBranchCashAllocationAccountType() {
    return branchCashAllocationAccountType;
  }

  public void setBranchCashAllocationAccountType(String branchCashAllocationAccountType) {
    this.branchCashAllocationAccountType = branchCashAllocationAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Branch Cash Allocation 
   * @return branchCashAllocationAccountReference
  **/

  public String getBranchCashAllocationAccountReference() {
    return branchCashAllocationAccountReference;
  }

  public void setBranchCashAllocationAccountReference(String branchCashAllocationAccountReference) {
    this.branchCashAllocationAccountReference = branchCashAllocationAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return branchCashAllocationCaptureActionTaskRecord
  **/

  public Object getBranchCashAllocationCaptureActionTaskRecord() {
    return branchCashAllocationCaptureActionTaskRecord;
  }

  public void setBranchCashAllocationCaptureActionTaskRecord(Object branchCashAllocationCaptureActionTaskRecord) {
    this.branchCashAllocationCaptureActionTaskRecord = branchCashAllocationCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRBranchCashAllocationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRBranchCashAllocationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}


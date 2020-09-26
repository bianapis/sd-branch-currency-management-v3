package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedService;
import org.bian.dto.SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementRetrieveOutputModel
 */
public class SDBranchCurrencyManagementRetrieveOutputModel   {
  private String branchCurrencyManagementRetrieveActionTaskReference = null;

  private Object branchCurrencyManagementRetrieveActionTaskRecord = null;

  private String branchCurrencyManagementRetrieveActionResponse = null;

  private SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementRetrieveActionRecord branchCurrencyManagementRetrieveActionRecord = null;

  private SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedService branchCurrencyManagementOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return branchCurrencyManagementRetrieveActionTaskReference
  **/

  public String getBranchCurrencyManagementRetrieveActionTaskReference() {
    return branchCurrencyManagementRetrieveActionTaskReference;
  }

  public void setBranchCurrencyManagementRetrieveActionTaskReference(String branchCurrencyManagementRetrieveActionTaskReference) {
    this.branchCurrencyManagementRetrieveActionTaskReference = branchCurrencyManagementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchCurrencyManagementRetrieveActionTaskRecord
  **/

  public Object getBranchCurrencyManagementRetrieveActionTaskRecord() {
    return branchCurrencyManagementRetrieveActionTaskRecord;
  }

  public void setBranchCurrencyManagementRetrieveActionTaskRecord(Object branchCurrencyManagementRetrieveActionTaskRecord) {
    this.branchCurrencyManagementRetrieveActionTaskRecord = branchCurrencyManagementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return branchCurrencyManagementRetrieveActionResponse
  **/

  public String getBranchCurrencyManagementRetrieveActionResponse() {
    return branchCurrencyManagementRetrieveActionResponse;
  }

  public void setBranchCurrencyManagementRetrieveActionResponse(String branchCurrencyManagementRetrieveActionResponse) {
    this.branchCurrencyManagementRetrieveActionResponse = branchCurrencyManagementRetrieveActionResponse;
  }


  /**
   * Get branchCurrencyManagementRetrieveActionRecord
   * @return branchCurrencyManagementRetrieveActionRecord
  **/

  public SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementRetrieveActionRecord getBranchCurrencyManagementRetrieveActionRecord() {
    return branchCurrencyManagementRetrieveActionRecord;
  }

  public void setBranchCurrencyManagementRetrieveActionRecord(SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementRetrieveActionRecord branchCurrencyManagementRetrieveActionRecord) {
    this.branchCurrencyManagementRetrieveActionRecord = branchCurrencyManagementRetrieveActionRecord;
  }


  /**
   * Get branchCurrencyManagementOfferedService
   * @return branchCurrencyManagementOfferedService
  **/

  public SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedService getBranchCurrencyManagementOfferedService() {
    return branchCurrencyManagementOfferedService;
  }

  public void setBranchCurrencyManagementOfferedService(SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedService branchCurrencyManagementOfferedService) {
    this.branchCurrencyManagementOfferedService = branchCurrencyManagementOfferedService;
  }


}


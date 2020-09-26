package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedService;
import org.bian.dto.SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementRetrieveInputModel
 */
public class SDBranchCurrencyManagementRetrieveInputModel   {
  private Object branchCurrencyManagementRetrieveActionTaskRecord = null;

  private String branchCurrencyManagementRetrieveActionRequest = null;

  private SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementRetrieveActionRecord branchCurrencyManagementRetrieveActionRecord = null;

  private SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedService branchCurrencyManagementOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return branchCurrencyManagementRetrieveActionRequest
  **/

  public String getBranchCurrencyManagementRetrieveActionRequest() {
    return branchCurrencyManagementRetrieveActionRequest;
  }

  public void setBranchCurrencyManagementRetrieveActionRequest(String branchCurrencyManagementRetrieveActionRequest) {
    this.branchCurrencyManagementRetrieveActionRequest = branchCurrencyManagementRetrieveActionRequest;
  }


  /**
   * Get branchCurrencyManagementRetrieveActionRecord
   * @return branchCurrencyManagementRetrieveActionRecord
  **/

  public SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementRetrieveActionRecord getBranchCurrencyManagementRetrieveActionRecord() {
    return branchCurrencyManagementRetrieveActionRecord;
  }

  public void setBranchCurrencyManagementRetrieveActionRecord(SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementRetrieveActionRecord branchCurrencyManagementRetrieveActionRecord) {
    this.branchCurrencyManagementRetrieveActionRecord = branchCurrencyManagementRetrieveActionRecord;
  }


  /**
   * Get branchCurrencyManagementOfferedService
   * @return branchCurrencyManagementOfferedService
  **/

  public SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedService getBranchCurrencyManagementOfferedService() {
    return branchCurrencyManagementOfferedService;
  }

  public void setBranchCurrencyManagementOfferedService(SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedService branchCurrencyManagementOfferedService) {
    this.branchCurrencyManagementOfferedService = branchCurrencyManagementOfferedService;
  }


}


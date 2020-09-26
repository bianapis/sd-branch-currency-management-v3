package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceAnalysis;
import org.bian.dto.CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBranchCashAllocationRetrieveInputModel
 */
public class CRBranchCashAllocationRetrieveInputModel   {
  private Object branchCashAllocationRetrieveActionTaskRecord = null;

  private String branchCashAllocationRetrieveActionRequest = null;

  private CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceReportRecord branchCashAllocationInstanceReportRecord = null;

  private CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceAnalysis branchCashAllocationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchCashAllocationRetrieveActionTaskRecord
  **/

  public Object getBranchCashAllocationRetrieveActionTaskRecord() {
    return branchCashAllocationRetrieveActionTaskRecord;
  }

  public void setBranchCashAllocationRetrieveActionTaskRecord(Object branchCashAllocationRetrieveActionTaskRecord) {
    this.branchCashAllocationRetrieveActionTaskRecord = branchCashAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return branchCashAllocationRetrieveActionRequest
  **/

  public String getBranchCashAllocationRetrieveActionRequest() {
    return branchCashAllocationRetrieveActionRequest;
  }

  public void setBranchCashAllocationRetrieveActionRequest(String branchCashAllocationRetrieveActionRequest) {
    this.branchCashAllocationRetrieveActionRequest = branchCashAllocationRetrieveActionRequest;
  }


  /**
   * Get branchCashAllocationInstanceReportRecord
   * @return branchCashAllocationInstanceReportRecord
  **/

  public CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceReportRecord getBranchCashAllocationInstanceReportRecord() {
    return branchCashAllocationInstanceReportRecord;
  }

  public void setBranchCashAllocationInstanceReportRecord(CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceReportRecord branchCashAllocationInstanceReportRecord) {
    this.branchCashAllocationInstanceReportRecord = branchCashAllocationInstanceReportRecord;
  }


  /**
   * Get branchCashAllocationInstanceAnalysis
   * @return branchCashAllocationInstanceAnalysis
  **/

  public CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceAnalysis getBranchCashAllocationInstanceAnalysis() {
    return branchCashAllocationInstanceAnalysis;
  }

  public void setBranchCashAllocationInstanceAnalysis(CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceAnalysis branchCashAllocationInstanceAnalysis) {
    this.branchCashAllocationInstanceAnalysis = branchCashAllocationInstanceAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchCashAllocationRetrieveOutputModelBranchCashAllocationInstanceReportRecord
 */
public class CRBranchCashAllocationRetrieveOutputModelBranchCashAllocationInstanceReportRecord   {
  private String branchCashAllocationInstanceReportData = null;

  private String branchCashAllocationInstanceReportType = null;

  private Object branchCashAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return branchCashAllocationInstanceReportData
  **/

  public String getBranchCashAllocationInstanceReportData() {
    return branchCashAllocationInstanceReportData;
  }

  public void setBranchCashAllocationInstanceReportData(String branchCashAllocationInstanceReportData) {
    this.branchCashAllocationInstanceReportData = branchCashAllocationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return branchCashAllocationInstanceReportType
  **/

  public String getBranchCashAllocationInstanceReportType() {
    return branchCashAllocationInstanceReportType;
  }

  public void setBranchCashAllocationInstanceReportType(String branchCashAllocationInstanceReportType) {
    this.branchCashAllocationInstanceReportType = branchCashAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return branchCashAllocationInstanceReport
  **/

  public Object getBranchCashAllocationInstanceReport() {
    return branchCashAllocationInstanceReport;
  }

  public void setBranchCashAllocationInstanceReport(Object branchCashAllocationInstanceReport) {
    this.branchCashAllocationInstanceReport = branchCashAllocationInstanceReport;
  }


}


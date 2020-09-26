package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchCashAllocationRetrieveOutputModelBranchCashAllocationInstanceAnalysis
 */
public class CRBranchCashAllocationRetrieveOutputModelBranchCashAllocationInstanceAnalysis   {
  private String branchCashAllocationInstanceAnalysisData = null;

  private String branchCashAllocationInstanceAnalysisReportType = null;

  private Object branchCashAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return branchCashAllocationInstanceAnalysisData
  **/

  public String getBranchCashAllocationInstanceAnalysisData() {
    return branchCashAllocationInstanceAnalysisData;
  }

  public void setBranchCashAllocationInstanceAnalysisData(String branchCashAllocationInstanceAnalysisData) {
    this.branchCashAllocationInstanceAnalysisData = branchCashAllocationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return branchCashAllocationInstanceAnalysisReportType
  **/

  public String getBranchCashAllocationInstanceAnalysisReportType() {
    return branchCashAllocationInstanceAnalysisReportType;
  }

  public void setBranchCashAllocationInstanceAnalysisReportType(String branchCashAllocationInstanceAnalysisReportType) {
    this.branchCashAllocationInstanceAnalysisReportType = branchCashAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return branchCashAllocationInstanceAnalysisReport
  **/

  public Object getBranchCashAllocationInstanceAnalysisReport() {
    return branchCashAllocationInstanceAnalysisReport;
  }

  public void setBranchCashAllocationInstanceAnalysisReport(Object branchCashAllocationInstanceAnalysisReport) {
    this.branchCashAllocationInstanceAnalysisReport = branchCashAllocationInstanceAnalysisReport;
  }


}


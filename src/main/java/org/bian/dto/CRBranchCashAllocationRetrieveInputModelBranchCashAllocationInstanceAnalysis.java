package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceAnalysis
 */
public class CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceAnalysis   {
  private String branchCashAllocationInstanceAnalysisReference = null;

  private String branchCashAllocationInstanceAnalysisReportType = null;

  private String branchCashAllocationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return branchCashAllocationInstanceAnalysisReference
  **/

  public String getBranchCashAllocationInstanceAnalysisReference() {
    return branchCashAllocationInstanceAnalysisReference;
  }

  public void setBranchCashAllocationInstanceAnalysisReference(String branchCashAllocationInstanceAnalysisReference) {
    this.branchCashAllocationInstanceAnalysisReference = branchCashAllocationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return branchCashAllocationInstanceAnalysisParameters
  **/

  public String getBranchCashAllocationInstanceAnalysisParameters() {
    return branchCashAllocationInstanceAnalysisParameters;
  }

  public void setBranchCashAllocationInstanceAnalysisParameters(String branchCashAllocationInstanceAnalysisParameters) {
    this.branchCashAllocationInstanceAnalysisParameters = branchCashAllocationInstanceAnalysisParameters;
  }


}


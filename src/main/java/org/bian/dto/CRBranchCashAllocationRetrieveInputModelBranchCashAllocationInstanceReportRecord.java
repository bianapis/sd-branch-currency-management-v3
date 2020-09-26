package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceReportRecord
 */
public class CRBranchCashAllocationRetrieveInputModelBranchCashAllocationInstanceReportRecord   {
  private String branchCashAllocationInstanceReportReference = null;

  private String branchCashAllocationInstanceReportType = null;

  private String branchCashAllocationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return branchCashAllocationInstanceReportReference
  **/

  public String getBranchCashAllocationInstanceReportReference() {
    return branchCashAllocationInstanceReportReference;
  }

  public void setBranchCashAllocationInstanceReportReference(String branchCashAllocationInstanceReportReference) {
    this.branchCashAllocationInstanceReportReference = branchCashAllocationInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return branchCashAllocationInstanceReportParameters
  **/

  public String getBranchCashAllocationInstanceReportParameters() {
    return branchCashAllocationInstanceReportParameters;
  }

  public void setBranchCashAllocationInstanceReportParameters(String branchCashAllocationInstanceReportParameters) {
    this.branchCashAllocationInstanceReportParameters = branchCashAllocationInstanceReportParameters;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryAllocationRetrieveOutputModelInventoryAllocationInstanceAnalysis
 */
public class BQInventoryAllocationRetrieveOutputModelInventoryAllocationInstanceAnalysis   {
  private Object inventoryAllocationInstanceAnalysisRecord = null;

  private String inventoryAllocationInstanceAnalysisReportType = null;

  private String inventoryAllocationInstanceAnalysisParameters = null;

  private Object inventoryAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return inventoryAllocationInstanceAnalysisRecord
  **/

  public Object getInventoryAllocationInstanceAnalysisRecord() {
    return inventoryAllocationInstanceAnalysisRecord;
  }

  public void setInventoryAllocationInstanceAnalysisRecord(Object inventoryAllocationInstanceAnalysisRecord) {
    this.inventoryAllocationInstanceAnalysisRecord = inventoryAllocationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return inventoryAllocationInstanceAnalysisReportType
  **/

  public String getInventoryAllocationInstanceAnalysisReportType() {
    return inventoryAllocationInstanceAnalysisReportType;
  }

  public void setInventoryAllocationInstanceAnalysisReportType(String inventoryAllocationInstanceAnalysisReportType) {
    this.inventoryAllocationInstanceAnalysisReportType = inventoryAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return inventoryAllocationInstanceAnalysisParameters
  **/

  public String getInventoryAllocationInstanceAnalysisParameters() {
    return inventoryAllocationInstanceAnalysisParameters;
  }

  public void setInventoryAllocationInstanceAnalysisParameters(String inventoryAllocationInstanceAnalysisParameters) {
    this.inventoryAllocationInstanceAnalysisParameters = inventoryAllocationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return inventoryAllocationInstanceAnalysisReport
  **/

  public Object getInventoryAllocationInstanceAnalysisReport() {
    return inventoryAllocationInstanceAnalysisReport;
  }

  public void setInventoryAllocationInstanceAnalysisReport(Object inventoryAllocationInstanceAnalysisReport) {
    this.inventoryAllocationInstanceAnalysisReport = inventoryAllocationInstanceAnalysisReport;
  }


}


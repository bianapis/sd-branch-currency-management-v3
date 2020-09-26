package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryAllocationRetrieveOutputModelInventoryAllocationInstanceReport
 */
public class BQInventoryAllocationRetrieveOutputModelInventoryAllocationInstanceReport   {
  private Object inventoryAllocationInstanceReportRecord = null;

  private String inventoryAllocationInstanceReportType = null;

  private String inventoryAllocationInstanceReportParameters = null;

  private Object inventoryAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return inventoryAllocationInstanceReportRecord
  **/

  public Object getInventoryAllocationInstanceReportRecord() {
    return inventoryAllocationInstanceReportRecord;
  }

  public void setInventoryAllocationInstanceReportRecord(Object inventoryAllocationInstanceReportRecord) {
    this.inventoryAllocationInstanceReportRecord = inventoryAllocationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return inventoryAllocationInstanceReportType
  **/

  public String getInventoryAllocationInstanceReportType() {
    return inventoryAllocationInstanceReportType;
  }

  public void setInventoryAllocationInstanceReportType(String inventoryAllocationInstanceReportType) {
    this.inventoryAllocationInstanceReportType = inventoryAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return inventoryAllocationInstanceReportParameters
  **/

  public String getInventoryAllocationInstanceReportParameters() {
    return inventoryAllocationInstanceReportParameters;
  }

  public void setInventoryAllocationInstanceReportParameters(String inventoryAllocationInstanceReportParameters) {
    this.inventoryAllocationInstanceReportParameters = inventoryAllocationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return inventoryAllocationInstanceReport
  **/

  public Object getInventoryAllocationInstanceReport() {
    return inventoryAllocationInstanceReport;
  }

  public void setInventoryAllocationInstanceReport(Object inventoryAllocationInstanceReport) {
    this.inventoryAllocationInstanceReport = inventoryAllocationInstanceReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceAnalysis;
import org.bian.dto.BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInventoryAllocationRetrieveInputModel
 */
public class BQInventoryAllocationRetrieveInputModel   {
  private Object inventoryAllocationRetrieveActionTaskRecord = null;

  private String inventoryAllocationRetrieveActionRequest = null;

  private BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceReport inventoryAllocationInstanceReport = null;

  private BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceAnalysis inventoryAllocationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inventoryAllocationRetrieveActionTaskRecord
  **/

  public Object getInventoryAllocationRetrieveActionTaskRecord() {
    return inventoryAllocationRetrieveActionTaskRecord;
  }

  public void setInventoryAllocationRetrieveActionTaskRecord(Object inventoryAllocationRetrieveActionTaskRecord) {
    this.inventoryAllocationRetrieveActionTaskRecord = inventoryAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return inventoryAllocationRetrieveActionRequest
  **/

  public String getInventoryAllocationRetrieveActionRequest() {
    return inventoryAllocationRetrieveActionRequest;
  }

  public void setInventoryAllocationRetrieveActionRequest(String inventoryAllocationRetrieveActionRequest) {
    this.inventoryAllocationRetrieveActionRequest = inventoryAllocationRetrieveActionRequest;
  }


  /**
   * Get inventoryAllocationInstanceReport
   * @return inventoryAllocationInstanceReport
  **/

  public BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceReport getInventoryAllocationInstanceReport() {
    return inventoryAllocationInstanceReport;
  }

  public void setInventoryAllocationInstanceReport(BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceReport inventoryAllocationInstanceReport) {
    this.inventoryAllocationInstanceReport = inventoryAllocationInstanceReport;
  }


  /**
   * Get inventoryAllocationInstanceAnalysis
   * @return inventoryAllocationInstanceAnalysis
  **/

  public BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceAnalysis getInventoryAllocationInstanceAnalysis() {
    return inventoryAllocationInstanceAnalysis;
  }

  public void setInventoryAllocationInstanceAnalysis(BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceAnalysis inventoryAllocationInstanceAnalysis) {
    this.inventoryAllocationInstanceAnalysis = inventoryAllocationInstanceAnalysis;
  }


}


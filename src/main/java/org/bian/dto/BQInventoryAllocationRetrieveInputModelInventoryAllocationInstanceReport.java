package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceReport
 */
public class BQInventoryAllocationRetrieveInputModelInventoryAllocationInstanceReport   {
  private String inventoryAllocationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return inventoryAllocationInstanceReportReference
  **/

  public String getInventoryAllocationInstanceReportReference() {
    return inventoryAllocationInstanceReportReference;
  }

  public void setInventoryAllocationInstanceReportReference(String inventoryAllocationInstanceReportReference) {
    this.inventoryAllocationInstanceReportReference = inventoryAllocationInstanceReportReference;
  }


}


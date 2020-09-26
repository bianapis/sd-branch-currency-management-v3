package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedService
 */
public class SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedService   {
  private String branchCurrencyManagementServiceReference = null;

  private SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecord branchCurrencyManagementServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return branchCurrencyManagementServiceReference
  **/

  public String getBranchCurrencyManagementServiceReference() {
    return branchCurrencyManagementServiceReference;
  }

  public void setBranchCurrencyManagementServiceReference(String branchCurrencyManagementServiceReference) {
    this.branchCurrencyManagementServiceReference = branchCurrencyManagementServiceReference;
  }


  /**
   * Get branchCurrencyManagementServiceRecord
   * @return branchCurrencyManagementServiceRecord
  **/

  public SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecord getBranchCurrencyManagementServiceRecord() {
    return branchCurrencyManagementServiceRecord;
  }

  public void setBranchCurrencyManagementServiceRecord(SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecord branchCurrencyManagementServiceRecord) {
    this.branchCurrencyManagementServiceRecord = branchCurrencyManagementServiceRecord;
  }


}


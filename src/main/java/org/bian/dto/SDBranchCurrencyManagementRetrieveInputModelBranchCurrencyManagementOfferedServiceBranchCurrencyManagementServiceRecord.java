package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecord
 */
public class SDBranchCurrencyManagementRetrieveInputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecord   {
  private String branchCurrencyManagementServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return branchCurrencyManagementServiceVersion
  **/

  public String getBranchCurrencyManagementServiceVersion() {
    return branchCurrencyManagementServiceVersion;
  }

  public void setBranchCurrencyManagementServiceVersion(String branchCurrencyManagementServiceVersion) {
    this.branchCurrencyManagementServiceVersion = branchCurrencyManagementServiceVersion;
  }


}


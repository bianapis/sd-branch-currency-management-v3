package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup
 */
public class SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup   {
  private String branchCurrencyManagementServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return branchCurrencyManagementServiceConfigurationParameter
  **/

  public String getBranchCurrencyManagementServiceConfigurationParameter() {
    return branchCurrencyManagementServiceConfigurationParameter;
  }

  public void setBranchCurrencyManagementServiceConfigurationParameter(String branchCurrencyManagementServiceConfigurationParameter) {
    this.branchCurrencyManagementServiceConfigurationParameter = branchCurrencyManagementServiceConfigurationParameter;
  }


}


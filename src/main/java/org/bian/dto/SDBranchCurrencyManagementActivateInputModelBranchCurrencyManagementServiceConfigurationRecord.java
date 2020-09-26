package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecord
 */
public class SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecord   {
  private String branchCurrencyManagementServiceConfigurationSettingReference = null;

  private String branchCurrencyManagementServiceConfigurationSettingType = null;

  private SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup branchCurrencyManagementServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return branchCurrencyManagementServiceConfigurationSettingReference
  **/

  public String getBranchCurrencyManagementServiceConfigurationSettingReference() {
    return branchCurrencyManagementServiceConfigurationSettingReference;
  }

  public void setBranchCurrencyManagementServiceConfigurationSettingReference(String branchCurrencyManagementServiceConfigurationSettingReference) {
    this.branchCurrencyManagementServiceConfigurationSettingReference = branchCurrencyManagementServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return branchCurrencyManagementServiceConfigurationSettingType
  **/

  public String getBranchCurrencyManagementServiceConfigurationSettingType() {
    return branchCurrencyManagementServiceConfigurationSettingType;
  }

  public void setBranchCurrencyManagementServiceConfigurationSettingType(String branchCurrencyManagementServiceConfigurationSettingType) {
    this.branchCurrencyManagementServiceConfigurationSettingType = branchCurrencyManagementServiceConfigurationSettingType;
  }


  /**
   * Get branchCurrencyManagementServiceConfigurationSetup
   * @return branchCurrencyManagementServiceConfigurationSetup
  **/

  public SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup getBranchCurrencyManagementServiceConfigurationSetup() {
    return branchCurrencyManagementServiceConfigurationSetup;
  }

  public void setBranchCurrencyManagementServiceConfigurationSetup(SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup branchCurrencyManagementServiceConfigurationSetup) {
    this.branchCurrencyManagementServiceConfigurationSetup = branchCurrencyManagementServiceConfigurationSetup;
  }


}


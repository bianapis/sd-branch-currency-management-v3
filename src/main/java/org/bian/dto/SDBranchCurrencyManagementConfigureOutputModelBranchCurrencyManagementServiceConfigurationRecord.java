package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement;
import org.bian.dto.SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup;
import org.bian.dto.SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementConfigureOutputModelBranchCurrencyManagementServiceConfigurationRecord
 */
public class SDBranchCurrencyManagementConfigureOutputModelBranchCurrencyManagementServiceConfigurationRecord   {
  private String branchCurrencyManagementServiceConfigurationSettingDescription = null;

  private SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup branchCurrencyManagementServiceConfigurationSetup = null;

  private SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription branchCurrencyManagementServiceSubscription = null;

  private SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement branchCurrencyManagementServiceAgreement = null;

  private String branchCurrencyManagementServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return branchCurrencyManagementServiceConfigurationSettingDescription
  **/

  public String getBranchCurrencyManagementServiceConfigurationSettingDescription() {
    return branchCurrencyManagementServiceConfigurationSettingDescription;
  }

  public void setBranchCurrencyManagementServiceConfigurationSettingDescription(String branchCurrencyManagementServiceConfigurationSettingDescription) {
    this.branchCurrencyManagementServiceConfigurationSettingDescription = branchCurrencyManagementServiceConfigurationSettingDescription;
  }


  /**
   * Get branchCurrencyManagementServiceConfigurationSetup
   * @return branchCurrencyManagementServiceConfigurationSetup
  **/

  public SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup getBranchCurrencyManagementServiceConfigurationSetup() {
    return branchCurrencyManagementServiceConfigurationSetup;
  }

  public void setBranchCurrencyManagementServiceConfigurationSetup(SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup branchCurrencyManagementServiceConfigurationSetup) {
    this.branchCurrencyManagementServiceConfigurationSetup = branchCurrencyManagementServiceConfigurationSetup;
  }


  /**
   * Get branchCurrencyManagementServiceSubscription
   * @return branchCurrencyManagementServiceSubscription
  **/

  public SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription getBranchCurrencyManagementServiceSubscription() {
    return branchCurrencyManagementServiceSubscription;
  }

  public void setBranchCurrencyManagementServiceSubscription(SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription branchCurrencyManagementServiceSubscription) {
    this.branchCurrencyManagementServiceSubscription = branchCurrencyManagementServiceSubscription;
  }


  /**
   * Get branchCurrencyManagementServiceAgreement
   * @return branchCurrencyManagementServiceAgreement
  **/

  public SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement getBranchCurrencyManagementServiceAgreement() {
    return branchCurrencyManagementServiceAgreement;
  }

  public void setBranchCurrencyManagementServiceAgreement(SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement branchCurrencyManagementServiceAgreement) {
    this.branchCurrencyManagementServiceAgreement = branchCurrencyManagementServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return branchCurrencyManagementServiceStatus
  **/

  public String getBranchCurrencyManagementServiceStatus() {
    return branchCurrencyManagementServiceStatus;
  }

  public void setBranchCurrencyManagementServiceStatus(String branchCurrencyManagementServiceStatus) {
    this.branchCurrencyManagementServiceStatus = branchCurrencyManagementServiceStatus;
  }


}


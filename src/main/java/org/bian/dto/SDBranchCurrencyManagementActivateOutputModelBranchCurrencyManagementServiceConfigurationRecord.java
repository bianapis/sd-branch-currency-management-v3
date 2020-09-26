package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup;
import org.bian.dto.SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement;
import org.bian.dto.SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecord
 */
public class SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecord   {
  private String branchCurrencyManagementServiceConfigurationSettingReference = null;

  private String branchCurrencyManagementServiceConfigurationSettingDescription = null;

  private SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup branchCurrencyManagementServiceConfigurationSetup = null;

  private SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription branchCurrencyManagementServiceSubscription = null;

  private SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement branchCurrencyManagementServiceAgreement = null;

  private String branchCurrencyManagementServiceStatus = null;


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

  public SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup getBranchCurrencyManagementServiceConfigurationSetup() {
    return branchCurrencyManagementServiceConfigurationSetup;
  }

  public void setBranchCurrencyManagementServiceConfigurationSetup(SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup branchCurrencyManagementServiceConfigurationSetup) {
    this.branchCurrencyManagementServiceConfigurationSetup = branchCurrencyManagementServiceConfigurationSetup;
  }


  /**
   * Get branchCurrencyManagementServiceSubscription
   * @return branchCurrencyManagementServiceSubscription
  **/

  public SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription getBranchCurrencyManagementServiceSubscription() {
    return branchCurrencyManagementServiceSubscription;
  }

  public void setBranchCurrencyManagementServiceSubscription(SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription branchCurrencyManagementServiceSubscription) {
    this.branchCurrencyManagementServiceSubscription = branchCurrencyManagementServiceSubscription;
  }


  /**
   * Get branchCurrencyManagementServiceAgreement
   * @return branchCurrencyManagementServiceAgreement
  **/

  public SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement getBranchCurrencyManagementServiceAgreement() {
    return branchCurrencyManagementServiceAgreement;
  }

  public void setBranchCurrencyManagementServiceAgreement(SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement branchCurrencyManagementServiceAgreement) {
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


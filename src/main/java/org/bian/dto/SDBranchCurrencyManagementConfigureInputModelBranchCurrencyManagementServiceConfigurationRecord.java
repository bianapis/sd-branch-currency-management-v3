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
 * SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecord
 */
public class SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecord   {
  private String branchCurrencyManagementServiceConfigurationSettingReference = null;

  private String branchCurrencyManagementServiceConfigurationSettingType = null;

  private SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceConfigurationSetup branchCurrencyManagementServiceConfigurationSetup = null;

  private SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription branchCurrencyManagementServiceSubscription = null;

  private SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement branchCurrencyManagementServiceAgreement = null;


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


}


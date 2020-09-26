package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription
 */
public class SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceSubscription   {
  private String branchCurrencyManagementServiceSubscriberReference = null;

  private String branchCurrencyManagementServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return branchCurrencyManagementServiceSubscriberReference
  **/

  public String getBranchCurrencyManagementServiceSubscriberReference() {
    return branchCurrencyManagementServiceSubscriberReference;
  }

  public void setBranchCurrencyManagementServiceSubscriberReference(String branchCurrencyManagementServiceSubscriberReference) {
    this.branchCurrencyManagementServiceSubscriberReference = branchCurrencyManagementServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return branchCurrencyManagementServiceSubscriberAccessProfile
  **/

  public String getBranchCurrencyManagementServiceSubscriberAccessProfile() {
    return branchCurrencyManagementServiceSubscriberAccessProfile;
  }

  public void setBranchCurrencyManagementServiceSubscriberAccessProfile(String branchCurrencyManagementServiceSubscriberAccessProfile) {
    this.branchCurrencyManagementServiceSubscriberAccessProfile = branchCurrencyManagementServiceSubscriberAccessProfile;
  }


}


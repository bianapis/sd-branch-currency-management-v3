package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement
 */
public class SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecordBranchCurrencyManagementServiceAgreement   {
  private String branchCurrencyManagementServiceAgreementReference = null;

  private String branchCurrencyManagementServiceUserReference = null;

  private String branchCurrencyManagementServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return branchCurrencyManagementServiceAgreementReference
  **/

  public String getBranchCurrencyManagementServiceAgreementReference() {
    return branchCurrencyManagementServiceAgreementReference;
  }

  public void setBranchCurrencyManagementServiceAgreementReference(String branchCurrencyManagementServiceAgreementReference) {
    this.branchCurrencyManagementServiceAgreementReference = branchCurrencyManagementServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return branchCurrencyManagementServiceUserReference
  **/

  public String getBranchCurrencyManagementServiceUserReference() {
    return branchCurrencyManagementServiceUserReference;
  }

  public void setBranchCurrencyManagementServiceUserReference(String branchCurrencyManagementServiceUserReference) {
    this.branchCurrencyManagementServiceUserReference = branchCurrencyManagementServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return branchCurrencyManagementServiceAgreementTermsandConditions
  **/

  public String getBranchCurrencyManagementServiceAgreementTermsandConditions() {
    return branchCurrencyManagementServiceAgreementTermsandConditions;
  }

  public void setBranchCurrencyManagementServiceAgreementTermsandConditions(String branchCurrencyManagementServiceAgreementTermsandConditions) {
    this.branchCurrencyManagementServiceAgreementTermsandConditions = branchCurrencyManagementServiceAgreementTermsandConditions;
  }


}


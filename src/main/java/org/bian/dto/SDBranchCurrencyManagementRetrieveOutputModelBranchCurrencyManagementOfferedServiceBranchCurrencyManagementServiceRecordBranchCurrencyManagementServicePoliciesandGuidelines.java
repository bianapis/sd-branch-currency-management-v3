package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecordBranchCurrencyManagementServicePoliciesandGuidelines
 */
public class SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecordBranchCurrencyManagementServicePoliciesandGuidelines   {
  private String branchCurrencyManagementServiceEligibility = null;

  private String branchCurrencyManagementServiceIntendedUses = null;

  private String branchCurrencyManagementServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return branchCurrencyManagementServiceEligibility
  **/

  public String getBranchCurrencyManagementServiceEligibility() {
    return branchCurrencyManagementServiceEligibility;
  }

  public void setBranchCurrencyManagementServiceEligibility(String branchCurrencyManagementServiceEligibility) {
    this.branchCurrencyManagementServiceEligibility = branchCurrencyManagementServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return branchCurrencyManagementServiceIntendedUses
  **/

  public String getBranchCurrencyManagementServiceIntendedUses() {
    return branchCurrencyManagementServiceIntendedUses;
  }

  public void setBranchCurrencyManagementServiceIntendedUses(String branchCurrencyManagementServiceIntendedUses) {
    this.branchCurrencyManagementServiceIntendedUses = branchCurrencyManagementServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return branchCurrencyManagementServicePricingandTerms
  **/

  public String getBranchCurrencyManagementServicePricingandTerms() {
    return branchCurrencyManagementServicePricingandTerms;
  }

  public void setBranchCurrencyManagementServicePricingandTerms(String branchCurrencyManagementServicePricingandTerms) {
    this.branchCurrencyManagementServicePricingandTerms = branchCurrencyManagementServicePricingandTerms;
  }


}


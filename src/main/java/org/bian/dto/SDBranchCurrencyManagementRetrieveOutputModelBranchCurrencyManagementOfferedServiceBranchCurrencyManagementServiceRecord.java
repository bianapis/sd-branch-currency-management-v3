package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecordBranchCurrencyManagementServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecord
 */
public class SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecord   {
  private String branchCurrencyManagementServiceType = null;

  private String branchCurrencyManagementServiceVersion = null;

  private String branchCurrencyManagementServiceDescription = null;

  private SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecordBranchCurrencyManagementServicePoliciesandGuidelines branchCurrencyManagementServicePoliciesandGuidelines = null;

  private String branchCurrencyManagementServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return branchCurrencyManagementServiceType
  **/

  public String getBranchCurrencyManagementServiceType() {
    return branchCurrencyManagementServiceType;
  }

  public void setBranchCurrencyManagementServiceType(String branchCurrencyManagementServiceType) {
    this.branchCurrencyManagementServiceType = branchCurrencyManagementServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return branchCurrencyManagementServiceDescription
  **/

  public String getBranchCurrencyManagementServiceDescription() {
    return branchCurrencyManagementServiceDescription;
  }

  public void setBranchCurrencyManagementServiceDescription(String branchCurrencyManagementServiceDescription) {
    this.branchCurrencyManagementServiceDescription = branchCurrencyManagementServiceDescription;
  }


  /**
   * Get branchCurrencyManagementServicePoliciesandGuidelines
   * @return branchCurrencyManagementServicePoliciesandGuidelines
  **/

  public SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecordBranchCurrencyManagementServicePoliciesandGuidelines getBranchCurrencyManagementServicePoliciesandGuidelines() {
    return branchCurrencyManagementServicePoliciesandGuidelines;
  }

  public void setBranchCurrencyManagementServicePoliciesandGuidelines(SDBranchCurrencyManagementRetrieveOutputModelBranchCurrencyManagementOfferedServiceBranchCurrencyManagementServiceRecordBranchCurrencyManagementServicePoliciesandGuidelines branchCurrencyManagementServicePoliciesandGuidelines) {
    this.branchCurrencyManagementServicePoliciesandGuidelines = branchCurrencyManagementServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return branchCurrencyManagementServiceSchedule
  **/

  public String getBranchCurrencyManagementServiceSchedule() {
    return branchCurrencyManagementServiceSchedule;
  }

  public void setBranchCurrencyManagementServiceSchedule(String branchCurrencyManagementServiceSchedule) {
    this.branchCurrencyManagementServiceSchedule = branchCurrencyManagementServiceSchedule;
  }


}


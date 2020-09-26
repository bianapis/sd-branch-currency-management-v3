package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementActivateOutputModel
 */
public class SDBranchCurrencyManagementActivateOutputModel   {
  private String branchCurrencyManagementActivationActionTaskReference = null;

  private Object branchCurrencyManagementActivationActionTaskRecord = null;

  private String branchCurrencyManagementServicingSessionReference = null;

  private Object branchCurrencyManagementServicingSessionRecord = null;

  private SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecord branchCurrencyManagementServiceConfigurationRecord = null;

  private String branchCurrencyManagementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return branchCurrencyManagementActivationActionTaskReference
  **/

  public String getBranchCurrencyManagementActivationActionTaskReference() {
    return branchCurrencyManagementActivationActionTaskReference;
  }

  public void setBranchCurrencyManagementActivationActionTaskReference(String branchCurrencyManagementActivationActionTaskReference) {
    this.branchCurrencyManagementActivationActionTaskReference = branchCurrencyManagementActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return branchCurrencyManagementActivationActionTaskRecord
  **/

  public Object getBranchCurrencyManagementActivationActionTaskRecord() {
    return branchCurrencyManagementActivationActionTaskRecord;
  }

  public void setBranchCurrencyManagementActivationActionTaskRecord(Object branchCurrencyManagementActivationActionTaskRecord) {
    this.branchCurrencyManagementActivationActionTaskRecord = branchCurrencyManagementActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return branchCurrencyManagementServicingSessionReference
  **/

  public String getBranchCurrencyManagementServicingSessionReference() {
    return branchCurrencyManagementServicingSessionReference;
  }

  public void setBranchCurrencyManagementServicingSessionReference(String branchCurrencyManagementServicingSessionReference) {
    this.branchCurrencyManagementServicingSessionReference = branchCurrencyManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return branchCurrencyManagementServicingSessionRecord
  **/

  public Object getBranchCurrencyManagementServicingSessionRecord() {
    return branchCurrencyManagementServicingSessionRecord;
  }

  public void setBranchCurrencyManagementServicingSessionRecord(Object branchCurrencyManagementServicingSessionRecord) {
    this.branchCurrencyManagementServicingSessionRecord = branchCurrencyManagementServicingSessionRecord;
  }


  /**
   * Get branchCurrencyManagementServiceConfigurationRecord
   * @return branchCurrencyManagementServiceConfigurationRecord
  **/

  public SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecord getBranchCurrencyManagementServiceConfigurationRecord() {
    return branchCurrencyManagementServiceConfigurationRecord;
  }

  public void setBranchCurrencyManagementServiceConfigurationRecord(SDBranchCurrencyManagementActivateOutputModelBranchCurrencyManagementServiceConfigurationRecord branchCurrencyManagementServiceConfigurationRecord) {
    this.branchCurrencyManagementServiceConfigurationRecord = branchCurrencyManagementServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return branchCurrencyManagementServicingSessionStatus
  **/

  public String getBranchCurrencyManagementServicingSessionStatus() {
    return branchCurrencyManagementServicingSessionStatus;
  }

  public void setBranchCurrencyManagementServicingSessionStatus(String branchCurrencyManagementServicingSessionStatus) {
    this.branchCurrencyManagementServicingSessionStatus = branchCurrencyManagementServicingSessionStatus;
  }


}


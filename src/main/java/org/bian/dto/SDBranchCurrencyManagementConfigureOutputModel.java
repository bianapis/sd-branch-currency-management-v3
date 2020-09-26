package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementConfigureOutputModelBranchCurrencyManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementConfigureOutputModel
 */
public class SDBranchCurrencyManagementConfigureOutputModel   {
  private String branchCurrencyManagementConfigurationActionTaskReference = null;

  private Object branchCurrencyManagementConfigurationActionTaskRecord = null;

  private SDBranchCurrencyManagementConfigureOutputModelBranchCurrencyManagementServiceConfigurationRecord branchCurrencyManagementServiceConfigurationRecord = null;

  private String branchCurrencyManagementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return branchCurrencyManagementConfigurationActionTaskReference
  **/

  public String getBranchCurrencyManagementConfigurationActionTaskReference() {
    return branchCurrencyManagementConfigurationActionTaskReference;
  }

  public void setBranchCurrencyManagementConfigurationActionTaskReference(String branchCurrencyManagementConfigurationActionTaskReference) {
    this.branchCurrencyManagementConfigurationActionTaskReference = branchCurrencyManagementConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return branchCurrencyManagementConfigurationActionTaskRecord
  **/

  public Object getBranchCurrencyManagementConfigurationActionTaskRecord() {
    return branchCurrencyManagementConfigurationActionTaskRecord;
  }

  public void setBranchCurrencyManagementConfigurationActionTaskRecord(Object branchCurrencyManagementConfigurationActionTaskRecord) {
    this.branchCurrencyManagementConfigurationActionTaskRecord = branchCurrencyManagementConfigurationActionTaskRecord;
  }


  /**
   * Get branchCurrencyManagementServiceConfigurationRecord
   * @return branchCurrencyManagementServiceConfigurationRecord
  **/

  public SDBranchCurrencyManagementConfigureOutputModelBranchCurrencyManagementServiceConfigurationRecord getBranchCurrencyManagementServiceConfigurationRecord() {
    return branchCurrencyManagementServiceConfigurationRecord;
  }

  public void setBranchCurrencyManagementServiceConfigurationRecord(SDBranchCurrencyManagementConfigureOutputModelBranchCurrencyManagementServiceConfigurationRecord branchCurrencyManagementServiceConfigurationRecord) {
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


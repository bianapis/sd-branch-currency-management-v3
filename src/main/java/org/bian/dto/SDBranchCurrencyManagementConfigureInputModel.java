package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementConfigureInputModel
 */
public class SDBranchCurrencyManagementConfigureInputModel   {
  private Object branchCurrencyManagementConfigurationActionTaskRecord = null;

  private String branchCurrencyManagementServicingSessionReference = null;

  private String branchCurrencyManagementServiceReference = null;

  private SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecord branchCurrencyManagementServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return branchCurrencyManagementServiceReference
  **/

  public String getBranchCurrencyManagementServiceReference() {
    return branchCurrencyManagementServiceReference;
  }

  public void setBranchCurrencyManagementServiceReference(String branchCurrencyManagementServiceReference) {
    this.branchCurrencyManagementServiceReference = branchCurrencyManagementServiceReference;
  }


  /**
   * Get branchCurrencyManagementServiceConfigurationRecord
   * @return branchCurrencyManagementServiceConfigurationRecord
  **/

  public SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecord getBranchCurrencyManagementServiceConfigurationRecord() {
    return branchCurrencyManagementServiceConfigurationRecord;
  }

  public void setBranchCurrencyManagementServiceConfigurationRecord(SDBranchCurrencyManagementConfigureInputModelBranchCurrencyManagementServiceConfigurationRecord branchCurrencyManagementServiceConfigurationRecord) {
    this.branchCurrencyManagementServiceConfigurationRecord = branchCurrencyManagementServiceConfigurationRecord;
  }


}


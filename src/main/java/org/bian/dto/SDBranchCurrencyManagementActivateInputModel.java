package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementActivateInputModel
 */
public class SDBranchCurrencyManagementActivateInputModel   {
  private Object branchCurrencyManagementActivationActionTaskRecord = null;

  private String branchCurrencyManagementCenterReference = null;

  private String branchCurrencyManagementServiceReference = null;

  private SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecord branchCurrencyManagementServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return branchCurrencyManagementCenterReference
  **/

  public String getBranchCurrencyManagementCenterReference() {
    return branchCurrencyManagementCenterReference;
  }

  public void setBranchCurrencyManagementCenterReference(String branchCurrencyManagementCenterReference) {
    this.branchCurrencyManagementCenterReference = branchCurrencyManagementCenterReference;
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

  public SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecord getBranchCurrencyManagementServiceConfigurationRecord() {
    return branchCurrencyManagementServiceConfigurationRecord;
  }

  public void setBranchCurrencyManagementServiceConfigurationRecord(SDBranchCurrencyManagementActivateInputModelBranchCurrencyManagementServiceConfigurationRecord branchCurrencyManagementServiceConfigurationRecord) {
    this.branchCurrencyManagementServiceConfigurationRecord = branchCurrencyManagementServiceConfigurationRecord;
  }


}


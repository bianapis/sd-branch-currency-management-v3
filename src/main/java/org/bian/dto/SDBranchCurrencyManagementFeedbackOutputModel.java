package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementFeedbackOutputModelBranchCurrencyManagementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementFeedbackOutputModel
 */
public class SDBranchCurrencyManagementFeedbackOutputModel   {
  private String branchCurrencyManagementFeedbackActionTaskReference = null;

  private Object branchCurrencyManagementFeedbackActionTaskRecord = null;

  private SDBranchCurrencyManagementFeedbackOutputModelBranchCurrencyManagementFeedbackActionRecord branchCurrencyManagementFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return branchCurrencyManagementFeedbackActionTaskReference
  **/

  public String getBranchCurrencyManagementFeedbackActionTaskReference() {
    return branchCurrencyManagementFeedbackActionTaskReference;
  }

  public void setBranchCurrencyManagementFeedbackActionTaskReference(String branchCurrencyManagementFeedbackActionTaskReference) {
    this.branchCurrencyManagementFeedbackActionTaskReference = branchCurrencyManagementFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return branchCurrencyManagementFeedbackActionTaskRecord
  **/

  public Object getBranchCurrencyManagementFeedbackActionTaskRecord() {
    return branchCurrencyManagementFeedbackActionTaskRecord;
  }

  public void setBranchCurrencyManagementFeedbackActionTaskRecord(Object branchCurrencyManagementFeedbackActionTaskRecord) {
    this.branchCurrencyManagementFeedbackActionTaskRecord = branchCurrencyManagementFeedbackActionTaskRecord;
  }


  /**
   * Get branchCurrencyManagementFeedbackActionRecord
   * @return branchCurrencyManagementFeedbackActionRecord
  **/

  public SDBranchCurrencyManagementFeedbackOutputModelBranchCurrencyManagementFeedbackActionRecord getBranchCurrencyManagementFeedbackActionRecord() {
    return branchCurrencyManagementFeedbackActionRecord;
  }

  public void setBranchCurrencyManagementFeedbackActionRecord(SDBranchCurrencyManagementFeedbackOutputModelBranchCurrencyManagementFeedbackActionRecord branchCurrencyManagementFeedbackActionRecord) {
    this.branchCurrencyManagementFeedbackActionRecord = branchCurrencyManagementFeedbackActionRecord;
  }


}


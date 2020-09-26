package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchCurrencyManagementFeedbackInputModelBranchCurrencyManagementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchCurrencyManagementFeedbackInputModel
 */
public class SDBranchCurrencyManagementFeedbackInputModel   {
  private Object branchCurrencyManagementFeedbackActionTaskRecord = null;

  private SDBranchCurrencyManagementFeedbackInputModelBranchCurrencyManagementFeedbackActionRecord branchCurrencyManagementFeedbackActionRecord = null;


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

  public SDBranchCurrencyManagementFeedbackInputModelBranchCurrencyManagementFeedbackActionRecord getBranchCurrencyManagementFeedbackActionRecord() {
    return branchCurrencyManagementFeedbackActionRecord;
  }

  public void setBranchCurrencyManagementFeedbackActionRecord(SDBranchCurrencyManagementFeedbackInputModelBranchCurrencyManagementFeedbackActionRecord branchCurrencyManagementFeedbackActionRecord) {
    this.branchCurrencyManagementFeedbackActionRecord = branchCurrencyManagementFeedbackActionRecord;
  }


}


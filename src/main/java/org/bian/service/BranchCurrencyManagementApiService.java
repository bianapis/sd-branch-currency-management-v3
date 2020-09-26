/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface BranchCurrencyManagementApiService {

	SDBranchCurrencyManagementActivateOutputModel activate(SDBranchCurrencyManagementActivateInputModel request);
	
	BQInventoryAllocationCaptureOutputModel captureInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryAllocationCaptureInputModel request);
	
	CRBranchCashAllocationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBranchCashAllocationCaptureInputModel request);
	
	SDBranchCurrencyManagementConfigureOutputModel configure(String sdReferenceId, SDBranchCurrencyManagementConfigureInputModel request);
	
	BQInventoryAllocationControlOutputModel controlInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryAllocationControlInputModel request);
	
	CRBranchCashAllocationControlOutputModel control(String sdReferenceId, String crReferenceId, CRBranchCashAllocationControlInputModel request);
	
	BQInventoryAllocationExchangeOutputModel exchangeInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryAllocationExchangeInputModel request);
	
	CRBranchCashAllocationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBranchCashAllocationExchangeInputModel request);
	
	SDBranchCurrencyManagementFeedbackOutputModel feedback(String sdReferenceId, SDBranchCurrencyManagementFeedbackInputModel request);
	
	CRBranchCashAllocationInitiateOutputModel initiate(String sdReferenceId, CRBranchCashAllocationInitiateInputModel request);
	
	BQInventoryAllocationInitiateOutputModel initiateInventoryallocation(String sdReferenceId, String crReferenceId, BQInventoryAllocationInitiateInputModel request);
	
	BQInventoryAllocationRetrieveOutputModel retrieveInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRBranchCashAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDBranchCurrencyManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRBranchCashAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBranchCashAllocationUpdateInputModel request);
	
	BQInventoryAllocationUpdateOutputModel updateInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryAllocationUpdateInputModel request);
	
}

/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BranchCurrencyManagementApiServiceImpl implements BranchCurrencyManagementApiService {

	public SDBranchCurrencyManagementActivateOutputModel activate(SDBranchCurrencyManagementActivateInputModel request){
		return JsonReader.read("activate-SDBranchCurrencyManagementActivateOutputModel.json",new TypeReference<SDBranchCurrencyManagementActivateOutputModel>(){});
	}
	
	public BQInventoryAllocationCaptureOutputModel captureInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryAllocationCaptureInputModel request){
		return JsonReader.read("capture-BQInventoryAllocationCaptureOutputModel.json",new TypeReference<BQInventoryAllocationCaptureOutputModel>(){});
	}
	
	public CRBranchCashAllocationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBranchCashAllocationCaptureInputModel request){
		return JsonReader.read("capture-CRBranchCashAllocationCaptureOutputModel.json",new TypeReference<CRBranchCashAllocationCaptureOutputModel>(){});
	}
	
	public SDBranchCurrencyManagementConfigureOutputModel configure(String sdReferenceId, SDBranchCurrencyManagementConfigureInputModel request){
		return JsonReader.read("configure-SDBranchCurrencyManagementConfigureOutputModel.json",new TypeReference<SDBranchCurrencyManagementConfigureOutputModel>(){});
	}
	
	public BQInventoryAllocationControlOutputModel controlInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryAllocationControlInputModel request){
		return JsonReader.read("control-BQInventoryAllocationControlOutputModel.json",new TypeReference<BQInventoryAllocationControlOutputModel>(){});
	}
	
	public CRBranchCashAllocationControlOutputModel control(String sdReferenceId, String crReferenceId, CRBranchCashAllocationControlInputModel request){
		return JsonReader.read("control-CRBranchCashAllocationControlOutputModel.json",new TypeReference<CRBranchCashAllocationControlOutputModel>(){});
	}
	
	public BQInventoryAllocationExchangeOutputModel exchangeInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryAllocationExchangeInputModel request){
		return JsonReader.read("exchange-BQInventoryAllocationExchangeOutputModel.json",new TypeReference<BQInventoryAllocationExchangeOutputModel>(){});
	}
	
	public CRBranchCashAllocationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBranchCashAllocationExchangeInputModel request){
		return JsonReader.read("exchange-CRBranchCashAllocationExchangeOutputModel.json",new TypeReference<CRBranchCashAllocationExchangeOutputModel>(){});
	}
	
	public SDBranchCurrencyManagementFeedbackOutputModel feedback(String sdReferenceId, SDBranchCurrencyManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDBranchCurrencyManagementFeedbackOutputModel.json",new TypeReference<SDBranchCurrencyManagementFeedbackOutputModel>(){});
	}
	
	public CRBranchCashAllocationInitiateOutputModel initiate(String sdReferenceId, CRBranchCashAllocationInitiateInputModel request){
		return JsonReader.read("initiate-CRBranchCashAllocationInitiateOutputModel.json",new TypeReference<CRBranchCashAllocationInitiateOutputModel>(){});
	}
	
	public BQInventoryAllocationInitiateOutputModel initiateInventoryallocation(String sdReferenceId, String crReferenceId, BQInventoryAllocationInitiateInputModel request){
		return JsonReader.read("initiate-BQInventoryAllocationInitiateOutputModel.json",new TypeReference<BQInventoryAllocationInitiateOutputModel>(){});
	}
	
	public BQInventoryAllocationRetrieveOutputModel retrieveInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInventoryAllocationRetrieveOutputModel.json",new TypeReference<BQInventoryAllocationRetrieveOutputModel>(){});
	}
	
	public CRBranchCashAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBranchCashAllocationRetrieveOutputModel.json",new TypeReference<CRBranchCashAllocationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDBranchCurrencyManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDBranchCurrencyManagementRetrieveOutputModel.json",new TypeReference<SDBranchCurrencyManagementRetrieveOutputModel>(){});
	}
	
	public CRBranchCashAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBranchCashAllocationUpdateInputModel request){
		return JsonReader.read("update-CRBranchCashAllocationUpdateOutputModel.json",new TypeReference<CRBranchCashAllocationUpdateOutputModel>(){});
	}
	
	public BQInventoryAllocationUpdateOutputModel updateInventoryallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryAllocationUpdateInputModel request){
		return JsonReader.read("update-BQInventoryAllocationUpdateOutputModel.json",new TypeReference<BQInventoryAllocationUpdateOutputModel>(){});
	}
	
}

/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class BranchCurrencyManagementApiController {

	@Autowired
	BranchCurrencyManagementApiService service;
	
	@Allocate.Activate
	public BianResponse<SDBranchCurrencyManagementActivateOutputModel> activate(@RequestBody BianRequest<SDBranchCurrencyManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("inventoryallocation")
	@Allocate.Capture
	public BianResponse<BQInventoryAllocationCaptureOutputModel> captureInventoryallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureInventoryallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Capture
	public BianResponse<CRBranchCashAllocationCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchCashAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Configure
	public BianResponse<SDBranchCurrencyManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBranchCurrencyManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventoryallocation")
	@Allocate.Control
	public BianResponse<BQInventoryAllocationControlOutputModel> controlInventoryallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlInventoryallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Control
	public BianResponse<CRBranchCashAllocationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchCashAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventoryallocation")
	@Allocate.Exchange
	public BianResponse<BQInventoryAllocationExchangeOutputModel> exchangeInventoryallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeInventoryallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Exchange
	public BianResponse<CRBranchCashAllocationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchCashAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Feedback
	public BianResponse<SDBranchCurrencyManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBranchCurrencyManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Initiate
	public BianResponse<CRBranchCashAllocationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRBranchCashAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventoryallocation")
	@Allocate.Initiate
	public BianResponse<BQInventoryAllocationInitiateOutputModel> initiateInventoryallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQInventoryAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateInventoryallocation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventoryallocation")
	@Allocate.Retrieve
	public BianResponse<BQInventoryAllocationRetrieveOutputModel> retrieveInventoryallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventoryallocation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Allocate.Retrieve
	public BianResponse<CRBranchCashAllocationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Allocate.RetrieveSD
	public BianResponse<SDBranchCurrencyManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Allocate.Update
	public BianResponse<CRBranchCashAllocationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchCashAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventoryallocation")
	@Allocate.Update
	public BianResponse<BQInventoryAllocationUpdateOutputModel> updateInventoryallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInventoryallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

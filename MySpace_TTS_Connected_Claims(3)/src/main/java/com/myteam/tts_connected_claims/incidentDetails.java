package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "incidentDetails")
public class incidentDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("incidentTime")
	private Long incidentTime;

	@org.kie.api.definition.type.Label("location")
	private java.lang.String location;

	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("triggerSource")
	private java.lang.String triggerSource;

	@org.kie.api.definition.type.Label("incidentType")
	private java.lang.String incidentType;

	@org.kie.api.definition.type.Label("riskItem")
	private java.lang.String riskItem;

	@org.kie.api.definition.type.Label("drivable")
	private String drivable;

	@org.kie.api.definition.type.Label("incidentDriver")
	private java.lang.String incidentDriver;

	@org.kie.api.definition.type.Label("speakingTo")
	private java.lang.String speakingTo;

	@org.kie.api.definition.type.Label("passengerCount")
	private java.lang.Integer passengerCount;

	@org.kie.api.definition.type.Label("claimNumber")
	private java.lang.String claimNumber;

	@org.kie.api.definition.type.Label("customerDetails")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.customerDetails customerDetails;

	@org.kie.api.definition.type.Label("policyDetails")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.policyDetails policyDetails;

	@org.kie.api.definition.type.Label("vehicleDetails")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.vehicleDetails vehicleDetails;

	@org.kie.api.definition.type.Label("incidentId")
	private java.lang.String incidentId;

	@org.kie.api.definition.type.Label("incidentDriverOther")
	private java.lang.String incidentDriverOther;

	@org.kie.api.definition.type.Label("speakingToOther")
	private java.lang.String speakingToOther;

	@org.kie.api.definition.type.Label("vehicleIncidentSubType")
	private java.lang.String vehicleIncidentSubType;

	@org.kie.api.definition.type.Label("vehicleIncidentType")
	private java.lang.String vehicleIncidentType;

	@org.kie.api.definition.type.Label("carHireEligibility")
	private java.lang.String carHireEligibility;

	@org.kie.api.definition.type.Label("primaryContactDetails")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private com.myteam.tts_connected_claims.contactDetail primaryContactDetails;

	@org.kie.api.definition.type.Label("secondaryContactDetails")
	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails;

	@org.kie.api.definition.type.Label("medicalDetails")
	private java.lang.String medicalDetails;

	@org.kie.api.definition.type.Label("creator")
	private java.lang.String creator;

	@org.kie.api.definition.type.Label("owner")
	private java.lang.String owner;

	@org.kie.api.definition.type.Label("processId")
	private java.lang.String processId;

	@org.kie.api.definition.type.Label("containerId")
	private java.lang.String containerId;

	@org.kie.api.definition.type.Label("processInstanceId")
	private java.lang.Long processInstanceId;

	@org.kie.api.definition.type.Label("caseStatus")
	private java.lang.String caseStatus;

	@org.kie.api.definition.type.Label("medicalService")
	private java.lang.String medicalService;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("thirdPartyDetails")
	private java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> thirdPartyDetails;

	@org.kie.api.definition.type.Label("enableIncidentServices")
	private java.lang.Boolean enableIncidentServices;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("vehicleInnerDamage")
	private com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage;

	@org.kie.api.definition.type.Label("drivableUpdateReason")
	private java.lang.String drivableUpdateReason;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("vehicleOuterDamage")
	private com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage;

	@org.kie.api.definition.type.Label("caseTime")
	private Long caseTime;

	@org.kie.api.definition.type.Label("agentName")
	private java.lang.String agentName;

	@org.kie.api.definition.type.Label("drivableReasonOther")
	private java.lang.String drivableReasonOther;

	@org.kie.api.definition.type.Label("incidentDriverAssociation")
	private java.lang.String incidentDriverAssociation;

	@org.kie.api.definition.type.Label("riskitemSequenceNo")
	private java.lang.String riskitemSequenceNo;

	@org.kie.api.definition.type.Label("speakingToDisplayValue")
	private java.lang.String speakingToDisplayValue;

	@org.kie.api.definition.type.Label("subCaseStatus")
	private java.lang.String subCaseStatus;

	@org.kie.api.definition.type.Label("toBeResolved")
	private String toBeResolved;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("eligibleServices")
	private com.myteam.tts_connected_claims.eligibleServices eligibleServices;

	@org.kie.api.definition.type.Label("servicesEnabled")
	private java.lang.Boolean servicesEnabled;

	@org.kie.api.definition.type.Label("otherIncidentDriverRelationDesc")
	private java.lang.String otherIncidentDriverRelationDesc;

	@org.kie.api.definition.type.Label("otherIncidentDriverRelationCode")
	private java.lang.String otherIncidentDriverRelationCode;

	@org.kie.api.definition.type.Label("otherIncidentDriverContactInfo")
	private java.lang.String otherIncidentDriverContactInfo;

	@org.kie.api.definition.type.Label("otherIncidentDriverName")
	private java.lang.String otherIncidentDriverName;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("incidentLocation")
	private com.myteam.tts_connected_claims.location incidentLocation;

	@org.kie.api.definition.type.Label("duplicateStatus")
	private java.lang.Boolean duplicateStatus;

	@org.kie.api.definition.type.Label("possibleDuplicate")
	private java.lang.Boolean possibleDuplicate;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("listOfDuplicate")
	private java.util.List<java.lang.String> listOfDuplicate;

	@org.kie.api.definition.type.Label("unresolvableReason")
	private java.lang.String unresolvableReason;

	@org.kie.api.definition.type.Label("unresolvableReasonText")
	private java.lang.String unresolvableReasonText;

	@org.kie.api.definition.type.Label("unresolvableReasonOther")
	private java.lang.String unresolvableReasonOther;

	@org.kie.api.definition.type.Label("vehicleUpdatedFlag")
	private java.lang.Boolean vehicleUpdatedFlag;

	@org.kie.api.definition.type.Label("isReopenedCase")
	private java.lang.Boolean isReopenedCase;

	@org.kie.api.definition.type.Label("isMaster")
	private java.lang.Boolean isMaster;

	@org.kie.api.definition.type.Label("escalated")
	private java.lang.Boolean escalated;

	@org.kie.api.definition.type.Label("escalationDashboard")
	private java.lang.Boolean escalationDashboard;

	@org.kie.api.definition.type.Label("escalationReason")
	private java.lang.String escalationReason;

	@org.kie.api.definition.type.Label("escalationCategory")
	private java.lang.String escalationCategory;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("escalatedServices")
	private java.util.List<com.myteam.tts_connected_claims.escalatedServices> escalatedServices;

	@org.kie.api.definition.type.Label("duplicateStatusText")
	private java.lang.String duplicateStatusText;

	@org.kie.api.definition.type.Label("duplicationResolved")
	private java.lang.Boolean duplicationResolved;

	@org.kie.api.definition.type.Label(value = "masterReference")
	private java.lang.String masterReference;

	public incidentDetails() {
	}

	public java.lang.String getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getTriggerSource() {
		return this.triggerSource;
	}

	public void setTriggerSource(java.lang.String triggerSource) {
		this.triggerSource = triggerSource;
	}

	public java.lang.String getIncidentType() {
		return this.incidentType;
	}

	public void setIncidentType(java.lang.String incidentType) {
		this.incidentType = incidentType;
	}

	public java.lang.String getRiskItem() {
		return this.riskItem;
	}

	public void setRiskItem(java.lang.String riskItem) {
		this.riskItem = riskItem;
	}

	public java.lang.String getIncidentDriver() {
		return this.incidentDriver;
	}

	public void setIncidentDriver(java.lang.String incidentDriver) {
		this.incidentDriver = incidentDriver;
	}

	public java.lang.String getSpeakingTo() {
		return this.speakingTo;
	}

	public void setSpeakingTo(java.lang.String speakingTo) {
		this.speakingTo = speakingTo;
	}

	public java.lang.Integer getPassengerCount() {
		return this.passengerCount;
	}

	public void setPassengerCount(java.lang.Integer passengerCount) {
		this.passengerCount = passengerCount;
	}

	public java.lang.String getClaimNumber() {
		return this.claimNumber;
	}

	public void setClaimNumber(java.lang.String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public com.myteam.tts_connected_claims.customerDetails getCustomerDetails() {
		return this.customerDetails;
	}

	public void setCustomerDetails(
			com.myteam.tts_connected_claims.customerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public com.myteam.tts_connected_claims.policyDetails getPolicyDetails() {
		return this.policyDetails;
	}

	public void setPolicyDetails(
			com.myteam.tts_connected_claims.policyDetails policyDetails) {
		this.policyDetails = policyDetails;
	}

	public com.myteam.tts_connected_claims.vehicleDetails getVehicleDetails() {
		return this.vehicleDetails;
	}

	public void setVehicleDetails(
			com.myteam.tts_connected_claims.vehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public java.lang.String getIncidentId() {
		return this.incidentId;
	}

	public void setIncidentId(java.lang.String incidentId) {
		this.incidentId = incidentId;
	}

	public java.lang.String getDrivable() {
		return this.drivable;
	}

	public void setDrivable(java.lang.String drivable) {
		this.drivable = drivable;
	}

	public java.lang.String getIncidentDriverOther() {
		return this.incidentDriverOther;
	}

	public void setIncidentDriverOther(java.lang.String incidentDriverOther) {
		this.incidentDriverOther = incidentDriverOther;
	}

	public java.lang.String getSpeakingToOther() {
		return this.speakingToOther;
	}

	public void setSpeakingToOther(java.lang.String speakingToOther) {
		this.speakingToOther = speakingToOther;
	}

	public java.lang.String getVehicleIncidentSubType() {
		return this.vehicleIncidentSubType;
	}

	public void setVehicleIncidentSubType(
			java.lang.String vehicleIncidentSubType) {
		this.vehicleIncidentSubType = vehicleIncidentSubType;
	}

	public java.lang.String getVehicleIncidentType() {
		return this.vehicleIncidentType;
	}

	public void setVehicleIncidentType(java.lang.String vehicleIncidentType) {
		this.vehicleIncidentType = vehicleIncidentType;
	}

	public java.lang.String getCarHireEligibility() {
		return this.carHireEligibility;
	}

	public void setCarHireEligibility(java.lang.String carHireEligibility) {
		this.carHireEligibility = carHireEligibility;
	}

	public com.myteam.tts_connected_claims.contactDetail getPrimaryContactDetails() {
		return this.primaryContactDetails;
	}

	public void setPrimaryContactDetails(
			com.myteam.tts_connected_claims.contactDetail primaryContactDetails) {
		this.primaryContactDetails = primaryContactDetails;
	}

	public java.util.List<com.myteam.tts_connected_claims.contactDetail> getSecondaryContactDetails() {
		return this.secondaryContactDetails;
	}

	public void setSecondaryContactDetails(
			java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails) {
		this.secondaryContactDetails = secondaryContactDetails;
	}

	public java.lang.String getMedicalDetails() {
		return this.medicalDetails;
	}

	public void setMedicalDetails(java.lang.String medicalDetails) {
		this.medicalDetails = medicalDetails;
	}

	public java.lang.String getCreator() {
		return this.creator;
	}

	public void setCreator(java.lang.String creator) {
		this.creator = creator;
	}

	public java.lang.String getOwner() {
		return this.owner;
	}

	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}

	public incidentDetails(
			java.lang.String location,
			java.lang.String description,
			java.lang.String triggerSource,
			java.lang.String incidentType,
			java.lang.String riskItem,
			java.lang.String drivable,
			java.lang.String incidentDriver,
			java.lang.String speakingTo,
			java.lang.Integer passengerCount,
			java.lang.String claimNumber,
			com.myteam.tts_connected_claims.customerDetails customerDetails,
			com.myteam.tts_connected_claims.policyDetails policyDetails,
			com.myteam.tts_connected_claims.vehicleDetails vehicleDetails,
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage,
			java.lang.String incidentId,
			java.lang.String incidentDriverOther,
			java.lang.String speakingToOther,
			java.lang.String vehicleIncidentSubType,
			java.lang.String vehicleIncidentType,
			java.lang.String carHireEligibility,
			com.myteam.tts_connected_claims.contactDetail primaryContactDetails,
			java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails,
			java.lang.String medicalDetails, java.lang.String creator,
			java.lang.String owner) {
		this.incidentTime = incidentTime;
		this.location = location;
		this.description = description;
		this.triggerSource = triggerSource;
		this.incidentType = incidentType;
		this.riskItem = riskItem;
		this.drivable = drivable;
		this.incidentDriver = incidentDriver;
		this.speakingTo = speakingTo;
		this.passengerCount = passengerCount;
		this.claimNumber = claimNumber;
		this.customerDetails = customerDetails;
		this.policyDetails = policyDetails;
		this.vehicleDetails = vehicleDetails;
		this.vehicleInnerDamage = vehicleInnerDamage;
		this.incidentId = incidentId;
		this.incidentDriverOther = incidentDriverOther;
		this.speakingToOther = speakingToOther;
		this.vehicleIncidentSubType = vehicleIncidentSubType;
		this.vehicleIncidentType = vehicleIncidentType;
		this.carHireEligibility = carHireEligibility;
		this.primaryContactDetails = primaryContactDetails;
		this.secondaryContactDetails = secondaryContactDetails;
		this.medicalDetails = medicalDetails;
		this.creator = creator;
		this.owner = owner;

	}

	public java.lang.String getProcessId() {
		return this.processId;
	}

	public void setProcessId(java.lang.String processId) {
		this.processId = processId;
	}

	public java.lang.String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(java.lang.String containerId) {
		this.containerId = containerId;
	}

	public java.lang.Long getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(java.lang.Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public java.lang.String getCaseStatus() {
		return this.caseStatus;
	}

	public void setCaseStatus(java.lang.String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public java.lang.String getMedicalService() {
		return this.medicalService;
	}

	public void setMedicalService(java.lang.String medicalService) {
		this.medicalService = medicalService;
	}

	public java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> getThirdPartyDetails() {
		return this.thirdPartyDetails;
	}

	public void setThirdPartyDetails(
			java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> thirdPartyDetails) {
		this.thirdPartyDetails = thirdPartyDetails;
	}

	public java.lang.Boolean getEnableIncidentServices() {
		return this.enableIncidentServices;
	}

	public void setEnableIncidentServices(
			java.lang.Boolean enableIncidentServices) {
		this.enableIncidentServices = enableIncidentServices;
	}

	public com.myteam.tts_connected_claims.vehicleInnerDamage getVehicleInnerDamage() {
		return this.vehicleInnerDamage;
	}

	public void setVehicleInnerDamage(
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage) {
		this.vehicleInnerDamage = vehicleInnerDamage;
	}

	public java.lang.String getDrivableUpdateReason() {
		return this.drivableUpdateReason;
	}

	public void setDrivableUpdateReason(java.lang.String drivableUpdateReason) {
		this.drivableUpdateReason = drivableUpdateReason;
	}

	public incidentDetails(
			java.lang.Long incidentTime,
			java.lang.String location,
			java.lang.String description,
			java.lang.String triggerSource,
			java.lang.String incidentType,
			java.lang.String riskItem,
			java.lang.String drivable,
			java.lang.String incidentDriver,
			java.lang.String speakingTo,
			java.lang.Integer passengerCount,
			java.lang.String claimNumber,
			com.myteam.tts_connected_claims.customerDetails customerDetails,
			com.myteam.tts_connected_claims.policyDetails policyDetails,
			com.myteam.tts_connected_claims.vehicleDetails vehicleDetails,
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage,
			java.lang.String incidentId,
			java.lang.String incidentDriverOther,
			java.lang.String speakingToOther,
			java.lang.String vehicleIncidentSubType,
			java.lang.String vehicleIncidentType,
			java.lang.String carHireEligibility,
			com.myteam.tts_connected_claims.contactDetail primaryContactDetails,
			java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails,
			java.lang.String medicalDetails,
			java.lang.String creator,
			java.lang.String owner,
			java.lang.String processId,
			java.lang.String containerId,
			java.lang.Long processInstanceId,
			java.lang.String caseStatus,
			java.lang.String medicalService,
			java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> thirdPartyDetails,
			java.lang.Boolean enableIncidentServices,
			java.lang.String drivableUpdateReason) {
		this.incidentTime = incidentTime;
		this.location = location;
		this.description = description;
		this.triggerSource = triggerSource;
		this.incidentType = incidentType;
		this.riskItem = riskItem;
		this.drivable = drivable;
		this.incidentDriver = incidentDriver;
		this.speakingTo = speakingTo;
		this.passengerCount = passengerCount;
		this.claimNumber = claimNumber;
		this.customerDetails = customerDetails;
		this.policyDetails = policyDetails;
		this.vehicleDetails = vehicleDetails;
		this.vehicleInnerDamage = vehicleInnerDamage;
		this.incidentId = incidentId;
		this.incidentDriverOther = incidentDriverOther;
		this.speakingToOther = speakingToOther;
		this.vehicleIncidentSubType = vehicleIncidentSubType;
		this.vehicleIncidentType = vehicleIncidentType;
		this.carHireEligibility = carHireEligibility;
		this.primaryContactDetails = primaryContactDetails;
		this.secondaryContactDetails = secondaryContactDetails;
		this.medicalDetails = medicalDetails;
		this.creator = creator;
		this.owner = owner;
		this.processId = processId;
		this.containerId = containerId;
		this.processInstanceId = processInstanceId;
		this.caseStatus = caseStatus;
		this.medicalService = medicalService;
		this.thirdPartyDetails = thirdPartyDetails;
		this.enableIncidentServices = enableIncidentServices;
		this.drivableUpdateReason = drivableUpdateReason;
	}

	public com.myteam.tts_connected_claims.vehicleOuterDamage getVehicleOuterDamage() {
		return this.vehicleOuterDamage;
	}

	public void setVehicleOuterDamage(
			com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage) {
		this.vehicleOuterDamage = vehicleOuterDamage;
	}

	public java.lang.String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(java.lang.String agentName) {
		this.agentName = agentName;
	}

	public java.lang.String getDrivableReasonOther() {
		return this.drivableReasonOther;
	}

	public void setDrivableReasonOther(java.lang.String drivableReasonOther) {
		this.drivableReasonOther = drivableReasonOther;
	}

	public java.lang.String getIncidentDriverAssociation() {
		return this.incidentDriverAssociation;
	}

	public void setIncidentDriverAssociation(
			java.lang.String incidentDriverAssociation) {
		this.incidentDriverAssociation = incidentDriverAssociation;
	}

	public java.lang.String getRiskitemSequenceNo() {
		return this.riskitemSequenceNo;
	}

	public void setRiskitemSequenceNo(java.lang.String riskitemSequenceNo) {
		this.riskitemSequenceNo = riskitemSequenceNo;
	}

	public java.lang.String getSpeakingToDisplayValue() {
		return this.speakingToDisplayValue;
	}

	public void setSpeakingToDisplayValue(
			java.lang.String speakingToDisplayValue) {
		this.speakingToDisplayValue = speakingToDisplayValue;
	}

	public java.lang.String getSubCaseStatus() {
		return this.subCaseStatus;
	}

	public void setSubCaseStatus(java.lang.String subCaseStatus) {
		this.subCaseStatus = subCaseStatus;
	}

	public com.myteam.tts_connected_claims.eligibleServices getEligibleServices() {
		return this.eligibleServices;
	}

	public void setEligibleServices(
			com.myteam.tts_connected_claims.eligibleServices eligibleServices) {
		this.eligibleServices = eligibleServices;
	}

	public java.lang.Boolean getServicesEnabled() {
		return this.servicesEnabled;
	}

	public void setServicesEnabled(java.lang.Boolean servicesEnabled) {
		this.servicesEnabled = servicesEnabled;
	}

	public java.lang.String getOtherIncidentDriverRelationDesc() {
		return this.otherIncidentDriverRelationDesc;
	}

	public void setOtherIncidentDriverRelationDesc(
			java.lang.String otherIncidentDriverRelationDesc) {
		this.otherIncidentDriverRelationDesc = otherIncidentDriverRelationDesc;
	}

	public java.lang.String getOtherIncidentDriverRelationCode() {
		return this.otherIncidentDriverRelationCode;
	}

	public void setOtherIncidentDriverRelationCode(
			java.lang.String otherIncidentDriverRelationCode) {
		this.otherIncidentDriverRelationCode = otherIncidentDriverRelationCode;
	}

	public java.lang.String getOtherIncidentDriverContactInfo() {
		return this.otherIncidentDriverContactInfo;
	}

	public void setOtherIncidentDriverContactInfo(
			java.lang.String otherIncidentDriverContactInfo) {
		this.otherIncidentDriverContactInfo = otherIncidentDriverContactInfo;
	}

	public java.lang.String getOtherIncidentDriverName() {
		return this.otherIncidentDriverName;
	}

	public void setOtherIncidentDriverName(
			java.lang.String otherIncidentDriverName) {
		this.otherIncidentDriverName = otherIncidentDriverName;
	}

	public com.myteam.tts_connected_claims.location getIncidentLocation() {
		return this.incidentLocation;
	}

	public void setIncidentLocation(
			com.myteam.tts_connected_claims.location incidentLocation) {
		this.incidentLocation = incidentLocation;
	}

	public java.lang.Long getIncidentTime() {
		return this.incidentTime;
	}

	public void setIncidentTime(java.lang.Long incidentTime) {
		this.incidentTime = incidentTime;
	}

	public java.lang.Long getCaseTime() {
		return this.caseTime;
	}

	public void setCaseTime(java.lang.Long caseTime) {
		this.caseTime = caseTime;
	}

	public java.lang.String getToBeResolved() {
		return this.toBeResolved;
	}

	public void setToBeResolved(java.lang.String toBeResolved) {
		this.toBeResolved = toBeResolved;
	}

	public java.lang.Boolean getDuplicateStatus() {
		return this.duplicateStatus;
	}

	public void setDuplicateStatus(java.lang.Boolean duplicateStatus) {
		this.duplicateStatus = duplicateStatus;
	}

	public java.lang.Boolean getPossibleDuplicate() {
		return this.possibleDuplicate;
	}

	public void setPossibleDuplicate(java.lang.Boolean possibleDuplicate) {
		this.possibleDuplicate = possibleDuplicate;
	}

	public java.util.List<java.lang.String> getListOfDuplicate() {
		return this.listOfDuplicate;
	}

	public void setListOfDuplicate(
			java.util.List<java.lang.String> listOfDuplicate) {
		this.listOfDuplicate = listOfDuplicate;
	}

	public java.lang.String getUnresolvableReason() {
		return this.unresolvableReason;
	}

	public void setUnresolvableReason(java.lang.String unresolvableReason) {
		this.unresolvableReason = unresolvableReason;
	}

	public java.lang.String getUnresolvableReasonText() {
		return this.unresolvableReasonText;
	}

	public void setUnresolvableReasonText(
			java.lang.String unresolvableReasonText) {
		this.unresolvableReasonText = unresolvableReasonText;
	}

	public java.lang.String getUnresolvableReasonOther() {
		return this.unresolvableReasonOther;
	}

	public void setUnresolvableReasonOther(
			java.lang.String unresolvableReasonOther) {
		this.unresolvableReasonOther = unresolvableReasonOther;
	}

	public java.lang.Boolean getVehicleUpdatedFlag() {
		return this.vehicleUpdatedFlag;
	}

	public void setVehicleUpdatedFlag(java.lang.Boolean vehicleUpdatedFlag) {
		this.vehicleUpdatedFlag = vehicleUpdatedFlag;
	}

	public java.lang.Boolean getIsReopenedCase() {
		return this.isReopenedCase;
	}

	public void setIsReopenedCase(java.lang.Boolean isReopenedCase) {
		this.isReopenedCase = isReopenedCase;
	}

	public java.lang.Boolean getIsMaster() {
		return this.isMaster;
	}

	public void setIsMaster(java.lang.Boolean isMaster) {
		this.isMaster = isMaster;
	}

	public java.lang.Boolean getEscalated() {
		return this.escalated;
	}

	public void setEscalated(java.lang.Boolean escalated) {
		this.escalated = escalated;
	}

	public java.lang.Boolean getEscalationDashboard() {
		return this.escalationDashboard;
	}

	public void setEscalationDashboard(java.lang.Boolean escalationDashboard) {
		this.escalationDashboard = escalationDashboard;
	}

	public java.lang.String getEscalationReason() {
		return this.escalationReason;
	}

	public void setEscalationReason(java.lang.String escalationReason) {
		this.escalationReason = escalationReason;
	}

	public java.lang.String getEscalationCategory() {
		return this.escalationCategory;
	}

	public void setEscalationCategory(java.lang.String escalationCategory) {
		this.escalationCategory = escalationCategory;
	}

	public java.util.List<com.myteam.tts_connected_claims.escalatedServices> getEscalatedServices() {
		return this.escalatedServices;
	}

	public void setEscalatedServices(
			java.util.List<com.myteam.tts_connected_claims.escalatedServices> escalatedServices) {
		this.escalatedServices = escalatedServices;
	}

	public java.lang.String getDuplicateStatusText() {
		return this.duplicateStatusText;
	}

	public void setDuplicateStatusText(java.lang.String duplicateStatusText) {
		this.duplicateStatusText = duplicateStatusText;
	}

	public java.lang.Boolean getDuplicationResolved() {
		return this.duplicationResolved;
	}

	public void setDuplicationResolved(java.lang.Boolean duplicationResolved) {
		this.duplicationResolved = duplicationResolved;
	}

	public java.lang.String getMasterReference() {
		return this.masterReference;
	}

	public void setMasterReference(java.lang.String masterReference) {
		this.masterReference = masterReference;
	}

	public incidentDetails(
			java.lang.Long incidentTime,
			java.lang.String location,
			java.lang.String description,
			java.lang.String triggerSource,
			java.lang.String incidentType,
			java.lang.String riskItem,
			java.lang.String drivable,
			java.lang.String incidentDriver,
			java.lang.String speakingTo,
			java.lang.Integer passengerCount,
			java.lang.String claimNumber,
			com.myteam.tts_connected_claims.customerDetails customerDetails,
			com.myteam.tts_connected_claims.policyDetails policyDetails,
			com.myteam.tts_connected_claims.vehicleDetails vehicleDetails,
			java.lang.String incidentId,
			java.lang.String incidentDriverOther,
			java.lang.String speakingToOther,
			java.lang.String vehicleIncidentSubType,
			java.lang.String vehicleIncidentType,
			java.lang.String carHireEligibility,
			com.myteam.tts_connected_claims.contactDetail primaryContactDetails,
			java.util.List<com.myteam.tts_connected_claims.contactDetail> secondaryContactDetails,
			java.lang.String medicalDetails,
			java.lang.String creator,
			java.lang.String owner,
			java.lang.String processId,
			java.lang.String containerId,
			java.lang.Long processInstanceId,
			java.lang.String caseStatus,
			java.lang.String medicalService,
			java.util.List<com.myteam.tts_connected_claims.thirdPartyDetails> thirdPartyDetails,
			java.lang.Boolean enableIncidentServices,
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage,
			java.lang.String drivableUpdateReason,
			com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage,
			java.lang.Long caseTime,
			java.lang.String agentName,
			java.lang.String drivableReasonOther,
			java.lang.String incidentDriverAssociation,
			java.lang.String riskitemSequenceNo,
			java.lang.String speakingToDisplayValue,
			java.lang.String subCaseStatus,
			java.lang.String toBeResolved,
			com.myteam.tts_connected_claims.eligibleServices eligibleServices,
			java.lang.Boolean servicesEnabled,
			java.lang.String otherIncidentDriverRelationDesc,
			java.lang.String otherIncidentDriverRelationCode,
			java.lang.String otherIncidentDriverContactInfo,
			java.lang.String otherIncidentDriverName,
			com.myteam.tts_connected_claims.location incidentLocation,
			java.lang.Boolean duplicateStatus,
			java.lang.Boolean possibleDuplicate,
			java.util.List<java.lang.String> listOfDuplicate,
			java.lang.String unresolvableReason,
			java.lang.String unresolvableReasonText,
			java.lang.String unresolvableReasonOther,
			java.lang.Boolean vehicleUpdatedFlag,
			java.lang.Boolean isReopenedCase,
			java.lang.Boolean isMaster,
			java.lang.Boolean escalated,
			java.lang.Boolean escalationDashboard,
			java.lang.String escalationReason,
			java.lang.String escalationCategory,
			java.util.List<com.myteam.tts_connected_claims.escalatedServices> escalatedServices,
			java.lang.String duplicateStatusText,
			java.lang.Boolean duplicationResolved,
			java.lang.String masterReference) {
		this.incidentTime = incidentTime;
		this.location = location;
		this.description = description;
		this.triggerSource = triggerSource;
		this.incidentType = incidentType;
		this.riskItem = riskItem;
		this.drivable = drivable;
		this.incidentDriver = incidentDriver;
		this.speakingTo = speakingTo;
		this.passengerCount = passengerCount;
		this.claimNumber = claimNumber;
		this.customerDetails = customerDetails;
		this.policyDetails = policyDetails;
		this.vehicleDetails = vehicleDetails;
		this.incidentId = incidentId;
		this.incidentDriverOther = incidentDriverOther;
		this.speakingToOther = speakingToOther;
		this.vehicleIncidentSubType = vehicleIncidentSubType;
		this.vehicleIncidentType = vehicleIncidentType;
		this.carHireEligibility = carHireEligibility;
		this.primaryContactDetails = primaryContactDetails;
		this.secondaryContactDetails = secondaryContactDetails;
		this.medicalDetails = medicalDetails;
		this.creator = creator;
		this.owner = owner;
		this.processId = processId;
		this.containerId = containerId;
		this.processInstanceId = processInstanceId;
		this.caseStatus = caseStatus;
		this.medicalService = medicalService;
		this.thirdPartyDetails = thirdPartyDetails;
		this.enableIncidentServices = enableIncidentServices;
		this.vehicleInnerDamage = vehicleInnerDamage;
		this.drivableUpdateReason = drivableUpdateReason;
		this.vehicleOuterDamage = vehicleOuterDamage;
		this.caseTime = caseTime;
		this.agentName = agentName;
		this.drivableReasonOther = drivableReasonOther;
		this.incidentDriverAssociation = incidentDriverAssociation;
		this.riskitemSequenceNo = riskitemSequenceNo;
		this.speakingToDisplayValue = speakingToDisplayValue;
		this.subCaseStatus = subCaseStatus;
		this.toBeResolved = toBeResolved;
		this.eligibleServices = eligibleServices;
		this.servicesEnabled = servicesEnabled;
		this.otherIncidentDriverRelationDesc = otherIncidentDriverRelationDesc;
		this.otherIncidentDriverRelationCode = otherIncidentDriverRelationCode;
		this.otherIncidentDriverContactInfo = otherIncidentDriverContactInfo;
		this.otherIncidentDriverName = otherIncidentDriverName;
		this.incidentLocation = incidentLocation;
		this.duplicateStatus = duplicateStatus;
		this.possibleDuplicate = possibleDuplicate;
		this.listOfDuplicate = listOfDuplicate;
		this.unresolvableReason = unresolvableReason;
		this.unresolvableReasonText = unresolvableReasonText;
		this.unresolvableReasonOther = unresolvableReasonOther;
		this.vehicleUpdatedFlag = vehicleUpdatedFlag;
		this.isReopenedCase = isReopenedCase;
		this.isMaster = isMaster;
		this.escalated = escalated;
		this.escalationDashboard = escalationDashboard;
		this.escalationReason = escalationReason;
		this.escalationCategory = escalationCategory;
		this.escalatedServices = escalatedServices;
		this.duplicateStatusText = duplicateStatusText;
		this.duplicationResolved = duplicationResolved;
		this.masterReference = masterReference;
	}

}
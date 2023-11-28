package com.test1;

public class UploadControls {
	private Integer uploadIndicator;
	private String uploadMode;
	private String autoEnabled;
	private String uploadAttestations;
	private String toBeMigratedOn;
	private Integer formatsMigrated;
	private Boolean testControlsMet;
	private Boolean uploadEvidencesAttached;
	private Integer uploadCoverage;
	private String teamManagerContact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UploadControls() {

	}

	public UploadControls(Integer uploadIndicator, String uploadMode, String autoEnabled, String uploadAttestations,
			String toBeMigratedOn, Integer formatsMigrated, Boolean testControlsMet, Boolean uploadEvidencesAttached,
			Integer uploadCoverage, String teamManagerContact, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.uploadIndicator = uploadIndicator;
		this.uploadMode = uploadMode;
		this.autoEnabled = autoEnabled;
		this.uploadAttestations = uploadAttestations;
		this.toBeMigratedOn = toBeMigratedOn;
		this.formatsMigrated = formatsMigrated;
		this.testControlsMet = testControlsMet;
		this.uploadEvidencesAttached = uploadEvidencesAttached;
		this.uploadCoverage = uploadCoverage;
		this.teamManagerContact = teamManagerContact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getUploadIndicator() {
		return uploadIndicator;
	}

	public void setUploadIndicator(Integer uploadIndicator) {
		this.uploadIndicator = uploadIndicator;
	}

	public String getUploadMode() {
		return uploadMode;
	}

	public void setUploadMode(String uploadMode) {
		this.uploadMode = uploadMode;
	}

	public String getAutoEnabled() {
		return autoEnabled;
	}

	public void setAutoEnabled(String autoEnabled) {
		this.autoEnabled = autoEnabled;
	}

	public String getUploadAttestations() {
		return uploadAttestations;
	}

	public void setUploadAttestations(String uploadAttestations) {
		this.uploadAttestations = uploadAttestations;
	}

	public String getToBeMigratedOn() {
		return toBeMigratedOn;
	}

	public void setToBeMigratedOn(String toBeMigratedOn) {
		this.toBeMigratedOn = toBeMigratedOn;
	}

	public Integer getFormatsMigrated() {
		return formatsMigrated;
	}

	public void setFormatsMigrated(Integer formatsMigrated) {
		this.formatsMigrated = formatsMigrated;
	}

	public Boolean getTestControlsMet() {
		return testControlsMet;
	}

	public void setTestControlsMet(Boolean testControlsMet) {
		this.testControlsMet = testControlsMet;
	}

	public Boolean getUploadEvidencesAttached() {
		return uploadEvidencesAttached;
	}

	public void setUploadEvidencesAttached(Boolean uploadEvidencesAttached) {
		this.uploadEvidencesAttached = uploadEvidencesAttached;
	}

	public Integer getUploadCoverage() {
		return uploadCoverage;
	}

	public void setUploadCoverage(Integer uploadCoverage) {
		this.uploadCoverage = uploadCoverage;
	}

	public String getTeamManagerContact() {
		return teamManagerContact;
	}

	public void setTeamManagerContact(String teamManagerContact) {
		this.teamManagerContact = teamManagerContact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

package com.test1;

public class CfgExcelUpload {
	private Integer uploadId;
	private String refName;
	private String fileName;
	private String createdBy;
	private String uploadDesc;
	private String pendingOn;
	private String currentStatus;
	private String authirizationBy;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CfgExcelUpload() {

	}

	public CfgExcelUpload(Integer uploadId, String refName, String fileName, String createdBy, String uploadDesc,
			String pendingOn, String currentStatus, String authirizationBy, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.uploadId = uploadId;
		this.refName = refName;
		this.fileName = fileName;
		this.createdBy = createdBy;
		this.uploadDesc = uploadDesc;
		this.pendingOn = pendingOn;
		this.currentStatus = currentStatus;
		this.authirizationBy = authirizationBy;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getUploadId() {
		return uploadId;
	}

	public void setUploadId(Integer uploadId) {
		this.uploadId = uploadId;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUploadDesc() {
		return uploadDesc;
	}

	public void setUploadDesc(String uploadDesc) {
		this.uploadDesc = uploadDesc;
	}

	public String getPendingOn() {
		return pendingOn;
	}

	public void setPendingOn(String pendingOn) {
		this.pendingOn = pendingOn;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getAuthirizationBy() {
		return authirizationBy;
	}

	public void setAuthirizationBy(String authirizationBy) {
		this.authirizationBy = authirizationBy;
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

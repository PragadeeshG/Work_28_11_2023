package com.test1;

public class AutoUpoadJob {
	private Integer jobId;
	private String uploadTime;
	private String downTime;
	private String emailIdsfrom;
	private String emailTo;
	private String subjectPattern;
	private String signature;
	private String cc;
	private String timeZone;
	private String teamContact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AutoUpoadJob() {

	}

	public AutoUpoadJob(Integer jobId, String uploadTime, String downTime, String emailIdsfrom, String emailTo,
			String subjectPattern, String signature, String cc, String timeZone, String teamContact,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.jobId = jobId;
		this.uploadTime = uploadTime;
		this.downTime = downTime;
		this.emailIdsfrom = emailIdsfrom;
		this.emailTo = emailTo;
		this.subjectPattern = subjectPattern;
		this.signature = signature;
		this.cc = cc;
		this.timeZone = timeZone;
		this.teamContact = teamContact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getDownTime() {
		return downTime;
	}

	public void setDownTime(String downTime) {
		this.downTime = downTime;
	}

	public String getEmailIdsfrom() {
		return emailIdsfrom;
	}

	public void setEmailIdsfrom(String emailIdsfrom) {
		this.emailIdsfrom = emailIdsfrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubjectPattern() {
		return subjectPattern;
	}

	public void setSubjectPattern(String subjectPattern) {
		this.subjectPattern = subjectPattern;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getTeamContact() {
		return teamContact;
	}

	public void setTeamContact(String teamContact) {
		this.teamContact = teamContact;
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

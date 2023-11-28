package com.test1;

public class uploadAuthentucation {
	private Integer authId;
	private String authMethod;
	private Boolean basicAuth;
	private Boolean jsonAuth;
	private String privateKey;
	private String publicKey;
	private Long validTimestamp;
	private String secretKey;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public uploadAuthentucation() {

	}

	public uploadAuthentucation(Integer authId, String authMethod, Boolean basicAuth, Boolean jsonAuth,
			String privateKey, String publicKey, Long validTimestamp, String secretKey, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.authId = authId;
		this.authMethod = authMethod;
		this.basicAuth = basicAuth;
		this.jsonAuth = jsonAuth;
		this.privateKey = privateKey;
		this.publicKey = publicKey;
		this.validTimestamp = validTimestamp;
		this.secretKey = secretKey;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getAuthId() {
		return authId;
	}

	public void setAuthId(Integer authId) {
		this.authId = authId;
	}

	public String getAuthMethod() {
		return authMethod;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}

	public Boolean getBasicAuth() {
		return basicAuth;
	}

	public void setBasicAuth(Boolean basicAuth) {
		this.basicAuth = basicAuth;
	}

	public Boolean getJsonAuth() {
		return jsonAuth;
	}

	public void setJsonAuth(Boolean jsonAuth) {
		this.jsonAuth = jsonAuth;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public Long getValidTimestamp() {
		return validTimestamp;
	}

	public void setValidTimestamp(Long validTimestamp) {
		this.validTimestamp = validTimestamp;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
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

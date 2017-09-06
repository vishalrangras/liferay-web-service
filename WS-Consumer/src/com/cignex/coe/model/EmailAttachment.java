package com.cignex.coe.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "EMAIL_ATTACHMENT_ID", "attachmentFileName", "attachmentFileText", "createTimestamp",
		"createUserId", "emailReminderId", "lastUpdateTimestamp", "lastUpdateUserId" })
public class EmailAttachment {
	
	public EmailAttachment() {
		
	}

	@JsonProperty("EMAIL_ATTACHMENT_ID")
	private long eMAILATTACHMENTID;
	@JsonProperty("attachmentFileName")
	private String attachmentFileName;
	
	
	@JsonProperty("attachmentFileText")
	private Object attachmentFileText;
	@JsonProperty("createTimestamp")
	private Date createTimestamp;
	@JsonProperty("createUserId")
	private String createUserId;
	@JsonProperty("emailReminderId")
	private long emailReminderId;
	@JsonProperty("lastUpdateTimestamp")
	private Date lastUpdateTimestamp;
	@JsonProperty("lastUpdateUserId")
	private long lastUpdateUserId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("EMAIL_ATTACHMENT_ID")
	public long getEMAILATTACHMENTID() {
		return eMAILATTACHMENTID;
	}

	@JsonProperty("EMAIL_ATTACHMENT_ID")
	public void setEMAILATTACHMENTID(Integer eMAILATTACHMENTID) {
		this.eMAILATTACHMENTID = eMAILATTACHMENTID;
	}

	@JsonProperty("attachmentFileName")
	public String getAttachmentFileName() {
		return attachmentFileName;
	}

	@JsonProperty("attachmentFileName")
	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName;
	}

	@JsonProperty("attachmentFileText")
	public Object getAttachmentFileText() {
		return attachmentFileText;
	}

	@JsonProperty("attachmentFileText")
	public void setAttachmentFileText(Object attachmentFileText) {
		this.attachmentFileText = attachmentFileText;
	}

	@JsonProperty("createTimestamp")
	public Date getCreateTimestamp() {
		return createTimestamp;
	}

	@JsonProperty("createTimestamp")
	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	@JsonProperty("createUserId")
	public String getCreateUserId() {
		return createUserId;
	}

	@JsonProperty("createUserId")
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	@JsonProperty("emailReminderId")
	public long getEmailReminderId() {
		return emailReminderId;
	}

	@JsonProperty("emailReminderId")
	public void setEmailReminderId(long emailReminderId) {
		this.emailReminderId = emailReminderId;
	}

	@JsonProperty("lastUpdateTimestamp")
	public Date getLastUpdateTimestamp() {
		return lastUpdateTimestamp;
	}

	@JsonProperty("lastUpdateTimestamp")
	public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}

	@JsonProperty("lastUpdateUserId")
	public long getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	@JsonProperty("lastUpdateUserId")
	public void setLastUpdateUserId(long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "EmailAttachment [eMAILATTACHMENTID=" + eMAILATTACHMENTID + ", attachmentFileName=" + attachmentFileName
				+ ", attachmentFileText=" + attachmentFileText + ", createTimestamp=" + createTimestamp
				+ ", createUserId=" + createUserId + ", emailReminderId=" + emailReminderId + ", lastUpdateTimestamp="
				+ lastUpdateTimestamp + ", lastUpdateUserId=" + lastUpdateUserId + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
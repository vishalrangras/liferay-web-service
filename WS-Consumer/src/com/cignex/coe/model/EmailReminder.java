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
@JsonPropertyOrder({ "createTimestamp", "createUserId", "emailBodyText", "emailReminderId", "emailSubjectText",
		"lastUpdateTimestamp", "lastUpdateUserId", "reminderNumber", "scheduleTimestamp", "statusCode",
		"submitterEmailId", "submitterName" })
public class EmailReminder {

	@JsonProperty("createTimestamp")
	private Date createTimestamp;
	@JsonProperty("createUserId")
	private long createUserId;
	@JsonProperty("emailBodyText")
	private String emailBodyText;
	@JsonProperty("emailReminderId")
	private long emailReminderId;
	@JsonProperty("emailSubjectText")
	private String emailSubjectText;
	@JsonProperty("lastUpdateTimestamp")
	private Date lastUpdateTimestamp;
	@JsonProperty("lastUpdateUserId")
	private long lastUpdateUserId;
	@JsonProperty("reminderNumber")
	private int reminderNumber;
	@JsonProperty("scheduleTimestamp")
	private Date scheduleTimestamp;
	@JsonProperty("statusCode")
	private String statusCode;
	@JsonProperty("submitterEmailId")
	private String submitterEmailId;
	@JsonProperty("submitterName")
	private String submitterName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("createTimestamp")
	public Date getCreateTimestamp() {
		return createTimestamp;
	}

	@JsonProperty("createTimestamp")
	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	@JsonProperty("createUserId")
	public long getCreateUserId() {
		return createUserId;
	}

	@JsonProperty("createUserId")
	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}

	@JsonProperty("emailBodyText")
	public String getEmailBodyText() {
		return emailBodyText;
	}

	@JsonProperty("emailBodyText")
	public void setEmailBodyText(String emailBodyText) {
		this.emailBodyText = emailBodyText;
	}

	@JsonProperty("emailReminderId")
	public long getEmailReminderId() {
		return emailReminderId;
	}

	@JsonProperty("emailReminderId")
	public void setEmailReminderId(long emailReminderId) {
		this.emailReminderId = emailReminderId;
	}

	@JsonProperty("emailSubjectText")
	public String getEmailSubjectText() {
		return emailSubjectText;
	}

	@JsonProperty("emailSubjectText")
	public void setEmailSubjectText(String emailSubjectText) {
		this.emailSubjectText = emailSubjectText;
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

	@JsonProperty("reminderNumber")
	public Integer getReminderNumber() {
		return reminderNumber;
	}

	@JsonProperty("reminderNumber")
	public void setReminderNumber(Integer reminderNumber) {
		this.reminderNumber = reminderNumber;
	}

	@JsonProperty("scheduleTimestamp")
	public Date getScheduleTimestamp() {
		return scheduleTimestamp;
	}

	@JsonProperty("scheduleTimestamp")
	public void setScheduleTimestamp(Date scheduleTimestamp) {
		this.scheduleTimestamp = scheduleTimestamp;
	}

	@JsonProperty("statusCode")
	public String getStatusCode() {
		return statusCode;
	}

	@JsonProperty("statusCode")
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@JsonProperty("submitterEmailId")
	public String getSubmitterEmailId() {
		return submitterEmailId;
	}

	@JsonProperty("submitterEmailId")
	public void setSubmitterEmailId(String submitterEmailId) {
		this.submitterEmailId = submitterEmailId;
	}

	@JsonProperty("submitterName")
	public String getSubmitterName() {
		return submitterName;
	}

	@JsonProperty("submitterName")
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
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
		return "EmailReminder [createTimestamp=" + createTimestamp + ", createUserId=" + createUserId
				+ ", emailBodyText=" + emailBodyText + ", emailReminderId=" + emailReminderId + ", emailSubjectText="
				+ emailSubjectText + ", lastUpdateTimestamp=" + lastUpdateTimestamp + ", lastUpdateUserId="
				+ lastUpdateUserId + ", reminderNumber=" + reminderNumber + ", scheduleTimestamp=" + scheduleTimestamp
				+ ", statusCode=" + statusCode + ", submitterEmailId=" + submitterEmailId + ", submitterName="
				+ submitterName + ", additionalProperties=" + additionalProperties + "]";
	}

}
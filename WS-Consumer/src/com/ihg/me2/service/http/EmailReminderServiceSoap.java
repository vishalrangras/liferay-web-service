/**
 * EmailReminderServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ihg.me2.service.http;

public interface EmailReminderServiceSoap extends java.rmi.Remote {
    public com.ihg.me2.model.EmailReminderSoap addEmailReminder(java.lang.String submitterName, java.lang.String submitterEmailId, int reminderNumber, java.util.Calendar scheduleTimestamp, java.lang.String emailSubjectTxt, java.lang.String emailBodyTxt, java.lang.String statusCode, java.lang.String createUserId, java.util.Calendar createTimestamp, java.lang.String lastUpdateUserId, java.util.Calendar lastUpdateTimestamp) throws java.rmi.RemoteException;
    public com.ihg.me2.model.EmailReminderSoap getEmailReminderById(long emailReminderId) throws java.rmi.RemoteException;
    public com.ihg.me2.model.EmailReminderSoap[] getEmailReminderBySchedule(java.util.Calendar scheduleTimestamp) throws java.rmi.RemoteException;
    public com.ihg.me2.model.EmailReminderSoap[] getEmailReminders() throws java.rmi.RemoteException;
    public com.ihg.me2.model.EmailReminderSoap[] getEmailReminders(int start, int end) throws java.rmi.RemoteException;
    public com.ihg.me2.model.EmailReminderSoap updateEmailReminder(long emailReminderId, java.lang.String submitterName, java.lang.String submitterEmailId, int reminderNumber, java.util.Calendar scheduleTimestamp, java.lang.String emailSubjectTxt, java.lang.String emailBodyTxt, java.lang.String statusCode, java.lang.String lastUpdateUserId, java.util.Calendar lastUpdateTimestamp) throws java.rmi.RemoteException;
}

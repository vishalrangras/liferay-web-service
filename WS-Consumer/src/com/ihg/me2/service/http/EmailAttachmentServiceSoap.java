/**
 * EmailAttachmentServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ihg.me2.service.http;

public interface EmailAttachmentServiceSoap extends java.rmi.Remote {
    public com.ihg.me2.model.EmailAttachmentSoap addEmailAttachment(long emailReminderId, java.lang.String attachmentFileName, java.lang.Object attachmentFileTxt, java.lang.String createUserId, java.util.Calendar createTimestamp, java.lang.String lastUpdateUserId, java.util.Calendar lastUpdateTimestamp) throws java.rmi.RemoteException;
    public com.ihg.me2.model.EmailAttachmentSoap getEmailAttachmentById(long emailAttachmentId) throws java.rmi.RemoteException;
    public com.ihg.me2.model.EmailAttachmentSoap[] getEmailAttachmentByReminderId(long emailReminderId) throws java.rmi.RemoteException;
    public com.ihg.me2.model.EmailAttachmentSoap updateEmailAttachment(long emailAttachmentId, java.lang.String attachmentFileName, java.lang.Object attachmentFileTxt, java.lang.String lastUpdateUserId, java.util.Calendar lastUpdateTimestamp) throws java.rmi.RemoteException;
}

package com.ihg.me2.service.http;

public class EmailAttachmentServiceSoapProxy implements com.ihg.me2.service.http.EmailAttachmentServiceSoap {
  private String _endpoint = null;
  private com.ihg.me2.service.http.EmailAttachmentServiceSoap emailAttachmentServiceSoap = null;
  
  public EmailAttachmentServiceSoapProxy() {
    _initEmailAttachmentServiceSoapProxy();
  }
  
  public EmailAttachmentServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmailAttachmentServiceSoapProxy();
  }
  
  private void _initEmailAttachmentServiceSoapProxy() {
    try {
      emailAttachmentServiceSoap = (new com.ihg.me2.service.http.EmailAttachmentServiceSoapServiceLocator()).getPlugin_endeca_EmailAttachmentService();
      if (emailAttachmentServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)emailAttachmentServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)emailAttachmentServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (emailAttachmentServiceSoap != null)
      ((javax.xml.rpc.Stub)emailAttachmentServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ihg.me2.service.http.EmailAttachmentServiceSoap getEmailAttachmentServiceSoap() {
    if (emailAttachmentServiceSoap == null)
      _initEmailAttachmentServiceSoapProxy();
    return emailAttachmentServiceSoap;
  }
  
  public com.ihg.me2.model.EmailAttachmentSoap addEmailAttachment(long emailReminderId, java.lang.String attachmentFileName, java.lang.Object attachmentFileTxt, java.lang.String createUserId, java.util.Calendar createTimestamp, java.lang.String lastUpdateUserId, java.util.Calendar lastUpdateTimestamp) throws java.rmi.RemoteException{
    if (emailAttachmentServiceSoap == null)
      _initEmailAttachmentServiceSoapProxy();
    return emailAttachmentServiceSoap.addEmailAttachment(emailReminderId, attachmentFileName, attachmentFileTxt, createUserId, createTimestamp, lastUpdateUserId, lastUpdateTimestamp);
  }
  
  public com.ihg.me2.model.EmailAttachmentSoap getEmailAttachmentById(long emailAttachmentId) throws java.rmi.RemoteException{
    if (emailAttachmentServiceSoap == null)
      _initEmailAttachmentServiceSoapProxy();
    return emailAttachmentServiceSoap.getEmailAttachmentById(emailAttachmentId);
  }
  
  public com.ihg.me2.model.EmailAttachmentSoap[] getEmailAttachmentByReminderId(long emailReminderId) throws java.rmi.RemoteException{
    if (emailAttachmentServiceSoap == null)
      _initEmailAttachmentServiceSoapProxy();
    return emailAttachmentServiceSoap.getEmailAttachmentByReminderId(emailReminderId);
  }
  
  public com.ihg.me2.model.EmailAttachmentSoap updateEmailAttachment(long emailAttachmentId, java.lang.String attachmentFileName, java.lang.Object attachmentFileTxt, java.lang.String lastUpdateUserId, java.util.Calendar lastUpdateTimestamp) throws java.rmi.RemoteException{
    if (emailAttachmentServiceSoap == null)
      _initEmailAttachmentServiceSoapProxy();
    return emailAttachmentServiceSoap.updateEmailAttachment(emailAttachmentId, attachmentFileName, attachmentFileTxt, lastUpdateUserId, lastUpdateTimestamp);
  }
  
  
}
package com.ihg.me2.service.http;

public class EmailReminderServiceSoapProxy implements com.ihg.me2.service.http.EmailReminderServiceSoap {
  private String _endpoint = null;
  private com.ihg.me2.service.http.EmailReminderServiceSoap emailReminderServiceSoap = null;
  
  public EmailReminderServiceSoapProxy() {
    _initEmailReminderServiceSoapProxy();
  }
  
  public EmailReminderServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmailReminderServiceSoapProxy();
  }
  
  private void _initEmailReminderServiceSoapProxy() {
    try {
      emailReminderServiceSoap = (new com.ihg.me2.service.http.EmailReminderServiceSoapServiceLocator()).getPlugin_endeca_EmailReminderService();
      if (emailReminderServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)emailReminderServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)emailReminderServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (emailReminderServiceSoap != null)
      ((javax.xml.rpc.Stub)emailReminderServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ihg.me2.service.http.EmailReminderServiceSoap getEmailReminderServiceSoap() {
    if (emailReminderServiceSoap == null)
      _initEmailReminderServiceSoapProxy();
    return emailReminderServiceSoap;
  }
  
  public com.ihg.me2.model.EmailReminderSoap addEmailReminder(java.lang.String submitterName, java.lang.String submitterEmailId, int reminderNumber, java.util.Calendar scheduleTimestamp, java.lang.String emailSubjectTxt, java.lang.String emailBodyTxt, java.lang.String statusCode, java.lang.String createUserId, java.util.Calendar createTimestamp, java.lang.String lastUpdateUserId, java.util.Calendar lastUpdateTimestamp) throws java.rmi.RemoteException{
    if (emailReminderServiceSoap == null)
      _initEmailReminderServiceSoapProxy();
    return emailReminderServiceSoap.addEmailReminder(submitterName, submitterEmailId, reminderNumber, scheduleTimestamp, emailSubjectTxt, emailBodyTxt, statusCode, createUserId, createTimestamp, lastUpdateUserId, lastUpdateTimestamp);
  }
  
  public com.ihg.me2.model.EmailReminderSoap getEmailReminderById(long emailReminderId) throws java.rmi.RemoteException{
    if (emailReminderServiceSoap == null)
      _initEmailReminderServiceSoapProxy();
    return emailReminderServiceSoap.getEmailReminderById(emailReminderId);
  }
  
  public com.ihg.me2.model.EmailReminderSoap[] getEmailReminderBySchedule(java.util.Calendar scheduleTimestamp) throws java.rmi.RemoteException{
    if (emailReminderServiceSoap == null)
      _initEmailReminderServiceSoapProxy();
    return emailReminderServiceSoap.getEmailReminderBySchedule(scheduleTimestamp);
  }
  
  public com.ihg.me2.model.EmailReminderSoap[] getEmailReminders() throws java.rmi.RemoteException{
    if (emailReminderServiceSoap == null)
      _initEmailReminderServiceSoapProxy();
    return emailReminderServiceSoap.getEmailReminders();
  }
  
  public com.ihg.me2.model.EmailReminderSoap[] getEmailReminders(int start, int end) throws java.rmi.RemoteException{
    if (emailReminderServiceSoap == null)
      _initEmailReminderServiceSoapProxy();
    return emailReminderServiceSoap.getEmailReminders(start, end);
  }
  
  public com.ihg.me2.model.EmailReminderSoap updateEmailReminder(long emailReminderId, java.lang.String submitterName, java.lang.String submitterEmailId, int reminderNumber, java.util.Calendar scheduleTimestamp, java.lang.String emailSubjectTxt, java.lang.String emailBodyTxt, java.lang.String statusCode, java.lang.String lastUpdateUserId, java.util.Calendar lastUpdateTimestamp) throws java.rmi.RemoteException{
    if (emailReminderServiceSoap == null)
      _initEmailReminderServiceSoapProxy();
    return emailReminderServiceSoap.updateEmailReminder(emailReminderId, submitterName, submitterEmailId, reminderNumber, scheduleTimestamp, emailSubjectTxt, emailBodyTxt, statusCode, lastUpdateUserId, lastUpdateTimestamp);
  }
  
  
}
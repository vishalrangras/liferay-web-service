package com.cignex.coe;

import com.ihg.me2.model.EmailAttachmentSoap;
import com.ihg.me2.model.EmailReminderSoap;
import com.ihg.me2.service.http.EmailAttachmentServiceSoap;
import com.ihg.me2.service.http.EmailAttachmentServiceSoapServiceLocator;
import com.ihg.me2.service.http.EmailReminderServiceSoap;
import com.ihg.me2.service.http.EmailReminderServiceSoapServiceLocator;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

public class SoapConsumer {
	
	private static final String EMAIL_REMINDER_SERVICE = "Plugin_endeca_EmailReminderService";
	private static final String EMAIL_ATTACHMENT_SERVICE = "Plugin_endeca_EmailAttachmentService";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		try {
			
			getEmailReminderById(2801);
			getEmailAttachmentByReminderId(2801);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
private static List<EmailAttachmentSoap> getEmailAttachmentByReminderId(long emailReminderId) throws MalformedURLException, ServiceException, RemoteException{
		
		
		EmailAttachmentServiceSoapServiceLocator emailAttachmentServiceLocator = new EmailAttachmentServiceSoapServiceLocator();
		EmailAttachmentServiceSoap emailAttachmentServiceSoap = emailAttachmentServiceLocator.getPlugin_endeca_EmailAttachmentService(_getEndecaServiceURL(EMAIL_ATTACHMENT_SERVICE));
		EmailAttachmentSoap[] emailAttachment = emailAttachmentServiceSoap.getEmailAttachmentByReminderId(emailReminderId);
		List<EmailAttachmentSoap> emailAttachmentList = Arrays.asList(emailAttachment);
		System.out.println(emailAttachmentList.get(0).getAttachmentFileName());
		return emailAttachmentList;
	}
	
	
	private static EmailReminderSoap getEmailReminderById(long emailReminderId) throws MalformedURLException, ServiceException, RemoteException{
		
		EmailReminderServiceSoapServiceLocator emailReminderServiceLocator = new EmailReminderServiceSoapServiceLocator();
		EmailReminderServiceSoap emailReminderServiceSoap = emailReminderServiceLocator
				.getPlugin_endeca_EmailReminderService(_getEndecaServiceURL(EMAIL_REMINDER_SERVICE));
		EmailReminderSoap emailReminder = emailReminderServiceSoap.getEmailReminderById(emailReminderId);
		System.out.println(emailReminder.getEmailBodyText());
		return emailReminder;
	}
	
	private static URL _getEndecaServiceURL(String serviceName) throws MalformedURLException{
		String remoteUser = "joebloggs";
		String password = "test";
		String virtualHost = "localhost";
		String port = "8080";
		String context = "/endeca-mail-job-portlet";
		return _getURL(remoteUser, password, virtualHost, port, context, serviceName);

	}

	private static URL _getURL(String remoteUser, String password, String virtualHost, String port, String context, String serviceName) throws MalformedURLException{

		String url = "http://" + remoteUser + ":" + password + "@"+virtualHost+":"+port+context+"/api/axis/" + serviceName;

		return new URL(url);
	}

}

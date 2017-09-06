package com.cignex.coe;

import com.cignex.coe.model.EmailAttachment;
import com.cignex.coe.model.EmailReminder;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

class CredentialContext{
	
	private String hostname;
	private int port;
	private String scheme;
	private String username;
	private String password;
	
	public String getHostname() {
		return hostname;
	}
	
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public String getScheme() {
		return scheme;
	}
	
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public CredentialContext() {
		
	}
	
	public CredentialContext(String hostname, int port, String scheme, String username, String password) {
		this.hostname = hostname;
		this.port = port;
		this.scheme = scheme;
		this.username = username;
		this.password = password;
	}
	
	
	
}

public class ReminderRestConsumer {
	
	public static Connection connection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		CredentialContext credentialContext = new CredentialContext("localhost", 8080, "http", "joebloggs", "test");
		
		/*String hostname = "localhost";
		int port = 8080;
		String scheme = "http";
		String username = "joebloggs";
		String password = "test";*/
		
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse("2017-09-08");
			List<EmailReminder> emailReminderList = getRemindersBySchedule(credentialContext, date);
			
			Date start = new Date();
			
			for(EmailReminder emailReminder: emailReminderList){
				System.out.println("Processing the email: "+emailReminder.getEmailSubjectText());
				List<EmailAttachment> emailAttachmentList = getAttachmentByReminderId(credentialContext, emailReminder.getEmailReminderId());
				sendEmail(credentialContext, emailReminder, emailAttachmentList);
				//updateReminderStatus(credentialContext, emailReminder.getEmailReminderId(), "2");
			}
			
			Date stop = new Date();
			long time = stop.getTime()-start.getTime();
			System.out.println("Time taken for the job using Rest Call: "+time);
			
			start = new Date();
			
			for(EmailReminder emailReminder: emailReminderList){
				System.out.println("Processing the email: "+emailReminder.getEmailSubjectText());
				List<EmailAttachment> emailAttachmentList = getAttachmentByReminderId(credentialContext, emailReminder.getEmailReminderId());
				sendEmail(emailReminder, emailAttachmentList);
				//updateReminderStatus(credentialContext, emailReminder.getEmailReminderId(), "2");
			}
			
			stop = new Date();
			time = stop.getTime()-start.getTime();
			System.out.println("Time taken for the job using DB Call: "+time);
			
			
			/*List<EmailAttachment> emailAttachmentList = getAttachmentByReminderId(credentialContext, 1);
			Date start = new Date();
			
			for(EmailAttachment attachment: emailAttachmentList){
				System.out.println("Processing attachment:"+attachment.getEMAILATTACHMENTID());
				byte[] data = getAttachmentFileById(credentialContext, attachment.getEMAILATTACHMENTID());
				FileOutputStream outputStream = new FileOutputStream("c:/test/"+attachment.getAttachmentFileName());
				outputStream.write(data);
				outputStream.close();
			}
			
			Date stop = new Date();
			long time = stop.getTime()-start.getTime();
			System.out.println("Time taken for the job using Rest Call: "+time);
			
			start = new Date();
			
			for(EmailAttachment attachment: emailAttachmentList){
				System.out.println("Processing attachment:"+attachment.getEMAILATTACHMENTID());
				byte[] data = getAttachmentFromDb(attachment.getEMAILATTACHMENTID());
				FileOutputStream outputStream = new FileOutputStream("c:/test2/"+attachment.getAttachmentFileName());
				outputStream.write(data);
				outputStream.close();
			}
			
			stop = new Date();
			time = stop.getTime()-start.getTime();
			System.out.println("Time taken for the job using DB Call: "+time);*/
			
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static List<EmailReminder> getRemindersBySchedule(CredentialContext credentialContext, Date date) throws ClientProtocolException, IOException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String strDate = sdf.format(date);
		
		String url = "http://localhost:8080/api/jsonws/endeca-mail-job-portlet.emailreminder/get-email-reminder-by-schedule/schedule-timestamp/"+strDate;
		
		CloseableHttpResponse response = authenticateAndExecute(credentialContext, url, false);
		
		InputStream input = response.getEntity().getContent();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		//EmailAttachment attachment = objectMapper.readValue(input, EmailAttachment.class);
		
		List<EmailReminder> emailReminderList =  objectMapper.readValue(input, TypeFactory.defaultInstance().constructCollectionType(List.class, EmailReminder.class));
		
		return emailReminderList;
	}
	
	public static boolean updateReminderStatus(CredentialContext credentialContext, long emailReminderId, String statusCode) throws ClientProtocolException, IOException{
		
		String url = "http://localhost:8080/api/jsonws/endeca-mail-job-portlet.emailreminder/update-email-reminder-status/email-reminder-id/"+emailReminderId+"/status-code/"+statusCode;
		CloseableHttpResponse response = authenticateAndExecute(credentialContext, url, true);
		
		InputStream input = response.getEntity().getContent();
		ObjectMapper objectMapper = new ObjectMapper();
		boolean result = objectMapper.readValue(input, Boolean.class);
		return result;
	}
	
	public static List<EmailAttachment> getAttachmentByReminderId(CredentialContext credentialContext, long emailReminderId) throws JsonParseException, JsonMappingException, IOException{
		
		String url = "http://localhost:8080/api/jsonws/endeca-mail-job-portlet.emailattachment/get-email-attachment-by-reminder-id/email-reminder-id/"+emailReminderId;
		CloseableHttpResponse response = authenticateAndExecute(credentialContext, url, false);
		
		InputStream input = response.getEntity().getContent();
		ObjectMapper objectMapper = new ObjectMapper();
		List<EmailAttachment> emailAttachmentList =  objectMapper.readValue(input, TypeFactory.defaultInstance().constructCollectionType(List.class, EmailAttachment.class));
		return emailAttachmentList;
	}
	
	public static byte[] getAttachmentFileById(CredentialContext credentialContext, long emailAttachmentId) throws ClientProtocolException, IOException{
		String url = "http://localhost:8080/api/jsonws/endeca-mail-job-portlet.emailattachment/get-email-attachment-file-by-id/email-attachment-id/"+emailAttachmentId;
		CloseableHttpResponse response = authenticateAndExecute(credentialContext, url, false);
		
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		response.getEntity().writeTo(byteArrayOutputStream);
		byte[] byteArray = byteArrayOutputStream.toByteArray();
		String attachmentFileText = new String(byteArray);
		byte[] blobBytes = Base64.decodeBase64(attachmentFileText);
		return blobBytes;
	}
	
	public static void sendEmail(CredentialContext credentialContext, EmailReminder emailReminder, List<EmailAttachment> emailAttachmentList) throws MessagingException, ClientProtocolException, IOException{
		
		final String userName = "vishalrangrasconsult@gmail.com";
		final String password = "Neilparker@91";
		
		// sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);
        
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        
        Session session = Session.getInstance(properties, auth);
        
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
        
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress("vishal.rangras@cignex.com") };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(emailReminder.getEmailSubjectText());
        msg.setSentDate(new Date());
        
        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(emailReminder.getEmailBodyText(), "text/html");
        
        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        
        // adds attachments
        if (emailAttachmentList != null && emailAttachmentList.size() > 0) {
            for (EmailAttachment emailAttachment : emailAttachmentList) {
                MimeBodyPart attachPart = new MimeBodyPart();
                byte[] data = getAttachmentFileById(credentialContext, emailAttachment.getEMAILATTACHMENTID());
                DataSource ds = new ByteArrayDataSource(data, "application/x-any");
                attachPart.setDataHandler(new DataHandler(ds));
                attachPart.setFileName(emailAttachment.getAttachmentFileName());
                multipart.addBodyPart(attachPart);
            }
        }
        
        // sets the multi-part as e-mail's content
        msg.setContent(multipart);
        
        // sends the e-mail
        Transport.send(msg);
		
	}
	
public static void sendEmail(EmailReminder emailReminder, List<EmailAttachment> emailAttachmentList) throws MessagingException, ClientProtocolException, IOException, SQLException{
		
		final String userName = "vishalrangrasconsult@gmail.com";
		final String password = "Neilparker@91";
		
		// sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);
        
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        
        Session session = Session.getInstance(properties, auth);
        
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
        
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress("vishal.rangras@cignex.com") };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(emailReminder.getEmailSubjectText());
        msg.setSentDate(new Date());
        
        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(emailReminder.getEmailBodyText(), "text/html");
        
        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        
        // adds attachments
        if (emailAttachmentList != null && emailAttachmentList.size() > 0) {
            for (EmailAttachment emailAttachment : emailAttachmentList) {
                MimeBodyPart attachPart = new MimeBodyPart();
                byte[] data = getAttachmentFromDb(emailAttachment.getEMAILATTACHMENTID());
                DataSource ds = new ByteArrayDataSource(data, "application/x-any");
                attachPart.setDataHandler(new DataHandler(ds));
                attachPart.setFileName(emailAttachment.getAttachmentFileName());
                multipart.addBodyPart(attachPart);
            }
        }
        
        // sets the multi-part as e-mail's content
        msg.setContent(multipart);
        
        // sends the e-mail
        Transport.send(msg);
		
	}
	
	public static byte[] getAttachmentFromDb(long emailAttachmentId) throws FileNotFoundException, IOException, SQLException{
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = "select ATTACHMENT_FILE_TEXT from email_attachment where EMAIL_ATTACHMENT_ID="+emailAttachmentId;
		ResultSet result = statement.executeQuery(sql);
		
		byte[] data;
		
		if (result.next()){
			data = result.getBytes("ATTACHMENT_FILE_TEXT");
			return data;
		}
		
		return null;
	}
	
	public static Connection getConnection() throws FileNotFoundException, IOException, SQLException{
		
		if (connection!=null){
			return connection;
		}else{
			Properties props = new Properties();
			props.load(new FileInputStream("connection.properties"));
			String username = props.getProperty("user");
			String password = props.getProperty("password");
			String url = props.getProperty("dburl");
			connection = DriverManager.getConnection(url, username, password);
			return connection;
		}
		
	};
	
	public static CloseableHttpResponse authenticateAndExecute(String hostname, int port, String scheme, String username, String password, String url, boolean isPost ) throws ClientProtocolException, IOException{
		
		CloseableHttpClient httpclient = null;
		HttpHost targetHost = new HttpHost(hostname, port, scheme);
		HttpClientContext context = HttpClientContext.create();

		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(
				new AuthScope(hostname, AuthScope.ANY_PORT, AuthScope.ANY_REALM, AuthSchemes.BASIC),
				new UsernamePasswordCredentials(username, password));

		// Create AuthCache instance
		AuthCache authCache = new BasicAuthCache();

		// Generate BASIC scheme object and add it to the local auth cache
		BasicScheme basicAuth = new BasicScheme();
		authCache.put(targetHost, basicAuth);

		// Add AuthCache to the execution context
		context = HttpClientContext.create();
		context.setCredentialsProvider(credsProvider);
		context.setAuthCache(authCache);

		httpclient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();
		HttpRequest httpRequest;
		
		if(isPost){
			httpRequest = new HttpPost(url);
		}else{
			httpRequest = new HttpGet(url);
		}
		
				
		CloseableHttpResponse response = httpclient.execute(targetHost, httpRequest, context);
		
		return response;
		
	}
	
	public static CloseableHttpResponse authenticateAndExecute(CredentialContext credentialContext, String url, boolean isPost ) throws ClientProtocolException, IOException{
		
		CloseableHttpClient httpclient = null;
		HttpHost targetHost = new HttpHost(credentialContext.getHostname(), credentialContext.getPort(), credentialContext.getScheme());
		HttpClientContext context = HttpClientContext.create();

		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(
				new AuthScope(credentialContext.getHostname(), AuthScope.ANY_PORT, AuthScope.ANY_REALM, AuthSchemes.BASIC),
				new UsernamePasswordCredentials(credentialContext.getUsername(), credentialContext.getPassword()));

		// Create AuthCache instance
		AuthCache authCache = new BasicAuthCache();

		// Generate BASIC scheme object and add it to the local auth cache
		BasicScheme basicAuth = new BasicScheme();
		authCache.put(targetHost, basicAuth);

		// Add AuthCache to the execution context
		context = HttpClientContext.create();
		context.setCredentialsProvider(credsProvider);
		context.setAuthCache(authCache);

		httpclient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();
		HttpRequest httpRequest;
		
		if(isPost){
			httpRequest = new HttpPost(url);
		}else{
			httpRequest = new HttpGet(url);
		}
		
				
		CloseableHttpResponse response = httpclient.execute(targetHost, httpRequest, context);
		
		return response;
		
	}

}

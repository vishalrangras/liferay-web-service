package com.cignex.coe;




import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloseableHttpClient httpclient = null;
		HttpHost targetHost = new HttpHost("localhost", 8080, "http");
		HttpClientContext context = HttpClientContext.create();

		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(
				new AuthScope("localhost", AuthScope.ANY_PORT, AuthScope.ANY_REALM, AuthSchemes.BASIC),
				new UsernamePasswordCredentials("joebloggs", "test"));

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
		//HttpGet httpGet = new HttpGet("http://localhost:8080/api/jsonws/endeca-mail-job-portlet.emailattachment/get-email-attachment-by-reminder-id/email-reminder-id/2801");
		HttpGet httpGet = new HttpGet("http://localhost:8080/api/jsonws/endeca-mail-job-portlet.emailattachment/get-email-attachment-file-by-id/email-attachment-id/2401");
		
		try {
			
			CloseableHttpResponse response = httpclient.execute(targetHost, httpGet, context);
			
			FileOutputStream outputStream = new FileOutputStream("c:/test/sign2.jpg");
				
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			
			response.getEntity().writeTo(byteArrayOutputStream);
			
			byte[] byteArray = byteArrayOutputStream.toByteArray();
			
			
			String attachmentFileText = new String(byteArray);
			
			System.out.println(attachmentFileText);
			byte[] blobBytes = Base64.decodeBase64(attachmentFileText);
			
			System.out.println(new String(blobBytes));
			outputStream.write(blobBytes);
			outputStream.close();
			
			for(byte data:blobBytes){
				System.out.print(data+",");
			}
			
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

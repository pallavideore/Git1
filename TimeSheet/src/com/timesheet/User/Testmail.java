package com.timesheet.User;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.email.notification.Constants;

/**
 * Servlet implementation class Testmail
 */
@WebServlet("/Testmail")
public class Testmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static void main(String args[]){
		String to = "aakash.shirodkar@datamato.com";
		//String cc = "priyanka.jogdand@datamato.com";

		// Sender's email ID needs to be mentioned
		String from = "clmsupport@mindacorporation.com";
		final String username = "clmsupport@mindacorporation.com";//change accordingly
		final String password =  "Datamato@365";//change accordingly
		
		System.out.println(username);
		System.out.println(password);
		// Assuming you are sending email through relay.jangosmtp.net
		String host = "smtp.office365.com";
		System.out.println(host);
		String port = "587";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);

		// Get the Session object.
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));

			// Set Subject: header field
			message.setSubject("Task Approval");
			String baseUrl = null;
			
			String textbody="hello test";

					
		    System.out.println(textbody);
			    //System.out.println(baseUrl);
			// Send the actual HTML message, as big as you like
			message.setContent(textbody,"text/html");

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");


		} catch (Exception e) {
			e.printStackTrace();
			
		}

		
	}
	
}

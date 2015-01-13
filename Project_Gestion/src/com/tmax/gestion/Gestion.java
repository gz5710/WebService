/**
 * 
 */
package com.tmax.gestion;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author Bruce GONG
 *
 */
public class Gestion {

	private void sendEmail(Date date, int ID, String name, String location, String email){
		final String username = "bruce.gong.tmax@gmail.com";
		final String password = "gzlovexj1314";
		final String to = email;
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("from-email@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(to));
			message.setSubject("Lancement d'une intervention");
			message.setText("Bonjour, cher client, "+name+"\n\n"
					+ "On vient de confirmer votre demande et la lacer à "+location +" le "+date +"\n\n"
				+ "Bien cordialement");
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String gerer(Date date, int ID, String name, String location, String email){
		String compteRendu = "Bonjour, " + name + " On a bien reçu votre demande, notre équipe("+ID+")"
				+ " va vous joindre le "+date;
		this.sendEmail(date, ID, name, location, email);
		return compteRendu;
	}
}

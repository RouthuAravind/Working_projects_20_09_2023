package com.sending_email.sending_email;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.sending_email.sending_email.email.GEmailSender;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		GEmailSender gEmailSender = new GEmailSender();
		String to = "aravindrouthu22@gmail.com";
		String from = "routhuaravind22@gmail.com";
		String subject = "email test_2";
		String text = "hi aravind this is sending using less secure apps";
		File file = new File("D:\\ARA\\4 States trip\\.trashed-1670518637-IMG-20221106-WA0000.jpg");

		boolean b = gEmailSender.sendEmailWithAttachment(to, from, subject, text, file);

		if (b) {
			System.out.println("email sent with attachment");
		} else {
			System.out.println("email with attachment not sent");
		}

		boolean c = gEmailSender.sendEmail(to, from, subject, text);

		if (c) {
			System.out.println("email sent without attachment");
		} else {
			System.out.println("email not sent without attachment");
		}

	}
}
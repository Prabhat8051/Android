/**
 * 
 */
package com.cineverse.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.MailWithAttachment;

/**
 * 
 */
public class MailWithAttachmentTest {
	
	 private MailWithAttachment mailSender;
	    private String host;
	    private String from;
	    private String password;
	    private String[] recipients;
	    private String subject;
	    private String message;
	    private String attachmentPath;
	    public String screenshotdir;

	    @BeforeClass
	    public void setUp() {
	        host = "smtp.gmail.com";
	        from = "prabhat80516@gmail.com";
	        password = "vznyysxsarcsgfuz";  
	        recipients = new String[]{"sjana@cineverse.com", "pjha@cineverse.com", "proy@cineverse.com", "dbanik@cineverse.com", "skumar@cineverse.com", "apalta@cineverse.com", "sghosh@cineverse.com", "susamanta@cineverse.com" };
	        //recipients = new String[] {"pjha@cineverse.com", "prabhatjha1399@gmail.com"};
	        subject = "IOS Automation : Screenshots Sample With Reports";
	        message = "Hi All, Please find the attached report and Scrreshots as a sample purpose.\n" +"Please let me knw if any emhamcement or any suggestion is there. \n" + "\n" + "Thanks & Regards \n" +"Prabhat Jha";
	        attachmentPath = "/Users/testengine/eclipse-workspace/IOS_Automation/allure-report/index.html";
            screenshotdir = "/Users/testengine/eclipse-workspace/IOS_Automation/screenshots";
	        mailSender = new MailWithAttachment(host, from, password);
	    }

	    @Test
	    public void testSendMail() {
	        try {
	            mailSender.sendMail(message, subject, recipients, attachmentPath,screenshotdir);
	            // Add assertions if needed, e.g., check logs or mail delivery status
	            Assert.assertTrue(true, "Email sent successfully.");
	        } catch (Exception e) {
	            Assert.fail("Email sending failed: " + e.getMessage());
	        }
	    }

	    @AfterClass
	    public void tearDown() {
	        // Cleanup resources if needed
	        mailSender = null;
	    }

}

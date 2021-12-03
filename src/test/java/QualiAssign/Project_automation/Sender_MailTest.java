package QualiAssign.Project_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Sender_MailTest {
    //Creating object of Intial() class 
	Initial In=new Initial();
	
	@Test
	public void send_mail() throws IOException, InterruptedException, AWTException {
		//using try to handle exception
		try {
			
		WebDriver driver=In.init_1();
		
		//creating object to access sender login method
		Yahoo_login sl=new Yahoo_login(driver);
		sl.senderlogin();
		driver.manage().window().maximize();
		
		//creating object to access methods from senderobj class
		senderobj so=new senderobj(driver);
		so.composebutton().click();
		so.receivermail().sendKeys("receiversarvesh@yahoo.com");
		so.attachbutton().click();
		so.attachfile().click();
		
		//using Robot class to attach the document
		Robot rb = new Robot();
		Thread.sleep(3000);
		StringSelection str = new StringSelection("C:\\Users\\hp\\Downloads\\Documentexample.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		 // press Contol+V for pasting
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 
		 // release Contol+V for pasting
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 
		 // for pressing and releasing Enter
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		   
	     Thread.sleep(3000);	 
		 so.sendbutton().click();
		 so.alertsend().click();
		 
		 //logging out
		 so.logouthover().click();
		 Thread.sleep(3000);
		 so.logoutbutton().click();
			 
		}catch(Exception e){System.out.println("Document is not sent ");} 
	}
}

package QualiAssign.Project_automation;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Receiver_MailTest {
	 //Creating object of Initial() class 
	Initial In=new Initial();
	
	@Test
	public void send_mail() throws IOException, InterruptedException, AWTException {
		
		//using try and catch to handle exception
		try {
		     WebDriver driver=In.init_1();
		     Yahoo_login sl=new Yahoo_login(driver);
	         sl.receiverlogin();
		     driver.manage().window().maximize();
		
		    Receiverobj ro=new Receiverobj(driver);
		    Thread.sleep(5000);
		    
		    //validating whether the attachment is displayed 
	        Assert.assertTrue(driver.findElement(By.xpath("//*[@data-test-id='attachment-icon']")).isDisplayed());
	        ro.iconbutton().click();
	        ro.attachment().click();	        
	        Thread.sleep(5000);
	        
	        //switching to frames to fetch the contents of document 
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='b_n I_Zmk8Gp em_N']")));
	        
	        //comparing actual with the expected using assertion
	        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='pf1']/div/div")).getText(), "Sarvesh");
	        
	        //switching back to default
	        driver.switchTo().defaultContent();
	        
	        //logging out
	        ro.sign_out1().click();
	        Thread.sleep(3000);
	        ro.sign_out2().click();
	        
		}catch(Exception e){System.out.println("Content is mismatched");} 
	}
}







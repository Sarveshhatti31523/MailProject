package QualiAssign.Project_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Yahoo_login extends Initial{

	public Yahoo_login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public void senderlogin() throws InterruptedException {
		 driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		 
		 driver.findElement(By.id("login-username")).sendKeys("sendersarvesh@yahoo.com");
		 driver.findElement(By.id("login-signin")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("login-passwd")).sendKeys("Sarvesh@4612");
		 driver.findElement(By.xpath("//*[@value='Next']")).click();
         driver.findElement(By.xpath("//*[@title='Mail']")).click();
	}
	
	public void receiverlogin() throws InterruptedException {
		 driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");

		 driver.findElement(By.id("login-username")).sendKeys("receiversarvesh@yahoo.com");
		 driver.findElement(By.id("login-signin")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("login-passwd")).sendKeys("Sarvesh@4612");
		 driver.findElement(By.xpath("//*[@value='Next']")).click();
		 driver.findElement(By.xpath("//*[@title='Mail']")).click();
		 
	}
}

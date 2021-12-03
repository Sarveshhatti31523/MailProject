package QualiAssign.Project_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class senderobj {

	public WebDriver driver;
	
	public senderobj(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement composebutton() {
		return driver.findElement(By.xpath("//a[@role='button']"));
	}
	
	public WebElement receivermail() {
		return driver.findElement(By.xpath("//input[@id='message-to-field']"));
	}
	
	public WebElement attachbutton() {
		return driver.findElement(By.xpath("//button[@data-test-id='icon-btn-attach']"));
	}
	
	public WebElement attachfile() {
		return driver.findElement(By.xpath("//*[text()='Attach files from computer']"));
	}
	
	public WebElement sendbutton() {
		return driver.findElement(By.xpath("//*[text()='Send']"));
	}
	
	public WebElement alertsend() {
		return driver.findElement(By.xpath("//*[@data-test-id='primary-btn']"));
	}
	
	public WebElement logouthover() {
		return driver.findElement(By.xpath("//div[@class='_yb_1tv83']"));
	}
	
	public WebElement logoutbutton() {
		return driver.findElement(By.xpath("//a[@id='profile-signout-link']"));
	}
	
}

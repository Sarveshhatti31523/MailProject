package QualiAssign.Project_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Receiverobj {

public WebDriver driver;
	
	public Receiverobj(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement iconbutton() {
		return driver.findElement(By.xpath("//*[@data-test-id='attachment-icon']"));
	}
	
	public WebElement attachment() {
		return driver.findElement(By.xpath("//div[@data-test-id='attachment-container']"));
	}
	
	
	public WebElement sign_out1() {
		return driver.findElement(By.xpath("//label[@id='ybarAccountMenuOpener']"));
	}
	
	public WebElement sign_out2() {
		return driver.findElement(By.xpath("//a[@id='profile-signout-link']"));
	}
}

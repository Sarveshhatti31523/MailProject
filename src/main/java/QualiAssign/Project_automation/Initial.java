package QualiAssign.Project_automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initial {

	public WebDriver driver;
	
	public WebDriver init_1() throws IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SarAssignment\\src\\main\\java\\QCAssignment\\SarAssignment\\Project.properties");
	    prop.load(fis);
	    String str=prop.getProperty("browser");
	    
	    if(str.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver= new ChromeDriver();		
	    }
	    
	    else if(str.equals("firefox")) {
	    	
	    	driver=new FirefoxDriver();
	    }
	    
	    
	    return driver;
	}

}

package utility;

import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private static WebDriver driver=null;
  private static Properties	 getPropertiesFromPropertyReader;
	private static Logger LOGGER=LogManager.getLogger(DriverManager.class);
	
	public static void setDriver(WebDriver driver) {
	DriverManager.driver=driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public  WebDriver openUrl(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		driver.get(getPropertiesFromPropertyReader.getProperty("url"));
		return driver;
	}
	
	
	public static  void closeBrowser() {
		driver.close();
	}
	
	public  WebDriver  launchBrowser() {
		
	 	 getPropertiesFromPropertyReader=PropertyReader.getProperties(Constants.get_Browser_Url_Properties_Filename());
	 	 try {
			 switch(getPropertiesFromPropertyReader.getProperty("browser")) {
			 
			 case"chrome":
				 ChromeOptions obj_ChromeOptions=new ChromeOptions();
				 obj_ChromeOptions.addArguments("InCognito");
				 obj_ChromeOptions.addArguments("start-maximized");
				WebDriverManager.chromedriver().setup();
				DriverManager.setDriver(new ChromeDriver(obj_ChromeOptions));
				break;
				
			 case"firefox":
				 WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				 break;  
				 
			 case"ie":
				 WebDriverManager.iedriver().setup();
				 driver=new InternetExplorerDriver();
				 break;
				 
			 case"edge":
				 WebDriverManager.edgedriver().setup();
			  
				 break;
				 default:
					 ChromeOptions obj_ChromeOptions2=new ChromeOptions();
					 obj_ChromeOptions2.addArguments("InCognito");
					 obj_ChromeOptions2.addArguments("start-maximized");
					 WebDriverManager.chromedriver().setup();
					   driver=new ChromeDriver(obj_ChromeOptions2);
					 
				 
				break;
			     
			 
			 
			 
			 
			 
			 
			 
			 
			 }
	 		 
	 		 
	 		 
	 		 
	 		 
	 		 
	 		 
	 		 
	 		 
	 		 
	 		 
		} catch (Exception e) {
			 LOGGER.info(e);
		}
	 	 
		 return driver;
		
		 
		 
	}
	
	
	
	
	
}

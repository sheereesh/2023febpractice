package hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.DriverManager;
import utility.ScreenShot;

public class Hooks {
	private static WebDriver driver;
	private static DriverManager obj_DriverManger;
private static  final Logger LOGGER=LogManager.getLogger(Hooks.class);
@Before

public void openUrlandBrowser() {
	LOGGER.info("invoking the browser");
obj_DriverManger=new DriverManager();
	
	
	if(DriverManager.getDriver()==null) {
		obj_DriverManger.openUrl(obj_DriverManger.launchBrowser());
		 
		 LOGGER.info("url opend");
	}
	else
	{
		LOGGER.info("not null");
	}
	
	
	
}
	@After(order=0)
	public void takeAndAttachScreenShotsToReports(Scenario scenario ) {
		
		
		if(scenario.isFailed()) {
			try {
				
				ScreenShot.takeScreenShotForFailedTestCase(scenario);
			} catch (Exception e) {
			System.out.println("please check the screenshot output");
			}
			
		}
	}
		//with out thread sleep we cant see the process clearly for understand purpose it was like that
	//@After(order=1)
	//public void closeBrowser() throws InterruptedException {
	////	Thread.sleep(5000);
		//DriverManager.closeBrowser();
		
	//}
	
}


package utility;





import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import io.cucumber.java.Scenario;


public class ScreenShot {

	public static void takeScreenShotForFailedTestCase(Scenario scenario) throws IOException {
	scenario.log(scenario.getName()+"scenario failed");
                               
File screenShotWithScenarioName=((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
String scenarioName=scenario.getName().replace(" ","_");
Date date=new Date();
SimpleDateFormat obj_SimpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
String string_Date=obj_SimpleDateFormat.format(date);
File destination_Path=new File(System.getProperty("user.dir")+"/screenshots/"+scenarioName+" "+string_Date+".png");
//add to path if doest not work
 
FileUtils.copyFile(screenShotWithScenarioName, destination_Path);


}
	
}

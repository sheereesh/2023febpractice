package commonMethods;



import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.DriverManager;

public class SeleniumSPecificMethods {



	public static final Logger LOGGER=LogManager.getLogger(SeleniumSPecificMethods.class);

	//window maximize

	public static void windowMaximize() {
		DriverManager.getDriver().manage().window().maximize();

		LOGGER.info("window maximized");
	}
	// validate page title 
	public static void  validatePageTitle(String expectedPageTitle) {

		Assert.assertEquals("window title"+expectedPageTitle+ "does not match",expectedPageTitle,DriverManager.getDriver().getTitle());

	}

	public static Object[] getAllWindowHandles() {
		Set<String>	windowHandles=DriverManager.getDriver().getWindowHandles();
		Object[] arrayOfWindows=windowHandles.toArray();

		return arrayOfWindows;
	}

	public static void specificWindowHandle(Object[] windows ,int pageIndexNumber) {
		DriverManager.getDriver().switchTo().window((String)windows[pageIndexNumber]);
		LOGGER.info("focus shifted to "+pageIndexNumber+"window");

	}

	public static void clickLInk(WebElement link) {
		String	link_Text=link.getText();
		link.click();
		LOGGER.info("clicked on the link"+link_Text);
	}


	public static void clickOnTheButton(WebElement button) {
		String	button_Text=button.getText();
		button.click();
		LOGGER.info("clicked on the button"+button_Text);
	}

	public static void clickOnTheButton(WebElement button,String button_text)	{
Assert.assertEquals(button_text,button.getAttribute("value"));
button.click();


LOGGER.info("Clicked on the button"+button_text);
	}
	public static void enterText_TextField(WebElement textbox, String dataToEnter) {
	
	textbox.sendKeys(dataToEnter);
	if(textbox.getText().equals(dataToEnter)) {
		LOGGER.info(dataToEnter+"entered");
	}
	}
public static void  checkText(WebElement elelment,String expected_Text) {
	Assert.assertEquals("expected page not opened", expected_Text, elelment.getText());
}
public static String get_TextLable(WebElement elelment) {
  
    return   elelment.getText();
	
}

//dropdown ====================================
public static void selectMultipleOptionsFromDropdownByVisibleText(WebElement element_DropDown,List<String> values) {
	Select select=new Select(element_DropDown);
	for(String value:values) {
		select.selectByVisibleText(value);
	}
}
public static void selectMultipleOptionsFromDropdownByValue(WebElement element_DropDown,List<String> values) {
	
Select select=new Select(element_DropDown);
for(String value:values) {
	select.selectByValue(value);
}
}

public static void selectMultipleOPtionsFromDropDownByIndex(WebElement elelment, List<String> indexes) {
	
	Select select=new Select(elelment);
	for(String index:indexes) {
	select.selectByIndex((Integer.parseInt(index)));
	
}
}
public static void selectFromDropDown(WebElement element,String howTo,String value) {
Select select=new Select(element);
switch(howTo) {
case "index":
	select.selectByIndex(Integer.parseInt(value));
    break;
case "value":
	 select.selectByValue(value);
	 break;
case "text":
	select.selectByVisibleText(value);
	break;
	default: 
		LOGGER.info("please provide valid selection option");
		break;

}
}
public static void selectFromDropDown(WebElement element,String howTo,List<String> values) {
	Select select=new Select(element);
	switch(howTo) {
		case "index":
			for(String value:values) {
		select.selectByIndex(Integer.parseInt(value));
			}
	break;
	
	
	case "value":
		for(String value:values) {
			select.selectByValue(value);
		}
			break;
	case "text":
	for(String value: values) {
		select.selectByVisibleText(value);	}
	break;
	
	default:
		LOGGER.info("please provide valid selection option");
		break;
			
		}
	}
public static void selectFromDropDownByIndex(WebElement element_dropDown,int index)
{
	Select select=new Select(element_dropDown);
	select.selectByIndex(index);
	
}

public static void selectFromDropDownByValue(WebElement element,String value) {
	Select select=new Select(element);
	select.selectByValue(value);
}

public static void selectFromDropDownByVisibleText(WebElement element,String value) {
	Select select=new Select(element);
	select.selectByVisibleText(value);
}
}





 

 




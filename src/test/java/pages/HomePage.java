package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSPecificMethods;

public class HomePage {
	WebDriver driver;
public   HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//a[contains(text(),'Selenium Example Page')]" )
WebElement link_Selenium_Example_Page;


public void click_On_The_Link() {
	SeleniumSPecificMethods.clickLInk(link_Selenium_Example_Page);
}
}
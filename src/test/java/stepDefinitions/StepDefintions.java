package stepDefinitions;

import commonMethods.SeleniumSPecificMethods;
import io.cucumber.java.en.*;
import pages.HomePage;
import utility.DriverManager;

public class StepDefintions {

@Given("user is in {string}  page")
public void user_is_in_page(String string) {
    SeleniumSPecificMethods.validatePageTitle(string);
 
}

@When("user clicks on  Selenium Example Page link")
public void user_clicks_on_selenium_example_page_link() {
    HomePage obj_Home=new HomePage(DriverManager.getDriver());
    obj_Home.click_On_The_Link();
}

@Then("system should display {string} page")
public void system_should_display_page(String string) {
    
	SeleniumSPecificMethods.validatePageTitle(string);
}
	

}

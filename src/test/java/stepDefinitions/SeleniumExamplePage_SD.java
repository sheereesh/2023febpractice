package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonMethods.SeleniumSPecificMethods;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SeleniumExamplePage;
import utility.DriverManager;

public class SeleniumExamplePage_SD {

	@Given("user is in {string} home page")
	public void user_is_in_home_page(String string) {
	   SeleniumSPecificMethods.validatePageTitle(string);
	}



@When("user enters the {string} on the Form Elements")
public void user_enters_the_on_the_form_elements(String text) {
   SeleniumExamplePage obj_SeleniumExamplePage=new SeleniumExamplePage(DriverManager.getDriver());
   obj_SeleniumExamplePage.enterDataOn_textBox_FormElements(text);
}

@When("user enters the {string} on the Text Area")
public void user_enters_the_on_the_text_area(String text) {
    SeleniumExamplePage obj_SeleniumExamplePage=new SeleniumExamplePage(DriverManager.getDriver());
    obj_SeleniumExamplePage.enterDataOn_TextArea(text);
}

@Then("user click on the submit button")
public void user_click_on_the_submit_button() {
    SeleniumExamplePage obj_SeleniumExamplePage=new SeleniumExamplePage(DriverManager.getDriver());
    obj_SeleniumExamplePage.clickOnTheSubmitButton();
    
}

}

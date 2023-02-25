package stepDefinitions;

import commonMethods.SeleniumSPecificMethods;
import io.cucumber.java.en.*;
import pages.SeleniumExamplePageDataDriven;
import utility.DriverManager;

public class DataDrivenNormal_SD {
 
	
	
	@Given("user is on {string} page")
	public void user_is_on_page(String string) {
	     SeleniumSPecificMethods.validatePageTitle(string);
	}

	@When("user clicks on selenium examples page link")
	public void user_clicks_on_selenium_examples_page_link() {
	    SeleniumExamplePageDataDriven obj_SeleniumExamplePageDataDriven=new SeleniumExamplePageDataDriven(DriverManager.getDriver());
	    obj_SeleniumExamplePageDataDriven.clickOnTheLInk_SeleniumExamplePage();
	}

	@When("user enters names on text box and clicks on Submit button")
	public void user_enters_names_on_text_box_and_clicks_on_submit_button() {
	  SeleniumExamplePageDataDriven obj_SeleniumExamplePageDataDriven=new SeleniumExamplePageDataDriven(DriverManager.getDriver());
	  obj_SeleniumExamplePageDataDriven.fillTheForm();
			  
	}

	
	
	
}

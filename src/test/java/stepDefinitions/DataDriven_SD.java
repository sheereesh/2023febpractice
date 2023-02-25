package stepDefinitions;

import commonMethods.SeleniumSPecificMethods;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SeleniumExamplePage;
import pages.SeleniumExamplePageDataDriven;
import utility.DriverManager;

public class DataDriven_SD {
	
	@Given("user is {string} page")
	public void user_is_page(String string) {
	    
		SeleniumSPecificMethods.validatePageTitle(string);
		
		
	}

	@When("user clicks on the Selenium Example Page link")
	public void user_clicks_on_the_selenium_example_page_link() {
	   HomePage obj_HomePage=new HomePage(DriverManager.getDriver());
	   obj_HomePage.click_On_The_Link();
	}



	@When("user enters names on the text boxes as per the row no {int} and clicks on the submit button")
	public void user_enters_names_on_the_text_boxes_as_per_the_row_no_and_clicks_on_the_submit_button(Integer rowno) {
	    SeleniumExamplePageDataDriven obj_SeleniumExamplePageDataDriven=new SeleniumExamplePageDataDriven(DriverManager.getDriver());
	    obj_SeleniumExamplePageDataDriven.fillTheForm(rowno);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
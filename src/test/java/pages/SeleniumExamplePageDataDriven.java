package pages;



import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSPecificMethods;
import utility.ExcelReader;

public class SeleniumExamplePageDataDriven {
	
  WebDriver driver;
	public SeleniumExamplePageDataDriven(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath = "//a[contains(text(),'Selenium Example Page')]")
	WebElement link_SeleniumExamplePage;


@FindBy(xpath = "//input[@name=\"text\"]")
WebElement textBox_FormElements;

@FindBy(xpath = "//textarea[@name=\"textarea\"]")
WebElement textBox_textarea;

@FindBy(xpath = "//input[@id=\"submitbtn\"]")
WebElement button_SubmitButton;
public void clickOnTheLInk_SeleniumExamplePage() {
	SeleniumSPecificMethods.clickLInk(link_SeleniumExamplePage);
}
public void fillTheForm() {
	for (HashMap<String,String> singleData : ExcelReader.getExcelData(ExcelReader.getSheetByName())) {

	SeleniumSPecificMethods.enterText_TextField(textBox_FormElements,singleData.get("username"));
	SeleniumSPecificMethods.enterText_TextField(textBox_textarea, singleData.get("password"));
	SeleniumSPecificMethods.clickOnTheButton(button_SubmitButton);
	}
}
public void fillTheForm(int rowno) {
	SeleniumSPecificMethods.enterText_TextField(textBox_FormElements,ExcelReader.getRowdata(ExcelReader.getSheetByName(), rowno).get("username"));
	SeleniumSPecificMethods.enterText_TextField(textBox_textarea,ExcelReader.getRowdata(ExcelReader.getSheetByName(), rowno).get("password"));
	SeleniumSPecificMethods.clickOnTheButton(button_SubmitButton);
}



/***public void enterDataOn._FormElements(String text) {
textBox_FormElements.sendKeys(text);	
}
public void clickOnTheLink_SeleniumExamplePage() {
	link_SeleniumExamplePage.click();
****/
}

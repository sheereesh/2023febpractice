package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumExamplePage {
	WebDriver driver;
public SeleniumExamplePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//input[@name=\"text\"]")
WebElement textBox_FormElements;
public void enterDataOn_textBox_FormElements(String text) {
	textBox_FormElements.sendKeys(text);
}

@FindBy(xpath = "//textarea[@name=\"textarea\"]")
WebElement textBox_TextArea;
public void enterDataOn_TextArea(String text) {
	textBox_TextArea.sendKeys(text);
}

@FindBy(xpath = "//input[@value=\"Submit\"]")
WebElement button_Submit;
public void clickOnTheSubmitButton() {
	button_Submit.click();
}
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResortPage {

	
	@FindBy(xpath = "//input[@placeholder='Search resort']")
	public WebElement resortName;
	
	@FindBy(xpath = "//input[contains(@aria-label,'Choose date')]")
	public WebElement resortDate;
	
	@FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiPickersDay-root MuiPickersDay')]")
	public WebElement date;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement okBtn;
	
	@FindBy(xpath = "//input[@data-testid='step-resort-checkbox-available-resorts']")
	public WebElement viewResortOnDate;
	
	@FindBy(xpath = "//*[text()='No Anticipated Date']")
	public WebElement verifyDateChoosen;
}

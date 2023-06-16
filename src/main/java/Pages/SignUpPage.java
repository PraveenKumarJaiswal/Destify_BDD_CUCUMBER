package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	
	@FindBy(xpath = "(//button[contains(text(),'Sign Up')])[1]")
	public static WebElement signUpBtn;
	
	@FindBy(xpath = "(//button[contains(text(),'Plan My Destination Wedding')])[1]")
	public static WebElement planMyDestinationWeddingBtn;
	
	@FindBy(xpath = "//button[@data-testid='button-next']")
	public static WebElement letsBeginBtn;
	
	@FindBy(xpath = "(//div[contains(text(),'Select')])[1]")
	public static WebElement selectBtn;

	@FindBy(xpath = "//button[@data-testid='button-next']")
	public static WebElement nextBtn;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[1]")
	public static WebElement preferredWeddingDate;

	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	public static WebElement secondChoiceWeddingDate;

	@FindBy(xpath = "//button[contains(text(),'24')]")
	public static WebElement selectDate1;
	
	@FindBy(xpath = "//button[contains(text(),'26')]")
	public static WebElement selectDate2;
	
	@FindBy(xpath = "//div[@data-testid=\"step-date-button-ok\"]")
	public static WebElement okDateBtn;
	
	@FindBy(xpath = "//div[@data-testid='step-alt-date-button-ok']")
	public static WebElement okAltDateBtn;
	
	
	
	
	
}


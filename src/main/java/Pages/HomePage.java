package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{
	
	@FindBy(xpath = "(//div[@class='d-flex flex-justify-between flex-items-center width-full width-lg-auto'])[1]")
	public static WebElement logoIcon;

	@FindBy(xpath = "//ul/li/a/div/div[contains(text(),'Actions')]")
	public static WebElement productMenuDD;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	public static WebElement productMenuBtn;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	public static WebElement solutionDD;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	public static WebElement openSourceDD;

	@FindBy(xpath = "(//a[@href='/pricing'])[1]")
	public static WebElement pricing;

	@FindBy(xpath = "(//a[@href='/login'])[1]")
	public static WebElement signInMenu;

	@FindBy(xpath = "(//a[contains(text(),'Sign up')])[1]")
	public static WebElement signUpMenu;
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//a[contains(text(),'Log In')]")
	public static WebElement loginLink;
	
	@FindBy(xpath = "(//button[contains(text(),'Log in')])[1]")
	public static WebElement loginBtn;
	
	@FindBy(xpath = "//input[@type='email']")
	public static WebElement emailTxtBox;
	
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement passwordTxtBox;

	@FindBy(xpath = "(//button[contains(text(),'Close')])")
	public static WebElement closeBtn;

	
	
	@FindBy(xpath = "//div[contains(text(),'Text')]")
	public static WebElement verifyIdentityTextOption;
	
	@FindBy(id = "idTxtBx_SAOTCC_OTC")
	public static WebElement otpTextBox;
	
	@FindBy(id = "idChkBx_SAOTCC_TD")
	public static WebElement doNotAskCheckBox;
	
	
	
}


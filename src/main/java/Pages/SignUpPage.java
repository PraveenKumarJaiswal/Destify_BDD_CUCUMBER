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

	
	

	
	
}


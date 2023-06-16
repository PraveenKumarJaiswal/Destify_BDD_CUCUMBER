package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;
import Resource.BaseClass;
import Resource.UtilityClass;

public class SignUpPagePanel extends BaseClass  {
	SignUpPage signUpPage = new SignUpPage();
	UtilityClass utilityClass = new UtilityClass();


		public SignUpPagePanel() {
			signUpPage = PageFactory.initElements(driver, SignUpPage.class);
		}	

	public static void clickSignUpBtn() throws Throwable {
			Thread.sleep(3000);
			UtilityClass.waitForElement(SignUpPage.signUpBtn);
			SignUpPage.signUpBtn.click();
	}

	public static void clickPlanMyWedding() throws Throwable {
		Thread.sleep(3000);
		UtilityClass.waitForElement(SignUpPage.planMyDestinationWeddingBtn);
		SignUpPage.planMyDestinationWeddingBtn.click();
	}
	
	public static void clickletsBeginBtn() throws Throwable {
		Thread.sleep(3000);
		UtilityClass.waitForElement(SignUpPage.letsBeginBtn);
		SignUpPage.letsBeginBtn.click();
	}
	
	public static void selectCountry() throws Throwable {
		Thread.sleep(3000);
		UtilityClass.waitForElement(SignUpPage.selectBtn);
		SignUpPage.selectBtn.click();
	}
	
	public static void selectNextBtn() throws Throwable {
		Thread.sleep(3000);
		UtilityClass.waitForElement(SignUpPage.nextBtn);
		SignUpPage.nextBtn.click();
	}
	
	public static void selectCity() throws Throwable {
		Thread.sleep(3000);
		UtilityClass.waitForElement(SignUpPage.selectBtn);
		SignUpPage.selectBtn.click();
	}
	
	public static void selectResort() throws Throwable {
		Thread.sleep(9000);
		UtilityClass.waitForElement(SignUpPage.selectBtn);
		SignUpPage.selectBtn.click();
	}
	
	public static void selectVenue() throws Throwable {
		Thread.sleep(3000);
		UtilityClass.waitForElement(SignUpPage.selectBtn);
		SignUpPage.selectBtn.click();
	}
	
	public static void selectPackage() throws Throwable {
		Thread.sleep(3000);
		UtilityClass.waitForElement(SignUpPage.selectBtn);
		SignUpPage.selectBtn.click();
	}
	
	
	public static  void selectProductDDValue(String val) {

		WebElement actionDD = BaseClass.driver.findElement(By.xpath("//ul/li/a/div/div[contains(text(),'" + val + "')]"));
		//UtilityClass.waitForElement(actionDD);
		actionDD.click();

	}

}

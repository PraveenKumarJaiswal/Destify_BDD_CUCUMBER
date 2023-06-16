package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Pages.HomePage;
import Pages.LoginPage;
import Resource.BaseClass;
import Resource.UtilityClass;

public class HomePagePanel extends BaseClass  {
	HomePage homePage = new HomePage();
	UtilityClass utilityClass = new UtilityClass();


		public HomePagePanel() {
			homePage = PageFactory.initElements(driver, HomePage.class);
		}	
	
		
	
	//public static  WebElement logoIcon = driver.findElement(
			//By.xpath("(//div[@class='d-flex flex-justify-between flex-items-center width-full width-lg-auto'])[1]"));
	public static  WebElement productMenu = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	public static WebElement solutionMenu = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
	public static WebElement openSource = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
	public static WebElement pricing = driver.findElement(By.xpath("(//a[@href='/pricing'])[1]"));
	public static WebElement signInMenu = driver.findElement(By.xpath("(//a[@href='/login'])[1]"));
	public static WebElement signUpMenu = driver.findElement(By.xpath("(//a[contains(text(),'Sign up')])[1]"));

	public static WebElement featuresTxt = BaseClass.driver.findElement(By.xpath("(//a[contains(text(),'Features')])[1]"));

	/*
	 * public  WebElement featuresTitle = driver.findElement(By.xpath(""));
	 * public  WebElement featuresTitle = driver.findElement(By.xpath(""));
	 * public  WebElement featuresTitle = driver.findElement(By.xpath(""));
	 * public  WebElement featuresTitle = driver.findElement(By.xpath(""));
	 */

	public static void clickLogoIcon() throws Throwable {
		
			Thread.sleep(3000);
			UtilityClass.waitForElement(HomePage.logoIcon);
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logoIcon);
			HomePage.logoIcon.click();
	
	}

	public static void clickProductMenu() throws Throwable {
		Thread.sleep(3000);
		UtilityClass.waitForElement(HomePage.productMenuBtn);
		HomePage.productMenuBtn.click();
	}

	public static  void selectProductDDValue(String val) {

		WebElement actionDD = BaseClass.driver.findElement(By.xpath("//ul/li/a/div/div[contains(text(),'" + val + "')]"));
		//UtilityClass.waitForElement(actionDD);
		actionDD.click();

	}

	public static  void verifyPageText(String titleName) {
		UtilityClass.verifyText(featuresTxt, titleName);
	}

	public  void verifyPageTitle(String title) {
		UtilityClass.verifyTitle(title);

	}
	/*
	public  void clickSolutionDD() {
		UtilityClass.waitForElement(HomePage.solutionDD);
		HomePage.solutionDD.click();
	}

	public  void clickOpenSourceDD() {
		UtilityClass.waitForElement(HomePage.openSourceDD);
		HomePage.openSourceDD.click();
	}

	public  void clickPricingBtn() {
		UtilityClass.waitForElement(HomePage.signInMenu);
		HomePage.pricing.click();
	}

	public  void clickSignInBtn() {
		UtilityClass.waitForElement(HomePage.signInMenu);
		HomePage.signInMenu.click();
	}

	public  void clickSignUpBtn() {
		UtilityClass.waitForElement(HomePage.signInMenu);
		HomePage.signUpMenu.click();
	}

	public  void scrollUntill() throws Throwable {
		WebElement element = driver.findElement(By.xpath("(//span[@class='btnMain funnelBtn'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
	}

	public  void clickOnPopUpBtn() throws Throwable {
		Thread.sleep(10000);
		logger.info("waiting for popup.....");
		Thread.sleep(10000);
		try {
			// homePage.logo.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public  void clickOnAutofill() {
		driver.findElement(By.xpath("//a[@onclick='autoFill();']")).click();
	}

	public  void fillForm() {
		WebElement fn = driver.findElement(By.id("firstName"));

		fn.click();
		fn.clear();
		fn.sendKeys("Ana");

		WebElement ln = driver.findElement(By.id("lastName"));

		ln.click();
		ln.clear();
		ln.sendKeys("lodes");

		WebElement phone = driver.findElement(By.id("phone"));
		phone.click();
		phone.clear();
		phone.sendKeys("667 555-0151");

		WebElement email = driver.findElement(By.id("email"));
		email.click();
		email.clear();
		email.sendKeys("Ana@example.com");

		WebElement address = driver.findElement(By.id("address"));
		address.click();
		address.sendKeys("754 Nolan Prairie");

		WebElement city = driver.findElement(By.id("city"));
		city.click();
		city.sendKeys("Ankeny");

		WebElement state = driver.findElement(By.id("state"));
		Select selectState = new Select(state);
		selectState.selectByIndex(2);

		WebElement zipCode = driver.findElement(By.id("postalCode"));
		zipCode.click();
		zipCode.sendKeys("35005");

		WebElement cardNumber = driver.findElement(By.id("cardNumber"));
		cardNumber.click();
		cardNumber.sendKeys("4556312207616615");

		WebElement cvvNumber = driver.findElement(By.id("cvv"));
		cvvNumber.click();
		cvvNumber.sendKeys("246");

		WebElement cardMonth = driver.findElement(By.id("cardMonth"));
		Select selectMonth = new Select(cardMonth);
		selectMonth.selectByIndex(6);

		WebElement cardYear = driver.findElement(By.id("cardYear"));
		Select selectYear = new Select(cardYear);
		selectYear.selectByIndex(7);

		WebElement total = driver.findElement(By.xpath("(//*[contains(text(),'Order Total:')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", total);
	}

	public  void clickOnTodayOnlyBuyButton() {
		driver.findElement(By.xpath("//*[@id='cta2']")).click();
	}

	public  void clickOnPayNowBtn() {
		WebElement payNowBtn = driver.findElement(By.xpath("//span[@class='funnelBtn paynow']"));
		payNowBtn.click();
	}

	public  void clickOnNoAdditionalShippingChargesBtn() {
		WebElement bACKGUARANTEE = driver
				.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement shippingCharges = driver
				.findElement(By.xpath("(//*[contains(text(),'No additional shipping charges!')])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		shippingCharges.click();
	}

	public  void clickOnNoAdditionalShippingChargesBtn2() {
		WebElement shippingCharges = driver
				.findElement(By.xpath("(//*[contains(text(),'No additional shipping charges!')])"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", shippingCharges);
		shippingCharges.click();
	}

	public  void clickOnDeclineBtn() {
		WebElement bACKGUARANTEE = driver
				.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement declineLink = driver
				.findElement(By.xpath("(//*[contains(text(),'Opportunity to Stock-Up and Save Today')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		declineLink.click();
	}

	public  void clickOnDeclineBtn6Bottles() {
		WebElement sixBottles = driver.findElement(By.xpath("//h2[contains(text(),'6 Bottles Too Much?')]"));
		sixBottles.isDisplayed();
		WebElement bACKGUARANTEE = driver
				.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[1]"));
		WebElement declineLink = driver
				.findElement(By.xpath("//*[contains(text(),'Pass on This One-Time Opportunity to ')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		declineLink.click();
	}

	public  void clickOnDeclineBtnVitaminD() {
		WebElement vitaminDHeadling = driver.findElement(By.xpath("(//h2[contains(text(),'Vitamin D')])[1]"));
		vitaminDHeadling.isDisplayed();
		WebElement bACKGUARANTEE = driver
				.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement declineLink = driver
				.findElement(By.xpath("(//*[contains(text(),'Opportunity to Stock-Up and Save Today')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		declineLink.click();
	}

	public  void clickOnFirstYesBtnVitaminD() {
		WebElement vitaminDHeadling = driver.findElement(By.xpath("(//h2[contains(text(),'Vitamin D')])[1]"));
		vitaminDHeadling.isDisplayed();
		WebElement bACKGUARANTEE = driver
				.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement yesBtn = driver.findElement(By.xpath("(//*[@class=\"cta-btn funnelBtn ctaContainer\"])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		yesBtn.click();
	}

	public  void clickOnSecondYesBtnZincGap() {
		WebElement zincGapHeadline = driver.findElement(By.xpath("//h2[contains(text(),'Zinc Gap')]"));
		zincGapHeadline.isDisplayed();
		WebElement bACKGUARANTEE = driver
				.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement yesBtn2 = driver.findElement(By.xpath("(//*[@class=\"cta-btn funnelBtn ctaContainer\"])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		yesBtn2.click();
	}

	public  void clickOnDeclineBtnFinalOpportunity() {
		WebElement sixBottles = driver
				.findElement(By.xpath("//h2[contains(text(),'Final Opportunity to \"Stock Up & Save\"!')]"));
		sixBottles.isDisplayed();
		WebElement bACKGUARANTEE = driver
				.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[1]"));
		WebElement declineLink = driver
				.findElement(By.xpath("(//*[contains(text(),'Opportunity to Stock-Up and Save Today ')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		declineLink.click();
	}

	//

	public  void clickOnYesBtnOnOurMostRedicilousDealPage() {
		WebElement redicilousDealPage = driver
				.findElement(By.xpath("//h2[contains(text(),'Our Most Ridiculous Deal Yet!')]"));
		redicilousDealPage.isDisplayed();
		WebElement yesBtn = driver.findElement(By.xpath("(//div[@class=\"cta-btn funnelBtn ctaContainer\"])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yesBtn);
		yesBtn.click();
	}

	public  void verifyCongratsScreenForB1G2() {
		WebElement congratulationsLink = driver.findElement(By.xpath("//h2[contains(text(),'Congratulations')]"));
		congratulationsLink.isDisplayed();
	}

	public  void validateBillingItems() {
		// Find the table of items and prices on the page
		WebElement table = driver.findElement(By.xpath("//table[@class=\"base-table\"]/tbody"));

		// Find all the rows in the table except for the last one, which is the total
		// row
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		rows.remove(rows.size() - 1);

		// Calculate the total cost of all items in the table
		double totalCost = 0;
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			double price = Double.parseDouble(cells.get(1).getText().replaceAll("[^\\d.]", ""));
			totalCost += price;
		}

		// Find the total row in the table and get the expected total cost
		WebElement totalRow = rows.get(rows.size() - 1);
		double expectedTotalCost = Double
				.parseDouble(totalRow.findElement(By.tagName("td")).getText().replaceAll("[^\\d.]", ""));

		// Compare the expected and actual total costs and output the result
		if (Math.abs(totalCost - expectedTotalCost) < 0.01) {
			System.out.println("Purchase billing total is valid.");
		} else {
			System.out.println("Purchase billing total is not valid.");
		}
	}

	public  void clickNoThanksToReachCongratsScreen() {

		WebElement declineLink = driver.findElement(By.xpath("//*[@cta-name='Decline']"));
		WebElement congratulationsLink = driver.findElement(By.xpath("//h2[contains(text(),'Congratulations')]"));
		String s = congratulationsLink.getText();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", declineLink);

		while (!congratulationsLink.isDisplayed()) {

			declineLink.click();
		}
	}

	public  boolean isTextPresent(String text) {
		try {
			WebElement congratulationsLink = driver.findElement(By.xpath("//h2[contains(text(),'Congratulations')]"));
			return congratulationsLink.getText().contains(text);
		} catch (Exception e) {
			return false;
		}
	}

	public  void scrollUp() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(document.body.scrollHeight, 0)");
		logger.info("Scroll up...");
	}

	public  void scrollDown() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");
		logger.info("Scroll down...");
	}

	public  void mouseHoverToProduct() {
		logger.info("Mouse hovering started...");
		// BaseClass.waitForElement(AddCartPage.productCard);
		WebElement ele = driver.findElement(By.xpath("(//*[@class = 'product-image-container'])[1]"));
		Actions act = new Actions(driver);
		logger.info("Action class...");
		act.moveToElement(ele).build().perform();
		logger.info("Mouse hovering ends...");
	}

	public  void clickOnContinueShippingBtn() {
		driver.findElement(By.xpath("//*[@class= 'icon-chevron-left left']")).click();
		logger.info("Clicked on back cart button");
	}

	public  void cartSize() {
		logger.info("Getting size of cart");
		String s = driver.findElement(By.xpath("//*[@class = 'ajax_cart_quantity unvisible']")).getText();
		logger.info("Size of cart is :" + s);
	}

	public  void proceedToCart() {
		logger.info("Navigate To Cart...");
		WebElement proceed = driver.findElement(By.xpath("//*[@class = 'btn btn-default button button-medium']"));
		proceed.click();
	}

	public  void getProductDetailsInCart() throws Throwable {
		WebElement cartTitle = driver.findElement(By.xpath("//*[@id='cart_title']"));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", cartTitle);

		List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowCount = ele.size();
		logger.info("No. of rows available in Table is: " + rowCount);
		for (int i = 0; i < rowCount; i++) {
			WebElement productName = driver
					.findElement(By.xpath("(//table/tbody/tr/td[@class='cart_description']/p/a)[1]"));
			WebElement productQuantity = driver.findElement(By.xpath(
					"(//table/tbody/tr/td[@class='cart_quantity text-center']/input[@class='cart_quantity_input form-control grey'])[1]"));
			String pName = productName.getText();
			String pQuantity = productQuantity.getAttribute("value");
			logger.info("---------------------------------------------------------------------");
			logger.info("You have : " + pName + " in you cart with quantity: " + pQuantity);
			logger.info("---------------------------------------------------------------------");
		}
	}
*/
}

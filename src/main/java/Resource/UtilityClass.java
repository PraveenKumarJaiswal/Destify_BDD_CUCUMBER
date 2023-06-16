package Resource;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UtilityClass extends BaseClass {

	// public static Logger log = LoggerHelper.getLogger(UtilityClass.class);
	// public static UtilityClass utilityClass = new UtilityClass();
	public static String dateToSelect;
	Actions act = new Actions(driver);
	public static WebDriverWait wait = new WebDriverWait(driver, 20);
	static JavascriptExecutor js = (JavascriptExecutor) driver;

	public static void verifyText(WebElement ele, String expectedTxtMSg) {

		System.out.println("Verifying text message");
		UtilityClass.waitForElement(ele);
		String actualTxtMsg = ele.getText();
		Assert.assertEquals(actualTxtMsg, expectedTxtMSg);
	}

	public static void verifyTitle(String expectedTitleText) {

		System.out.println("Verifying title message");
		String actualTitleText = BaseClass.driver.getTitle();
		System.out.println("actualTitleText Value of Title is -----> " + actualTitleText);
		System.out.println("expectedTitleText Value of Title is -----> " + expectedTitleText);
		Assert.assertEquals(actualTitleText, expectedTitleText);
	}

//***************************************************************************************
//							Notification Handler Code
//***************************************************************************************

	public static void notificationHandler(List<WebElement> ele, String str) throws Throwable {
		int ddSize = ele.size();
		// log.info("Inside Notification");
		for (int i = 0; i < ddSize; i++) {
			// log.info(">-------->Notifications Available in the list :>--------> " +
			// ele.get(i).getText());
			Thread.sleep(1000);
			if (ele.get(i).getText().endsWith(str)) {
				String str1 = ele.get(i).getText();
				System.out.println("Value of Notification is: " + str1);
				break;
			}
		}
		// log.info("==============================================================================");
		System.out.println("Task name" + str + "not available in Notification list");
		// log.info("==============================================================================");

	}

//***************************************************************************************
//							Dropdown Code
//***************************************************************************************

	public void dropDownHandle(List<WebElement> ele, String str) throws Throwable {
		int ddSize = ele.size();

		for (int i = 0; i < ddSize; i++) {
			// log.info("Values available on dropdown are: "+ele.get(i).getText());
			Thread.sleep(1000);
			if (ele.get(i).getText().equalsIgnoreCase(str)) {
				// log.info("Clicking on dropdown value: " + ele.get(i).getText());
				ele.get(i).click();
				break;
			}
		}
	}

//***************************************************************************************
//						Search Code
//***************************************************************************************

	public void searchHandle(List<WebElement> ele, String str) throws Throwable {
		int ddSize = ele.size();

		for (int i = 0; i < ddSize; i++) {
			// log.info("Values available on search results are: " + ele.get(i).getText());
			Thread.sleep(1000);
		}
	}

//***************************************************************************************
//						Time selection Code
//***************************************************************************************
	public static void selectTime() throws Throwable {
		final DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.HOUR, 0);
		c.add(Calendar.MINUTE, 3);
		Date currentDatePlusOne = c.getTime();
		String extendedTime = dateFormat.format(currentDatePlusOne);
		// System.out.println(dateFormat.format(currentDatePlusOne));
		System.out.println("Entering time to extended time: " + extendedTime);
		Thread.sleep(1000);
		// CreateTaskPage.selectTime.clear();
		Thread.sleep(1000);
		// CreateTaskPage.selectTime.sendKeys(extendedTime);
	}

//***************************************************************************************
//						Calendar Code
//***************************************************************************************
	private static String getCurrentDay() {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 0);
		Date tomorrow = calendar.getTime();
		// SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
		// String strDate = formatter.format(tomorrow);

		SimpleDateFormat formatter = new SimpleDateFormat("dd");
		String strDate = formatter.format(tomorrow);

		// log.info("Please see the date and format: " + strDate);

		return strDate;
	}

//	public static void calanderControl() throws Throwable {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		dateToSelect = getCurrentDay();
//		//log.info("Date to Select Value is: " + dateToSelect);
//		Thread.sleep(2000);
//
//		WebElement tableBody = CreateTaskPage.datePicker;
//		List<WebElement> columns = tableBody.findElements(By.tagName("td"));
//		//log.info("columns are" + columns);
//
//		int size = columns.size();
//		//log.info("size of table" + size);
//		int i = Integer.parseInt(dateToSelect) + 3;
//		//log.info("Value of j" + i);
//
//		// //log.info("Reached at foreach loop");
//
//		WebElement eachCell = driver.findElement(By.xpath("((//table/tbody)[2])/tr/td"));
//		String tabIndex = eachCell.getAttribute("tabindex");
//		System.out.println("Value of Tab index is: " + tabIndex);
//		String ariaDisabled = eachCell.getAttribute("aria-disabled");
//		System.out.println("Value of aria disabeld is: " + ariaDisabled);
//
//		CreateTaskPage.currentDate.click();
//		System.out.println("Clicking on Todays date");
//	}

//##################################################################################################################################################
//In case if above code don't work change the "i" in below can and uncomment it. Value of i will be index of active first date in calendar.	
//##################################################################################################################################################	
	/*
	 * public static void calanderControl() throws Throwable {
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); dateToSelect
	 * = getCurrentDay(); //log.info("Date to Select Value is: "+dateToSelect);
	 * Thread.sleep(2000);
	 * 
	 * WebElement tableBody = CreateTaskPage.datePicker; List<WebElement> columns =
	 * tableBody.findElements(By.tagName("td")); //log.info("columns are" +columns);
	 * 
	 * int size = columns.size(); //log.info("size of table" +size); int i =
	 * Integer.parseInt(dateToSelect)+3; //log.info("Value of i" +i);
	 * 
	 * //log.info("Reached at foreach loop");
	 * 
	 * driver.findElement(By.xpath("(((//table/tbody)[2])/tr/td)["+i+"]")).click();
	 * //CreateTaskPage.dueDateDoneBtn.click(); }
	 */

//***************************************************************************************
//							Current Status Code
//***************************************************************************************

	public static void verifyCurrentStatus(WebElement ele) {
		String currentStatus = ele.getText();
		// log.info("Value of current status is: " + currentStatus);
	}

//***************************************************************************************
//							Button click Code
//***************************************************************************************
	public static void clickButton(WebElement ele) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			// log.info("Clicking on --->" + ele.getText() + " Button");
			ele.click();

		} catch (Exception e) {
			e.printStackTrace();
			// log.info(e.getMessage());
		}
	}

//***************************************************************************************
//								Wait for Element Code
//***************************************************************************************

	public static void waitForElement(WebElement ele) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			// log.info("wait for element ele value" + ele);
		} catch (Exception e) {
			e.printStackTrace();
			// log.info(e.getMessage());
			System.out.println("Element doesn't exist verify it...!!!");
		}
	}

//***************************************************************************************
//									Toast message Code
//***************************************************************************************

	public static void verifyValidation(WebElement ele, String expectedToastMSg) {

		System.out.println("Verifyingtext");
		UtilityClass.waitForElement(ele);
		String toastMsgTxt = ele.getText();
		// log.info("**********************************************");
		// log.info("Toast message is----> " + toastMsgTxt);
		// log.info("**********************************************");
		// log.info("Validating toast message");
		Assert.assertEquals(toastMsgTxt, expectedToastMSg);
	}

	public void theFileUpload(String path) throws Throwable {

		StringSelection strSelection = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection, null);

		Robot robot = new Robot();

		robot.delay(300);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public String getFilePath(String fileTag) throws IOException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		String f = prop.getProperty(fileTag);
		System.out.println("##################################################");
		// log.info("Full data property file name details: "+f);

		String currentDirectory = System.getProperty("user.dir");
		String pathNew = currentDirectory + File.separator + f;
		// log.info("Real filepath will be : -------------->"+pathNew);
		System.out.println("##################################################");
		return pathNew;
	}

	public static void scrollToElement() {

		js.executeScript("javascript:window.scrollBy(250,350)");
	}

}

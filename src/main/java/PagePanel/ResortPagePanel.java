package PagePanel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import Pages.ResortPage;
import Resource.BaseClass;

public class ResortPagePanel extends BaseClass{

	public ResortPage resortPage;
	public ResortPagePanel() {
		resortPage=PageFactory.initElements(driver, ResortPage.class);
	}
	
	public void searchResort(String resort) {
		resortPage.resortName.sendKeys(resort);
		resortPage.resortName.sendKeys(Keys.ENTER);
	}
	
	public void selectDate() {
		resortPage.resortDate.click();
		resortPage.date.click();
		resortPage.okBtn.click();
		resortPage.viewResortOnDate.click();
	}
}

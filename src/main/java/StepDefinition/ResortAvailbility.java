package StepDefinition;

import org.testng.Assert;

import PagePanel.ResortPagePanel;
import io.cucumber.java.en.Then;

public class ResortAvailbility {

	ResortPagePanel resortPagePanel = new ResortPagePanel();

	@Then("Search Resort name {string}")
	public void searchResort(String resort) {
		resortPagePanel.searchResort(resort);
	}

	@Then("Choose date booking date")
	public void chooseDate() {
		resortPagePanel.selectDate();
	}
	
	@Then("Verifies date and resort is searched")
	public void verifyResort(){
		Assert.assertFalse(resortPagePanel.resortPage.resortDate.getAttribute("value").isEmpty());
	}
}

package StepDefinition;

import PagePanel.LoginPagePanel;
import PagePanel.SignUpPagePanel;
import Resource.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStep extends BaseClass {
	LoginPagePanel loginPagePanel = new LoginPagePanel();
	SignUpPagePanel signUpPagePanel = new SignUpPagePanel();
	//HomePagePanel homePagePanel = new HomePagePanel();
	Hooks hooks = new Hooks();

	@When("user clicks on Signup link")
	public void user_clicks_on_signup_link() throws Throwable {
		SignUpPagePanel.clickSignUpBtn();
	}
	
	@Then("user clicks on plan my destination wedding")
	public void user_clicks_on_plan_my_destination_wedding() throws Throwable {
		SignUpPagePanel.clickPlanMyWedding();
	}
	
	@Then("user clicks on lets Begin Button")
	public void user_clicks_on_lets_begin_button() throws Throwable {
		SignUpPagePanel.clickletsBeginBtn();
	}
	
	@Then("user select country")
	public void user_select_country() throws Throwable {
		SignUpPagePanel.selectCountry();
	}
	
	@Then("user clicks on next button")
	public void user_clicks_on_next_button() throws Throwable {
		SignUpPagePanel.selectNextBtn();
	     
	}
	@Then("user select city")
	public void user_select_city() throws Throwable {
		SignUpPagePanel.selectCity();
	     
	}
	@Then("user select resort")
	public void user_select_resort() throws Throwable {
	     Thread.sleep(30000);
		SignUpPagePanel.selectResort();
	}
	@Then("user select venue")
	public void user_select_venue() throws Throwable {
		SignUpPagePanel.selectVenue();
	     
	}
	@Then("user select wedding package")
	public void user_select_wedding_package() throws Throwable {
		SignUpPagePanel.selectPackage();
	     
	}
	@Then("user select preferred wedding date")
	public void user_select_preferred_wedding_date() throws Throwable {
		SignUpPagePanel.selectPreferedWeddingDate();
		SignUpPagePanel.okDateBtn();
	     
	}
	@Then("user select second choice wedding date")
	public void user_select_second_choice_wedding_date() throws Throwable {
		SignUpPagePanel.selectSecondWeddingDate();
		SignUpPagePanel.okAltDateBtn();
	}





}

package StepDefinition;

import org.slf4j.Logger;

import PagePanel.HomePagePanel;
import PagePanel.LoginPagePanel;
import Resource.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {
	LoginPagePanel loginPagePanel = new LoginPagePanel();
	//HomePagePanel homePagePanel = new HomePagePanel();
	Hooks hooks = new Hooks();

	// public static Logger log = LoggerHelper.getLogger(LoginHQUserStep.class);

	@Given("Launch destify website")
	public void launch_destify_website() {
	     System.out.println("Website is launching..."); 
	}
	
	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
		loginPagePanel.clickLoginLink();
		System.out.println("Clicked on login link...");
	}
	
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPagePanel.clickLoginBtn();
		System.out.println("Clicked on login button...");	     
	}
	
	@Then("user enter emailAddress {string}")
	public void user_enter_email_address(String username) throws Throwable {
		loginPagePanel.enterUserName(username);
		System.out.println("Enter emailAddress...");
	}
	
	@Then("user enter password {string}")
	public void user_enter_password(String password) {
		loginPagePanel.enterPassword(password);
		System.out.println("Enter password...");
	}
	@Then("click on login button")
	public void click_on_login_button() {
		loginPagePanel.clickLoginBtn();
		System.out.println("Clicked on login button...");	     
	}
	
	@Then("user verifies error message and click on close button on popup")
	public void user_verifies_error_message_and_click_on_close_button_on_popup() {
		loginPagePanel.clickCloseBtn();
	}



}

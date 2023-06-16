package StepDefinition;

import Pages.HeaderMenuPage;
import io.cucumber.java.en.Then;


public class HeaderMenu {
	
	HeaderMenuPage headerMenu = new HeaderMenuPage();
	@Then("user clicks on destination wedding guide")
	public void user_clicks_on_destination_wedding_guide() {
	   headerMenu.guide.click();
	   
	}

	@Then("user clicks on explore")
	public void user_clicks_on_explore() {
	   headerMenu.explore.click();
	   
	}

	@Then("user clicks on home")
	public void user_clicks_on_home() {
		
	   headerMenu.home.click();
	   
	}

	@Then("user clicks on wedding menu")
	public void user_clicks_on_wedding_menu() {
	   headerMenu.myWedding.click();
	   
	}

	@Then("user clicks on wedding website")
	public void user_clicks_on_wedding_website() {
	   
	   headerMenu.weddingWebsite.click();
	}

	@Then("user clicks on back")
	public void user_clicks_on_back() {
	   headerMenu.backBtn.click();
	   
	}

	@Then("user clicks on RSVPs")
	public void user_clicks_on_rsv_ps() {
	   
	   headerMenu.rsvp.click();
	}

	@Then("user clicks on wedding guest")
	public void user_clicks_on_wedding_guest() {
	   headerMenu.guestList.click();
	   
	}

	@Then("user clicks on my trips")
	public void user_clicks_on_my_trips() {
	   headerMenu.myTrips.click();
	   
	}

	@Then("user clicks on my rooms")
	public void user_clicks_on_my_rooms() {
	   headerMenu.myRooms.click();
	   
	}

	@Then("user clicks on support")
	public void user_clicks_on_support() {
	   headerMenu.support.click();
	   
	}

	@Then("user clicks on contactUs")
	public void user_clicks_on_contact_us() {
	   headerMenu.contact.click();
	   
	}

}

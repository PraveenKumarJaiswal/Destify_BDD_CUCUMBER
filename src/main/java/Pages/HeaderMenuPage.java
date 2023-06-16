package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resource.BaseClass;

public class HeaderMenuPage extends BaseClass{
	
	public HeaderMenuPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//p[text()='Your Destination Wedding Guide']")
	public WebElement guide;
	
	@FindBy(xpath = "//p[text()='Home']")
	public WebElement home;
	
	@FindBy(xpath = "//p[text()='Explore']")
	public WebElement explore;
	
	@FindBy(xpath = "//p[text()='My Wedding']")
	public WebElement myWedding;
	
	@FindBy(xpath = "//p[text()='Wedding Website']")
	public WebElement weddingWebsite;
	
	@FindBy(xpath = "//p[text()='RSVPs']")
	public WebElement rsvp;
	
	@FindBy(xpath = "//p[text()='Guest List']")
	public WebElement guestList;
	
	@FindBy(xpath = "//p[text()='My Trips']")
	public WebElement myTrips;
	
	@FindBy(xpath = "//p[text()='My Rooms']")
	public WebElement myRooms;
	
	@FindBy(xpath = "//p[text()='Support']")
	public WebElement support;
	
	@FindBy(xpath = "//p[text()='Contact Us']")
	public WebElement contact;
	
	@FindBy(xpath = "//button[text()='Back']")
	public WebElement backBtn;
	
	
	
	
	
	
	
	
	
	
	
}

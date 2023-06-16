package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Resource.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenario(Scenario s) throws Throwable {
		initializeDriver();
	}
	@After(order = 1)
	public void takeScereenShot(Scenario scenario){
		byte[] screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screnshot, "image/png", null);

	}
	@After(order=0)
	public void afterScenario()  {
//		driver.close();
//		driver.quit();
	}

}

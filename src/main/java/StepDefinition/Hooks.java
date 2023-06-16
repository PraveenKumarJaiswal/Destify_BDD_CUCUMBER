package StepDefinition;

import Resource.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenario(Scenario s) throws Throwable {
		initializeDriver();
	}

	@After
	public void afterScenario() throws Throwable {
		driver.close();
		driver.quit();
	}

}

package com.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features={"src/test/java/com/features/SignUp.feature","src/test/java/com/features/Login.feature"},
                features="src/test/java/com/features/SignUp.feature",
                glue="StepDefinition",
                stepNotifications = true,
                dryRun=false,
                //tags="@sanity", //scenarios taged with @sanity
                //tags="@sanity and @regression"  //Scenarios tagged with both @sanity and @regression
                //tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
                //tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression

                plugin= {"pretty",
                        "html:reports/myreport.html",
                        "rerun:target/rerun.txt",    //Mandatory to capture failures
                       }
        )
public class TestRunner extends AbstractTestNGCucumberTests {
  @BeforeClass
  public static void writeExtentReport() {
      ExtentProperties extentProperties = ExtentProperties.INSTANCE;
      extentProperties.setReportPath("output/myreport.html");
  }
}
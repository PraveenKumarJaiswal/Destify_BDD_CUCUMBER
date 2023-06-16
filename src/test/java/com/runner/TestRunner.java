package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
               // features={"src/test/java/com/features/"},
                features="src/test/java/com/features/",
                glue="StepDefinition",
                stepNotifications = true,
                dryRun=false,
                tags="@regression", //scenarios taged with @sanity
                //tags="@sanity and @regression"  //Scenarios tagged with both @sanity and @regression
                //tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
                //tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression

                plugin= {"pretty",
                        "html:reports/myreport.html",
                        "rerun:target/rerun.txt",    //Mandatory to capture failures
                       }
        )
public class TestRunner {

}
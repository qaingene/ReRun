package example.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(strict = true, glue = { "example.cucumber" },

        plugin = { "json:target/cucumber-report-composite.json", "pretty",
                "html:target/cucumber/","rerun:target/rerun.txt" },
        tags = { "~@skip" })
public class TestExampleCucumberIT {

}
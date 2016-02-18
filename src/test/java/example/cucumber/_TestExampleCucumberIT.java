package example.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        glue = { "example.cucumber" },
        features = { "@target/rerun.txt" },
        plugin = { "json:target/cucumber-report-composite.json", "pretty",
                "html:target/rerun-report/"})
public class _TestExampleCucumberIT {
}
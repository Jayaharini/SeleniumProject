package com.task.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "com.task.cucumber", strict = true, dryRun = true, tags = "@tag")
public class TestRun {

}

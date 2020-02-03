package com.task.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith (Cucumber.class)
@CucumberOptions(features="Feature",glue="com.task.cucumber")
public class TestRunner {

}

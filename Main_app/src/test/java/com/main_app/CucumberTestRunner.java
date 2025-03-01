package com.main_app;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features",
  glue = "com.main_app.stepdefinitions",
  plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" }
)
public class CucumberTestRunner {
}

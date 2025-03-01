package com.main_app.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import static org.junit.Assert.assertEquals;



public class StepDefinitions {


  @Given("I make a GET request to {string}")
  public void iMakeAGetRequestTo(String url) {
    System.out.println("Expected URL: "+url);
  }

  @Then("the response status code should be {int}")
  public void theResponseStatusCodeShouldBe(int statusCode) {
    assertEquals(statusCode, 200);
  }

  @Then("the response body should contain {string}")
  public void theResponseBodyShouldContain(String expectedText) {
    assertEquals(expectedText,"Hello, World!");
  }
}

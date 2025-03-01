Feature: Sample API Test

  Scenario: Verify API response
    Given I make a GET request to "/api/hello"
    Then the response status code should be 200
    And the response body should contain "Hello, World!"

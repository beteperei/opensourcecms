Feature: Login feature
  As a user
  I want to login in the web application

    Scenario: Do login in the application
      Given user is in the login page
      When user enters valid username "opensourcecms"
      And user enters valid password "opensourcecms"
      And user clicks the login button
      Then the login is successful


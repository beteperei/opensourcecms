Feature: Add New Post
  As a user
  I want to create a new post

  Scenario: Create a new post
    Given user is logged
    When user clicks Post button
    And user clicks on Add New button
    And user adds a Title
    And user adds a Text
    And user clicks on Publish button
    Then The post is created successfully
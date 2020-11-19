Feature: Add New Page
  As a user
  I want to create a new post

  Background: Do login in the application
    Given user is in the login page
    When user enters valid username "opensourcecms"
    And user enters valid password "opensourcecms"
    And user clicks the login button
    Then the login is successful

  Scenario: Create a new page
    When user clicks Pages button
    And user clicks on Add New button
    And user adds title "New Page"
    And user adds text "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    And user publishes the post
    Then The page is created successfully

  Scenario: Create a new Pages with images
    When user clicks Pages button
    And user clicks on Add New button
    And user adds title "New Page"
    And user clicks on Image button
    And user upload an image
    Then The page is created successfully
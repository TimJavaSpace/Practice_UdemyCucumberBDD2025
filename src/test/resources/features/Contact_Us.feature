Feature: Contact us page
  Scenario: Validate successful submission
    Given Navigate to the Contact us page
    When I enter uniq name
    And I enter uniq LastName
    And I enter uniq email
    And I enter uniq Comment
    And Clic submit button
    Then I got successful message

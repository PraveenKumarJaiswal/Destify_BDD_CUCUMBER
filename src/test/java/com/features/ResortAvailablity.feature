Feature: Resort Availability Functionality

   @regression
  Scenario Outline: Verify Resort Availability
    Given Launch destify website
    When user clicks on Signup link
    Then user clicks on plan my destination wedding
    Then user clicks on lets Begin Button
    Then user select country
    Then user clicks on next button
    Then user select city
    Then user clicks on next button
    Then user select resort
    Then Choose date booking date
    Then Search Resort name "<resort>"
    Then Verifies date and resort is searched

    Examples: 
      | resort    |
      | Palladium |

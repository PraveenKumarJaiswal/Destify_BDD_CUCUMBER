Feature: Test Signup Functionality 
    @regression
     Scenario Outline: Verify destify Signup Functionality
    Given Launch destify website
    When user clicks on Signup link
    Then user clicks on plan my destination wedding
    Then user clicks on lets Begin Button
    Then user select country
    Then user clicks on next button
    Then user select city
    Then user clicks on next button
    Then user select resort
    Then user clicks on next button
    Then user select venue
    Then user clicks on next button
    Then user select wedding package
    Then user clicks on next button
    Then user select preferred wedding date
    Then user select second choice wedding date
    Then user clicks on next button
    
    
    Then click on login button
    Then user verifies error message and click on close button on popup
  
    Examples: 
      | emailAddress   						 | password 			|                                                
      | asdw.sloadwxne@siedsx.com | Sadsls@456! | 
    
    
  
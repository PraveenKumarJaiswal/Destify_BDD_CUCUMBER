Feature: Test Login Functionality 
    @regression
     Scenario Outline: Verify destify Login Functionality
    Given Launch destify website
    When user clicks on login link
    Then user clicks on login button
    Then user enter emailAddress "<emailAddress>"
    Then user enter password "<password>"
    Then click on login button
    Then user verifies error message and click on close button on popup
  
    Examples: 
      | emailAddress   						 | password 			|                                                
      | asdw.sloadwxne@siedsx.com | Sadsls@456! | 
    
    
  
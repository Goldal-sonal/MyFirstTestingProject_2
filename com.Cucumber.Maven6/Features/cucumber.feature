Feature: Test Logic Invoice Scenario
    
      Scenario: Test Login with Valid Credential
      Given Open chrome browser and Start Applciation
      When I enter valid "admin" and valid "pointofsale" 
      Then User should be login successfully 
      Then Click on sales
      Then Create Sale Recipt and parameter is item "smartphone" and user is "3"
      Then CLick on Save
      And Browser Closed

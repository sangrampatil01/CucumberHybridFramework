Feature: Search functionality

Scenario: User searches for a valid product
Given User opens the application
When User enteres valid peoduct "HP" into search box field
And User clicks on search button
Then User should get valid product displayed in the search results

Scenario: User searches for an invalid product
Given User opens the application
When User enteres invalid peoduct "Thar" into search box field
And User clicks on search button
Then User should get message about no product matching

Scenario: User searches without any product
Given User opens the application
When User dont enter any product name into search box field
And User clicks on search button
Then User should get message about no product matching
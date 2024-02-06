Feature: Login functionality

@Sanity
Scenario: Login with valid credentials
Given User navigates to login page
When User enteres valid email address "testuser1213@gmail.com" into email fiels
And Use enteres valid password "12345" into password field
And User clicks on login button
Then User should get successfully loged in

@Sanity
Scenario: Login with invalid credentials
Given User navigates to login page
When User enteres invalid email address into email fiels
And Use has enteres invalid password "123456789" into password field
And User clicks on login button
Then User should get a proper warning message about credentials mismatch

@Sanity
Scenario: Login with valid email and invalid password
Given User navigates to login page
When User enteres valid email address "testuser1213@gmail.com" into email fiels
And Use has enteres invalid password "123456789" into password field
And User clicks on login button
Then User should get a proper warning message about credentials mismatch

@Sanity
Scenario: Login with invalid email and valid password
Given User navigates to login page
When User enteres invalid email address into email fiels
And Use enteres valid password "12345" into password field
And User clicks on login button
Then User should get a proper warning message about credentials mismatch

@Sanity
Scenario: Login without providing any credentials
Given User navigates to login page
When User dont enter email address into email field
And Use dont enter password into password field
And User clicks on login button
Then User should get a proper warning message about credentials mismatch
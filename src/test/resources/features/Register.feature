Feature: Register functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName    |Sandip                     |
|lastName     |Patil                      |
|telephone    |1010101010                 |
|password     |12345                      |
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an account with all fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName    |Sandip                     |
|lastName     |Patil                      |
|telephone    |1010101010                 |
|password     |12345                      |
And Use selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates a duplicate account
Given User navigates to Register Account page
When User enters the details into below fields with duplicate email
|firstName    |Sandip                     |
|lastName     |Patil                      |
|email        |testuser121314@gmail.com   |
|telephone    |9911991199                 |
|password     |12345                      |
And Use selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User should get proper warning about duplicate email

Scenario: User creates an account without filling any details
Given User navigates to Register Account page
When User dont enters any fiels ento fields
And User clicks on Continue button
Then Use should get proper warning message for every mandatory field
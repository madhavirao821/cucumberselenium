Feature: This file contains test scenarios of add employee

Scenario: Validate New Employee getting created and searched in HRMS System
Given Login with admin user
When Go to PIM TAB
When hit add employee section
When enter user details
When hit save button
When search the user
Then validate user getting searched


Scenario: validate employee not getting created if mandatory fields missing.
Given Login with admin user
When Go to PIM Tab
When hit add employee section
When enter user details
When hit save button
When search the user
Then validate user not getting searched

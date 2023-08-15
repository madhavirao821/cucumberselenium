Feature: Validate the POST  Request

Scenario:1. Validate you are able to create data in the system
Given post the data to create user
Then validate status code is "201"
Then validate ID created for user with non null value
Then validate id created for user with non zero value

Scenario:2. Validate you are able to create user from file
Given post the data to create user from file
Then validate status code is "201"
Then validate ID created for user with non null value
Then validate id created for user with non zero value


Scenario:3. Validate you are able to create user from update File with name field
Given post the data to create user from file with updated name
Then validate status code is "201"
Then validate ID created for user with non null value
Then validate id created for user with non zero value


Scenario:4. Validate you are able to create user from update File with name field
Given post the data to create user from file with updated 
|name|
Then validate status code is "201"
Then validate ID created for user with non null value
Then validate id created for user with non zero value


Scenario:5. Validate you are able to create user from update File with fields
Given post the data to create user from file with updated fields
|name|
|mob|
Then validate status code is "201"
Then validate ID created for user with non null value
Then validate id created for user with non zero value


Scenario: 6.Validate you are able to create user and delete the user
Given post the data to create user from file with updated 
|name|
Then validate status code is "201"
Then validate ID created for user with non null value
Then validate id created for user with non zero value
When delete the user from system
Then validate user deleted from system

#Scenario:4. Validate you are able to create user with name as only character
#Given post the data to create user
#Then validate status code is "201"
#Then validate name as character


#Scenario:5. Validate you are able to create user with name as only character and special character
#Given post the data to create user
#Then validate status code is "201"
#Then validate name as both character and specila char


#Scenario:6. Validate you are able to create user with name as number
#Given post the data to create user
#Then validate status code is "201"
#Then validate name as number


#Scenario:7. Validate you are able to create data and validate date in response
#Given post the data to create user
#Then validate status code is "201"
#Then validate date is todays date
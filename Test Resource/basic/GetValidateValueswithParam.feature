Feature: validate the get request

Scenario:1. Validate demo QA  running
Given hit the uri
Then validate title "Git Pocket Guide" and pages "234" of the application

Scenario:2. Validate demo QA  running
Given hit the uri
Then validate value for "books[0].title" is "Git Pocket Guide"
Then validate value for "books[0].pages" is "234"
Then validate value for "books[0].author" is "Richard E. Silverman"
Then validate value for "books[0].publisher" is "O'Reilly Media"
Then validate value for "books[1].title" is "Learning JavaScript Design Patterns"


Scenario:3. Validate demo QA  running
Given hit the uri
Then validate value for attribute "title" is "Git Pocket Guide" present the response
Then validate value for attribute "author" is "Axel Rauschmayer" present the response
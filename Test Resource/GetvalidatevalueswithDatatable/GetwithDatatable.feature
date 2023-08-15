Feature: validate the get request

Scenario:1. Validate demo QA  running
Given hit the uri1

#Scenario: 1.Validate demo QA  running
#Given hit the uri
#Then validate value for "books[0].title" is "Git Pocket Guide"
#Then validate value for "books[0].pages" is "234"
#Then validate value for "books[0].author" is "Richard E. Silverman"
#Then validate value for "books[0].publisher" is "O'Reilly Media"
#Then validate value for "books[1].title" is "Learning JavaScript Design Patterns"

Scenario:2. Validate demo QA  running
Given hit the uri1
Then validate value for below table

          |books[0].title               |Git Pocket Guide|
          |books[0].pages               |234|
          |books[0].author              |Richard E. Silverman|
          |books[0].publisher           |O'Reilly Media|
          |books[1].title               |Learning JavaScript Design Patterns|
Feature: feature 2
Scenario Outline: cheking the page
Given  user is in "Selenium Test Example Page" home page
When user enters the "<data1>" on the Form Elements
And user enters the "<data2>" on the Text Area
Then user click on the submit button

Examples:
|data1|data2|
|sheereesh|naveen|
|soudamani|soudamaniii|
|srinivas|pedayogaih|
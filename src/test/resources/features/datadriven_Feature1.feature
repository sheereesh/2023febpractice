Feature: feature1

Background: bg1

Given user is "Web Examples - CrossBrowserTesting.com" page
When user clicks on the Selenium Example Page link
Scenario Outline: scenario1
Given user is "Selenium Test Example Page" page
When user enters names on the text boxes as per the row no <rowno> and clicks on the submit button
Examples:
|rowno|
|2|
|3|
|1|

 
#Author: Swathi Mengji
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login

Scenario: Check login is successful using valid credentials
Given user is on login page
When user enters valid "<email>" and "<password>"
And clicks on submit button
Then user is navigated to home page and verify heading "Contact List"
#And close the browser

Examples:
	|email|password|
	|pandaperiperi@gmail.com|123abcd|
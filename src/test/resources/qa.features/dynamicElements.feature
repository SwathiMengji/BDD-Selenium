Feature: Handle dynamic elements

Scenario: Verify dynamic elements on the About page
	Given On the homepage verify title "cpsatmockexam"
  When navigate to the About section
  And click on "<dynamic_element>" to reveal the hidden content
  Then verify that the "<content>" is displayed

  Examples:
	|dynamic_element|content|
	|CP-SAT (Java)|Anyone having basic experience Java programming and manual testing can go for this certification.|
	|CP-SAT (Python)|Anyone having basic experience Python programming and manual testing can go for this certification.|
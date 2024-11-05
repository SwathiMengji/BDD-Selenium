Feature: Handle hover elements on the website

  Scenario: Validate hover functionality on logos
    Given On the homepage verify title "cpsatmockexam"
    When navigate to the About section
    And I hover over each "<logo>"
    Then the hidden <content> should be displayed correctly for each logo
    
Examples:
	|logo|content|
	|1|"CP-SAT (Java)"|
	|2|"CP-SAT (Python)"|
	|3|"CP-SAT (C#)"|
# BDD-Selenium

This project automates key functionalities using **Selenium WebDriver**, **Java**, **JUnit**, and **Cucumber** within a **Behavior-Driven Development (BDD)** framework and **Page factory**. The goal is to test dynamic elements, pop-ups, hover actions, multi-window handling, heatmap interactions, and AJAX content loading.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Test Cases Implemented](#test-cases-implemented)


## Project Overview

This automation project tests various functionalities of website, with a specific focus on handling dynamic and interactive web elements. The following major implementations are covered:

-Handling dynamic elements using explicit waits
-Managing pop-up alerts
-Performing hover actions and validating tooltips
-Switching between multiple windows or tabs
-Interacting with heatmaps for data visualization
-Ensuring AJAX content is fully loaded before interaction

## Technologies Used

- **Java**: Programming language
- **Selenium WebDriver**: For browser automation
- **JUnit**: Testing framework for assertions and test management
- **Cucumber**: Feature files with Gherkin for human-readable tests
- **Maven**: Build automation tool for managing dependencies

## Test Cases Implemented

**Test Case 1**: Handling dynamic elements
Test Scenario: Validate dynamic elements functionality

Steps:
1.	Navigate to the homepage and verify the title.
2. Navigate to the "About" section.
2. Click on a dynamic element (e.g., "CP-SAT (Java)") to reveal hidden content.
2. Verify that the corresponding content is displayed.

Expected Result: The hidden content related to the selected dynamic element should be displayed correctly.

Approach: Dynamic elements are handled using explicit waits and XPath to ensure elements are visible and interactable. The scrollToElement() method brings elements into view, while XPath dynamically locates elements by their text and parent relationships.


**More test cases with different functionalities on the way..."

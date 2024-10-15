# OrangHRM Test Automation Framework

This project is an automation framework for the OrangeHRM website, built using **Selenium WebDriver**. The framework follows the **Page Object Model (POM)** design pattern and is integrated with **TestNG** for structured test execution and reporting. It also supports **data-driven testing** and includes API testing with **Rest Assured**.

## Features
- **Page Object Model (POM)** for improved test maintenance.
- **TestNG Integration**: Organize, execute, and report tests efficiently.
- **Data-Driven Testing**: Easily manage test data for multiple scenarios.
- **Automatic Screenshot Capture** on test failures.
- **API Testing**: Rest Assured is used for validating backend services.
- **Allure Reports**: Generate detailed test reports for better insights.

## Prerequisites
Ensure the following are installed before running the project:
- **Java 22**: The programming language used in the framework.
- **Maven**: For managing dependencies and building the project.
- **Selenium WebDriver**: For automating browser actions (WebDriver binaries managed using WebDriverManager).
- **IntelliJ IDEA**: Recommended IDE for Java development.
- **Git**: For version control.

## Setup Instructions
Follow these steps to set up and run the project locally:
1. Clone the repository:
   ```bash
   git clone https://github.com/Gawad138/OrangHRMtestAutomation
   ```
2. Navigate to the project folder and run the Maven command:
   ```bash
   mvn clean install
   ```
3. Open the project in **IntelliJ IDEA**, configure the test environment, and run tests using **TestNG.xml**.


# 🚀 CucumberFramework01

A robust End-to-End UI Automation Framework built using **Java, Selenium WebDriver, Cucumber BDD, TestNG, Maven, and Jenkins**.

This framework follows industry-standard automation design patterns such as:

- Page Object Model (POM)
- Behavior Driven Development (BDD)
- Data-Driven Testing
- Reusable Utilities
- Cross Browser Execution
- CI/CD Integration with Jenkins
- Rich HTML Reporting

---

# 📌 Project Overview

This project is designed to automate web application testing using a scalable and maintainable framework architecture.

The framework allows:

- Writing human-readable BDD test cases using Gherkin syntax
- Executing tests on multiple browsers
- Running tests through Maven commands
- Triggering execution from Jenkins pipelines/jobs
- Generating detailed execution reports
- Easy maintenance and scalability for large automation suites

---

# 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| Selenium WebDriver | UI Automation |
| Cucumber BDD | Behavior Driven Development |
| TestNG | Test Execution |
| Maven | Build Management |
| Jenkins | CI/CD Integration |
| Git & GitHub | Version Control |
| Extent Reports / Cucumber Reports | Reporting |

---

# 📂 Project Structure

```bash
CucumberFramework01
│
├── src
│   ├── main
│   │   └── java
│   │       ├── pageObjects
│   │       ├── abstractComponents
│   │       └── resources
│   │
│   └── test
│       └── java
│           ├── cucumber
│           ├── stepDefinitions
│           ├── runners
│           └── features
│
├── target
├── pom.xml
├── testng.xml
└── README.md
```

---

# ✨ Framework Features

## ✅ BDD Framework
- Uses Cucumber feature files written in Gherkin language
- Easy collaboration between QA, Developers, and Business teams

## ✅ Page Object Model (POM)
- Reusable page classes
- Better code maintainability
- Cleaner test implementation

## ✅ Cross Browser Testing
Supports execution on:
- Chrome
- Edge
- Firefox

## ✅ Maven Integration
- Easy dependency management
- Simple command-based execution

## ✅ Jenkins CI/CD Support
- Automated execution using Jenkins jobs
- Easy integration with GitHub repositories

## ✅ Reporting
- Detailed HTML execution reports
- Failure screenshots support
- Easy debugging and analysis

---

# ⚙️ Prerequisites

Before running the project, ensure the following are installed:

## Required Software

- Java JDK 21 or above
- Maven 3.8+
- Git
- Chrome / Edge Browser
- Jenkins (Optional for CI/CD)
- IDE (IntelliJ IDEA / Eclipse / VS Code)

---

# 🔧 Setup Instructions

## 1️⃣ Clone Repository

```bash
git clone https://github.com/Code-With-Yogi/CucumberFramework01.git
```

---

## 2️⃣ Navigate to Project

```bash
cd CucumberFramework01
```

---

## 3️⃣ Install Dependencies

```bash
mvn clean install
```

---

# ▶️ How To Run Tests

## Run Complete Test Suite

```bash
mvn test
```

---

## Run Specific Cucumber Tag

Example:

```bash
mvn test -Dcucumber.filter.tags="@PlaceOrder"
```

---

## Run Tests On Specific Browser

### Chrome

```bash
mvn test -Dbrowser=chrome
```

### Edge

```bash
mvn test -Dbrowser=edge
```

### Firefox

```bash
mvn test -Dbrowser=firefox
```

---

# 🧪 Sample Cucumber Scenario

```gherkin
Feature: Product Purchase

Scenario: Successful Product Order
Given User launches application
When User logs in with valid credentials
And User adds product to cart
And User proceeds to checkout
Then Order should be placed successfully
```

---

# 📊 Reports

After execution, reports can be found under:

```bash
target/cucumber-reports/
```

or

```bash
target/ExtentReports/
```

---

# 🔄 Jenkins Integration

## Jenkins Build Command

Use the following Maven goal inside Jenkins:

```bash
test -Dcucumber.filter.tags="@PlaceOrder"
```

---

## Configure Jenkins

1. Create New Freestyle Project
2. Connect GitHub Repository
3. Configure Maven Build Step
4. Add Maven Goal
5. Trigger Build

---

# 📌 Best Practices Followed

- Reusable methods and utilities
- Externalized test data
- Generic wait implementations
- Clean framework layering
- Centralized configuration handling
- Minimal hardcoded values

---

# 🚧 Future Enhancements

- Docker Integration
- Selenium Grid Support
- Parallel Execution
- Allure Reporting
- API + UI Hybrid Framework
- Cloud Execution (BrowserStack / Sauce Labs)

---

# 👨‍💻 Author

### Yogesh Dahatonde

QA Automation Engineer | SDET

Skills:
- Java
- Selenium
- Cucumber BDD
- REST Assured
- TestNG
- Jenkins
- Maven
- GitHub
- SQL

GitHub Repository:

https://github.com/Code-With-Yogi/CucumberFramework01

---

# ⭐ Contribution

Contributions, suggestions, and improvements are always welcome.

Feel free to fork the repository and raise a pull request.

---

# 📜 License

This project is for learning and automation practice purposes.

# 🚀 Selenium Java Automation Framework – Admin Panel Testing

## 📌 Overview

This project is a **Selenium Java Test Automation Framework** built using:

* Page Object Model (POM)
* TestNG
* Maven
* Data-driven testing (Excel)
* Parallel execution
* Retry mechanism
* Extent Reports with screenshots

It automates a demo web application covering:

* Form interactions
* Alerts & dialogs
* Dynamic elements
* Frames handling

---

## 🔄 Project Workflow

<img width="2697" height="2793" alt="Project17Workflow drawio" src="https://github.com/user-attachments/assets/ff9ff14f-8da4-4e8b-8230-5a78307a3c35" />

---

## 📁 Project Structure

```
AdminPanel/
│
├── src/main/java/
│   ├── base/
│   │   └── BasePage.java                # Common reusable methods (click, wait, type, alerts, etc.)
│
│   ├── pages/
│   │   ├── AlertPage.java              # Handles alert, confirm, and prompt dialogs
│   │   ├── DynamicPage.java            # Handles AJAX and dynamic elements
│   │   ├── FormPage.java               # Handles HTML form interactions
│   │   └── FramesPage.java             # Handles iframe and nested frame operations
│
│   └── utils/
│       ├── ConfigReader.java           # Reads config.properties (browser, URL, timeout)
│       ├── ExcelUtil.java              # Reads test data from Excel file
│       ├── ExtentManager.java          # Configures Extent Reports
│       └── ScreenshotUtil.java         # Captures screenshots on failure
│
├── src/test/java/
│   ├── base/
│   │   └── BaseTest.java               # Driver setup, teardown, ThreadLocal for parallel execution
│
│   ├── listeners/
│   │   ├── RetryListener.java          # Applies retry logic automatically
│   │   └── TestListener.java           # Captures screenshots & logs results in reports
│
│   ├── tests/
│   │   ├── AlertTest.java              # Test cases for alerts module
│   │   ├── DynamicTest.java            # Test cases for dynamic/AJAX elements
│   │   ├── FormTest.java               # Data-driven form submission tests
│   │   └── FramesTest.java             # Test cases for iframe handling
│
│   └── utils/
│       └── RetryAnalyzer.java          # Retry failed tests logic
│
├── src/test/resources/
│   ├── testdata/
│   │   └── FormData.xlsx               # Excel data for DataProvider
│   │
│   └── config.properties              # Configuration (browser, baseUrl, timeout)
│
├── reports/                           # Extent report output
├── screenshots/                       # Failure screenshots
├── target/                            # Maven build output
├── test-output/                       # TestNG default reports
│
├── pom.xml                            # Maven dependencies
└── testng.xml                         # Test suite configuration
```

---

## 📌 Modules Covered

### ✅ Module 1 – Form Interactions

* Automated filling of HTML form with valid inputs
* Verified submission behavior
* Handled dropdowns, radio buttons, and checkboxes
* Validated behavior for empty fields

---

### ⚠️ Module 2 – Table Operations

* Explored the application for sortable and paginated tables
* The available **HTML Table (Basics → HTML Tag - Table)** was static
* No built-in sorting or pagination functionality was found in the accessible sections

👉 **Therefore:**

* Verified table structure (headers and data)
* Did not implement sorting/pagination automation due to lack of applicable UI

---

### ✅ Module 3 – Alerts and Dialogs

* Automated handling of:

  * Simple alert (accept)
  * Confirm alert (accept & dismiss)
  * Prompt alert (input + accept)
* Verified result messages after each action

---

### ✅ Module 4 – Dynamic Elements

* Automated AJAX-based interaction
* Verified dynamic behavior through page navigation
* Validated redirect functionality

---

### ✅ Module 5 – Frames

* Switched to iframe and interacted with elements
* Verified content inside iframe
* Switched back to main page and validated elements


---

## 🧪 How to Run

### ▶️ Run via Maven

```bash
mvn test
```

### ▶️ Run via TestNG XML

```
Right-click → testng.xml → Run As → TestNG Suite
```

---


## 📸 Reports & Screenshots

* Reports → `/reports`
* Screenshots → `/screenshots`
* Generated automatically after execution

---

## 👩‍💻 Author

Vaishnavi

---

## 🎯 Conclusion

This project demonstrates a structured Selenium automation framework using POM, TestNG, and data-driven testing. It effectively covers real-world scenarios including forms, alerts, dynamic elements, and frames with maintainable design.

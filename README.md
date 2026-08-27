

# Student Performance Calculator with JUnit 5

A Java application for calculating and classifying student academic performance, with automated unit testing using **JUnit 5**.

The project focuses on clean calculation logic, input validation, boundary testing and testable Java design.

---

## Overview

The application processes assessment scores and determines the corresponding academic performance result.

Core functionality includes:

* Average score calculation
* Pass/fail evaluation
* Performance classification
* Input validation
* Boundary value handling
* Automated unit testing

---



## Diagrame
<img width="800" height="700" alt="image" src="https://github.com/user-attachments/assets/15ba966a-7e2e-4efc-bd5f-0239fd430906" />

## Application Flow

![Student Performance Calculator Diagram](YOUR_IMAGE_PATH_HERE)

The application follows a simple flow:

```text
Assessment Scores
       │
       ▼
Input Validation
       │
       ▼
Average Calculation
       │
       ▼
Performance Classification
       │
       ▼
Final Result
```

---

## Technologies

* Java
* JUnit 5
* IntelliJ IDEA
* Maven or Gradle *(include only if your project actually uses one)*

---

## Key Features

### Performance Calculation

Calculates student performance based on supplied assessment scores.

### Grade Classification

Classifies results into defined academic performance categories.

### Input Validation

Prevents invalid score values from being processed.

### Boundary Testing

Tests values around important classification thresholds to ensure consistent behaviour.

### Automated Unit Tests

JUnit 5 tests verify the calculation and classification logic independently from the main application.

---

## Example Results

```text
Score: 75 → Grade A
Score: 62 → Grade B
Score: 45 → Fail
```

---

## Testing

The project includes automated JUnit 5 tests covering:

* Grade A classification
* Grade B classification
* Grade C classification
* Fail classification
* Valid score boundaries
* Invalid input handling

Example:

```java
@Test
void shouldReturnGradeAForHighScore() {
    // Arrange
    double score = 75;

    // Act
    String result = calculator.classify(score);

    // Assert
    assertEquals("Grade A", result);
}
```

> Replace this example with one of your actual test methods if the method names or implementation differ.

---

## Testing Approach

The test suite focuses on:

* Expected outputs
* Boundary values
* Invalid input
* Classification thresholds
* Regression protection

Automated testing helps ensure that changes to the calculation logic do not unintentionally break existing behaviour.

---

## Project Structure

```text
Student-Performance-Calculator-JUnit/
│
├── src/
│   ├── main/
│   │   └── java/
│   │
│   └── test/
│       └── java/
│
├── README.md
└── ...
```

---

## What This Project Demonstrates

This project demonstrates practical experience with:

* Java application development
* Object-oriented programming
* Unit testing with JUnit 5
* Testable code design
* Input validation
* Boundary value analysis
* Debugging
* Software quality practices

---

## Author

**Vasile Bejan**

GitHub: **vasile007**



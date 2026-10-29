# Leave Management System

## Overview
A Java console application for demonstrating object-oriented programming through employee leave management.

## Features
- Stores employee ID, name, department, and leave balance.
- Supports leave application, cancellation, employee detail display, and leave-balance checks.
- Uses employee types such as FullTimeEmployee, PartTimeEmployee, Intern, and Manager to demonstrate different leave policies.
- Demonstrates OOP principles and refactoring practices.

> **Before submission:** Make sure the features and class names listed here match your actual Java implementation. Remove any feature that is not implemented.

## Project Structure
```text
LeaveManagementSystem/
├── src/
│   ├── Employee.java
│   ├── FullTimeEmployee.java
│   ├── PartTimeEmployee.java
│   ├── Intern.java
│   ├── Manager.java
│   └── Main.java
├── ClassDiagram.png
├── OOP_Concepts.md
├── Refactoring_Notes.md
└── SampleOutput.txt
```
The filenames above are a suggested structure. Keep your existing package names and actual filenames.

## Requirements
- Java JDK installed
- Eclipse IDE (or another Java IDE)

## How to Run in Eclipse
1. Import/open the project in Eclipse.
2. Confirm the JDK is configured under the project's Java Build Path.
3. Open the class containing `main(String[] args)` (often `Main.java`).
4. Run it as **Java Application**.
5. Review the console output.

## Example Scenarios to Test
1. Create at least three employees.
2. Apply leave within the employee's available balance.
3. Try applying more leave than the available balance and verify the program handles it.
4. Cancel a valid leave request and verify the balance is restored correctly.
5. Check the different leave rules for full-time employees, part-time employees, interns, and managers.

## GitHub Repository
https://github.com/Dharmik2608/LeaveManagementSystem

## Author
Dharmik

## Submission Note
This README is a starter document. Update it to reflect the exact methods, policies, and output implemented in your source code before submitting.

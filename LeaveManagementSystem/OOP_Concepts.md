# OOP Concepts Used

This document explains how the assignment's object-oriented concepts can be demonstrated in the Leave Management System. Update each example to match your source code.

## 1. Encapsulation
Keep employee data such as employee ID, name, department, and leave balance private. Provide controlled access through constructors, getters/setters, and methods such as `checkLeaveBalance()`.

**Verify in code:** fields are not directly modified from unrelated classes.

## 2. Inheritance
Employee types can extend a common `Employee` class:
- `FullTimeEmployee extends Employee`
- `PartTimeEmployee extends Employee`
- `Intern extends Employee`
- `Manager extends Employee`

The subclasses reuse common employee data and behaviour.

## 3. Abstraction
An abstract `Employee` class can define shared structure and abstract behaviour, such as a method for determining an employee's leave allowance. Subclasses implement the employee-specific rule.

**If your `Employee` class is not abstract, describe the abstraction you actually use instead.**

## 4. Polymorphism
A variable of type `Employee` can refer to a `FullTimeEmployee`, `PartTimeEmployee`, `Intern`, or `Manager` object. Calling an overridden method through the `Employee` reference can produce behaviour specific to the actual employee type.

## 5. Method Overriding
A subclass can override a method from `Employee`, for example a method that determines the allowed leave days. Use `@Override` to make the intention clear.

## 6. Method Overloading
A class can provide methods with the same name but different parameter lists, for example:
- `applyLeave(int days)`
- `applyLeave(int days, String reason)`

Only document overloading if the corresponding methods actually exist in your code.

## 7. Access Modifiers
- `private`: restricts direct access to class internals.
- `protected`: allows access from subclasses and package-level code.
- `public`: exposes methods intended for use by other classes.
- package-private (no modifier): restricts access to the same package.

Use the least permissive access level that meets the design requirements.

## Example Relationship
`Employee` is the parent class. The employee-specific classes inherit common state and behaviour, and can implement different leave policies.

## Before Submission
Check that your Java source code contains clear examples of all required concepts. Remove or revise any section that is not demonstrated by your implementation.

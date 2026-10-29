# Refactoring Notes

Use this file to document improvements that are actually present in your final code. The examples below are suggestions; edit them to match the changes you made.

## Improvement 1: Remove duplicate employee logic
**Problem:** Similar employee details or leave-balance operations may be repeated across subclasses.

**Improvement:** Move common data and behaviour into the shared `Employee` class, leaving employee-specific rules in subclasses.

**Benefit:** Less duplication and easier maintenance.

## Improvement 2: Separate responsibilities
**Problem:** A single class may handle employee data, leave rules, input, and output.

**Improvement:** Keep employee state and behaviour in employee classes and keep demonstration/input flow in the main application class. If a separate service class exists, document its responsibility here.

**Benefit:** Each class has a clearer purpose.

## Improvement 3: Validate leave requests
**Problem:** Invalid values (such as zero or negative leave days) or requests exceeding the available balance may cause incorrect state.

**Improvement:** Validate the requested number of days and ensure the balance is sufficient before updating it. Use meaningful error messages or exceptions as appropriate.

**Benefit:** More reliable behaviour and clearer failure handling.

## Additional improvements to record
- Clear, consistent class and method names.
- Use private fields and controlled access.
- Use `@Override` for overridden methods.
- Avoid repeating hard-coded leave rules.
- Add tests for valid and invalid leave requests.

## Actual changes made
Fill in this section before submission:
1. **File/class changed:** ...
   - **Before:** ...
   - **After:** ...
   - **Reason/benefit:** ...
2. **File/class changed:** ...
   - **Before:** ...
   - **After:** ...
   - **Reason/benefit:** ...
3. **File/class changed:** ...
   - **Before:** ...
   - **After:** ...
   - **Reason/benefit:** ...

Do not claim an improvement unless it is implemented in your submitted source code.

# Recitation 2: Casting and String Concatenation in Java

## Learning Objectives

By the end of this recitation, students will be able to:

* Use method parameters correctly in output statements
* Write `System.out.println` statements using both strings and numeric values
* Identify and fix basic Java syntax errors
* Explain how Java evaluates expressions involving the `+` operator
* Distinguish between integer arithmetic and floating-point arithmetic
* Apply explicit type casting to control expression evaluation
* Interpret and satisfy a JUnit test that validates printed output
* Debug logic errors related to expression evaluation and output formatting


## Background

Java differs from Python in how it evaluates arithmetic expressions and how it treats the `+` operator.

In Java:

* Arithmetic involving only `int` values produces an `int`
* Assigning an expression to a `double` does **not** change how the expression is evaluated
* The `+` operator performs:

  * Numeric addition when both operands are numeric
  * String concatenation when either operand is a `String`

This recitation is designed to surface these differences through printed output rather than return values.


## The Task

You are given a Java class named `ScorePrinter` and a corresponding JUnit test. The JUnit test is **correct and must not be changed**.

Your task is to modify the Java class so that:

1. The code compiles successfully
2. All required output is produced using `System.out.println`
3. The output exactly matches what the JUnit test expects


## Requirements

### You **must not**:

* Change the method name
* Change the method return type
* Change any parameter types
* Modify the JUnit test
* Hard-code numeric values in print statements

### You **must**:

* Fix all syntax errors in the Java class
* **Write the required `println` statements at the beginning of the method**
* Compute the homework and exam contributions correctly
* **Write the final `println` statement that prints the final score**

### You **may**:

* Add parentheses
* Add explicit type casts
* Add additional local variables if needed


## Required Output Format

Your program must produce output in the following order.

### 1. Input Summary (You must write these print statements)

```
Homework Score and Exam Score: 89 35
Homework Weight and Exam Weight: 30 70
```

The values printed must come from the method parameters and must not be hard-coded.


### 2. Computed Contributions

```
Homework contribution: 26.7
Exam contribution: 24.5
```


### 3. Final Score (You must write this print statement)

```
Final score: 51.2
```

### 4. Final Output

The final output from the method `printWeightedScore` should look like the following with different values depending on the values passed to the parameters.

```
Homework Score and Exam Score: 89 35
Homework Weight and Exam Weight: 30 70
Homework contribution: 26.7
Exam contribution: 24.5
Final score: 51.2
```

You are responsible for writing the `println` statement that produces this output correctly.  See the *TODO* markers in the Java source file.


## Common Pitfalls

* Performing integer division before casting
* Casting *after* division instead of before it
* Assuming Java automatically converts arithmetic to floating-point
* Writing a `println` statement that concatenates numbers instead of adding them
* Writing String + number + number and expecting numeric addition
* Missing spaces or incorrect line breaks in output
* Forgetting that int / int performs integer division
* Assuming assignment to double changes how an expression is evaluated

## Hints

* Java evaluates expressions from **left to right**
* Once a `String` is involved in a `+` expression, the result becomes a `String`
* Parentheses can change the order of evaluation
* Printing a `double` does not guarantee floating-point arithmetic was used

## Submission

Before submitting, confirm that:

* The Java file compiles without errors
* All JUnit tests pass

When you have completed the above tasks, submit the **ScorePrinter.java** file by clicking on the CodeGrade *Recitation 2* link in Blackboard.

# STEP Semester 3 · Java Practice

**Class practice and assignment programs, organized by session.**

Maintained by **Ankur Bikram Thapa** · B.Tech Computer Science and Engineering

[GitHub Profile](https://github.com/abtcodermilli) · [Original Reference Repository](https://github.com/Rajveer-SGB/Step_Semester_3)

## Overview

A collection of Java programs for STEP Semester 3 revision and practice. Each available session contains class problems and assignment problems, making it easy to find examples, run programs, and review Java concepts.

The current collection includes **7 sessions and 70 Java source files**: 35 class programs and 35 assignment programs. Session 3 is not included because it is absent from the reference repository's session branches.

## Session Directory

| Session | Class Programs | Assignment Programs | Source Folder |
| --- | ---: | ---: | --- |
| 1 | 5 | 5 | [week1](src/main/java/week1/) |
| 2 | 5 | 5 | [week2](src/main/java/week2/) |
| 4 | 5 | 5 | [week4](src/main/java/week4/) |
| 5 | 5 | 5 | [week5](src/main/java/week5/) |
| 6 | 5 | 5 | [week6](src/main/java/week6/) |
| 7 | 5 | 5 | [week7](src/main/java/week7/) |
| 8 | 5 | 5 | [week8](src/main/java/week8/) |

Each week contains:

- **`class_problems`** — class practice programs.
- **`assignment_problems`** — assignment practice programs.

Week 1 retains the original folder spelling, **`assigment_problems`**.

## Getting Started

### Requirements

- A Java Development Kit (JDK), with `java` and `javac` available in your terminal.
- VS Code or another text editor.

Check your Java installation:

```bash
java -version
javac -version
```

### Open the Project

In VS Code, choose **File → Open Folder** and select your **STEP SEMESTER 3** folder. Expand **src → main → java** to browse the session programs.

### Compile and Run an Example

Open **Terminal → New Terminal** in the project folder, then run:

```bash
javac -d out src/main/java/week1/class_problems/BMICalculator.java
java -cp out week1.class_problems.BMICalculator
```

Enter the number of people, then each person's height in meters and weight in kilograms when prompted.

To run another program, use its source path and fully qualified class name from its `package` declaration. Programs without a `main` method require a driver or the corresponding online judge. Compile any required companion classes together.

## Practice Workflow

1. Read the problem and identify its inputs and expected output.
2. Trace the reference solution with a small example.
3. Run the program and test a few cases.
4. Write your own solution and compare the results.
5. Record what you learned in your commits or notes.

# STEP Semester 3 · Java Practice

**Class practice and assignment solutions, organized by session.**

Maintained by **Ankur Bikram Thapa**  
B.Tech Computer Science and Engineering · [GitHub](https://github.com/abtcodermilli)

## Overview

This repository brings together Java programs for STEP Semester 3 practice and revision. Each session has separate folders for class problems and assignment problems.

The collection covers **8 sessions through Session 9**, with **80 Java programs**: 40 class-practice programs and 40 assignment programs.

**Session 3 is not included.**

## Sessions

| Session | Class Practice | Assignment Practice | Programs |
| --- | --- | --- | ---: |
| 1 | [Class problems](src/main/java/week1/class_problems/) | [Assignment problems](src/main/java/week1/assigment_problems/) | 10 |
| 2 | [Class problems](src/main/java/week2/class_problems/) | [Assignment problems](src/main/java/week2/assignment_problems/) | 10 |
| 4 | [Class problems](src/main/java/week4/class_problems/) | [Assignment problems](src/main/java/week4/assignment_problems/) | 10 |
| 5 | [Class problems](src/main/java/week5/class_problems/) | [Assignment problems](src/main/java/week5/assignment_problems/) | 10 |
| 6 | [Class problems](src/main/java/week6/class_problems/) | [Assignment problems](src/main/java/week6/assignment_problems/) | 10 |
| 7 | [Class problems](src/main/java/week7/class_problems/) | [Assignment problems](src/main/java/week7/assignment_problems/) | 10 |
| 8 | [Class problems](src/main/java/week8/class_problems/) | [Assignment problems](src/main/java/week8/assignment_problems/) | 10 |
| 9 | [Class problems](src/main/java/week9/class_problems/) | [Assignment problems](src/main/java/week9/assignment_problems/) | 10 |

Week 1 retains the original folder spelling, `assigment_problems`.

## Session 9 — Abstraction and Interfaces

Session 9 contains solutions to the supplied Category C practice and assignment questions. Each problem is a separate Java file, with its supporting classes and interfaces nested inside it.

| Class Practice | Assignment Practice |
| --- | --- |
| Garden Plot Area Report | Movie Ticket Counter |
| Weekly Staff Pay | Parcel Shipping Desk |
| Library Late Fine Counter | College Fee Counter |
| Electricity Connection Billing | City Cab Fare Meter |
| Travel Booking with a Common Fee | Home Appliance Energy Report |

These programs demonstrate abstract classes, method overriding, polymorphism, shared fee calculations, and interfaces for optional capabilities such as insurance, bus transport, night service and saver mode.

See the [Session 9 guide](src/main/java/week9/README.md) for explanations, sample inputs and expected outputs.

## Folder Organization

Source files are stored under **`src/main/java`**. The available session folders are `week1`, `week2`, `week4`, `week5`, `week6`, `week7`, `week8` and `week9`.

Inside each session:

- **`class_problems`** contains class-practice programs.
- **`assignment_problems`** contains assignment solutions, except for the Week 1 spelling noted above.

Keep each program in its own `.java` file. Its filename must match its public class name.

## Run on Your Laptop

### Requirements

- A Java Development Kit (JDK), with `java` and `javac` available in Terminal.
- VS Code or another editor. Java 17 can compile the Session 9 solutions.

Check your installation:

```bash
java -version
javac -version
```

### Get the Repository

```bash
git clone https://github.com/abtcodermilli/STEP-Java-Practice.git
cd STEP-Java-Practice
```

Open this folder in VS Code, then select **Terminal → New Terminal**. Run the following commands from the repository root.

### Run a Class-Practice Program

```bash
javac -d out src/main/java/week9/class_problems/GardenPlotAreaReport.java
java -cp out week9.class_problems.GardenPlotAreaReport
```

Sample input:

```text
3
CIRCLE Asha 5
RECTANGLE Ravi 4 6
TRIANGLE Neha 10 3
```

Expected output:

```text
Asha (CIRCLE): 78.54
Ravi (RECTANGLE): 24.00
Neha (TRIANGLE): 15.00
Total Area: 117.54
```

### Run an Assignment Program

```bash
javac -d out src/main/java/week9/assignment_problems/MovieTicketCounter.java
java -cp out week9.assignment_problems.MovieTicketCounter
```

Sample input:

```text
3
REGULAR 3
PREMIUM 2
RECLINER 1
```

Expected output:

```text
REGULAR: 510.00
PREMIUM: 540.00
RECLINER: 420.00
Total: 1470.00
```

For another program, use its source path and the fully qualified class name from its `package` declaration. Some earlier files may need a driver or an online judge rather than direct execution.

## Practice Workflow

1. Read the problem and identify the inputs, outputs and rules.
2. Trace the solution using a small example.
3. Compile and run the program.
4. Test boundary cases and compare the output with the expected result.
5. Explain the approach in your own words and record meaningful changes in Git.

## Validation

The ten Session 9 programs compile with Java 17 and match all ten PDF sample outputs. Additional checks cover overtime boundaries, DVD fine limits, electricity billing thresholds, minimum cab fares and unsupported saver modes.

The earlier session files are reference material; their correctness has not been independently verified as part of this collection.

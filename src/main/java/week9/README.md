# Session 9 — Abstraction and Interfaces

Ten Java solutions based on the supplied Category C class-practice and coding-assignment PDFs. Session 9 is the next-session label used for this collection; the PDFs themselves do not specify a session number.

Each problem is a separate public Java class. Its supporting abstract classes, concrete classes and interfaces are nested inside it so that each file compiles independently without class-name conflicts.

## Class Practice

| PDF problem | Java file | Main idea |
| --- | --- | --- |
| 1. Garden Plot Area Report | class_problems/GardenPlotAreaReport.java | Abstract Plot and polymorphic area calculations |
| 2. Weekly Staff Pay | class_problems/WeeklyStaffPay.java | Abstract Staff and different pay rules |
| 3. Library Late Fine Counter | class_problems/LibraryLateFineCounter.java | Abstract Item with overridden fine calculations |
| 4. Electricity Connection Billing | class_problems/ElectricityConnectionBilling.java | Abstract Connection with different billing rules |
| 5. Travel Booking with a Common Fee | class_problems/TravelBooking.java | Abstract Booking with one shared booking-fee constant |

## Assignment Practice

| PDF problem | Java file | Main idea |
| --- | --- | --- |
| 1. Movie Ticket Counter | assignment_problems/MovieTicketCounter.java | Shared convenience fee, applied per ticket |
| 2. Parcel Shipping Desk | assignment_problems/ParcelShippingDesk.java | Abstract Parcel and optional Insurable interface |
| 3. College Fee Counter | assignment_problems/CollegeFeeCounter.java | Abstract Student and optional BusUser interface |
| 4. City Cab Fare Meter | assignment_problems/CityCabFareMeter.java | Shared minimum fare and optional NightService interface |
| 5. Home Appliance Energy Report | assignment_problems/HomeApplianceEnergyReport.java | Shared energy calculation and optional SaverMode interface |

## Run from the repository root

```bash
javac -d out src/main/java/week9/class_problems/*.java src/main/java/week9/assignment_problems/*.java
java -cp out week9.class_problems.GardenPlotAreaReport
```

For an assignment example:

```bash
java -cp out week9.assignment_problems.MovieTicketCounter
```

Paste the corresponding sample input below. Programs print only the specified outputs; no extra prompts are added. Inputs are assumed to follow the PDF's types and valid nonnegative measurements.

## Understanding the design

- An abstract class holds common information and declares operations that each concrete subclass must implement. It cannot be instantiated directly.
- An interface represents an optional capability: for example, only Express and Fragile parcels implement Insurable.
- The report calls an operation on a common base type; Java dispatches to the appropriate overridden method.
- Shared fees and minimums are defined once. Adding a new subclass still requires adding its input-construction case, while the reporting calculation remains shared.
- Each file's main method reads input, creates the matching object, calculates the result and prints it with two decimal places.

## Verification

All ten files compile with Java 17. All ten PDF sample outputs match exactly. Five additional checks cover overtime at 40 hours, DVD caps, electricity thresholds, cab minimums and unsupported saver modes.

## PDF sample inputs and expected outputs

### GardenPlotAreaReport

Input:

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

### WeeklyStaffPay

Input:

```text
3
FULLTIME Asha 12000
HOURLY Ravi 45 200
INTERN Neha 5000
```

Expected output:

```text
Asha: 12000.00
Ravi: 9500.00
Neha: 5000.00
Total Payroll: 26500.00
```

### LibraryLateFineCounter

Input:

```text
3
BOOK Algebra 4
DVD Inception 12
MAGAZINE Sports 3
```

Expected output:

```text
Algebra: 8.00
Inception: 50.00
Sports: 3.00
Total Fines: 61.00
```

### ElectricityConnectionBilling

Input:

```text
3
HOME 150
SHOP 90
FACTORY 120
```

Expected output:

```text
HOME: 850.00
SHOP: 820.00
FACTORY: 1000.00
Total: 2670.00
```

### TravelBooking

Input:

```text
3
BUS 200
TRAIN 300
FLIGHT 500
```

Expected output:

```text
BUS: 450.00
TRAIN: 500.00
FLIGHT: 4550.00
```

### MovieTicketCounter

Input:

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

### ParcelShippingDesk

Input:

```text
3
STANDARD 3 500
EXPRESS 2 1000
FRAGILE 4 2000
```

Expected output:

```text
STANDARD: Charge=70.00 Insurance=0.00 Total=70.00
EXPRESS: Charge=110.00 Insurance=20.00 Total=130.00
FRAGILE: Charge=130.00 Insurance=40.00 Total=170.00
Grand Total: 370.00
```

### CollegeFeeCounter

Input:

```text
3
DAY_SCHOLAR Asha
HOSTELLER Ravi
SCHOLAR Neha
```

Expected output:

```text
Asha: 52000.00
Ravi: 100000.00
Neha: 32000.00
Total Collected: 184000.00
```

### CityCabFareMeter

Input:

```text
4
MINI 8 DAY
SEDAN 10 NIGHT
SUV 20 DAY
MINI 5 NIGHT
```

Expected output:

```text
MINI: 100.00
SEDAN: 168.00
SUV: 360.00
MINI: night service not available
Total: 628.00
```

### HomeApplianceEnergyReport

Input:

```text
4
FRIDGE 24
AC 8 SAVER
TV 5
WASHER 2 SAVER
```

Expected output:

```text
FRIDGE: Units=3.60 Cost=28.80
AC: Units=9.00 Cost=72.00
TV: Units=0.50 Cost=4.00
WASHER: Units=0.75 Cost=6.00
Total Cost: 110.80
```


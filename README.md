# ATM-Simulator
Console-based ATM simulator in Java using OOP, inheritance, file handling, and input validation.

# Java ATM Simulator

This is a console-based ATM simulation project built in Java. The application allows users to log in with a customer number and PIN, select account types (Current or Savings), and perform common banking operations like checking balance, depositing, and withdrawing funds.

## Features

- User authentication using Customer Number and PIN
- Account type selection (Current and Savings)
- Check account balance
- Deposit and withdraw money with validation
- Input error handling
- Menu-driven system
- Use of `HashMap` for storing credentials
- Console-based user interface

## Technologies Used

- Java (JDK 8+)
- Object-Oriented Programming (OOP)
- Collections (HashMap)
- Exception Handling (`InputMismatchException`)
- Decimal formatting using `DecimalFormat`
- Scanner for input handling

## Class Structure

### Account
- Handles balance operations and account data
- Contains methods for deposit, withdrawal, and balance checks

### OptionMenu
- Inherits from `Account`
- Handles login validation and user interface/menu interaction
- Uses `HashMap` to store user credentials

### ATM (Main Class)
- Entry point for the program
- Loops login attempts and starts the menu

## How to Run

1. Clone the repository: https://github.com/Guruvesh3/ATM-Simulator
3. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse)
4. Compile and run the `ATM.java` file

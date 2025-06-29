# ATM-Simulator
Console-based ATM simulator in Java using OOP, inheritance, file handling, and input validation.

# Java ATM Simulator

This is a console-based ATM simulation project built in Java. The project allows users to:
- Log in using a customer number and PIN
- Choose between Current and Savings accounts
- Check account balances
- Deposit or withdraw money with balance validation

---

## Features

- Object-Oriented Design using inheritance
- Input validation and error handling
- HashMap used for user credential mapping
- Account types: Current & Savings
- Deposit and Withdraw functionality with limits
- Loop-based menu system
- Format output using DecimalFormat

---

## Class Structure

- `Account`: Manages balance, deposit, withdrawal, and user info
- `OptionMenu`: Handles login, user interaction, and account options
- `ATM (Main class)`: Starts the application and loops login attempts


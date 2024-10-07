# Personal Account Manager

## Description

The Personal Account Manager is a Java application designed to manage personal bank accounts. It allows users to perform transactions, including deposits and withdrawals, while keeping track of their transaction history.

## Features

- Create a personal account with a unique account number and account holder name.
- Perform deposit and withdrawal transactions.
- View transaction history.
- Retrieve account balance and account holder information.

## Classes

### TransactionType (enum)

Defines the type of transactions that can be performed:
- `DEPOSIT`: Represents a deposit transaction.
- `WITHDRAWAL`: Represents a withdrawal transaction.

### Amount

Represents a transaction amount with the following attributes:
- `amount`: The transaction amount (double).
- `transactionType`: The type of transaction (TransactionType).

### PersonalAccount

Represents a personal bank account with the following attributes:
- `accountNumber`: Unique identifier for the account (int).
- `accountHolder`: Name of the account holder (String).
- `balance`: Current balance in the account (double).
- `transactions`: An array of Amount objects to store transaction history.

#### Methods:
- `PersonalAccount(int accountNumber, String accountHolder)`: Initializes a new account.
- `void deposit(double amount)`: Deposits money into the account.
- `void withdraw(double amount)`: Withdraws money from the account.
- `void printTransactionHistory()`: Displays transaction history.
- `double getBalance()`: Retrieves the current account balance.
- `int getAccountNumber()`: Retrieves the account number.
- `String getAccountHolder()`: Retrieves the account holder's name.

## Installation

1. Clone the repository:
   ```bash
   git clone git@github.com:bektenovich/personalaccountmanag.git

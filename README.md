# Bank System

## Overview

This is a Spring Boot-based Bank System project designed to manage bank operations. The application allows users to perform typical banking tasks such as creating accounts, processing transactions, and managing customer information. The backend is built using Java, Spring Boot, JPA, and MySQL for data storage.

## Prerequisites

- Java Development Kit (JDK) 11 or later
- Apache Maven 3.6.0 or later
- MySQL Database

## Features

- Account creation and management
- Customer management
- Transaction processing
- Data persistence using JPA and MySQL

## Getting Started

### Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/yourusername/Bank-System.git
   cd Bank-System
   
2. **Set up Java and Maven:

Ensure you have the Java Development Kit (JDK) installed and the JAVA_HOME environment variable set. Also, install Maven and set the MAVEN_HOME environment variable.

3. **Configure MySQL:

Create a MySQL database for the project.

Update the src/main/resources/application.properties file with your MySQL database connection details

### How the Application Works
### Account Management
Create Account: Users can create new bank accounts by providing necessary details like account type, initial deposit, and customer information.
View Accounts: Users can view a list of all accounts, along with details such as account balance and transaction history.
Delete Account: Users can delete an account if it meets the criteria for deletion.

### Customer Management
Add Customer: Users can add new customers by providing their personal details.
View Customers: Users can view a list of all customers along with their account details.
Update Customer: Users can update existing customer information.

### Transaction Processing
Deposit Money: Users can deposit money into an account by specifying the account ID and amount.
Withdraw Money: Users can withdraw money from an account by specifying the account ID and amount, provided the account has sufficient balance.
Transfer Money: Users can transfer money between accounts by specifying the source account ID, destination account ID, and the amount.

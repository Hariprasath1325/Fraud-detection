# 📌 Digital Banking Fraud Detection & Simulation Engine

## 🚀 Project Overview

The **Digital Banking Fraud Detection & Simulation Engine** is a Java-based backend system that simulates digital banking transactions, detects potential fraud using rule-based logic, calculates risk scores, and stores transaction data securely in a MySQL database.

This project demonstrates real-world banking transaction processing, fraud detection logic, and secure database integration using environment variables.

---

## 🎯 Features

- 🔄 Automatic Transaction Generation (Simulation Engine)
- 🧮 Risk Score Calculation
- 🚨 Rule-Based Fraud Detection
- 💾 MySQL Database Integration using JDBC
- 🔐 Secure Credential Handling using Environment Variables
- 🗂 Clean Modular Architecture (DAO Pattern)
- 🛠 Git Version Control Setup

---

## 🏗 Project Architecture

Main  
   ↓  
TransactionGenerator  
   ↓  
Transaction (Model)  
   ↓  
TransactionDAO  
   ↓  
MySQL Database  

---

## 📂 Project Structure

```
src/
└── com/
    └── fraud/
        └── simulation/
            ├── Main.java
            ├── Transaction.java
            ├── TransactionGenerator.java
            ├── TransactionDAO.java
            └── DatabaseConnection.java

.gitignore
```

---

## ⚙️ Technologies Used

- Java (Core Java)
- MySQL
- JDBC
- Git & GitHub
- IntelliJ IDEA

---

## 🧠 Fraud Detection Logic

Risk score is calculated using predefined business rules:

| Condition | Risk Points |
|------------|------------|
| Amount > 50,000 | +50 |
| Foreign Location | +40 |
| ATM Device | +10 |

If **Risk Score ≥ 70**, the transaction is marked as:

Fraud = true

---

## 🗄 Database Setup

### 1️⃣ Create Database

CREATE DATABASE fraud_db;
USE fraud_db;

2️⃣ Create Table
CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    transaction_id VARCHAR(50),
    sender_account VARCHAR(20),
    receiver_account VARCHAR(20),
    amount DOUBLE,
    transaction_type VARCHAR(20),
    location VARCHAR(50),
    device VARCHAR(20),
    risk_score INT,
    fraud BOOLEAN,
    timestamp DATETIME
);

---

🔐 Environment Variables Setup

Before running the project, configure:

DB_USER=root
DB_PASSWORD=your_password

The application securely reads credentials using:

System.getenv("DB_USER");
System.getenv("DB_PASSWORD");

---

▶️ How to Run

Clone the repository

Configure MySQL database

Set environment variables

Run Main.java

Verify stored transactions:

SELECT * FROM transactions;

---

## 📊 Sample Output

```
===== DIGITAL BANK FRAUD SIMULATION ENGINE =====

Transaction #1
----------------------------------------
Type           : DEPOSIT
Sender         : ACC25263279
Receiver       : ACC18757318
Amount         : 34057.0
Location       : Chennai
Device         : Laptop
Risk Score     : 0
Fraud          : false
Time           : 2026-02-13T14:09:00.322853
----------------------------------------
```
---

🏆 Learning Outcomes

Implemented modular Java architecture

Applied structured exception handling

Designed rule-based fraud detection engine

Integrated JDBC with MySQL database

Practiced secure credential management

---

🔮 Future Enhancements

REST API using Spring Boot

Real-time dashboard integration

Machine Learning fraud detection plug-in

Kafka-based transaction streaming

OTP & Authentication module

Daily transaction limit monitoring

# Smart NGO Donation Tracker

## 📌 Project Overview

Smart NGO Donation Tracker is a Java-based donation management system developed for NayePankh Foundation. The project helps NGOs efficiently manage donor information and donation records.

The system allows users to add, view, search, and delete donor details while maintaining donation data. It supports both ArrayList-based storage and MySQL database storage using JDBC.

This project was developed to demonstrate Java programming, Object-Oriented Programming (OOP), JDBC connectivity, and database management concepts in a real-world NGO use case.

---

## 🎯 Project Objective

The objective of this project is to help NGOs:

- Manage donor records efficiently
- Store donation details securely
- Track donation categories
- Search donor information quickly
- Maintain organized donation records

---

## 🚀 Features

### Donor Management
- Add Donor
- View Donor Details
- Search Donor by Name
- Delete Donor Records

### Donation Tracking
- Store Donation Amount
- Store Donation Category
- Calculate Total Donations

### Storage Options
- ArrayList-based Storage
- MySQL Database Storage using JDBC

### Database Operations
- Insert Donor Records
- View Donor Records
- Delete Donor Records
- Update Donor Records

---

## 🛠 Technologies Used

- Java
- JDBC
- MySQL
- Object-Oriented Programming (OOP)
- ArrayList Collection Framework

---

## 📂 Project Structure

```text
Smart_NGO_DonationTracker_JDBC
│
├── Donor.java
├── DonationSystem.java
├── DonarDAO.java
├── DBConnection.java
└── MySQL Database
```

## 🗄 Database

Database Name:

```sql
ngo_tracker
```

Table:

```sql
donor
```

Fields:

| Field | Type |
|---------|---------|
| id | INT |
| name | VARCHAR |
| amount | DOUBLE |
| category | VARCHAR |

---

## ▶ How to Run

1. Create MySQL database `ngo_tracker`
2. Create donor table
3. Configure database credentials in `DBConnection.java`
4. Run `DonationSystem.java`
5. Use menu options to manage donor records

---

## 🔮 Future Enhancements

- Java Swing GUI
- Donation Reports
- PDF Report Generation
- Online Donation Portal
- Volunteer Management System
- Admin Dashboard
- Authentication & Login System

---

## 📸 Project Demonstration

Screenshots and demo video are included in the submission files.

---

## 👩‍💻 Developed By

**Roushni**

Java Development Internship Assignment

NayePankh Foundation

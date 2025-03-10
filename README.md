# Wholesale Business Management System

## 📌 Overview
The **Wholesale Business Management System** is a Java-based application designed to streamline wholesale operations, including **user management, product categorization, customer management, order processing, and invoice generation**. Built using **Java (NetBeans IDE) and MySQL**, it ensures efficient business management with role-based access control.

## 🚀 Features
- **User Authentication & Role Management**
  - SuperAdmin & Regular Users
  - SuperAdmin can manage users (Activate, Deactivate, Update Details)
- **Category Management**
  - Add, Update, and Manage Product Categories
- **Product Management**
  - Add, Update, Delete Products
  - Categorize Products for Easy Management
- **Customer Management**
  - Store and Manage Customer Information
- **Order Processing**
  - Select Products & Generate Bills (PDF)
  - Maintain Customer Order History
- **Order History & Invoice Viewing**
  - View Previous Orders with Invoice Details
- **Secure User Logout System**

## 🛠️ Tech Stack
- **Frontend:** Java Swing (NetBeans GUI Builder)
- **Backend:** Java (JDBC)
- **Database:** MySQL
- **IDE:** Apache NetBeans

## 📂 Database Schema
The system consists of the following tables:
- **AppUser:** Stores user details & access roles.
- **Category:** Maintains product categories.
- **Product:** Stores product details (linked to Category).
- **Customer:** Stores customer information.
- **OrderDetail:** Manages customer orders & invoice details.

## 🏗️ System Architecture
The system follows a **3-layered architecture**:
1. **Presentation Layer:** Java Swing UI
2. **Business Logic Layer:** Java Classes for Business Operations
3. **Database Layer:** MySQL for Data Storage

## 🔧 Installation & Setup
### 1️⃣ Prerequisites
- Java Development Kit (**JDK 8+**)
- Apache NetBeans IDE
- MySQL Server

### 2️⃣ Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/HackSpire/wholesale-business-management.git
   ```
2. Import the project into **NetBeans IDE**.
3. Set up the MySQL database and create tables (SQL scripts included in the repo).
4. Update **database connection settings** in `ConnectionProvider.java`.
5. Run the project from NetBeans.

## 📜 Usage
1. **Login Page:** Enter credentials to log in.
2. **Dashboard:** Access various management features.
3. **Manage Users, Products, and Customers:** Based on role permissions.
4. **Place Orders:** Generate invoices and view order history.
5. **Logout:** Securely exit the system.

## 📌 Future Enhancements
- Inventory Management
- Role-Based Access Control Expansion
- Real-Time Sales Analytics & Reporting
- Cloud Database Integration

## 🤝 Contributing
Contributions are welcome! Feel free to **fork** this repository and submit **pull requests**.

## 📄 License
This project is licensed under the **MIT License** – see the [LICENSE](LICENSE) file for details.

## 📞 Contact
For any inquiries or suggestions, contact:
📧 Email: hackspire.dev@gmail.com
🌐 GitHub: [HackSpire](https://github.com/HackSpire)

---
**⭐ Don't forget to star this repository if you find it useful! ⭐**

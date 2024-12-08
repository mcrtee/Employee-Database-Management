# Employee Database Management System

## Description

The Employee Database Management System is a Java-based application that interacts with a relational database (MySQL or PostgreSQL) to manage employee data. It implements CRUD (Create, Read, Update, Delete) operations for an employee table using JDBC. The application consists of two main classes:
- **Employee**: Represents the employee entity with fields like `id`, `name`, `position`, `salary`, and `hireDate`.
- **EmployeeData**: Handles all the database operations such as inserting, updating, retrieving, and deleting employee records.

This system can be used for managing employee information in a corporate environment. It allows you to add new employees, view employee details, update existing records, and delete employees from the database.

## Technologies Used

- Java 8 (or later)
- JDBC (Java Database Connectivity)
- MySQL or PostgreSQL
- Maven (for dependency management)

## Database Setup

1. **Database**: You can choose to use either MySQL or PostgreSQL.
2. **Table Structure**: The system operates on an `employee` table with the following schema:
    ```sql
    CREATE TABLE employee (
        id SERIAL PRIMARY KEY,
        name VARCHAR(100),
        position VARCHAR(100),
        salary DOUBLE PRECISION,
        hire_date DATE
    );
    ```
    - `id`: Employee's unique ID (auto-incremented).
    - `name`: Employee's name.
    - `position`: Employee's job position.
    - `salary`: Employee's salary.
    - `hire_date`: The date when the employee was hired.

3. **Database Configuration**: Ensure the database server is running locally and that the correct credentials are used in the `EmployeeData` class for establishing the connection.

## How to Run the Program

### Step 1: Set up the Database
- Set up a MySQL or PostgreSQL database with the name `employee_db`.
- Create the `employee` table using the provided SQL schema.

### Step 2: Add JDBC Driver to the Project
- For **MySQL**, include the MySQL JDBC driver in your `pom.xml`:
    ```xml
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.33</version>
    </dependency>
    ```
- For **PostgreSQL**, include the PostgreSQL JDBC driver in your `pom.xml`:
    ```xml
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.5.1</version>
    </dependency>
    ```

### Step 3: Configure Database Connection in the Code
- Ensure the `EmployeeData` class contains the correct database connection string and credentials:
    - For **MySQL**:
      ```java
      String url = "jdbc:mysql://localhost:3306/employee_db";
      ```
    - For **PostgreSQL**:
      ```java
      String url = "jdbc:postgresql://localhost:2006/employee_db";
      ```

### Step 4: Run the Application
1. Clone or download the repository.
2. Open the project in an IDE (e.g., IntelliJ IDEA).
3. Run the `Main.java` class to test the CRUD operations.

### Step 5: Perform CRUD Operations
- **Create Employee**: Create a new employee record and insert it into the database.
- **Read Employee**: Retrieve employee details by their ID.
- **Update Employee**: Update the details of an existing employee.
- **Delete Employee**: Delete an employee from the database by their ID.

## Screenshots of the Database

Below are screenshots of the database at each step:

1. **Before Running the Application (Initial Database State)**:
 ![Снимок экрана 2024-12-09 021852](https://github.com/user-attachments/assets/388840dc-ed1b-4fca-b9ca-95ba1301e7d1)

2. **After Adding an Employee (Create Operation)**:
![Снимок экрана 2024-12-09 022022](https://github.com/user-attachments/assets/bfc18197-0f3f-4bf8-abd2-fc87d928653d)

4. **After Updating an Employee (Update Operation)**:
![Снимок экрана 2024-12-09 022636](https://github.com/user-attachments/assets/ac64a128-f263-4e6c-979c-2c738765801a)

5. **After Deleting an Employee (Delete Operation)**:
6. ![Снимок экрана 2024-12-09 022726](https://github.com/user-attachments/assets/a1146a5f-0199-4456-917b-e3587092edf5)

 
## Conclusion

This system provides a simple yet effective way to manage employee records in a database. It demonstrates how to connect a Java application to a relational database and perform basic CRUD operations using JDBC. You can extend the functionality by adding features like input validation, sorting, and more complex queries.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

# Paylinker
This electronic payment using Java Swing and MySQL. This system enables users to make payments both online and in person. Users can start transactions within the application and then finalize payments in person. Its primary objective is to reduce waiting times at the cashier department.

## Setup
```
Netbeans
```

```
JDK version 18 above
```

```
mysql-connector-j-8.1.0.jar
```

## Step 1: Create the Paylinker Database

1. Open the "database creator" folder in this repository.

2. Inside the folder, you will find a file named `paylinkerdb.sql`. Import this file into your XAMPP PHPMyAdmin. This will automatically create the Paylinker database.

3. Within the Paylinker database, you will find a table named `admin_account`. This table contains the accounts of cashiers. By default, there is one account with the following credentials:
   - Email: Admin@gmail.com
   - Password: Admin

4. If you want to add more cashier accounts, you will need to manually input them into the database. Ensure that all cashier email addresses have the format `your_email@gmail.com`.

## Step 2: Create a Connection Between NetBeans and XAMPP

1. Follow this [tutorial](https://www.youtube.com/watch?v=HySWyiIfU1M&ab_channel=CodeJava) to set up a connection between NetBeans and XAMPP. This tutorial will guide you through the process of configuring the database connection.

2. You can find the database configuration in the file `src\database\DatabaseConfig.java`.

3. If you encounter the error `java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost/paylinker`, refer to this [tutorial](https://youtu.be/d3-GLv6G7c8?si=Nzmv3o9bu0MVZknb) for troubleshooting. This error may occur due to connection issues or driver problems.

4. Make sure to periodically check the service database in NetBeans, as connections can sometimes be disconnected. Additionally, ensure that XAMPP's Apache and MySQL services are running.

Now, you have successfully created the Paylinker database and set up the connection between NetBeans and XAMPP. You can proceed with your project development using this configured environment. If you encounter any issues or have questions, feel free to refer to the provided tutorials.

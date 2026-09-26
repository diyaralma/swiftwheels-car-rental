<p align="center">
  <img src="images/yatay.png" alt="SwiftWheels" width="420">
</p>

# SwiftWheels: Vehicle Rental System

![Java](https://img.shields.io/badge/Java-Swing-ED8B00?logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-JDBC-4169E1?logo=postgresql&logoColor=white)

A desktop vehicle rental application built with **Java Swing** on top of a **PostgreSQL** database.

Most of the business logic lives in the database itself: stored procedures, functions and triggers handle renting, returning, stock tracking and audit logging. The Java client stays a thin UI layer.

---

## Features

**Customers**
- Register and log in, then view, edit or delete their account.
- Browse cars, SUVs/jeeps and motorcycles with detailed specs.
- Rent a vehicle with delivery address, rental period and payment details.
- View their active rentals and return a vehicle.

**Administrators**
- Add, edit and delete vehicles of every type, including vehicle images.
- Dashboard with vehicle types, users, rented vehicles, total turnover and stock.
- View all active rentals across users.

## Database design

The vehicle hierarchy is modelled in both layers. In Java it is an abstract `Vehicle` class with `Car`, `Jeep` and `Motorcycle` subclasses. In the database it is a base `vehicles` table plus one detail table per type.

| Object | Purpose |
|---|---|
| **Tables** | `vehicles`, `car_details`, `jeep_details`, `motor_details`, `kullanici` (users), `rented_vehicles`, `user_logs` |
| **Stored procedures** | `vehicle_rent`, `return_vehicle`, `add_update_vehicle`, `delete_vehicle`, `account_iu`, `account_delete` |
| **Functions** | `get_vehicles`, `get_vehicle_details_by_type`, `get_rented_vehicles_by_user`, `get_all_rented_vehicles`, `account_read` |
| **Triggers** | Stock goes down on rent and back up on return; deleting a detail row cascades to its base vehicle; new user registrations are written to `user_logs` |

The full schema, including tables, procedures, functions and triggers, is in [`SQL_Commands.txt`](SQL_Commands.txt).

## Tech stack

- **Java** with **Swing** (UI forms built with the IntelliJ IDEA GUI Designer)
- **PostgreSQL** with the **JDBC** driver (`postgresql-42.7.4`)
- **PL/pgSQL** for procedures, functions and triggers

## Getting started

1. **Create the database.** Create a PostgreSQL database and run the statements in [`SQL_Commands.txt`](SQL_Commands.txt) in pgAdmin or `psql`. The file is divided into sections: tables, functions, procedures and triggers. Run the sections in that order.
2. **Configure the connection.** Set `URL`, `USER` and `PASSWORD` to your own database in the source files that open a connection:
   - [`innerAppPanel.java`](src/innerAppPanel.java)
   - [`Car.java`](src/Car.java)
   - [`Jeep.java`](src/Jeep.java)
   - [`Motorcycle.java`](src/Motorcycle.java)
   - [`Customer.java`](src/Customer.java)

   The committed values are placeholders.
3. **Run.** Open the project in IntelliJ IDEA, add the [PostgreSQL JDBC driver](https://jdbc.postgresql.org/download/) (42.7.x) as a library, and run [`Main.java`](src/Main.java).

## Project structure

```
├── src/
│   ├── Main.java                  # Entry point
│   ├── LoginRegisterPanel.java    # Login and registration screen
│   ├── innerAppPanel.java         # Main application: browsing, renting, account, admin panel
│   ├── Vehicle.java               # Abstract base class
│   ├── Car.java / Jeep.java / Motorcycle.java
│   └── Customer.java
├── images/                        # UI assets and default vehicle images
└── SQL_Commands.txt               # Database schema, procedures, functions, triggers
```

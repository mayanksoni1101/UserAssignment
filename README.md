User Management System (Hibernate ORM)A Java application utilizing Hibernate ORM and HQL (Hibernate Query Language) to manage user records in a relational database. This application covers core database persistence operations including record insertion, updates, deletions, interactive lookups, projection queries, and authentication helpers.📌 FeaturesUser Ingestion & Management:Batch insertion of sample user records with properties including Name, Email, Phone Number, and Password.Update existing user records using saveOrUpdate.Delete users by Unique ID with transactional safety.Targeted Lookups & Search:Retrieve user details by ID, Email, Phone Number, or Name.Handled via parameterized HQL queries to prevent SQL injection and errors.Projections & Bulk Data Fetching:Fetch complete records of all registered users.Project and list specific fields across all entities (e.g., list all user emails or phone numbers).🛠️ Tech Stack & PrerequisitesLanguage: Java (JDK 8 or higher)ORM Framework: Hibernate ORM 5.x / 6.xQuery Language: HQL (Hibernate Query Language) & JPA Persistence APIDatabase: Any SQL-compliant RDBMS (MySQL, PostgreSQL, Oracle, etc.)📂 Project Structuresrc/
└── org/jsp/users/
    ├── User.java                       # Entity / POJO Model Class
    ├── addUser.java                    # Populates batch user records
    ├── UpdateUser.java                 # Modifies user details by ID
    ├── DeleteUserById.java             # Removes user record by ID
    ├── FetchAllUsers.java              # Retrieves all user records
    ├── FetchEmailOfAllUsers.java       # Projects list of all user emails
    ├── FetchPhoneOfAllUsers.java       # Projects list of all user phone numbers
    ├── FindUserByEmail.java            # HQL lookup by Email
    ├── FindUserById.java               # Session getter lookup by Primary Key
    ├── FindUserByName.java             # HQL lookup by Name
    └── FindUserByPhone.java            # HQL lookup by Phone Number
⚙️ Configuration SetupEnsure you have a valid hibernate.cfg.xml located in your source directory (src/ or src/main/resources).Example hibernate.cfg.xml:<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
    "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <!-- Database Connection Settings -->
        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost:3306/your_database_name</property>
        <property name="connection.username">your_username</property>
        <property name="connection.password">your_password</property>

        <!-- JDBC Dialect -->
        <property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>

        <!-- Hibernate Behavior Properties -->
        <property name="show_sql">true</property>
        <property name="hbm2ddl.auto">update</property>

        <!-- Entity Mapping -->
        <mapping class="org.jsp.users.User"/>
    </session-factory>
</hibernate-configuration>
🚀 How to RunClone or download the repository into your local environment.Start your SQL database server (e.g., MySQL) and update hibernate.cfg.xml with your database credentials.Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, VS Code).Run any standalone class containing a main method:addUser.java – Seed the database with initial sample user data.FetchAllUsers.java – Retrieve and display all saved users.FindUserByEmail.java or FindUserByPhone.java – Interactively query users from the terminal.📋 Entity Class Schema (User)FieldTypeDescriptionidintPrimary Key (Auto-generated/Assigned)nameStringFull NamephonelongContact Phone NumberemailStringEmail AddresspasswordStringAccount Password

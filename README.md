
# Product Management - Spring Boot

![Java](https://img.shields.io/badge/Java-17-brightgreen.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0.0-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-3.8.1-brightgreen.svg)

## Description
A Spring Boot application designed to manage products. This project offers RESTful APIs to create, read, update, and delete products. It demonstrates fundamental Spring Boot functionalities including entity mapping, service layers, and integration with a database.

## Features
- Create, update, delete, and retrieve products
- RESTful API for managing product data
- Integration with a database for persistence

## Technologies Used
- **Java**: Version 17
- **Spring Boot**: Version 3.0.0
- **Maven**: Project build and dependency management
- **Hibernate/JPA**: For data persistence and ORM
- **PostgreSQL**: Database used for managing product records

## Project Structure
```bash
Product-Management-Springboot
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───productmanagement
│   │   │           ├───controller  # REST controllers
│   │   │           ├───model       # Entities representing the database tables
│   │   │           ├───repository  # JPA repositories for data access
│   │   │           └───service     # Business logic
│   └───resources
│       └───application.properties  # Configuration files
├───test
└───pom.xml  # Maven configuration
```

## Database Configuration
- **Database**: PostgreSQL
- **Default port**: `5432`
- Configure the connection settings in `application.properties`:
  ```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/productdb
  spring.datasource.username=your-username
  spring.datasource.password=your-password
  ```

## API Endpoints

### Product Management
- `GET /api/products`: Retrieve all products
- `GET /api/products/{id}`: Retrieve a product by ID
- `POST /api/products`: Add a new product
- `PUT /api/products/{id}`: Update an existing product
- `DELETE /api/products/{id}`: Delete a product by ID

## Prerequisites
- Java 17
- Maven
- PostgreSQL

## Getting Started

### Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/xreedev/Product-Management-Springboot.git
   cd Product-Management-Springboot
   ```
2. Configure the database in `application.properties`.
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Testing
Use Postman or any API client to test the REST endpoints.

---
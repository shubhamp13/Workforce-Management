 
 
# Workforce Management Software

🚀 **Overview**  
Workforce Management Software is a comprehensive application built using Spring Boot, designed to streamline the management of employees, departments, and bank accounts. This system facilitates seamless CRUD operations, allowing users to efficiently create, update, retrieve, and delete records.

📦 **Features**
- **Employee Management**: 
  - Manage employee records with functionalities to add, update, find, and delete employees.
  
- **Department Management**: 
  - Organize and manage different departments within the organization.
  
- **Bank Account Management**: 
  - Handle bank account information for employees efficiently.
  
- **DTOs and Mappers**: 
  - Use Data Transfer Objects (DTOs) and mappers for clean data handling and transformation.

🛠️ **Technologies Used**
- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **RESTful APIs**
- **Maven**

📂 **Structure**
The project structure is organized into several key components:

- **Controllers**: Handle incoming requests and define the endpoints.
- **DTOs**: Data Transfer Objects for transferring data between layers.
- **Entities**: JPA entities that represent the data model.
- **Mappers**: Classes that map between entities and DTOs.
- **Repositories**: Interfaces for data access operations.


🗺️ **Key REST Endpoints**

### Employee Management
| Method | Endpoint                          | Description                         |
|--------|-----------------------------------|-------------------------------------|
| POST   | `/employees`                      | Save an employee                   |
| GET    | `/employees`                      | Get all employees                  |
| GET    | `/employees/id/{emp-id}`         | Find employee by ID                |
| GET    | `/employees/name/{emp-name}`     | Find employee by name              |
| DELETE | `/employees/{emp-id}`            | Delete employee by ID              |
| PUT    | `/employees/update`               | Update an employee                 |
| POST   | `/employees-list`                | Save a list of employees           |

### Department Management
| Method | Endpoint                          | Description                         |
|--------|-----------------------------------|-------------------------------------|
| POST   | `/departments`                    | Add a department                    |
| GET    | `/departments`                    | Get all departments                 |

### Bank Account Management
| Method | Endpoint                          | Description                         |
|--------|-----------------------------------|-------------------------------------|
| POST   | `/accounts`                       | Save a bank account                 |
| GET    | `/accounts`                       | Get all bank accounts               |
| POST   | `/accounts-list`                 | Save a list of bank accounts        |


⚙️ **Getting Started**  
**Prerequisites**  
- Java 17 or higher  
- Maven  
- An IDE (e.g., IntelliJ IDEA, Eclipse)  
- A database (H2, MySQL, etc.)  

**Installation**  
1. Clone the repository:
 
   git clone https://github.com/shubhamp13/Workforce-Management.git
   
2. Navigate to the project directory:
   
   cd workforce-management-software
    
3. Build the project using Maven:
 
   mvn clean install
   
4. Run the application:
 
   mvn spring-boot:run
  

**Accessing the API**  
Once the application is running, you can access the REST API endpoints at [http://localhost:8080](http://localhost:8080).

📄 **License**  
This project is licensed under the MIT License - see the LICENSE file for details.

🤝 **Contributing**  
Contributions are welcome! Please feel free to submit a pull request or raise an issue.

📫 **Contact**  
For any inquiries or feedback, please reach out at:  
📞 **Phone:** 8793569631  
✉️ **Email:** shubhampuri8297@gmail.com  
🔗 **GitHub:** [github.com/shubhamp13](https://github.com/shubhamp13)  
🔗 **LinkedIn:** [linkedin.com/in/shubham-puri-361175242](https://linkedin.com/in/shubham-puri-361175242)  
 
 

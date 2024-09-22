
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

### Exception Handling

In this application, we handle exceptions using a global exception handler. For example, when validation fails during request processing, we catch those exceptions using `@ExceptionHandler`.

#### Example Code for Exception Handling
```java
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.validation.FieldError;

import java.util.HashMap;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentException(MethodArgumentNotValidException exception) {
        var errors = new HashMap<String, String>();
        exception.getBindingResult().getAllErrors()
                .forEach(error -> {
                    var fieldName = ((FieldError) error).getField();
                    var errorName = error.getDefaultMessage();
                    errors.put(fieldName, errorName);
                });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

   
}
```

### Spring Boot Validations

To ensure that the input data meets specific criteria, we can use validation annotations provided by Spring. Below is the `EmployeeDto` with its validation annotations:

#### Example DTO with Validations
```java
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public record EmployeeDto(
    @NotEmpty(message = "Employee name is mandatory") String employeeName,
    @Email(message = "Email should be valid") String employeeEmail,
    @Digits(integer = 10, fraction = 0, message = "Phone number must be a valid 10-digit number") String employeePhone
) {}
```

### Validation Points

1. **DTO Annotations**: Use `@NotEmpty`, `@Email`, `@Digits`, etc., in your DTO classes to enforce validation rules.
2. **Controller Integration**: Apply `@Valid` in your controller methods to validate incoming requests:
   ```java
   @PostMapping("/employees")
   public ResponseEntity<Employee> addEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
        
   }
   ```

### Exception Handling Table

| HTTP Status | Exception                   | Description                               |
|-------------|-----------------------------|-------------------------------------------|
| 400         | BadRequestException         | Returned when the request has invalid parameters. |
| 404         | ResourceNotFoundException   | Returned when a requested resource (e.g., employee or department) is not found. |
| 409         | ConflictException           | Returned when there is a conflict with the current state of the resource (e.g., duplicate entries). |
| 500         | InternalServerErrorException | Returned for unexpected server errors. |

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
```

 

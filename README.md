# Task Management API

This project is a simple task management REST API developed using Spring Boot.

## 🚀 Features
- CRUD operations for tasks (Create, Read, Update, Delete)
- H2 database integration
- API documentation with Swagger UI
- Global error handling
- JPA/Hibernate integration

## 🛠 Technologies
- Java 17
- Spring Boot 3.4.3
- Spring Data JPA
- H2 Database
- SpringDoc OpenAPI (Swagger UI)
- Maven


## 📋 API Endpoints

| Method | URL                    | Description              |
|--------|------------------------|--------------------------|
| GET    | /api/tasks             | List all tasks           |
| GET    | /api/tasks/{id}        | Get task by ID           |
| POST   | /api/tasks             | Create new task          |
| PUT    | /api/tasks/{id}        | Update task              |
| DELETE | /api/tasks/{id}        | Delete task              |


## 🏃‍♂️ Running the Project

1. Clone the project:
    ```bash
    git clone https://github.com/kayamuhammet/task-management-api.git
    ```

2. Navigate to the project directory:
    ```bash
    cd TaskManagement
    ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## 📚 API Documentation
To access Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

![Image](https://github.com/user-attachments/assets/2a8ad9fb-ee13-448e-ae15-51a4d3842fdd)


## 💾 Database
To access H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## 📝 Sample Task JSON
```json
{
    "title": "Task Example",
    "description": "This is an example task",
    "status": "TODO"
}
```

## 🔍 Task Status Values
* TODO
* IN_PROGRESS
* DONE

## 🛡️ Error Handling
The API returns appropriate error messages for the following scenarios:

* Resource not found (404 Not Found)
* Invalid request (400 Bad Request)
* Internal server error (500 Internal Server Error)

## 📦 Project Structure
<pre>
task-management-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── kayamuhammet/
│   │   │           └── TaskManagement/
│   │   │               └── config/ 
│   │   │               │   ├── SwaggerConfig.java
│   │   │               └── controller/
│   │   │               │   ├── TaskController.java
│   │   │               └── exception/
│   │   │               │   ├── ErrorDetails.java
│   │   │               │   ├── GlobalExceptionHandling.java
│   │   │               │   ├── ResourceNotFoundException.java
│   │   │               └── model/
│   │   │               │   ├── Task.java
│   │   │               └── repository/
│   │   │               │   ├── TaskRepository.java
│   │   │               └── service/
│   │   │               │   ├── TaskService.java
│   │   └── resources/
│   │       └── application.properties
└── pom.xml
</pre>

## ⚠️ Note
> This project is for educational purposes, and the H2 database credentials are publicly shared. In real-world projects, sensitive information such as database credentials should never be shared in public repositories.

## 👥 Contributing

1. Fork this repository
2. Create a new feature branch **(git checkout -b feature/amazing-feature)**
3. Commit your changes **(git commit -m 'feat: Add amazing feature')**
4. Push your branch **(git push origin feature/amazing-feature)**
5. Create a Pull Request

## 📄 License

This project is licensed under the MIT License. See the LICENSE file for more details.

## ✍️ Contact

Muhammet Kaya - kayamuhammet78@gmail.com

Project Link: https://github.com/kayamuhammet/TaskManagement

# Project Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

## 📚 Overview

The **Project Management System** is a robust web application designed to streamline project tracking, task management, and team collaboration. It empowers users to efficiently organize, assign, and monitor projects with real-time updates and a user-friendly interface.

## 🌟 Features

- **🗂️ Project Creation & Management**: Seamlessly create, update, and delete projects.
- **📋 Task Management**: Organize tasks by assigning team members, tracking statuses, and setting deadlines.
- **👥 User & Role Management**: Add team members, assign roles (e.g., Admin, Project Manager, Developer), and set permissions.
- **📅 Timeline Tracking**: View project timelines and track progress in a visual format.
- **📱 Responsive Design**: Built with **Bootstrap** for mobile-first responsive design.
- **⚡ Real-Time Feedback**: Enjoy dynamic interactions and instant updates via **JavaScript**.

## 🛠️ Tech Stack

### Backend:
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) **Java 8+**
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white) **Spring Boot** for application logic.
- **Spring Data JPA** for database interaction.
- **Maven** for dependency management.

### Frontend:
- ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white) **HTML5** for the structure.
- ![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white) **CSS3** for styling.
- ![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black) **JavaScript** for dynamic functionality.
- ![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white) **Bootstrap** for a responsive and sleek design.

### Database:
- ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white) **MySQL** for storing user data, projects, and tasks.

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:
- **Java 8+** 
- **Maven** 
- **MySQL** 

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/project-management-system.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd project-management-system
    ```

3. **Configure the database**:
    - Create a new database in MySQL.
    - Update the database configuration in `application.properties`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      spring.jpa.hibernate.ddl-auto=update
      ```

4. **Build and run the project**:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

5. **Access the application**: 
   Open your browser and go to `http://localhost:8080`.

## 📂 Project Structure

The project structure appears to be a standard Spring Boot project. Here's a breakdown of the main components:

```bash
ProjectManagementSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── nit/
│   │   │           ├── config/
│   │   │           │   └── ProjectConfig.java          # Configuration class for beans and properties
│   │   │           ├── controller/
│   │   │           │   └── ProjectController.java      # Handles HTTP requests related to projects
│   │   │           ├── entity/
│   │   │           │   ├── Employee.java               # Represents Employee entity
│   │   │           │   ├── Project.java                # Represents Project entity
│   │   │           │   └── Task.java                   # Represents Task entity
│   │   │           ├── repository/
│   │   │           │   └── ProjectRepository.java      # Data access interface for Projects
│   │   │           └── service/
│   │   │               └── ProjectService.java         # Business logic for managing projects
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/                                # CSS files
│   │       │   ├── js/                                 # JavaScript files
│   │       │   └── images/                             # Static image files
│   │       ├── templates/
│   │       │   └── *.html                              # HTML templates for views
│   │       └── application.properties                  # Configuration properties for the application
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── nit/
│   │               └── ProjectManagementTests.java      # Unit and integration tests
│   └── META-INF/
│       └── MANIFEST.MF                                 # Manifest for the project
├── target/
│   ├── classes/                                         # Compiled application classes
│   ├── test-classes/                                    # Compiled test classes
│   └── generated-sources/                               # Source files generated from annotations
├── HELP.md                                              # Documentation or project instructions
├── pom.xml                                              # Maven project file with dependencies
└── README.md                                            # Project overview and setup instructions

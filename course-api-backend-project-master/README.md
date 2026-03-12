<h1 align="center">Course API</h1>

<p align="center">
A simple and clean <b>Spring Boot REST API</b> for managing course topics.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-Backend-orange?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Spring%20Boot-Framework-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Maven-Build%20Tool-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/REST-API-red?style=for-the-badge" />
</p>

---

## About the Project

Course API is a RESTful web service built using **Spring Boot**.

It provides endpoints to manage course topics and demonstrates the fundamentals of backend development with Java.

This project is a **beginner-friendly CRUD REST API** designed to help understand how APIs work in a Spring Boot application.

---

## Features

- Create new course topics
- Retrieve all topics
- Retrieve a topic by ID
- Update existing topics
- Delete topics
- Simple and organized project structure

---

## Tech Stack

| Technology | Purpose |
|------------|--------|
| Java | Backend Language |
| Spring Boot | Web Framework |
| Maven | Build Tool |
| REST API | Communication |

---

## API Endpoints

| Method | Endpoint | Description |
|------|--------|-------------|
| GET | `/topics` | Get all topics |
| GET | `/topics/{id}` | Get topic by ID |
| POST | `/topics` | Create new topic |
| PUT | `/topics/{id}` | Update topic |
| DELETE | `/topics/{id}` | Delete topic |

---

## Example Request

### Create Topic

```json
POST /topics

{
  "id": "spring",
  "name": "Spring Framework",
  "description": "Spring Boot Basics"
}
```


## ⚙️ How to Run the Project

<div align="left">
  
  <h3>1️⃣ Clone the Repository</h3>
  <p>Copy and paste the following command into your terminal:</p>
  <pre><code>git clone https://github.com/VedantKashid/course-api-backend-project.git</code></pre>

  <h3>2️⃣ Navigate to the Project Directory</h3>
  <pre><code>cd course-api-backend-project</code></pre>

  <h3>3️⃣ Run the Application</h3>
  <p>Choose one of the following methods:</p>

  <table>
    <tr>
      <th>Method</th>
      <th>Action / Command</th>
    </tr>
    <tr>
      <td><b>IDE (IntelliJ/VS Code)</b></td>
      <td>Run the <code>CourseApiApplication.java</code> file.</td>
    </tr>
    <tr>
      <td><b>Maven Wrapper</b></td>
      <td><code>./mvnw spring-boot:run</code></td>
    </tr>
  </table>

  <p>Once started, the API will be live at: 
    <a href="http://localhost:8080"><b>http://localhost:8080</b></a>
  </p>
</div>

## 📁 Project Structure
<div align="left">
<pre>
course-api
├── src
│   ├── main
│   │   ├── java/com/company/course_api
│   │   │   ├── CourseApiApplication.java
│   │   │   ├── Topic.java
│   │   │   └── TopicController.java
│   │   └── resources
│   │       └── application.properties
├── .mvn
├── mvnw
├── mvnw.cmd
├── pom.xml
└── .gitignore
</pre>
</div>

## 🔮 Future Improvements
<ul>
<li>🚀 Add Service Layer</li>
<li>🗄️ Add Database Integration (JPA + MySQL/PostgreSQL)</li>
<li>⚠️ Add Global Exception Handling</li>
<li>🛡️ Add Validation</li>
<li>📄 Add Swagger / OpenAPI Documentation</li>
<li>🧪 Add Unit Tests</li>
</ul>

---

## 👨‍💻 Author

<div align="center">
  <h3><b>Vedant Kashid</b></h3>
  <p>
    <a href="https://github.com/VedantKashid">
      <img src="https://img.shields.io/badge/GitHub-Profile-181717?style=for-the-badge&logo=github" alt="GitHub Profile" />
    </a>
  </p>
  <p>GitHub: <a href="https://github.com/VedantKashid">github.com/VedantKashid</a></p>
</div>

# User Management API Automation Testing

This project demonstrates automated REST API testing using Java, Rest Assured, TestNG, and Maven.

## Tools Used
- Java 17
- Eclipse IDE
- Maven
- Rest Assured
- TestNG
- JSON Server (mock API)

## Endpoints Tested
- GET /users
- POST /users
- PUT /users/{id}
- DELETE /users/{id}

## How to Run
1. Start JSON Server → `json-server --watch db.json`
2. Open Eclipse → Run `testng.xml` as TestNG Suite.
3. View results in console or `target/surefire-reports`.

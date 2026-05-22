# Demoblaze API testing

This repository is a project for automated API tests using KARATE.

Quick overview:
- Contains example tests automated with Karate for the Signup and Login endpoints of `https://api.demoblaze.com/`.
- Project contains one feature for each endpoint, dependency are not allowed between features.

Run the tests
1. Open PowerShell at the project root
2. Run:

```powershell
.\mvn test
```

Notes
- `pom.xml` contains all the necessary dependencies for karate to run the tests.
- In the `karate-config.js`, the baseUrl could be updated, and also the test environment

Contributing
- If you add tests, try to keep features generic and use similar structure so others can reuse them easily.

Enjoy working with the project.
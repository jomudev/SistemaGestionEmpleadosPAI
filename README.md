# Employee Management System — MVC + DAO Persistence (Java + Maven)

![Java](https://img.shields.io/badge/Java-OOP_%26_File_I%2FO-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Architecture](https://img.shields.io/badge/Patterns-MVC_%2B_DAO-10B981?style=flat-square)
![Maven](https://img.shields.io/badge/Build-Apache_Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)

## Executive Summary

A **Java & Apache Maven** employee management system built using **Object-Oriented Inheritance/Composition**, **MVC architecture**, and the **Data Access Object (DAO)** pattern for persistent flat-file storage (`empleados.txt`).

---

## Architecture & Domain Model

- **OOP Inheritance & Composition (`Modelo/`):** `Empleado` extends `Persona` and composes `Direccion`, modeling real-world HR entities cleanly.
- **Persistence Layer (`Persistencia/ArchivoEmpleadoDAO.java`):** Abstracts file read/write serialization (`empleados.txt`) behind a dedicated DAO layer.
- **Controller Layer (`Controlador/EmpleadoController.java`):** Coordinates HR operations between domain models and file persistence.

---

## Project Structure

```text
SistemaGestionEmpleadosPAI/
├── empleados.txt
├── pom.xml
└── src/main/java/
    ├── Controlador/EmpleadoController.java
    ├── Modelo/{Persona.java, Direccion.java, Empleado.java}
    ├── Persistencia/ArchivoEmpleadoDAO.java
    └── com/mycompany/sistemagestionempleados/SistemaGestionEmpleados.java
```

---

## Getting Started

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.mycompany.sistemagestionempleados.SistemaGestionEmpleados"
```

---

## Author & Contact

**Héctor Joann Murillo Mejía** — Mobile & Full-Stack Software Engineer (React Native · TypeScript · Node.js)

- **Email:** [joannmurillo@icloud.com](mailto:joannmurillo@icloud.com)
- **LinkedIn:** [linkedin.com/in/hector-joann-murillo-mejia](https://www.linkedin.com/in/hector-joann-murillo-mejia/)
- **GitHub:** [github.com/jomudev](https://github.com/jomudev)
- **Portfolio:** [joannmurillo.com](https://www.joannmurillo.com)

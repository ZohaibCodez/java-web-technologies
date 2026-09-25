<!-- SEO Meta Tags
Description: Java Web Technologies coursework: Core Java, multithreading, TCP/IP sockets, JDBC, Servlets, JSP and MVC on Jakarta EE, with labs, assignments and a project.
Keywords: java web technologies, java servlets, jsp, jdbc, mvc, jakarta ee, java ee, multithreading, socket programming, tcp/ip chat application, university coursework
author: Muhammad Zohaib Khan
canonical: https://github.com/ZohaibCodez/java-web-technologies
-->

<!-- Open Graph / Facebook
og:type: website
og:url: https://github.com/ZohaibCodez/java-web-technologies
og:title: Java Web Technologies - Labs, Assignments and MVC Project
og:description: A semester-long record of Java web technologies coursework, from Core Java and JDBC to Servlets, JSP and MVC on Jakarta EE.
og:site_name: java-web-technologies
og:locale: en_US
-->

<!-- Twitter Card
twitter:card: summary_large_image
twitter:url: https://github.com/ZohaibCodez/java-web-technologies
twitter:title: Java Web Technologies - Labs, Assignments and MVC Project
twitter:description: A semester-long record of Java web technologies coursework, from Core Java and JDBC to Servlets, JSP and MVC on Jakarta EE.
-->

<!-- GitHub Metadata
topics: java, jakarta-ee, java-ee, servlets, jsp, jdbc, mvc, multithreading, socket-programming, tcp-ip, chat-application, html, css, javascript, maven, tomcat, web-development, coursework, university, learning-in-public
languages: Java, HTML, CSS, JavaScript
-->

<div align="center">

# 🌐 Java Web Technologies

### Labs, assignments and an MVC project: Core Java to Servlets, JSP and JDBC on Jakarta EE

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
![Status](https://img.shields.io/badge/status-in%20progress-yellow.svg)
![Java](https://img.shields.io/badge/java-JDK%2017%2B-007396?logo=openjdk&logoColor=white)
![Jakarta EE](https://img.shields.io/badge/jakarta%20ee-servlets%20%26%20jsp-F89820?logo=eclipseide&logoColor=white)
![Maven](https://img.shields.io/badge/build-maven-C71A36?logo=apachemaven&logoColor=white)
![Tomcat](https://img.shields.io/badge/server-tomcat%2010.1%2B-F8DC75?logo=apachetomcat&logoColor=black)

![GitHub Stars](https://img.shields.io/github/stars/ZohaibCodez/java-web-technologies?style=social)
![GitHub Forks](https://img.shields.io/github/forks/ZohaibCodez/java-web-technologies?style=social)
![Last Commit](https://img.shields.io/github/last-commit/ZohaibCodez/java-web-technologies)

[**Syllabus**](#-syllabus) • [**Progress**](#-progress) • [**Getting Started**](#-getting-started)

</div>

---

## 📋 Table of Contents

- [About](#-about)
- [Syllabus](#-syllabus)
- [Tech Stack](#-tech-stack)
- [Repository Structure](#-repository-structure)
- [Getting Started](#-getting-started)
- [Progress](#-progress)
- [Resources](#-resources)
- [License](#-license)
- [Contact](#-contact)

---

## 🎯 About

**Java Web Technologies** is my Semester 5 coursework repository. It records how to build a dynamic web application in Java: first the Core Java foundation (Java SE), then the web layer (Java EE, now called Jakarta EE) with Servlets, JSP and the MVC pattern.

Every lab, assignment and the final project lives here, so the repo doubles as a learning journal.

### What you will find here

- 🧱 **Core Java foundations**: OOP, abstract classes and interfaces, streams, multithreading and exception handling.
- 🔌 **Network programming**: a multi-threaded TCP/IP chat application.
- 🗄️ **JDBC**: connecting Java to different types of DBMS.
- 🌍 **Web components**: Servlets, JSP, sessions, cookies and URL rewriting.
- 🏗️ **MVC architecture**: designing an enterprise-level application with Model, View and Controller.

---

## 📚 Syllabus

The course is split into two halves.

### Part 1: Pre-Mid (Java SE / Core Java)

- **OOP syntax**: classes, objects, inheritance and polymorphism.
- **Abstract classes and interfaces**: abstract classes exist so every child class must follow the same rules, enforced through abstract methods.
- **Packages and streams**: a stream is a path or channel between your program and an endpoint or destination.
- **Multithreading**: threads share the address space of their parent process instead of occupying their own.
- **Exception handling**
- **Network programming (TCP/IP)**: building a multi-threaded chat application.
- **JDBC (Java Database Connectivity)**: connecting to different types of DBMS.

### Part 2: Post-Mid (Java EE / Jakarta EE)

- **HTML, CSS and JavaScript**
- **Servlets**: server-side code that runs to fulfil a client request.
  - Request handling and response
  - Database access
  - State management: URL rewriting, cookies and sessions
- **Java Server Pages (JSP)**: combining HTML and Java.
- **MVC (Model, View, Controller)**: separating the presentation layer to design an enterprise-level application.

---

## 🛠️ Tech Stack

| Category | Technologies |
|----------|--------------|
| **Language** | Java (JDK 17 or later recommended) |
| **Web layer** | Servlets, JSP, HTML, CSS, JavaScript |
| **Data** | JDBC with a relational DBMS |
| **Build tool** | Maven (for JDBC, Servlet, JSP and project work) |
| **Server** | Apache Tomcat 10.1 or later |
| **Editor** | IntelliJ IDEA, Eclipse or VS Code |

> **Note on `javax` vs `jakarta`:** Tomcat 10 and later use the `jakarta.servlet.*` package names. Older material and Tomcat 9 use `javax.servlet.*`. Match the package names to the Tomcat version your lab machines run.

---

## 🗂️ Repository Structure

This is the planned layout. Folders are added as each lab, assignment or project is completed.

```
java-web-technologies/
├── 📁 docs/                  # syllabus, notes and resources
├── 📁 labs/
│   ├── 📁 lab-01-<topic>/
│   ├── 📁 lab-02-<topic>/
│   └── ...
├── 📁 assignments/
│   └── 📁 assignment-01-<topic>/
├── 📁 project/               # final MVC application
├── 📄 LICENSE
└── 📄 README.md              # you are here
```

Each lab and assignment folder has its own `README.md` with the task statement, my approach, how to run it and what I learned.

---

## 🚀 Getting Started

### Prerequisites

- ✅ JDK 17 or later
- ✅ Apache Maven 3.9 or later (for the web labs and the project)
- ✅ Apache Tomcat 10.1 or later (from the Servlet labs onward)
- ✅ A relational DBMS for the JDBC labs

### Clone the repository

```bash
git clone https://github.com/ZohaibCodez/java-web-technologies.git
cd java-web-technologies
```

### Run a lab

Each lab documents its own run steps in its `README.md`. Core Java labs can be compiled and run directly with the JDK. Web labs are Maven projects that build a WAR file to deploy on Tomcat.

---

## 🗺️ Progress

| Part | Topic | Status |
|------|-------|--------|
| 1 | OOP, abstract classes and interfaces | 📅 Planned |
| 1 | Packages and streams | 📅 Planned |
| 1 | Multithreading | 📅 Planned |
| 1 | Exception handling | 📅 Planned |
| 1 | TCP/IP multi-threaded chat application | 📅 Planned |
| 1 | JDBC | 📅 Planned |
| 2 | HTML, CSS and JavaScript | 📅 Planned |
| 2 | Servlets: request, response, database | 📅 Planned |
| 2 | State management: URL rewriting, cookies, sessions | 📅 Planned |
| 2 | JSP | 📅 Planned |
| 2 | MVC enterprise application | 📅 Planned |

Status key: 📅 Planned • 🚧 In progress • ✅ Done

---

## 📖 Resources

- *Java: The Complete Reference* by Herbert Schildt, the course reference book.
- [Jakarta Servlet specification](https://jakarta.ee/specifications/servlet/)
- [Apache Tomcat documentation](https://tomcat.apache.org/)

---

## 📄 License

Distributed under the MIT License. See the [LICENSE](LICENSE) file for details.

Lab problem statements belong to the course instructor. This repository contains only my own solutions and notes.

---

## 📧 Contact

**Muhammad Zohaib Khan** - [@ZohaibCodez](https://github.com/ZohaibCodez)

**Project Link**: [github.com/ZohaibCodez/java-web-technologies](https://github.com/ZohaibCodez/java-web-technologies)

---

<div align="center">

**Java Web Technologies** • Built with 🖤 by Muhammad Zohaib Khan

⭐ Star this repo if you find it helpful!

</div>

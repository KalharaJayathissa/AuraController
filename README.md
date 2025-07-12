# Aura Project

> A motivational task reminder and resource-sharing platform for students.

## Table of Contents

* [Project Overview](#project-overview)
* [Stage I Features](#stage-i-features)
* [System Components](#system-components)

  * [User Interface](#user-interface)
  * [Control System (Backend)](#control-system-backend)
  * [Database](#database)
  * [Data Storage](#data-storage)
* [Tech Stack & Tools](#tech-stack--tools)
* [Getting Started](#getting-started)

  * [Prerequisites](#prerequisites)
  * [Setup & Installation](#setup--installation)
* [Usage](#usage)
* [Contributing](#contributing)
* [Project Links & Resources](#project-links--resources)
* [General Notes](#general-notes)

---

## Project Overview

Aura is a web-based system designed to help students stay on track with weekly tasks by reminding them of due assignments and motivating them through an 'Aura' point system. Users can also upload and share study materials—such as notes, videos, and other resources—to help peers learn and collaborate.

## Stage I Features

* **Weekly Task Reminders**: Notifies users of tasks to be completed in the current week.
* **Aura Points**: A gamified point system to encourage timely task completion.
* **Resource Library**: Upload and browse user-contributed study materials (notes, videos, etc.).

## System Components

### User Interface

* **Description**: Responsive web application compatible with desktop and mobile browsers.
* **Primary Pages**:

  1. **Login Page**: Landing page for user authentication.
  2. **Tasks Page**: Dashboard displaying weekly tasks and completion status.
  3. **Resources Page**: Library of uploaded materials with upload functionality.
  4. **Dummy Page (Optional)**: Placeholder for Stage II enhancements.

### Control System (Backend)

* **Description**: RESTful API layer connecting the UI with data storage.
* **Core Endpoints**:

  * **Authentication**: Login and session management.
  * **Tasks**: Fetch and submit weekly tasks.
  * **Resources**: Fetch and submit study materials.
  * **Aura Calculator**: (Planned for Stage II)
* **Design Notes**: Use proper data structures, loose coupling, and suitable design patterns. Avoid AI-generated code to simplify debugging and scaling.

### Database

* **Tool**: MongoDB Atlas (free tier, 500 MB limit).
* **Usage**: Store authentication details, tasks, resource metadata, and logs.
* **Storage Strategy**: Minimize database footprint; offload large files to external storage.

### Data Storage

* **Tool Options**: Dropbox or Google Drive APIs.
* **Usage**: Store user-uploaded files (videos, documents, etc.).
* **Structure**: Organize files in predictable folders and link metadata in the database.

## Tech Stack & Tools

| Component       | Suggested Tools                                                                           |
| --------------- | ----------------------------------------------------------------------------------------- |
| Frontend        | React.js (Vite) or Next.js, Vercel/Nelify/Firebase hosting, GitHub Actions CI/CD, VS Code |
| Backend         | Spring Boot (Java), Docker, DockerHub, Azure hosting, Postman for API testing             |
| Database        | MongoDB Atlas, Postman                                                                    |
| Data Storage    | Dropbox or Google Drive APIs                                                              |
| Version Control | GitHub                                                                                    |

## Getting Started

### Prerequisites

* Node.js & npm/yarn
* Java 11+ and Maven/Gradle
* Docker & Docker Compose
* MongoDB Atlas account
* Dropbox or Google Drive API credentials

### Setup & Installation

1. **Clone Repositories**

   ```bash
   git clone https://github.com/KalharaJayathissa/AuraWebPage.git
   git clone https://github.com/KalharaJayathissa/AuraController.git
   ```
2. **Frontend**

   ```bash
   cd AuraWebPage
   npm install
   npm run dev
   ```
3. **Backend**

   ```bash
   cd AuraController
   mvn clean install
   docker build -t aurabackend .
   docker run -p 8080:8080 aurabackend
   ```
4. **Environment Variables**

   * `MONGO_URI` for database connection
   * `DROPBOX_TOKEN` or Google Drive API keys

## Usage

1. Navigate to `http://localhost:3000` to access the web UI.
2. Register or log in with your student account.
3. View and complete tasks on the **Tasks** page; earn Aura points.
4. Upload and browse study materials on the **Resources** page.

## Contributing

We welcome contributions! Please:

* Fork the repository and create a feature branch.
* Implement your changes, following existing code style and patterns.
* Submit a pull request with a clear description of your changes.

> **Note**: Avoid AI-generated code to maintain clarity and ease of debugging.

## Project Links & Resources

* **This Document**: [Development Plan](https://docs.google.com/document/d/1neQELNfmVFzWNmOUMHnIkfW9qAA9mcQO587ebdmzx4E/edit)
* **Status Report**: [Live Status](https://docs.google.com/document/d/1kGP4bO722equTezF9rgXYrr-VXlsy5m_Zaleg_o0Z6Q/edit)
* **Frontend Repo**: [https://github.com/KalharaJayathissa/AuraWebPage](https://github.com/KalharaJayathissa/AuraWebPage)
* **Backend Repo**: [https://github.com/KalharaJayathissa/AuraController](https://github.com/KalharaJayathissa/AuraController)
* **Docker Image**: [https://hub.docker.com/repository/docker/kalharajayathissa/aurabackend/general](https://hub.docker.com/repository/docker/kalharajayathissa/aurabackend/general)

### Learning Resources

* Full-stack dev tutorial (Sinhala): YouTube 5‑hour series
* React.js Guide: [https://www.geeksforgeeks.org/reactjs/react](https://www.geeksforgeeks.org/reactjs/react)
* Dropbox API Example: [https://github.com/KalharaJayathissa/tg\_videos\_bot/tree/master/dropbox-uploader](https://github.com/KalharaJayathissa/tg_videos_bot/tree/master/dropbox-uploader)
* Spring Boot Backend Example: [https://github.com/KalharaJayathissa/stories\_backend](https://github.com/KalharaJayathissa/stories_backend)
* Spring Boot (Sinhala): YouTube playlist
* Java Design Patterns: [https://www.geeksforgeeks.org/system-design/java-design-patterns/](https://www.geeksforgeeks.org/system-design/java-design-patterns/)

## General Notes

* Keep your code modular and scalable for Stage II.
* Update the live status report regularly.
* Link to this README in your project documentation.

---

*Happy coding!*

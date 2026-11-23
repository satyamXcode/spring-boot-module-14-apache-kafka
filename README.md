# Spring Boot Module 14 – Apache Kafka

## 📌 Overview

This repository contains the practical implementation of Apache Kafka concepts using Spring Boot as part of my Java Full Stack Development course.

The project demonstrates event-driven communication using Kafka Producer and Consumer components.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Apache Kafka
- Spring Kafka
- Maven
- IntelliJ IDEA
- Git and GitHub

## 📚 Concepts Implemented

### 1. Apache Kafka

- Introduction to Apache Kafka.
- Understanding event-driven architecture.
- Understanding message-based communication.
- Producer and Consumer concepts.

### 2. Kafka Producer

**Class:** `KafkaProducerService.java`

Responsible for publishing messages to Kafka topics.

### 3. Kafka Consumer

**Class:** `KafkaConsumerService.java`

Responsible for receiving and processing messages from Kafka topics.

### 4. REST API Integration

**Class:** `KafkaController.java`

Provides API endpoints for interacting with the Kafka functionality implemented in the application.

### 5. Spring Boot Configuration

**File:** `application.yaml`

Contains the application and Kafka-related configuration.

## 📂 Project Structure

```text
module_14/
├── src/
│   ├── main/
│   │   ├── java/com/example/module14/
│   │   │   ├── consumer/
│   │   │   │   └── KafkaConsumerService.java
│   │   │   ├── controller/
│   │   │   │   └── KafkaController.java
│   │   │   ├── service/
│   │   │   │   └── KafkaProducerService.java
│   │   │   └── Module14Application.java
│   │   └── resources/
│   │       └── application.yaml
│   └── test/
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## 🔄 Message Flow

1. A client sends a request to the Kafka Controller.
2. The controller interacts with the Kafka Producer Service.
3. The producer publishes a message to a Kafka topic.
4. The Kafka Consumer listens for messages.
5. The consumer receives and processes the published message.

## ▶️ How to Run the Project

### Prerequisites

- Java JDK
- IntelliJ IDEA
- Apache Kafka broker
- Maven (or the included Maven Wrapper)

### 1. Clone the repository

```bash
git clone https://github.com/satyamXcode/spring-boot-module-14-apache-kafka.git
```

### 2. Navigate to the project

```bash
cd spring-boot-module-14-apache-kafka
```

### 3. Start Apache Kafka

Start your Kafka broker using the setup configured for this project.

Make sure the broker address matches the configuration in `application.yaml`.

### 4. Build the application

For Windows PowerShell:

```powershell
.\mvnw.cmd clean install
```

### 5. Run the Spring Boot application

```powershell
.\mvnw.cmd spring-boot:run
```

## 🎯 Learning Outcomes

Through this module, I gained practical understanding of:

- Apache Kafka fundamentals.
- Event-driven communication.
- Kafka Producer and Consumer implementation.
- Publishing and consuming messages.
- Integrating Apache Kafka with Spring Boot.
- Understanding asynchronous message-based communication.

## 👨‍💻 Author

**Satyam Jaiswal**

Java Full Stack Development Learner

GitHub: [satyamXcode](https://github.com/satyamXcode)

---

⭐ This repository is part of my ongoing Java Full Stack Development learning journey.
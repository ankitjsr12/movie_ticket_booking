# 🎬 Movie Ticket Booking System

A full-stack movie ticket booking web application built with **Java (Spring Boot)** and **HTML**, containerized with **Docker**, and deployed on [Render](https://movie-ticket-booking-9nj8.onrender.com).

---

## 🚀 Live Demo

🌐 [https://movie-ticket-booking-9nj8.onrender.com](https://movie-ticket-booking-9nj8.onrender.com)

---

## 🛠️ Tech Stack

| Layer      | Technology              |
|------------|-------------------------|
| Backend    | Java, Spring Boot        |
| Frontend   | HTML, CSS               |
| Build Tool | Maven (via `mvnw`)       |
| Container  | Docker                   |
| Deployment | Render                   |

---

## 📁 Project Structure

```
movie_ticket_booking/
├── src/                        # Java source files (Spring Boot application)
├── wrapper/                    # Maven wrapper files
├── BookingRepository.java      # Data repository for bookings
├── Dockerfile                  # Docker build configuration
├── pom.xml                     # Maven project configuration
├── mvnw                        # Maven wrapper (Unix)
└── mvnw.cmd                    # Maven wrapper (Windows)
```

---

## ✨ Features

- Browse and select movies
- Choose seats and showtime
- Book movie tickets online
- Manage bookings via repository layer
- RESTful backend API with Spring Boot

---

## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Maven (or use the included `mvnw` wrapper)
- Docker (optional, for containerized run)

### Run Locally

**Clone the repository:**
```bash
git clone https://github.com/ankitjsr12/movie_ticket_booking.git
cd movie_ticket_booking
git checkout aku
```

**Build and run with Maven:**
```bash
./mvnw spring-boot:run
```

The application will start at `http://localhost:8080`.

### Run with Docker

**Build the Docker image:**
```bash
docker build -t movie-ticket-booking .
```

**Run the container:**
```bash
docker run -p 8080:8080 movie-ticket-booking
```

Visit `http://localhost:8080` in your browser.

---

## 📦 Build

To create a production JAR:
```bash
./mvnw clean package
java -jar target/*.jar
```

---

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m 'Add your feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a Pull Request

---

## 👤 Author

**Ankit Kumar** — [@ankitjsr12](https://github.com/ankitjsr12)

---

## 📄 License

This project is open source. Feel free to use and modify it.

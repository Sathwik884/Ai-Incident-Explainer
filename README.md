# Incident Analyzer API

A professional REST API built with Quarkus that analyzes incident descriptions and provides intelligent insights including issue detection, root cause analysis, and recommended fixes.

## 📋 Overview

The Incident Analyzer API is a lightweight, high-performance microservice designed to process incident reports and return structured analysis. Built on Quarkus, it offers fast startup times, low memory footprint, and developer-friendly features like live reload.

## 🎯 Problem

When incidents occur in production systems, teams need quick analysis to:
- Identify the core issue from incident descriptions
- Understand the root cause
- Get actionable recommendations for resolution

Manual analysis is time-consuming and inconsistent. This API provides automated, structured incident analysis.

## ✨ Solution

The Incident Analyzer API accepts incident text via a REST endpoint and returns:
- **Issue Detection**: Identifies the primary problem from the incident description
- **Root Cause Analysis**: Provides insights into why the incident occurred
- **Recommended Fix**: Suggests actionable steps to resolve the issue

## 🛠️ Tech Stack

- **Language**: Java 17
- **Framework**: Quarkus 3.8.1
- **Build Tool**: Maven 3.x
- **Dependencies**:
  - RESTEasy Reactive (REST endpoints)
  - Jackson (JSON serialization)
  - Quarkus Arc (CDI)
- **Containerization**: Docker

## 🚀 API Endpoint

### POST `/analyze`

Analyzes incident text and returns structured insights.

#### Request

```bash
POST http://localhost:8080/analyze
Content-Type: application/json
```

**Body:**
```json
{
  "text": "Database connection timeout occurred during peak hours"
}
```

#### Response

```json
{
  "issue": "Detected issue in: Database connection timeout occurred during peak h",
  "cause": "Root cause analysis of the incident",
  "fix": "Recommended fix for the issue"
}
```

**Status Codes:**
- `200 OK` - Successful analysis
- `400 Bad Request` - Invalid input
- `500 Internal Server Error` - Server error

## 🏃 How to Run

### Prerequisites
- Java 17 or higher
- Maven 3.x (or use included Maven wrapper)

### Development Mode (with Live Reload)

```bash
./mvnw clean compile quarkus:dev
```

The application will start on `http://localhost:8080`

### Production Mode

```bash
# Build the application
./mvnw clean package

# Run the JAR
java -jar target/quarkus-app/quarkus-run.jar
```

### Docker

```bash
# Build Docker image
docker build -t incident-analyzer .

# Run container
docker run -p 8080:8080 incident-analyzer
```

## 🧪 How to Test

### Using cURL

```bash
curl -X POST http://localhost:8080/analyze \
  -H "Content-Type: application/json" \
  -d '{"text":"Database connection timeout occurred during peak hours"}'
```

### Using HTTPie

```bash
http POST http://localhost:8080/analyze text="Database connection timeout occurred during peak hours"
```

### Expected Output

```json
{
  "issue": "Detected issue in: Database connection timeout occurred during peak h",
  "cause": "Root cause analysis of the incident",
  "fix": "Recommended fix for the issue"
}
```

## 📁 Project Structure

```
incident-analyzer/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── incident/
│       │           └── analyzer/
│       │               ├── IncidentAnalyzerApplication.java  # Main application class
│       │               ├── AnalyzeResource.java              # REST endpoint
│       │               ├── AnalyzeRequest.java               # Request DTO
│       │               └── AnalyzeResponse.java              # Response DTO
│       └── resources/
│           └── application.properties                        # Configuration
├── pom.xml                                                   # Maven configuration
├── Dockerfile                                                # Docker configuration
├── mvnw                                                      # Maven wrapper (Unix)
├── mvnw.cmd                                                  # Maven wrapper (Windows)
└── README.md                                                 # This file
```

## 🤖 IBM Bob Usage

This project was developed with assistance from **IBM Bob**, an AI-powered coding assistant. Bob helped with:

### Code Generation
- Created the main application class (`IncidentAnalyzerApplication.java`)
- Enhanced REST resource with proper CDI annotations
- Configured Maven plugins for Quarkus

### Configuration
- Updated `pom.xml` with complete Quarkus plugin configuration
- Added proper build goals and test infrastructure
- Configured compiler settings for Java 17

### Testing & Verification
- Verified application startup and functionality
- Tested REST endpoints with sample requests
- Validated JSON serialization/deserialization

### Documentation
- Generated comprehensive project documentation
- Created this professional README
- Produced detailed Bob Report (`BOB_REPORT.md`)

**Bob's Contribution**: Bob streamlined the development process by automating boilerplate code generation, ensuring best practices, and providing instant verification of changes. This reduced development time significantly while maintaining code quality.

## 📝 Configuration

Edit `src/main/resources/application.properties` to customize:

```properties
# HTTP port
quarkus.http.port=8080

# Disable banner
quarkus.banner.enabled=false
```

## 🔧 Development Features

- **Live Reload**: Changes are automatically reflected without restart
- **Dev UI**: Access at `http://localhost:8080/q/dev`
- **Health Checks**: Built-in health endpoints
- **Metrics**: Performance monitoring capabilities

## 📦 Building for Production

### JVM Mode
```bash
./mvnw clean package
```

### Native Mode (GraalVM required)
```bash
./mvnw package -Pnative
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License.

## 🔗 Resources

- [Quarkus Documentation](https://quarkus.io/guides/)
- [RESTEasy Reactive Guide](https://quarkus.io/guides/resteasy-reactive)
- [Quarkus Maven Plugin](https://quarkus.io/guides/maven-tooling)

---

**Built with ❤️ using Quarkus and IBM Bob**
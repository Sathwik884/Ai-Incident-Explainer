# Incident Analyzer API

Minimal Quarkus REST API for incident analysis.

## Endpoint

**POST** `/analyze`

### Request
```json
{
  "text": "Your incident description"
}
```

### Response
```json
{
  "issue": "Detected issue description",
  "cause": "Root cause analysis",
  "fix": "Recommended fix"
}
```

## Run

```bash
./mvnw quarkus:dev
```

## Test

```bash
curl -X POST http://localhost:8080/analyze \
  -H "Content-Type: application/json" \
  -d '{"text":"Database connection timeout"}'
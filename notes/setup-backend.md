# setup-backend

## Completed

- Generated Spring Boot project
- Added Spring Web
- Added Spring Data JPA
- Added Validation
- Added H2
- Confirmed application starts
- Confirmed embedded Tomcat runs on port 8080
- Confirmed `/` returns 404 because no route exists yet

## Next step

Create a simple status endpoint:

`GET /api/status`

Expected response:

```json
{
  "project": "Where Did My Coffee Money Go?",
  "status": "alive"
}
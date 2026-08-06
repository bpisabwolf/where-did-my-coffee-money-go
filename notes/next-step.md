\# Next step



Generate a Spring Boot backend in the `backend` folder.



\## Java 21 ##



The programming language for the backend.



Why:

\- I already have professional Java experience.

\- It is current, stable, and widely used.

\- It lets this project demonstrate skills relevant to backend jobs.



\## Spring Boot ##



The framework that runs the web server and organizes the backend.



Why:

\- It removes a lot of manual setup.

\- It makes REST APIs straightforward.

\- It is common in enterprise Java jobs.

\- I already have experience with it, so this project strengthens existing skills.



\## Maven ##



The build and dependency-management tool.



Why:

\- It downloads libraries the project needs.

\- It compiles and tests the application.

\- It gives other developers one standard command for running the project.

\- Spring Initializr can generate the Maven configuration automatically.



Important file:



`pom.xml`



That file lists the dependencies and build settings.



\## Spring Web ##



Provides the HTTP server and REST controller tools.



Why:

\- React needs a backend API to request data from.

\- It lets us create endpoints such as:



`GET /api/companies/starbucks/activities`



Without Spring Web, the backend would not expose useful web endpoints.



\## Spring Data JPA ##



Provides a structured way to store and retrieve Java objects from a database.



Why:

\- The app will store companies, activities, countries, sources, and users.

\- It reduces repetitive SQL and database-access code.

\- It lets Java classes represent database records.



Example:



A `FinancialActivity` Java object can become a row in the database.



\## Validation ##



Checks incoming data before accepting it.



Why (IMPORTANT):

\- A company name should not be blank.

\- An amount should not contain nonsense.

\- A source URL should follow expected rules.

\- Invalid data should fail clearly instead of quietly corrupting the database.



\## H2 Database ##



A lightweight database that runs with the application during early development. Never used but for testing and robust before jump to PostgreSQL



Why:

\- No separate database installation is required.

\- It is enough to build and test the first API.

\- It prevents PostgreSQL setup from blocking the beginning of the project.



Limitation:

\- H2 is temporary development infrastructure.

\- It will later be replaced by PostgreSQL.



\## PostgreSQL — later ##



The real database intended for the deployed application.



Why:

\- It is reliable and production-ready.

\- It handles relational data well.

\- It supports strong querying and indexing.

\- I have previous PostgreSQL experience.



Why not now:

\- Installing and configuring it adds work before we have anything worth storing.



\## Backend responsibilities  ##



The backend will eventually:



1\. Store public financial activity.

2\. Provide data to the React frontend.

3\. Import information from public sources.

4\. Track the evidence supporting each claim.

5\. Manage company-following preferences.

6\. Generate weekly email updates.

7\. Optionally call an AI service when a user requests an explanation.

8\. AI service shall be prioritized as optional

9\. Look into other QOL features



\## Backend responsibilities for the first version ##



Only:



1\. Start successfully.

2\. Return a status response.

3\. Store manually entered financial activities.

4\. Return Starbucks activities through one API endpoint.- H2 Database

5\. Do not add React, PostgreSQL, AI, email, scraping, or cloud deployment yet.


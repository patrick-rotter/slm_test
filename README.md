# slm_test

### 1. Used tech stack
- Java 17
- Spring Boot 2.7.5

### 2. Running the application
Open the java project that is located in the directory /server. After maven downloads the necessary dependencies the maven SLM-options are available and can be used. To run the server execute the maven option "install" and then run the application.
<br>Default port: 8080

### 3. Using the application
If you are running the application locally:
- Execute a GET-request to http://localhost:8080/yardToMeter/{number} to calculate meters from inches
- Execute a GET-request to http://localhost:8080/inchToCm/{number} to calculate centimeters from inches

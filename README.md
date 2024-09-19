# Spring MVC security demo application

This is a simple app to practice Spring MVC Security and Thymeleaf. We have a custom login form (thymeleaf) that uses spring security to read the user information from a database (MySQL):

<img width="443" alt="users table" src="https://github.com/user-attachments/assets/89772592-5ada-42a7-91ee-d893c3d466a0">

<img width="157" alt="roles table" src="https://github.com/user-attachments/assets/ed0a56bf-931c-4389-99b0-bb74b2e48609">

https://github.com/user-attachments/assets/13014ded-b2d4-4608-b0a6-4dd93216e319

If the user has a specific role (in this example "Manager"), he/she can see specific content in the page (like a link to another page in this example):

https://github.com/user-attachments/assets/c9b51dc1-bbf8-4103-b469-47c88d7bc0aa

If the user does not have a specific role and tries to access a page specific to certain roles, the user will see custom content to let them know that they are not authorized to see that page:

https://github.com/user-attachments/assets/5b08489d-89db-4e57-843b-ef26041d29a1

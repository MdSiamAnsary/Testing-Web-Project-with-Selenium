# Testing Web Project with Selenium

## Project for testing 
A web project **[Sports Corner](https://github.com/MdSiamAnsary/SportsCorner)** is tested. The GitHub repository of the project is at the [[LINK](https://github.com/MdSiamAnsary/SportsCorner)] 

## Test Case Design Documentation for testing 
A document is prepared for designing the test cases to do testing. The document is available at the [[LINK](https://github.com/MdSiamAnsary/Testing-Web-Project-with-Selenium/blob/main/Test%20Case%20Documentation/Test%20Case%20Documentation.pdf)]

## Tools for testing

The code for testing is written using **Java** programming language on **Eclipse IDE** to do the testing with **Google Chrome** on a **Windows OS PC**.

It is to be noted that requirements for running the project **Sports Corner** should be met before testing is carried out. 

For testing purpose, the following elements are required.
- Language specific client driver of Selenium for Java
	> Can be downloaded from the link: https://www.selenium.dev/downloads/ 
- ChromeDriver - WebDriver for Chrome 
	> Can be downloaded from the link: https://chromedriver.chromium.org/ 
 
## Testing flow
From user perspective, the **Sports Corner** project has three aspects. They are 
- User registration 
- User Log in 
- Navigation of the site and Log out 

The testing of user log in and navigation and log out may depend on the successful run of user registration testing. 

The codes for testing are written in the package `testpackage`.
- Test cases related to User registration are in `RegistrationTests.java`
- Test cases related to User Log in are in `LogInTests.java`
- Test cases related to Navigation of the site and Log out are in `NavigationAndLogOutTests.java`

Test cases for **User registration** should be run first, then, test cases for **User Log in** and test cases for **Navigation of the site and Log out** should be run. 

The detailed description is in the [design document](https://github.com/MdSiamAnsary/Testing-Web-Project-with-Selenium/blob/main/Test%20Case%20Documentation/Test%20Case%20Documentation.pdf) 

openStaxTesting  Read Me


This project was written with Java and uses Selenium and JUnit to automate testing for openstax login error handling. 

EmailValidationTest.java will automate Test cases 005 to check that the user will be shown an error message when they attempt
to login with an Email not registered with an OpenStax account.


PasswordValidationTest.java will automate Test cases 004 to check the user will be shown an error message when they enter
an incorrect password with a valid account. 

these are JUnit test cases.

AllTest is a JUnit test suite, running this will run all of the test cases.

the actual logic for these function is located in OpenStax LoginTesting.java

code is found in SeleniumDemo -> src -> testing 




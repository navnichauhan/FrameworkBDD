 Feature: Login into the application

  Background: I landed on the page
  Given User navigate on the page
  

  @Regression
  Scenario Outline: Login into application using valid credential
    Given Click on signin button
    When Enter the useremail "<email>"
    And Enter the password "<prd>"
    Then User is able to login successfully


    Examples: 
      | email  | prd |
      | seema.sharma122@gmail.com | N123456v@ |
      
   @Regression
   Scenario: Logout from signin page
   Given Click on dropdown button
   When Select value from dropdown to logout
   Then User is logout successfully
      
   @tag4
   Scenario Outline: User Forget password
    Given Click on signin button
    When click on Forget password
    And Enter the email id "<email>"
    And click Reset my password
    Then User is getting pop message up and email
    Examples: 
      | email  |
      | seema.sharma122@gmail.com |
    

 
      
  # @tag4
   #Scenario Outline: Create a new account
   #Given Click on Create account button
   #When Enter First name <firstname>
   #And Enter Last name <lastname>
   #And Enter email <email>
   #And Enter password <password>
   #And Enter confirm password <confirmpassword>
   #Then Click create an account to successfully
   #Examples:
   #|firstname|lastname|email| password|confirmpassword|
   #|Manish| sharma|test344@gmail.com|N12345
   

      


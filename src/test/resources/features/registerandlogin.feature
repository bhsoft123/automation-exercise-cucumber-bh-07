@author_BP @regression
Feature: Register user and Login functionality
  As a user, I should be able to register a new account and then login with valid credential and unable to login with invalid credentials
#scenario 1,2,3,4,5

#Test Case 1: Register User
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Signup / Login' button
#        5. Verify 'New User Signup!' is visible
#        6. Enter name and email address
#        7. Click 'Signup' button
#        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#        9. Fill details: Title, Name, Email, Password, Date of birth
#        10. Select checkbox 'Sign up for our newsletter!'
#        11. Select checkbox 'Receive special offers from our partners!'
#        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#        13. Click 'Create Account button'
#        14. Verify that 'ACCOUNT CREATED!' is visible
#        15. Click 'Continue' button
#        16. Verify that 'Logged in as username' is visible
#        17. Click 'Delete Account' button
#        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

  @author_BP @smoke @(priority=00)
Scenario Outline: 01 Register user
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  When  Click 'Signup / Login' button
  Then  Verify that "New User Signup!" is visible
  And   Enter FullName "<full name>" and Email"<email>"
  And   Click 'Signup' button
  Then  Verify that 'ENTER ACCOUNT INFORMATION' is visible
  And   Fill details "<title>","<full name>","<email>","<password>","<day of birth>","<month of birth>", "<year of birth>"
  And   Select checkbox 'Sign up for our newsletter!'
  And   Select checkbox 'Receive special offers from our partners!'
  And   Fill details "<first name>", "<last name>","<company>","<address>","<address2>","<country>","<state>","<city>","<zipcode>","<mobile number>"
  And   Click 'Create Account' button
  Then  Verify that 'ACCOUNT CREATED!' is visible
  And   Click 'Continue' button
  Then  Verify that "Logged in as" "<full name>" is visible
  And   Click 'Delete Account' button
  Then  Verify that 'ACCOUNT DELETED!' is visible
  And   Click 'Continue' button
  Examples:
    | title  | full name     | first name   | last name  | email                    | password    | day of birth  | month of birth   | year of birth  | company             | address         | address2            | country | state| city     | zipcode| mobile number|
    | Mrs    | Kavita Patrick| Kavita       | Patrick    | kavitaxyz6034@gmail.com  | kavita@123  | 1             | January          | 1990           | Kavita Colours Ltd  | Colours Street  | Near Post Office    | India   | UP   | Banaras  | 399 002|  091876543211|

# scenario 2 Login User with correct email and password
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Signup / Login' button
#  5. Verify 'Login to your account' is visible
#  6. Enter correct email address and password
#  7. Click 'login' button
#  8. Verify that 'Logged in as username' is visible
#  9. Click 'Delete Account' button
#  10. Verify that 'ACCOUNT DELETED!' is visible

  @author_BP @sanity @(priority=001)
  Scenario Outline: 2 Login User with correct email and password
  When  Click 'Signup / Login' button
  And   Verify that 'Login to your account' is visible
  Then  Enter correct email "<email>" and password "<password>"
  And   Click 'login' button
  Then  Verify that "Logged in as" "<full name>" is visible
  #And   Click 'Delete Account' button
  #Then  Verify that 'ACCOUNT DELETED!' is visible
    Examples:
      | email                   | password    | full name       |
      | kavitaxyz10035@gmail.com  | kavita@123  | Kavita Patrick  |
      #correct email

  @author_BP @smoke @(priority=002)
  Scenario Outline: 3Login User with incorrect email and password
  When  Click 'Signup / Login' button
  Then  Verify that 'Login to your account' is visible
  And   Enter incorrect email "<incorrect email>" and "<password>"
  And   Click 'login' button
  Then  Verify error 'Your email or password is incorrect!' is visible
    Examples:
      | incorrect email                   | password    |
      | kavitaxyz123@gmail.com            | kavita@123  |

  @author_BP @smoke @(priority=003)
  Scenario Outline: 4Logout User
  When  Click 'Signup / Login' button
  And   Verify that 'Login to your account' is visible
  Then  Enter correct email "<email>" and password "<password>"
  And   Click 'login' button
  Then  Verify that "Logged in as" "<full name>" is visible
  And   Click 'Logout' button
    Examples:
      | email                   | password    |  full name     |
      | kavitaxyz10035@gmail.com  | kavita@123  |  Kavita Patrick|
      #correct email

  @author_BP @smoke @(priority=004)
  Scenario Outline: 5 Register User with existing email
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  When  Click 'Signup / Login' button
  Then  Verify that "New User Signup!" is visible
  And   Enter FullName "<full name>" and Email"<email>"
  And   Click 'Signup' button
  Then  Verify error 'Email Address already exist!' is visible
    Examples:
      | full name       | email                     |
      | Kavita Patrick  | kavitaxyz10035@gmail.com  |
      #correct email
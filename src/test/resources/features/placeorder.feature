@author_BP @regression
Feature: Checkout Functionality
  As a user, I should be able to add products to the cart and place order successfully

#scenario 14,15,16,17,171,23,24,25,26
#  Scenario : 14 Place Order: Register while Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click Proceed To Checkout
#  8. Click 'Register / Login' button
#  9. Fill all details in Signup and create account
#  10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  11. Verify ' Logged in as username' at top
#  12.Click 'Cart' button
#  13. Click 'Proceed To Checkout' button
#  14. Verify Address Details and Review Your Order
#  15. Enter description in comment text area and click 'Place Order'
#  16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  17. Click 'Pay and Confirm Order' button
#  18. Verify success message 'Your order has been placed successfully!'
#  19. Click 'Delete Account' button
#  20. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_BP @smoke @(priority=013)
Scenario Outline: 14 Place Order: Register while Checkout
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  And   Click View Product for "<any product>" on home page
  Then  Verify product detail "<any product>" is opened
  And   Increase quantity to "<quantity>"
  And   Click 'Add to cart' button
  And   Click 'View Cart' button
  Then  Verify that cart page is displayed
  And   Click 'Proceed To Checkout' button
  And   Click 'Register / Login' button on checkout window
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
  Then  Verify that "Logged in as" "Kavita Patrick" is visible
  And   Click 'Cart' button
  And   Click 'Proceed To Checkout' button
  Then  Verify 'Address Details' is displayed on page
  Then  Verify 'Review Your Order' is displayed on page
  And   Enter "Please leave with neighbour" in comment text area
  And   Click 'Place Order' button
  And   Enter payment details Name on Card "Kavita Patrick", Card Number "4263982640269299", CVC "345", Expiration month "09", Expiration year "2026"
  And   Click 'Pay and Confirm Order' button
  And   Verify success message 'Congratulations! Your order has been confirmed!'
  And   Click 'Delete Account' button
  Then  Verify that 'ACCOUNT DELETED!' is visible
  And   Click 'Continue' button
  Examples:
    |any product|quantity| title  | full name     | first name   | last name  | email                   | password    | day of birth  | month of birth   | year of birth  | company             | address         | address2            | country | state| city     | zipcode| mobile number|
    |Blue Top   |4       |  Mrs   | Kavita Patrick| Kavita       | Patrick    | kavitaxyz70312@gmail.com| kavita@123  | 1             | January          | 1990           | Kavita Colours Ltd  | Colours Street  | Near Post Office    | India   | UP   | Banaras  | 399 002|  091876543211|

#  Scenario: 15 Place Order: Register before Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill all details in Signup and create account
#  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  7. Verify ' Logged in as username' at top
#  8. Add products to cart
#  9. Click 'Cart' button
#  10. Verify that cart page is displayed
#  11. Click Proceed To Checkout
#  12. Verify Address Details and Review Your Order
#  13. Enter description in comment text area and click 'Place Order'
#  14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  15. Click 'Pay and Confirm Order' button
#  16. Verify success message 'Your order has been placed successfully!'
#  17. Click 'Delete Account' button
#  18. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_BP @sanity @(priority=014)
  Scenario Outline: 15 Place Order: Register before Checkout
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click View Product for "<any product>" on home page
    Then  Verify product detail "<any product>" is opened
    And   Increase quantity to "<quantity>"
    And   Click 'Add to cart' button
    And   Click 'View Cart' button
    And   Click 'Cart' button
    Then  Verify that cart page is displayed
    And   Click 'Proceed To Checkout' button
    And   Click 'Register / Login' button on checkout window
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
    And   Click 'Cart' button
    Then  Verify that cart page is displayed
    And   Click 'Proceed To Checkout' button
    Then  Verify 'Address Details' is displayed on page
    Then  Verify 'Review Your Order' is displayed on page
    And   Enter "Please leave with neighbour" in comment text area
    And   Click 'Place Order' button
    And   Enter payment details Name on Card "Kavita Patrick", Card Number "4263982640269299", CVC "345", Expiration month "09", Expiration year "2026"
    And   Click 'Pay and Confirm Order' button
    And   Verify success message 'Congratulations! Your order has been confirmed!'
    And   Click 'Delete Account' button
    Then  Verify that 'ACCOUNT DELETED!' is visible
    And   Click 'Continue' button
    Examples:
      |any product|quantity| title  | full name     | first name   | last name  | email                    | password    | day of birth  | month of birth   | year of birth  | company             | address         | address2            | country | state| city     | zipcode| mobile number| product        |
      |Blue Top   |4       |  Mrs   | Kavita Patrick| Kavita       | Patrick    | kavitaxyz0018312@gmail.com| kavita@123  | 1             | January          | 1990           | Kavita Colours Ltd  | Colours Street  | Near Post Office    | India   | UP   | Banaras  | 399 002|  091876543211| Fancy Green Top|

#  Scenario: 16 Place Order: Login before Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill email, password and click 'Login' button
#  6. Verify 'Logged in as username' at top
#  7. Add products to cart
#  8. Click 'Cart' button
#  9. Verify that cart page is displayed
#  10. Click Proceed To Checkout
#  11. Verify Address Details and Review Your Order
#  12. Enter description in comment text area and click 'Place Order'
#  13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  14. Click 'Pay and Confirm Order' button
#  15. Verify success message 'Your order has been placed successfully!'
#  16. Click 'Delete Account' button
#  17. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_BP @(priority=015)
  Scenario Outline: 16 Place Order: Login before Checkout
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    When  Click 'Signup / Login' button
    Then  Enter correct email "<email>" and password "<password>"
    And   Click 'login' button
    Then  Verify that "Logged in as" "<full name>" is visible
    And   Click 'Products' button
    And   Add "<product>" to cart
    And   Click 'View Cart' button
    Then  Verify that cart page is displayed
    And   Click 'Proceed To Checkout' button
    Then  Verify 'Address Details' is displayed on page
    Then  Verify 'Review Your Order' is displayed on page
    And   Enter "Please leave with neighbour" in comment text area
    And   Click 'Place Order' button
    And   Enter payment details Name on Card "Kavita Patrick", Card Number "4263982640269299", CVC "345", Expiration month "09", Expiration year "2026"
    And   Click 'Pay and Confirm Order' button
    And   Verify success message 'Congratulations! Your order has been confirmed!'
    #And   Click 'Delete Account' button
    #Then  Verify that 'ACCOUNT DELETED!' is visible
    #And   Click 'Continue' button
    Examples:
      | email                      | password    | full name     | product     |
      | kavitaxyz10035@gmail.com   | kavita@123  | Kavita Patrick| Winter Top  |

#  Scenario : 17 Remove Products From Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click 'X' button corresponding to particular product
#  8. Verify that product is removed from the cart

  @author_BP @(priority=016)
  Scenario Outline: 17 Remove Products From Cart
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click View Product for "<any product>" on home page
    Then  Verify product detail "<any product>" is opened
    And   Increase quantity to "<quantity>"
    And   Click 'Add to cart' button
    And   Click 'View Cart' button
    Then  Verify that cart page is displayed
    And   Click remove button corresponding to particular product "<any product>"
    Then  Verify that product is removed from the cart
      Examples:
      |any product|quantity|
      |Blue Top   |4       |


#  # adding more products through datatable and removing using custom xpath
#  @author_BP
#  Scenario: 171 Remove Products From Cart
#    Given I am on Home Page
#    And   I can verify that home page is visible successfully
#    And   Click View Product for any product on home page and add quantity
#      |product            |quantity   |
#      |Blue Top           |4          |
#      |Sleeveless Dress   |2          |
#    #And   Click 'Add to cart' button
#    And   Click on 'View Cart' button on main menu
#    Then  Verify that cart page is displayed
#    And   Click remove button corresponding to particular product
#      |product            |quantity   |
#      |Sleeveless Dress   |2          |

#  23 Verify address details in checkout page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill all details in Signup and create account
#  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  7. Verify ' Logged in as username' at top
#  8. Add products to cart
#  9. Click 'Cart' button
#  10. Verify that cart page is displayed
#  11. Click Proceed To Checkout
#  12. Verify that the delivery address is same address filled at the time registration of account
#  13. Verify that the billing address is same address filled at the time registration of account
#  14. Click 'Delete Account' button
#  15. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_BP @(priority=022)
  Scenario Outline: 23 Verify address details in checkout page
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
    And   Click 'Products' button
    And   Hover over 'Blue Top' product and click 'Add to cart' button
    And   Click 'Continue Shopping' button
    And   Hover over 'Men Tshirt' product and click 'Add to cart' button
    And   Click 'View Cart' button
    Then  Verify that cart page is displayed
    And   Click 'Proceed To Checkout' button
    Then  Verify that the delivery "<address>" is same address filled at the time registration of account
    Then  Verify that the billing "<address>" is same address filled at the time registration of account
    And   Click 'Delete Account' button
    Then  Verify that 'ACCOUNT DELETED!' is visible
    And   Click 'Continue' button
    Examples:
      | title  | full name     | first name   | last name  | email                       | password    | day of birth  | month of birth   | year of birth  | company             | address         | address2            | country | state| city     | zipcode| mobile number|
      | Mrs    | Kavita Patrick| Kavita       | Patrick    | kavitaxyz895112@gmail.com  | kavita@123  | 1             | January          | 1990           | Kavita Colours Ltd  | Colours Street  | Near Post Office    | India   | UP   | Banaras  | 399 002|  091876543211|


#  24 Download Invoice after purchase order
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click Proceed To Checkout
#  8. Click 'Register / Login' button
#  9. Fill all details in Signup and create account
#  10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  11. Verify ' Logged in as username' at top
#  12.Click 'Cart' button
#  13. Click 'Proceed To Checkout' button
#  14. Verify Address Details and Review Your Order
#  15. Enter description in comment text area and click 'Place Order'
#  16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  17. Click 'Pay and Confirm Order' button
#  18. Verify success message 'Your order has been placed successfully!'
#  19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
#  20. Click 'Continue' button
#  21. Click 'Delete Account' button
#  22. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_BP @(priority=023)
  Scenario Outline: 24 Download Invoice after purchase order
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click View Product for any product on home page and add quantity
      |product            |quantity   |
      |Blue Top           |4          |
      |Sleeveless Dress   |2          |
    #And   Click 'Add to cart' button
    And   Click on 'View Cart' button on main menu
    Then  Verify that cart page is displayed
    And   Click 'Proceed To Checkout' button
    When  Click 'Signup / Login' button on model window
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
    And   Click 'Cart' button
    Then  Verify that cart page is displayed
    And   Click 'Proceed To Checkout' button
    Then  Verify that the delivery "<address>" is same address filled at the time registration of account
    And   Enter "Please leave with neighbour" in comment text area
    And   Click 'Place Order' button
    And   Enter payment details Name on Card "Kavita Patrick", Card Number "4263982640269299", CVC "345", Expiration month "09", Expiration year "2026"
    And   Click 'Pay and Confirm Order' button
    And   Verify success message 'Congratulations! Your order has been confirmed!'
    And   Click 'Download Invoice' button
    Then  Verify invoice is downloaded successfully
    And   Click 'Continue' button
    And   Click 'Delete Account' button
    Then  Verify that 'ACCOUNT DELETED!' is visible
    And   Click 'Continue' button
    Examples:
      | title  | full name     | first name   | last name  | email                    | password    | day of birth  | month of birth   | year of birth  | company             | address         | address2            | country | state| city     | zipcode| mobile number|
      | Mrs    | Kavita Patrick| Kavita       | Patrick    | kavitaxyz4130@gmail.com  | kavita@123  | 1             | January          | 1990           | Kavita Colours Ltd  | Colours Street  | Near Post Office    | India   | UP   | Banaras  | 399 002|  091876543211|


#  25 Verify Scroll Up using 'Arrow' button and Scroll Down functionality
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Scroll down page to bottom
#  5. Verify 'SUBSCRIPTION' is visible
#  6. Click on arrow at bottom right side to move upward
#  7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

 @author_BP @(priority=024)
Scenario Outline: 25 Verify Scroll Up using 'Arrow' button and Scroll Down functionality
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  And   Scroll down to footer
  Then  Verify text 'SUBSCRIPTION'
  And   Enter email address "<email>" in input
  Then  Verify success message 'You have been successfully subscribed!' is visible
  And   Click 'arrow' button
  Then  Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
  Examples:
    |  email                   |
    |  kavitaxyz007@gmail.com  |


#26 Verify Scroll Up without 'Arrow' button and Scroll Down functionality
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Scroll down page to bottom
#5. Verify 'SUBSCRIPTION' is visible
#6. Scroll up page to top
#7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  @author_BP @(priority=025)
  Scenario Outline: 26 Verify Scroll Up without 'Arrow' button and Scroll Down functionality
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  And   Scroll down to footer
  Then  Verify text 'SUBSCRIPTION'
  And   Enter email address "<email>" in input
  Then  Verify success message 'You have been successfully subscribed!' is visible
  And   Scroll up page to top
  Then  Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
  Examples:
    |  email                   |
    |  kavitaxyz007@gmail.com  |

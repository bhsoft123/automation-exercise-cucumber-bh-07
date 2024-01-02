@author_BP @regression
Feature: Contact us form and Home page menu
  As a user, I should be able to fill in contact us form, verify test cases link and all products on the home page
#scenario 6,7,8,9,10,11

#scenario 6: Contact Us Form
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Contact Us' button
#        5. Verify 'GET IN TOUCH' is visible
#        6. Enter name, email, subject and message
#        7. Upload file
#        8. Click 'Submit' button
#        9. Click OK button
#        10. Verify success message 'Success! Your details have been submitted successfully.' is visible
#        11. Click 'Home' button and verify that landed to home page successfully

  @author_BP @sanity @(priority=005)
  Scenario Outline: 6 Contact us form
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click 'Contact Us' button
    Then  Verify that 'GET IN TOUCH' is visible
    And   Enter "<full name>", "<email>", "<subject>" and "<message>"
    And   Upload file
    Then  Verify that 'Success! Your details have been submitted successfully.' is visible
    And   Click 'Home' button
    And   Verify that user is navigated to home page after sumbmission
  Examples:
    | full name       | email                     | subject             | message                                         |
    | Kavita Patrick  | kavitaxyz10035@gmail.com  | inquiry for size M  | I am looking for a M size for attached product  |

#scenario 7: Verify Test Cases Page
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Test Cases' button
#        5. Verify user is navigated to test cases page successfully

  @author_BP @smoke @(priority=006)
  Scenario: 7 Verify Test Cases Page
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click 'Test Cases' button
    Then  Verify that user is navigated to 'Test Cases' page successfully

#scenario 8 Verify All Products and product detail page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Products' button
#  5. Verify user is navigated to ALL PRODUCTS page successfully
#  6. The products list is visible
#  7. Click on 'View Product' of first product
#  8. User is landed to product detail page
#  9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

  @author_BP @sanity @(priority=007)
  Scenario: 8 Verify All Products and product detail page
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click 'Products' button
    Then  Verify that user is navigated to 'ALL PRODUCTS' page successfully
    And   The products list is visible
    And   Click on 'View Product' of first product
    And   Verify that user is navigated to product detail page
    Then  Verify that detail is visible category, price, availability, condition, brand

#scenario 9 Search Product
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Products' button
#  5. Verify user is navigated to ALL PRODUCTS page successfully
#  6. Enter product name in search input and click search button
#  7. Verify 'SEARCHED PRODUCTS' is visible
#  8. Verify all the products related to search are visible

  @author_BP @sanity @(priority=008)
  Scenario Outline: 9 Search Product
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click 'Products' button
    Then  Verify that user is navigated to 'ALL PRODUCTS' page successfully
    And   Enter "<product name>" in search input
    And   Click search button
    Then  Verify SEARCHED PRODUCTS "<product name>" is visible
    And   Verify all the products related to search are visible
    Examples:
      | product name|
      | Blue Top    |

#  scenario 10 Verify Subscription in home page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Scroll down to footer
#  5. Verify text 'SUBSCRIPTION'
#  6. Enter email address in input and click arrow button
#  7. Verify success message 'You have been successfully subscribed!' is visible

  @author_BP @sanity @(priority=009)
  Scenario Outline: 10 Verify Subscription in home page
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Scroll down to footer
    Then  Verify text 'SUBSCRIPTION'
    And   Enter email address "<email>" in input
    And   Click 'arrow' button
    Then  Verify success message 'You have been successfully subscribed!' is visible
    Examples:
    |  email                   |
    |  kavitaxyz007@gmail.com  |

#scenario  11 Verify Subscription in Cart page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Cart' button
#  5. Scroll down to footer
#  6. Verify text 'SUBSCRIPTION'
#  7. Enter email address in input and click arrow button
#  8. Verify success message 'You have been successfully subscribed!' is visible

  @author_BP @sanity @(priority=010)
  Scenario Outline: 11 Verify Subscription in Cart page
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click 'Cart' button
    And   Scroll down to footer
    Then  Verify text 'SUBSCRIPTION'
    And   Enter email address "<email>" in input
    And   Click 'arrow' button
    Then  Verify success message 'You have been successfully subscribed!' is visible
    Examples:
      |  email                   |
      |  kavitaxyz007@gmail.com  |
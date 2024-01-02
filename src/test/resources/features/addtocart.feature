@author_BP @regression
Feature: Cart functionality
  As a user, I should be able to add products to the cart
#scenario 12,13

#  Scenario: 12 Add Products in Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Products' button
#  5. Hover over first product and click 'Add to cart'
#  6. Click 'Continue Shopping' button
#  7. Hover over second product and click 'Add to cart'
#  8. Click 'View Cart' button
#  9. Verify both products are added to Cart
#  10. Verify their prices, quantity and total price

  @author_BP @smoke @(priority=011)
  Scenario: 12 Add Products in Cart
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click 'Products' button
    And   Hover over "Blue Top" product and click 'Add to cart' button
    And   Click 'Continue Shopping' button
    And   Hover over 'Men Tshirt' product and click 'Add to cart' button
    And   Click 'View Cart' button
    Then  Verify 'Blue Top' added to Cart
    Then  Verify 'Men Tshirt' added to Cart

#  Scenario: 13 Verify Product quantity in Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'View Product' for any product on home page
#  5. Verify product detail is opened
#  6. Increase quantity to 4
#  7. Click 'Add to cart' button
#  8. Click 'View Cart' button
#  9. Verify that product is displayed in cart page with exact quantity

  @author_BP @sanity @(priority=012)
  Scenario Outline: 13 Verify Product quantity in Cart
    Given I am on Home Page
    And   I can verify that home page is visible successfully
    And   Click View Product for "<any product>" on home page
    Then  Verify product detail "<any product>" is opened
    And   Increase quantity to "<quantity>"
    And   Click 'Add to cart' button
    And   Click 'View Cart' button
    Then  Verify that product "<any product>" is displayed in cart page with exact quantity "<quantity>"
    Examples:
        | any product | quantity   |
        | Winter Top  | 4          |



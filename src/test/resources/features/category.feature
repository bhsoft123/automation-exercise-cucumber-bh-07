@author_BP @regression
Feature: View Category in Products
  As a user,I should be able to
  View Category Products
  View & Cart Brand Products
  Search Products and Verify Cart After Login
  Add review on product
  Add to cart from Recommended items
#scenario 18,19,20,21,22


#18 View Category Products
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that categories are visible on left side bar
#4. Click on 'Women' category
#5. Click on any category link under 'Women' category, for example: Dress
#6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
#7. On left side bar, click on any sub-category link of 'Men' category
#8. Verify that user is navigated to that category page

  @author_BP @smoke @(priority=17)
  Scenario: 18 View Category Products
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  Then  Verify text 'CATEGORY' is displayed
  And   Click 'WOMEN' category
  And   Click 'DRESS' category link under Women category
  Then  Verify text 'WOMEN - DRESS PRODUCTS' is displayed
  And   Click 'MEN' category
  And   Click 'TSHIRTS' category link under Men category
  Then  Verify text 'MEN - TSHIRTS PRODUCTS' is displayed

#19 View & Cart Brand Products
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify that Brands are visible on left side bar
#5. Click on any brand name
#6. Verify that user is navigated to brand page and brand products are displayed
#7. On left side bar, click on any other brand link
#8. Verify that user is navigated to that brand page and can see products

  @author_BP @(priority=18)
Scenario: 19 View & Cart Brand Products
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  And   Click 'Products' button
  Then  Verify text 'BRANDS' is displayed
  And   Click 'POLO'  brand category
  Then  Verify text 'BRAND - POLO PRODUCTS' is displayed
  And   Click 'H&M'  brand category
  Then  Verify text 'BRAND - H&M PRODUCTS' is displayed

#20 Search Products and Verify Cart After Login
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify user is navigated to ALL PRODUCTS page successfully
#5. Enter product name in search input and click search button
#6. Verify 'SEARCHED PRODUCTS' is visible
#7. Verify all the products related to search are visible
#8. Add those products to cart
#9. Click 'Cart' button and verify that products are visible in cart
#10. Click 'Signup / Login' button and submit login details
#11. Again, go to Cart page
#12. Verify that those products are visible in cart after login as well

  @author_BP @(priority=19)
Scenario: 20 Search Products and Verify Cart After Login
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  And   Click 'Products' button
  Then  Verify that user is navigated to 'ALL PRODUCTS' page successfully
  And   Enter product names in search input and click search and add product to cart
    |product              |
    |Blue Top             |
    |Sleeveless Dress     |
    |Frozen Tops For Kids |
    |Premium Polo T-Shirts|
  And   Click on 'View Cart' button on main menu
  Then  Verify that products are visible in cart
  When  Click 'Signup / Login' button
  And   Verify that 'Login to your account' is visible
  Then  Enter correct email "kavitaxyz007@gmail.com" and password "kavita@123"
  And   Click 'login' button
  And   Click on 'View Cart' button on main menu
  Then  Verify that product names are visible in cart after login as well
    |product              |
    |Blue Top             |
    |Sleeveless Dress     |
    |Frozen Tops For Kids |
    |Premium Polo T-Shirts|


#21 Add review on product
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify user is navigated to ALL PRODUCTS page successfully
#5. Click on 'View Product' button
#6. Verify 'Write Your Review' is visible
#7. Enter name, email and review
#8. Click 'Submit' button
#9. Verify success message 'Thank you for your review.'

  @author_BP @(priority=20)
Scenario: 21 Add review on product
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  And   Click 'Products' button
  Then  Verify that user is navigated to 'ALL PRODUCTS' page successfully
  And   Click View Product for "Blue Top" on home page
  Then  Verify that "Write Your Review" is visible
  And   Enter "Kavita", "kavita10035@gmail.com" and "The product is great!"
  And   Click 'Submit' button
  Then  Verify success message 'Thank you for your review.' in product page

#22 Add to cart from Recommended items
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Scroll to bottom of page
#4. Verify 'RECOMMENDED ITEMS' are visible
#5. Click on 'Add To Cart' on Recommended product
#6. Click on 'View Cart' button
#7. Verify that product is displayed in cart page

  @author_BP @sanity @(priority=21)
Scenario: 22 Add to cart from Recommended items
  Given I am on Home Page
  And   I can verify that home page is visible successfully
  And   Scroll to bottom of page
  Then  Verify that 'RECOMMENDED ITEMS' is visible
  And   Get all recommended products names
  And   Click on any Recommended product
    |product              |
    |Winter Top           |
    |Stylish Dress        |
  And   Click on 'View Cart' button on main menu
  Then  Verify that product names are visible in cart after login as well
    |product              |
    |Winter Top           |
    |Stylish Dress        |

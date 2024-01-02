package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Map;

public class AddToCartSteps {       //scenario 12
    @And("Hover over {string} product and click {string} button")
    public void hoverOverFirstProductAndClickAddToCartButton(String selectProduct, String addtocart) throws InterruptedException {
        new ProductsPage().clickOnProduct(selectProduct);
    }

    @Then("Verify {string} added to Cart")
    public void verifyBlueTopAddedToCart(String productName) {
        Assert.assertEquals(new AddToCartPage().verifyProductsAddedToCart(productName), productName, "Error");
    }

    @And("Click View Product for {string} on home page")
    public void clickViewProductForOnHomePage(String selectAProduct) {
        new ProductsPage().viewProductForSelectedProduct(selectAProduct);
    }

    @Then("Verify product detail {string} is opened")
    public void verifyProductDetailIsOpened(String selectAProduct) {
        Assert.assertEquals(new ProductsPage().verifyProductDetailsPageIsOpened(selectAProduct), selectAProduct, "Error");
    }

    @And("Increase quantity to {string}")
    public void increaseQuantityTo(String quantity) {
        new ProductsPage().changeQuantity(quantity);
    }

    @Then("Verify that product {string} is displayed in cart page with exact quantity {string}")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity(String selectedProduct, String quantity) {
        Assert.assertEquals(new AddToCartPage().verifyProductsAddedToCart(selectedProduct), selectedProduct, "Error");
        Assert.assertEquals(new AddToCartPage().verifyQuantityAddedToCart(selectedProduct), quantity, "Error");
    }

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        Assert.assertEquals(new CheckoutPage().verifyCartPageIsDisplyd(), "Shopping Cart", "Error");

    }

    @Then("Verify {string} is displayed on page")
    public void verifyAddressDetailsIsDisplayedOnPage(String verifyAddressDetOrReview) {
        if (verifyAddressDetOrReview.contains("Address")) {
            Assert.assertEquals(new CheckoutPage().getAddressDetailsText(), verifyAddressDetOrReview, "Error");
        } else if (verifyAddressDetOrReview.contains("Review")) {
            Assert.assertEquals(new CheckoutPage().getReviewYourOrderText(), verifyAddressDetOrReview, "Error");
        }
    }

    @And("Enter {string} in comment text area")
    public void enterInCommentTextArea(String addComment) {
        new CheckoutPage().enterComments(addComment);
    }

    @And("Enter payment details Name on Card {string}, Card Number {string}, CVC {string}, Expiration month {string}, Expiration year {string}")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationMonthExpirationYear(String name, String cardNumber, String cvc, String expiryMonth, String expireyYear) {
        new CheckoutPage().enterPaymentDetails(name, cardNumber, cvc, expiryMonth, expireyYear);
    }

    @And("Verify success message {string}")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String successMEssage) {
        Assert.assertEquals(new CheckoutPage().verifyPaymentSuccessMsg(), successMEssage, "Error");
        System.out.println(successMEssage);
    }

    @And("Click {string} button on checkout window")
    public void clickRegisterLoginButtonOnCheckoutWindow(String regorlogin) {
        new CheckoutPage().clickOnRegisterORLoginOnCheckoutWindow();
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
    }

    @And("Click remove button corresponding to particular product {string}")
    public void clickRemoveButtonCorrespondingToParticularProduct(String selectedProduct) {
        new CheckoutPage().clickOnRemoveProduct(selectedProduct);
    }

    @And("Click View Product for any product on home page and add quantity")
    // click on product and add quantity from datatable
    public void clickViewProductForAnyProductOnHomePageAndAddQuantity(DataTable datavalue) throws InterruptedException {
        for (Map<String, String> data : datavalue.asMaps(String.class, String.class)) {

            new CheckoutPage().sendDataValueProduct(data.get("product"));
            new CheckoutPage().sendDataValuQuantity(data.get("quantity"));
            new CheckoutPage().clickOnAddToCartButton();
            new ProductsPage().clickOnContinueAfterAddToCart();
            new HomePage().clickOnProductsLink();
        }
    }

    @Then("Verify text {string} is displayed")
    public void verifyTextIsDisplayed(String categoryText) {
        if (categoryText.contains("category")) {
            Assert.assertEquals(new ProductsPage().verifyCategoryText(), categoryText, "Error");
        } else if (categoryText.contains("WOMEN - DRESS")) {
            Assert.assertEquals(new ProductsPage().verifyWomenCategoryText(), categoryText, "Error");
        } else if (categoryText.contains("MEN - TSHIRTS")) {
            Assert.assertEquals(new ProductsPage().verifyMenCategoryText(), categoryText, "Error");
        } else if (categoryText.equalsIgnoreCase("BRAND")) {
            Assert.assertEquals(new ProductsPage().verifyBrandCategoryText(), categoryText, "Error");
        } else if (categoryText.contains("POLO PRODUCTS")) {
            Assert.assertEquals(new ProductsPage().verifyPoloBrandCategoryText(), categoryText, "Error");
        } else if (categoryText.contains("H&M PRODUCTS")) {
            Assert.assertEquals(new ProductsPage().verifyHnMBrandCategoryText(), categoryText, "Error");
        }
    }

    @And("Click {string} category")
    public void clickCategory(String selectCategory) {
        if (selectCategory.equalsIgnoreCase("WOMEN")) {
            new ProductsPage().clickOnWomenCategory();
        } else if (selectCategory.equalsIgnoreCase("MEN")) {
            new ProductsPage().clickOnMenCategory();
        }
    }

    @And("Click {string} category link under Women category")
    public void clickCategoryLinkUnderWomenCategory(String subCategory) {
        if (subCategory.equalsIgnoreCase("Dress")) {
            new ProductsPage().clickOnDressSubCat();
        }
    }

    @And("Click {string} category link under Men category")
    public void clickCategoryLinkUnderMenCategory(String subCategory) {
        if (subCategory.equalsIgnoreCase("Tshirts")) {
            new ProductsPage().clickOnTshirtSubCat();
        }
    }

    @And("Click {string}  brand category")
    public void clickBrandCategory(String subBrand) {
        if (subBrand.equalsIgnoreCase("POLO")) {
            new ProductsPage().clickOnPOLOBrand();
        } else if (subBrand.equalsIgnoreCase("h&m")) {
            new ProductsPage().clickOnHnMBrand();
        }
    }

    @And("Click remove button corresponding to particular product")
    public void clickRemoveButtonCorrespondingToParticularProduct(DataTable removeProduct) {
        for (Map<String, String> data : removeProduct.asMaps(String.class, String.class)) {
            new CheckoutPage().clickOnRemoveProduct(data.get("product"));
            new ProductsPage().clickOnViewCartOnMainMenu();
        }
    }

    @And("Click on {string} button on main menu")
    public void clickOnViewCartButtonOnMainMenu(String viewCartOnMainMenu) {
        new ProductsPage().clickOnViewCartOnMainMenu();
    }

    @Then("Verify that products are visible in cart")
    public void verifyThatProductsAreVisibleInCart() { //scenario 20
    }

    @And("Enter product names in search input and click search and add product to cart")//datatable
    public void enterProductNamesInSearchInputAndClickSearchAndAddProductToCart(DataTable searchData) throws InterruptedException {
        for (Map<String, String> searchp : searchData.asMaps(String.class, String.class)) {
            new ProductsPage().enterProductName(searchp.get("product"));
            new ProductsPage().clickOnSearchButton();
            new ProductsPage().viewProductForSelectedProduct(searchp.get("product"));
            new CheckoutPage().clickOnAddToCartButton();
            new ProductsPage().clickOnContinueAfterAddToCart();
            new HomePage().clickOnProductsLink();
        }
    }
            //scenario 20
    @Then("Verify that product names are visible in cart after login as well") // verify all products in cart with datatable
    public void verifyThatProductNamesAreVisibleInCartAfterLoginAsWell(DataTable cartData) {
        for (Map<String ,String > addedToCart : cartData.asMaps(String.class, String.class)){
           Assert.assertEquals(new ProductsPage().verifyProductIsInCartAfterLogin(addedToCart.get("product")),addedToCart.get("product") , "Error");
            System.out.println(addedToCart.get("product"));
        }
    }

    @And("Enter {string}, {string} and {string}")
    public void enterAnd(String name, String email, String reviewComment) {
        new ContactUsPage().writeAReview(name, email,reviewComment);
    }

    @Then("Verify success message {string} in product page")
    public void verifySuccessMessageThankYouForYourReviewInProductPage(String reviewThankYou) {
       Assert.assertEquals(new ContactUsPage().verifyThankyouForReview(), reviewThankYou, "Error");
    }

    @And("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        new ProductsPage().scrollToRecommendedItems();
    }

    @And("Get all recommended products names")
    public void getAllRecommendedProductsNames() {
        new ProductsPage().getAllRecommendedProducts();
    }



    @Then("Verify that the delivery {string} is same address filled at the time registration of account")
    public void verifyThatTheDeliveryIsSameAddressFilledAtTheTimeRegistrationOfAccount(String deliveryAddress) {
        Assert.assertEquals(new CheckoutPage().verifyDeliveryAddress(),deliveryAddress,"Error" );
    }

    @Then("Verify that the billing {string} is same address filled at the time registration of account")
    public void verifyThatTheBillingIsSameAddressFilledAtTheTimeRegistrationOfAccount(String billingAddress) {
        Assert.assertEquals(new CheckoutPage().verifyBillingAddress(),billingAddress,"Error" );
    }

    @Then("Verify invoice is downloaded successfully")
    public void verifyInvoiceIsDownloadedSuccessfully() {
        Assert.assertTrue(new CheckoutPage().verifyFileDownloaded());
    }

    @When("Click {string} button on model window")
    public void clickSignupLoginButtonOnModelWindow(String signupfromModelWindow) {
        new ProductsPage().clickOModelWindowSignORLogin();
    }

    @And("Add {string} to cart")
    public void addToCart(String selectProduct) throws InterruptedException {
        new ProductsPage().clickOnProduct(selectProduct);
    }

    @And("Click on any Recommended product")
    public void clickOnAnyRecommendedProduct(DataTable cartData1) {
            for (Map<String ,String > addedToCart : cartData1.asMaps(String.class, String.class)){
                new ProductsPage().clickOnAnyRecommendedItem(addedToCart.get("product"));
            }
        }
        }


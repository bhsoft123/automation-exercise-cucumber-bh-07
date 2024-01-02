package com.automationexercise.steps;

import com.automationexercise.pages.ContactUsPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsPage;
import com.automationexercise.pages.TestCasesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class VerifyHomePageMenuSteps {

    @And("Enter {string}, {string}, {string} and {string}")
    public void enterAnd(String fullname, String email, String subject, String message) {
        new ContactUsPage().enterDetailsForContactUs(fullname,email,subject,message);
    }

    @And("Upload file")
    public void uploadFile() {
        new ContactUsPage().clickOnUploadFile();
    }

    @Then("Verify that user is navigated to {string} page successfully")
    public void verifyThatUserIsNavigatedToPageSuccessfully(String testCasesText) {
        if (testCasesText.contains("TEST CASES")) {
            Assert.assertEquals(new TestCasesPage().verifyTestCasesText(), testCasesText, "Error");
        } else if (testCasesText.contains("PRODUCTS")) {
            Assert.assertEquals(new ProductsPage().verifyProductsText(), testCasesText, "Error");
        }
    }
    @And("Verify that user is navigated to {string} page")
    public void verifyThatUserIsNavigatedToLoginPage(String home) {
        Assert.assertEquals(new HomePage().isHomePageVisible(), "https://automationexercise.com/");
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
    }

    @And("Click on {string} of first product")//scenario 8
    public void clickOnViewProductOfFirstProduct(String viewProduct) {
       new ProductsPage().clickOnFirstViewProduct();
    }

    @And("Verify that user is navigated to product detail page")
    public void verifyThatUserIsNavigatedToProductDetailPage() {
        Assert.assertEquals(new ProductsPage().verifyProductDetailsPage(), "Blue Top", "Error");
    }

    @Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
    }
    @And("Enter {string} in search input")
    public void enterInSearchInput(String product) {
        new ProductsPage().enterProductName(product);
    }

    @And("Click search button")
    public void clickSearchButton() throws InterruptedException {
        new ProductsPage().clickOnSearchButton();
        Thread.sleep(2000);
    }

    @Then("Verify SEARCHED PRODUCTS {string} is visible")
    public void verifySEARCHEDPRODUCTSIsVisible(String verifySearchedProduct) {
        System.out.println(verifySearchedProduct);
        Assert.assertEquals(new ProductsPage().verifySearchedProduct(), verifySearchedProduct, "Error");
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
    }

    @Then("Verify text {string}")
    public void verifyTextSUBSCRIPTION(String subscriptionText) {
        Assert.assertEquals(new ProductsPage().verifySubscriptionText(), subscriptionText, "Error");
    }

    @And("Enter email address {string} in input")
    public void enterEmailAddressInInput(String email) {
        new ProductsPage().enterEmailInSubscriptionBox(email);
    }

    @Then("Verify success message {string} is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String subscptnMessage) {
        //        How to locate disappearing message on Selenium?
        //3 Answers
        //Open the previous page before the notification.
        //Press "Ctrl+Shift+c", Navigate to "sources" tab.
        //Do the manual step to generate the notification, which is going to hide in few seconds.
        //Press "F8". Page load scripts will be paused.
        //Then inspect the element as usual and fetch the xpath at your convenience.
        Assert.assertEquals(new ProductsPage().verifySuscriptionSuccessMessage(), subscptnMessage, "Error");
    }

    @Then("Verify that detail is visible category, price, availability, condition, brand")
    public void verifyThatDetailIsVisibleCategoryPriceAvailabilityConditionBrand() {
        Assert.assertTrue(new ProductsPage().verifyProductDetailsVisibile(),"Error");
    }

    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        new ProductsPage().scrollDowntoSubscription();
    }

    @Then("Verify that page is scrolled up and {string} text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String scrollUPVerificationMsg) {
        Assert.assertEquals(new HomePage().verifyScrolledUpMsg(),scrollUPVerificationMsg, "Error");
    }

    @And("Scroll up page to top")
    public void scrollUpPageToTop() {
        new ProductsPage().scrollup();
    }

    @And("Verify that user is navigated to home page after sumbmission")
    public void verifyThatUserIsNavigatedToHomePageAfterSumbmission() {
        Assert.assertEquals(new HomePage().isHomePageVisible(), "Automation Exercise - Contact Us");
    }
}

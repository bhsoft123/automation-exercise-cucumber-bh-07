package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterAndLoginSteps {
    @Given("I am on Home Page")
    public void iAmOnHomePage() {
    }

    @And("I can verify that home page is visible successfully")
    public void iCanVerifyThatHomePageIsVisibleSuccessfully() {

        Assert.assertEquals(new HomePage().isHomePageVisible(), "Automation Exercise","Error");
    }

    @When("Click {string} button")
    public void clickSignupLoginButton(String loginCommand) throws InterruptedException {
        System.out.println(loginCommand);
        if (loginCommand.equalsIgnoreCase("Signup / Login")) {
            new HomePage().clickOnSignupOrLoginLink();
        } else if (loginCommand.equalsIgnoreCase("Signup")) {
            new HomePage().clickOnSignupButton();
        } else if (loginCommand.equalsIgnoreCase("Login")) {
            new HomePage().clickOnLoginButton();
        } else if (loginCommand.equalsIgnoreCase("Create Account")) {
            new RegisterPage().clickOnCreateAccountButton();
        } else if (loginCommand.equalsIgnoreCase("Continue")) {
            new MyAccountPage().clickOnContinueButton();
        } else if (loginCommand.equalsIgnoreCase("Delete Account")) {
            new MyAccountPage().clickOnDeleteAccountButton();
        } else if (loginCommand.equalsIgnoreCase("Logout")) {
            new MyAccountPage().clickOnLogoutLink();
        } else if (loginCommand.equalsIgnoreCase("Contact us")) {
            new HomePage().clickOnContactUsForm();
        } else if (loginCommand.equalsIgnoreCase("Submit")) {
            new ContactUsPage().clickOnContactUsSubmitButton();
        } else if (loginCommand.equalsIgnoreCase("Home")) {
            new ContactUsPage().clickOnHomeButton();
        } else if (loginCommand.equalsIgnoreCase("Products")) {
            new HomePage().clickOnProductsLink();
        } else if (loginCommand.equalsIgnoreCase("Test Cases")) {
            new HomePage().clickOnTestCasesLink();
        } else if (loginCommand.equalsIgnoreCase("arrow")) {
            new ProductsPage().clickOnArrowButtonOnSubscription();
        } else if (loginCommand.equalsIgnoreCase("cart")) {
            //new HomePage().clickOnCartLink();
            new ProductsPage().clickOnViewCartOnMainMenu();
        } else if (loginCommand.equalsIgnoreCase("continue shopping")) {
            new ProductsPage().clickOnContinueAfterAddToCart();
        } else if (loginCommand.equalsIgnoreCase("View Cart")) {
            Thread.sleep(2000);
            new ProductsPage().clickOnViewCartonModel();
        } else if (loginCommand.equalsIgnoreCase("add to cart")) {
            new ProductsPage().clickOnAddToCartButton();
        } else if (loginCommand.equalsIgnoreCase("Proceed To Checkout")) {
            new CheckoutPage().clickOnProceedToCheckOutButton();
        } else if (loginCommand.equalsIgnoreCase("Place Order")) {
            new CheckoutPage().clickOnPlaceOrderButton();
        } else if (loginCommand.equalsIgnoreCase("Pay and Confirm Order")) {
            new CheckoutPage().clickOnPayAndConfirmOrderButton();
        } else if (loginCommand.equalsIgnoreCase("Download Invoice")) {
            new CheckoutPage().downloadInvoice();
        }
    }
    @Then("Verify that {string} is visible")
    public void verifyThatIsVisible(String text) {
        System.out.println("Verify text " +text);
        if (text.contains("New User Signup!")) {
            Assert.assertEquals(new HomePage().verifyNewUserSignupText(),text,text + " text not displayed");
        } else if(text.contains("Login to your account")){
            Assert.assertEquals(new HomePage().verifyLoginToYourAccText(), text, "Error");
        } else if (text.contains("ENTER ACCOUNT INFORMATION")) {
            Assert.assertEquals(new RegisterPage().verifyEnterAccInfoText(),text, "Not Navigated to " + text + " page");
        } else if (text.contains("ACCOUNT CREATED!")) {
            Assert.assertEquals(new MyAccountPage().verifyAccountCreatedText(), text, "Not Navigated to " + text + " page");
        } else if (text.contains("Logged in as ")) {
            Assert.assertEquals(new MyAccountPage().verifyLoggedinAsUserText(), "Logged in as Kavita Patrick", "Not Navigated to " + text + " page");
        } else if (text.contains("ACCOUNT DELETED!")) {
            Assert.assertEquals(new MyAccountPage().verifyAccountDeletedText(), text, "Not Navigated to " + text + " page");
        } else if( text.contains("GET IN TOUCH")){
            Assert.assertEquals(new ContactUsPage().verifyGetInToughText(), text, "Error");
        } else if( text.contains("submitted successfully.")){
            Assert.assertEquals(new ContactUsPage().verifyContctFormSubmittedSuccessfully(), text, "Error");
        } else if( text.contains("WRITE YOUR REVIEW")){
            Assert.assertEquals(new ContactUsPage().verifyWriteReviewText(), text, "Error");
        } else if( text.contains("RECOMMENDED ITEMS")){
            Assert.assertEquals(new ProductsPage().verifyRecommendedItemsText(), text, "Error");
        }
    }

    @And("Enter FullName {string} and Email{string}")
    public void enterFullNameAndEmail(String fullName, String email) {
        new HomePage().enterFullNameAndEmail(fullName,email);
    }

    @And("Fill details {string},{string},{string},{string},{string},{string}, {string}")
    public void fillDetails(String title, String fullName, String email, String password, String day, String month, String year) {
        new RegisterPage().fillAccountinformation(title,fullName,email,password,day,month,year);

    }

    @And("Select checkbox {string}")
    public void selectCheckboxSignUpForOurNewsletter(String checkboxOptions) {
        if(checkboxOptions.contains("newsletter")){
            new RegisterPage().clickOnSignupNewsletterCheckbox();
        } else if (checkboxOptions.contains("Receive special"))
            new RegisterPage().clickOnReceiveSpecialOffersCheckbox();
    }

    @And("Fill details {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void fillDetails(String firstname, String lastname, String company, String address, String address2, String country, String state, String city, String zipcode, String mobilenumber) {
        new RegisterPage().enterPersonalDetails(firstname,lastname,company,address,address2,country,state,city,zipcode,mobilenumber);
    }

    @Then("Enter correct email {string} and password {string}")
    public void enterCorrectEmailAndPassword(String email, String password) {
        new HomePage().enterCorrectEmailAndPassword(email,password);
    }

    @And("Enter incorrect email {string} and {string}")
    public void enterIncorrectEmailAnd(String incorrectEmail, String password) {
        new HomePage().enterIncorrectEmailAndPassword(incorrectEmail,password);
    }

    @Then("Verify error {string} is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String incorrectEmailerror) {
        if (incorrectEmailerror.contains("incorrect")) {
            Assert.assertEquals(new HomePage().verifyIncorrectMessage(), incorrectEmailerror, "Error");
        } else if (incorrectEmailerror.contains("already")) {
            Assert.assertEquals(new HomePage().verifyEmailAlreadyExists(), incorrectEmailerror, "Error");
        }
    }
    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        System.out.println("user is navigated to home page");
        //Assert.assertEquals(new HomePage().gettitleOfPage(), "Automation Exercise - Signup / Login","Error");

    }

    @Then("Verify that {string} {string} is visible")
    public void verifyThatIsVisible(String loggInAs, String fullName) {
        Assert.assertEquals(new MyAccountPage().verifyLoggedinAsUserText(), "Logged in as "+fullName, "Error");
    }
}

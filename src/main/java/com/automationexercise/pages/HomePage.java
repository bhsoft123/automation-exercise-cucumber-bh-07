package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    WebElement homepageText;

    @CacheLookup
    @FindBy(css = "a[href='/login']")
    WebElement signupOrLoginlinkelement;

    @CacheLookup
    @FindBy(css = "div[class='signup-form'] h2")
    WebElement newUserSignupTextElement;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement fullnameElement;

    @CacheLookup
    @FindBy(css = "input[data-qa='signup-email']")
    WebElement emailElement;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signupButtonElement;

    @CacheLookup
    @FindBy(css = "div[class='login-form'] h2")
    WebElement loginToYourAccTextElement;

    @CacheLookup
    @FindBy(css = "input[data-qa='login-email']")
    WebElement emailLoginElement;

    @CacheLookup
    @FindBy(css = "input[placeholder='Password']")
    WebElement passwordLoginElement;

    @CacheLookup
    @FindBy(css = "button[data-qa='login-button']")
    WebElement loginButtonElement;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement incorrectEmailMessageElement;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAlreadyExistsElement;

    @CacheLookup
    @FindBy(css = "a[href='/contact_us']")
    WebElement contactUsFormElement;

    @CacheLookup
    @FindBy(css = "a[href='/test_cases']")
    WebElement testCasesLinkElement;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsLinElement;

    @CacheLookup
    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement cartLinkElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-6']//h2")
    WebElement fullfledgedPrctcMsgTextElement;

    public String isHomePageVisible() {
        System.out.println(driver.getCurrentUrl());
        return driver.getTitle();
    }
    public String gettitleOfPage(){
        return driver.getTitle();
    }
    public void clickOnSignupOrLoginLink(){
        log.info("Home page is visible :" + homepageText.toString());
        clickOnElement(signupOrLoginlinkelement);
    }
    public String verifyNewUserSignupText(){
        return getTextFromElement(newUserSignupTextElement);
    }

    public void enterFullNameAndEmail(String fullName,String email){
        sendTextToElement(fullnameElement, fullName);
        sendTextToElement(emailElement, email);
    }
    public void clickOnSignupButton(){
        clickOnElement(signupButtonElement);
    }

    public String verifyLoginToYourAccText(){
        return getTextFromElement(loginToYourAccTextElement);
    }
    public void enterCorrectEmailAndPassword(String email,String password){
        sendTextToElement(emailLoginElement, email);
        sendTextToElement(passwordLoginElement, password);
        log.info("Entering correct email & password : " +emailLoginElement.toString());
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButtonElement);
        log.info("clicking on login button : " +loginButtonElement.toString());
    }

    public void enterIncorrectEmailAndPassword(String incorrectEmail,String password){
        sendTextToElement(emailLoginElement, incorrectEmail);
        sendTextToElement(passwordLoginElement, password);
        log.info("Entering incorrect email & password: " +emailLoginElement.toString());
    }
    public String verifyIncorrectMessage(){
        return getTextFromElement(incorrectEmailMessageElement);
    }
    public String verifyEmailAlreadyExists(){
        return getTextFromElement(emailAlreadyExistsElement);
    }
    public void clickOnContactUsForm(){
        clickOnElement(contactUsFormElement);
    }
    public void clickOnTestCasesLink(){
        clickOnElement(testCasesLinkElement);
    }
    public void clickOnProductsLink(){
        clickOnElement(productsLinElement);
    }
    public void clickOnCartLink(){
        clickOnElement(cartLinkElement);
    }
    public String verifyScrolledUpMsg(){
        return getTextFromElement(fullfledgedPrctcMsgTextElement);
    }
}


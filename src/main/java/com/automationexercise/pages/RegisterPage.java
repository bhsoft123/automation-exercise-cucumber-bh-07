package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccInfoTextElement;

    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement titleMrElement;

    @CacheLookup
    @FindBy(id = "id_gender2")
    WebElement titleMrsElement;

    @CacheLookup
    @FindBy(id ="name")
    WebElement fullnameElement;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordElement;

    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement dayElement;

    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthElement;

    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearElement;

    @CacheLookup
    @FindBy(id= "newsletter")
    WebElement singupCheckboxElement;

    @CacheLookup
    @FindBy(id = "optin")
    WebElement specialOffersCheckboxElement;

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstnameElement;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastnameElement;

    @CacheLookup
    @FindBy(id = "company")
    WebElement companyElement;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address1Element;

    @CacheLookup
    @FindBy(id = "address2")
    WebElement address2Element;

    @CacheLookup
    @FindBy(id = "country")
    WebElement countryElement;

    @CacheLookup
    @FindBy(id = "state")
    WebElement stateElement;

    @CacheLookup
    @FindBy(id = "city")
    WebElement cityElement;

    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement zipcodeElement;

    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobilenumberElement;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountButtonElement;

    public String verifyEnterAccInfoText() {
        log.info("verify Enter Account Info text: " + enterAccInfoTextElement.toString());
        return getTextFromElement(enterAccInfoTextElement);
    }
    public void fillAccountinformation(String title,String fullName,String email,String password,String day,String month,String year){
        if(title.equalsIgnoreCase("Mrs")){
            clickOnElement(titleMrsElement);
        } else if(title.equalsIgnoreCase("Mr")){
            clickOnElement(titleMrElement);
        }
        fullnameElement.clear();
        sendTextToElement(fullnameElement, fullName);
        //sendTextToElement(emailElement, title);
        sendTextToElement(passwordElement, password);
        selectByVisibleTextFromDropDown(dayElement, day);
        selectByVisibleTextFromDropDown(monthElement,month);
        selectByVisibleTextFromDropDown(yearElement,year);
    }

    public void clickOnSignupNewsletterCheckbox(){
        clickOnElement(singupCheckboxElement);
    }
    public void clickOnReceiveSpecialOffersCheckbox(){
        clickOnElement(specialOffersCheckboxElement);
    }
    public void enterPersonalDetails(String firstname, String lastname, String company, String address, String address2, String country, String state, String city, String zipcode, String mobilenumber){
        sendTextToElement(firstnameElement, firstname);
        sendTextToElement(lastnameElement, lastname);
        sendTextToElement(companyElement, company);
        sendTextToElement(address1Element, address);
        sendTextToElement(address2Element, address2);
        selectByVisibleTextFromDropDown(countryElement, country);
        sendTextToElement(stateElement, state);
        sendTextToElement(cityElement, city);
        sendTextToElement(zipcodeElement,zipcode);
        sendTextToElement(mobilenumberElement, mobilenumber);
    }
        public void clickOnCreateAccountButton(){
        clickOnElement(createAccountButtonElement);
    }
}


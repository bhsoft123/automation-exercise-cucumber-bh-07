package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class);

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement verifyAccountCreatedTextElement;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonElement;

    @CacheLookup
    @FindBy(css = "div.header-middle div.container div.row div.col-sm-8 div.shop-menu.pull-right ul.nav.navbar-nav li:nth-child(10) > a:nth-child(1)")
    WebElement loginAsUsernameElement;

    @CacheLookup
    @FindBy(css = "a[href='/delete_account']")
    WebElement deleteAccounElement;

    @CacheLookup
    @FindBy(css = "h2[class='title text-center'] b")
    WebElement accountDeletedTextElement;

    @CacheLookup
    @FindBy(css = "a[href='/logout']")
    WebElement logoutlinkElement;

    public String verifyAccountCreatedText(){
        log.info("Home page is visible :" + verifyAccountCreatedTextElement.toString());
        return getTextFromElement(verifyAccountCreatedTextElement);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButtonElement);
    }
    public String verifyLoggedinAsUserText(){
        log.info("verify logged in as user text : " +loginAsUsernameElement.toString());
        return getTextFromElement(loginAsUsernameElement);
    }
    public void clickOnDeleteAccountButton(){
        clickOnElement(deleteAccounElement);
    }
    public String verifyAccountDeletedText(){
        return getTextFromElement(accountDeletedTextElement);
    }
    public void clickOnLogoutLink(){
        clickOnElement(logoutlinkElement);
    }
}

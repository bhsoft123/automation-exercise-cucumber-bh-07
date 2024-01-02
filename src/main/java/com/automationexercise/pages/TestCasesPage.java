package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Test Cases']")
    WebElement testCasesTextElement;

    public String verifyTestCasesText(){
        log.info("verify Test Cases Text : " + testCasesTextElement.toString());
        return getTextFromElement(testCasesTextElement);
    }
}

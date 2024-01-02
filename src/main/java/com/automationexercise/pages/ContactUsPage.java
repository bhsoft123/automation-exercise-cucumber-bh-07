package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchTextElement;

    @CacheLookup
    @FindBy(css = "input[placeholder='Name']")
    WebElement nameElement;

    @CacheLookup
    @FindBy(css = "input[placeholder='Email']")
    WebElement emailElement;

    @CacheLookup
    @FindBy(css = "input[placeholder='Subject']")
    WebElement subjectElement;

    @CacheLookup
    @FindBy(css = "#message")
    WebElement messageElement;

    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement chooseFileButtonElement;

    @CacheLookup
    @FindBy(css = ".status.alert.alert-success")
    WebElement contactUsSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement homeButtonElement;

    @CacheLookup
    @FindBy(css = "a[href='#reviews']")
    WebElement writeReviewTextElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='tab-content']//div//div//input[@id='name']")
    WebElement nameOnReviewPage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='tab-content']//div//div//input[@id='email']")
    WebElement emailOnReviewPage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='tab-content']//div//div//textarea[@id='review']")
    WebElement messageOnReviewElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='tab-content']//div//div//button[@id='button-review']")
    WebElement submitButtonElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-12']//form//div//div//div[@class='alert-success alert']")
    WebElement thankYouForReviewMsgElement;


    public void enterDetailsForContactUs(String fullname, String email, String subject, String message){
        sendTextToElement(nameElement, fullname);
        sendTextToElement(emailElement, email);
        sendTextToElement(subjectElement, subject);
        sendTextToElement(messageElement, message);
        log.info("Sending details for Contact us form : " +nameElement.toString());
    }
    public String verifyGetInToughText(){
        log.info("Verify Get in touch text : " +getInTouchTextElement.toString());
        return getTextFromElement(getInTouchTextElement);
    }
    public void clickOnUploadFile(){
        WebElement upload = driver.findElement(By.cssSelector("input[value='Submit']"));
        upload.sendKeys("C:/Users/patel/OneDrive/Desktop/automation exercise/automation.docx"); //Uploading the file using sendKeys
        driver.switchTo().alert().accept();
        log.info("Clickin on Upload File : ");
    }
    public void clickOnContactUsSubmitButton(){
        clickOnElement(submitButtonElement);
        log.info("Click on Contact us Form Submit button : " +submitButtonElement.toString());
    }
    public String verifyContctFormSubmittedSuccessfully(){
        log.info("Verify Contact Form Submitted Successfully Text : " +contactUsSuccessMessage.toString());
        return getTextFromElement(contactUsSuccessMessage);
    }
    public void clickOnHomeButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(homeButtonElement);
        log.info("Clicking on home button : " +homeButtonElement.toString());
    }

    public String verifyWriteReviewText(){
        return getTextFromElement(writeReviewTextElement);
    }
    public void writeAReview(String name,String email,String review){
        sendTextToElement(nameOnReviewPage, name);
        sendTextToElement(emailOnReviewPage, email);
        sendTextToElement(messageOnReviewElement, review);
        log.info("Sending Text to Write a Review : " +messageOnReviewElement.toString());
    }
    public String verifyThankyouForReview(){
        log.info("Verify Thank you for Review Text : " +getInTouchTextElement.toString());
        return getTextFromElement(thankYouForReviewMsgElement);
    }
}

package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.io.File;
import java.util.List;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement cartPageIsDisplayedElement;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckOutButtonElement;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetailsTextElement;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrderTextElement;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement addCommentsElement;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderButtonElement;

    @CacheLookup
    @FindBy (xpath = "//input[@name='name_on_card']")
    WebElement nameOnCardField;

    @CacheLookup
    @FindBy (xpath = "//input[@name='card_number']")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='ex. 311']")
    WebElement CVCField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='MM']")
    WebElement expirationMonthField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='YYYY']")
    WebElement expirationYearField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement payAndConfirmOrderButtonElement;

    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement paymentSuccessMsgTextElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='modal-content']")
    WebElement switchToModelWindow;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerOrLoginBtnCheckelement;

    @CacheLookup
    @FindBy(id = "quantity")
    WebElement quantityFieldElement;

    @CacheLookup
    @FindBy(css = "button[type='button']")
    WebElement addToCartButtonElement;

    @CacheLookup
    @FindBy(xpath = "//ul[@id = 'address_delivery']/li[4]")
    WebElement verifyAddressElement;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_address1 address_address2'][normalize-space()='Colours Street']")
    WebElement verifyBillingElement;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    WebElement invoiceDownloadElement;

    public String verifyCartPageIsDisplyd(){        //scenario 15 & 16
        log.info("Cart page is displayed : " +cartPageIsDisplayedElement.toString());
        return getTextFromElement(cartPageIsDisplayedElement);
    }
    public void clickOnProceedToCheckOutButton(){
        clickOnElement(proceedToCheckOutButtonElement);
        log.info("Proceed to checkout : " +proceedToCheckOutButtonElement.toString());
    }
    public String getAddressDetailsText(){
        log.info("Verify Address details text : " +addressDetailsTextElement.toString());
        return getTextFromElement(addressDetailsTextElement);
    }
    public String getReviewYourOrderText(){
        log.info("Verify reveiw your order text : " +reviewYourOrderTextElement.toString());
        return getTextFromElement(reviewYourOrderTextElement);
    }
    public void enterComments(String addComment){
        sendTextToElement(addCommentsElement, addComment);
        log.info("Enter comments: " +addCommentsElement.toString());
    }
    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderButtonElement);
        log.info("Clicking on Place order button : " +placeOrderButtonElement.toString());
    }
    public void enterPaymentDetails(String name,String cardNumber,String cvc,String expiryMonth,String expireyYear){
        sendTextToElement(nameOnCardField, name);
        log.info("Sending " + name + " to Name on Card field : " + nameOnCardField.toString());
        sendTextToElement(cardNumberField, cardNumber);
        log.info("Sending " + cardNumber + " to Card Number : " + cardNumberField.toString());
        sendTextToElement(CVCField, cvc);
        log.info("Sending " + cvc + " to CVC field : " + CVCField.toString());
        sendTextToElement(expirationMonthField, expiryMonth);
        log.info("Sending " + expiryMonth + " to Month field : " + expirationMonthField.toString());
        sendTextToElement(expirationYearField, expireyYear);
        log.info("Sending " + expireyYear + " to Year field : " + expirationYearField.toString());
    }
    public void clickOnPayAndConfirmOrderButton(){
        clickOnElement(payAndConfirmOrderButtonElement);
        log.info("Click on pay and confirm button : " +payAndConfirmOrderButtonElement.toString());
    }
    public String verifyPaymentSuccessMsg(){
        log.info("Verify payment successful message : " +paymentSuccessMsgTextElement.toString());
        return getTextFromElement(paymentSuccessMsgTextElement);
    }
    public void clickOnRegisterORLoginOnCheckoutWindow(){
        mouseHoverToElement(switchToModelWindow);
        clickOnElement(registerOrLoginBtnCheckelement);
        log.info("Clickin on Register or Login After checkout : " +registerOrLoginBtnCheckelement.toString());
    }
    public void clickOnRemoveProduct(String selectedProduct){ //scenario 17
        List<WebElement> productListinCart = driver.findElements(By.xpath("//td[@class='cart_description']//h4"));
        for(WebElement pr : productListinCart)
            if(pr.getText().equalsIgnoreCase(selectedProduct)){
                WebElement removeButton = driver.findElement(By.xpath("//td[@class='cart_description']//h4"+"//ancestor::tr//i"));
                System.out.println(removeButton.getText());
                removeButton.click();
                log.info("removing products from cart: " +removeButton.getText());
                break;
            }
        }
    public void sendDataValueProduct(String selectAProduct){
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-image-wrapper']//div//p"));
        for (WebElement pr : productList)
            if (pr.getText().equalsIgnoreCase(selectAProduct)) {
                mouseHoverToElement(pr);
                WebElement getADemo = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='product-image-wrapper']//div//a")).below(pr));
                WebElement viewProduct = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='product-image-wrapper']//div//ul")).below(getADemo));
                viewProduct.click();
                log.info("Hovering mouse over " + selectAProduct + " : " + productList.toString());
                break;
            }
    }
    public void sendDataValuQuantity(String quantity){
        quantityFieldElement.clear();
        sendTextToElement(quantityFieldElement, quantity);
        log.info("Sending quantity : " +quantityFieldElement.toString());
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButtonElement);
        log.info("Click on add to cart button : " +addToCartButtonElement.toString());
    }
    public String verifyDeliveryAddress(){
        log.info("Verify delivery address : " +verifyAddressElement.toString());
        return getTextFromElement(verifyAddressElement);
    }
    public String verifyBillingAddress(){
        log.info("Verify Billing Address : " +verifyBillingElement.toString());
        return getTextFromElement(verifyBillingElement);
    }
    public void downloadInvoice(){
        clickOnElement(invoiceDownloadElement);
        log.info("Downloading Invoice : " +invoiceDownloadElement.toString());
    }
    public boolean verifyFileDownloaded(){
        File f = new File("C:\\Users\\patel\\Downloads\\"+ "invoice.txt" );
        System.out.println("File downloaded: " +f.exists() +" file name :" +f.getName());
        System.out.println(f.canRead());
        log.info("Verify File Downloaded : " +f.getName());
        return f.exists();
    }
}


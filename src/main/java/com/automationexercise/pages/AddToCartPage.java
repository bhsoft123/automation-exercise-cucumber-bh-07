package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddToCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//td[@class = 'cart_quantity']/button")
    WebElement quantity;

    public String verifyProductsAddedToCart(String productName) {
        System.out.println("product to be added:" +productName);
        List<WebElement> productAddedToCartElement = driver.findElements(By.xpath("//td[@class='cart_description']/h4/a"));
        for (WebElement e : productAddedToCartElement) {
            if (e.getText().equalsIgnoreCase(productName)) {
                log.info("Product name: " +e.getText());
                break;
            }
        }   return productName;
    }
    public String verifyQuantityAddedToCart(String productAddedToCart){
            log.info("Getting quantity from shopping cart page : " +quantity.toString());
            return getTextFromElement(quantity);
    }
}
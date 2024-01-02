package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement productsTextElement;

    @CacheLookup
    @FindBy(css = "a[href='/product_details/1']")
    WebElement viewProductElement;

    @CacheLookup
    @FindBy(css = "div[class='product-information'] h2")
    WebElement productNameVerifyElement;

    @CacheLookup
    @FindBy(css = "div.container div.row div.col-sm-9.padding-right div.product-details div.col-sm-7 div.product-information > p:nth-child(3)")
    WebElement categoryDisplayedElement;

    @CacheLookup
    @FindBy(css = "#search_product")
    WebElement searchProductElement;

    @CacheLookup
    @FindBy(css = ".fa.fa-search")
    WebElement searchButtonElement;

    @CacheLookup
    @FindBy(css = "div[class='overlay-content'] p")
    WebElement searchedProductNameElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-overlay']//div[2]//a")
    WebElement overlayElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-image-wrapper']//div//p")
    WebElement searchedPRod;

    @CacheLookup
    @FindBy(css = "div[class='single-widget'] h2")
    WebElement subscriptionTextElement;

    @CacheLookup
    @FindBy(css = "#susbscribe_email")
    WebElement enterEmailInSubscriptionBoxElement;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    WebElement arrowButtonElement;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement arrowButtononSubscribedElement;


    @CacheLookup
    @FindBy(css = "div[class='footer-widget'] div[class='row']")
    WebElement footer;

    @CacheLookup
    @FindBy(xpath = "//footer[@id='footer']//div[@class='alert-success alert']")
    WebElement subscrptnSuccessMessageElement;

    @CacheLookup
    @FindBy(xpath = "//button[@id='subscribe']")
    WebElement subBoxClickElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='modal-content']")
    WebElement switchToModelWindow;

    @CacheLookup
    @FindBy(xpath = "//div[@class='modal-content']//div//button")
    WebElement continueAfterAddToCartElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='modal-content']//div//a")
    WebElement viewCartonModelElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='modal-content']//a")
    WebElement signupOrLoginFromModelWindowElement;

    @CacheLookup
    @FindBy(css = "div[class='product-information'] h2")
    WebElement productNameDisplayedElement;

    @CacheLookup
    @FindBy(id = "quantity")
    WebElement quantityFieldElement;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButtonElement;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement categoryTextElement;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenCategoryTextElement;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    WebElement menCategoryTextElement;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategoryElement;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menCategoryElement;

    @CacheLookup
    @FindBy(css = "a[href='/category_products/1']")
    WebElement dressSubCatElement;

    @CacheLookup
    @FindBy(css = "a[href='/category_products/3']")
    WebElement tshirtSubCatElement;

    @CacheLookup
    @FindBy(css = "div[class='brands_products'] h2")
    WebElement brandTextElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='brands-name']//a[@href='/brand_products/Polo']")
    WebElement poloBrandElement;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement poloBrandCategoryTextElement;

    @CacheLookup
    @FindBy(css = "a[href='/brand_products/H&M']")
    WebElement hnmbrandElement;

    @CacheLookup
    @FindBy(css = ".title.text-center")
    WebElement hnmBrandTextElement;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']")
    WebElement cartOnMainMenuElement;

    @CacheLookup
    @FindBy(css = "div[class='recommended_items'] h2[class='title text-center']")
    WebElement recommendedTextElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='recommended_items']//div[1]/p")
    List<WebElement> recommendedPr;

    @CacheLookup
    @FindBy(xpath = "//a[@class='right recommended-item-control']//i[@class='fa fa-angle-right']")
    WebElement clickOnNextArrowRecommPrelement;

    @CacheLookup
    @FindBy (xpath = "//div[@class='product-image-wrapper']/div/div/p")
    List<WebElement> productList;


    public String verifyProductsText() {
        return getTextFromElement(productsTextElement);
    }

    public void clickOnFirstViewProduct() { //scenario 8
        clickOnElement(viewProductElement);
        log.info("Click on First view product : " +viewProductElement.toString());
    }
    public String verifyProductDetailsPage() {
        waitUntilVisibilityOfElementLocated(By.xpath("//a[normalize-space()='Write Your Review']"), 5);
        log.info("Getting Product Details Page URL : ");
        System.out.println(driver.getCurrentUrl());
        return getTextFromElement(productNameVerifyElement);
    }

    public boolean verifyProductDetailsVisibile() {
        return categoryDisplayedElement.isDisplayed();
    }

    public void enterProductName(String searchProduct) {
        sendTextToElement(searchProductElement, searchProduct);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButtonElement);
    }

    public String verifySearchedProduct() {     //scenario 9
        mouseHoverToElement(searchedPRod);
        return getTextFromElement(searchedProductNameElement);
    }
    public String verifySubscriptionText() {
        mouseHoverToElement(footer);
        return getTextFromElement(subscriptionTextElement);
    }

    public void enterEmailInSubscriptionBox(String email) {
        sendTextToElement(enterEmailInSubscriptionBoxElement, email);
        clickOnElement(subBoxClickElement);
    }

    public void clickOnArrowButtonOnSubscription() {
        clickOnElement(arrowButtononSubscribedElement);
        log.info("Clicking on subscription after entering email " + arrowButtononSubscribedElement.toString());

    }

    public String verifySuscriptionSuccessMessage() {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert-success alert']")));
        log.info("verifying success message after subscribing :" + subscrptnSuccessMessageElement.getText());
        return getTextFromElement(subscrptnSuccessMessageElement);
    }

    public void clickOnContinueAfterAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueAfterAddToCartElement);
    }
    public void clickOModelWindowSignORLogin(){
        mouseHoverToElementAndClick(switchToModelWindow);
        clickOnElement(signupOrLoginFromModelWindowElement);
    }

    public void clickOnViewCartonModel() throws InterruptedException {//scenario 15,16
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(viewCartonModelElement));
        clickOnElement(viewCartonModelElement);
    }

    public void viewProductForSelectedProduct(String selectAProduct) {          //scenario 13 view product
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-image-wrapper']//div//p"));
        for (WebElement pr : productList)
            if (pr.getText().equalsIgnoreCase(selectAProduct)) {
                mouseHoverToElement(pr);
                WebElement getADemo = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='product-image-wrapper']//div//a")).below(pr));
                WebElement viewProduct = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='product-image-wrapper']//div//ul")).below(getADemo));
                viewProduct.click();
                log.info("Hovering mouse over view product of " + selectAProduct + " : " + productList.toString());
                break;
            }
    }
    public void clickOnProduct(String selectAProduct) throws InterruptedException {     //scenario 12,15,16 addtocart
        for (WebElement pr : productList)
            if (pr.getText().equalsIgnoreCase(selectAProduct)) {
                log.info("Product located : " +pr.getText());
                mouseHoverToElementAndClick(pr);
                log.info("mouse hover to : " + pr.getText());
                Thread.sleep(1000);
                try {
                    WebElement getADemo = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='product-image-wrapper']//div//a")).below(pr));
                    getADemo.click();
                    log.info("add products to cart from list : " + overlayElement.toString());
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@class='product-image-wrapper']//div//a")));
                }
                break;
        }
    }

    public String verifyProductDetailsPageIsOpened(String selectAProduct) {      //scenario 13
        return getTextFromElement(productNameDisplayedElement);
    }

    public void changeQuantity(String quantity) {
        quantityFieldElement.clear();
        sendTextToElement(quantityFieldElement, quantity);
        log.info("Increased quantity to " + quantity + " : " + quantityFieldElement.toString());
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButtonElement);
    }

    public String verifyCategoryText() {
        return getTextFromElement(categoryTextElement);
    }  //scenario 18

    public String verifyWomenCategoryText() {
        return getTextFromElement(womenCategoryTextElement);
    }

    public String verifyMenCategoryText() {
        return getTextFromElement(menCategoryTextElement);
    }

    public void clickOnWomenCategory() {
        clickOnElement(womenCategoryElement);
    }

    public void clickOnMenCategory() {
        clickOnElement(menCategoryElement);
    }

    public void clickOnDressSubCat() {
        clickOnElement(dressSubCatElement);
    }

    public void clickOnTshirtSubCat() {
        clickOnElement(tshirtSubCatElement);
    }

    public String verifyBrandCategoryText() {
        return getTextFromElement(brandTextElement);
    }

    public void clickOnPOLOBrand() {
        clickOnElement(poloBrandElement);
    }

    public String verifyPoloBrandCategoryText() {
        return getTextFromElement(poloBrandCategoryTextElement);
    }

    public void clickOnHnMBrand() {
        clickOnElement(hnmbrandElement);
    }

    public String verifyHnMBrandCategoryText() {
        return getTextFromElement(hnmBrandTextElement);
    }

    public void clickOnViewCartOnMainMenu() {
        clickOnElement(cartOnMainMenuElement);
    }

    public String verifyProductIsInCartAfterLogin(String cartProducts) {
        List<WebElement> searchCartProducts = driver.findElements(By.xpath("//td[@class='cart_description']//h4"));
        for (WebElement sr : searchCartProducts)
            if (sr.getText().equalsIgnoreCase(cartProducts)) {
                System.out.println("product " + cartProducts + "is already in cart");
                break;
            }
        return cartProducts;
    }

    public String verifyRecommendedItemsText() {
        log.info("verify recommended items " + recommendedTextElement.toString());
        return getTextFromElement(recommendedTextElement);
    }

    public void getAllRecommendedProducts() {
        List<WebElement> recommendedPr = driver.findElements(By.xpath("//div[@class='recommended_items']//div/p"));
        ArrayList<String> arr = new ArrayList<>();
        for (WebElement recoPR : recommendedPr) {
            arr.add(recoPR.getText());
            System.out.println(arr.size());
            System.out.println(recoPR.getText());
        }
        log.info("get all recommended items" + recommendedPr.toString());
        clickOnElement(clickOnNextArrowRecommPrelement);
    }

    public void scrollToRecommendedItems() {
        scrolltoView(recommendedTextElement);
        log.info("scroll to recommended item " + recommendedTextElement.toString());
    }
    public void scrollDowntoSubscription(){
        scrolltoView(subscriptionTextElement);
    }
    public void scrollup(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)");
    }

    public void clickOnAnyRecommendedItem(String recoItem) {  //scenario 22
       for (WebElement recoPR : recommendedPr)
           if (recoPR.getText().equalsIgnoreCase(recoItem)) {
                    log.info("Product located " + recoPR.getText());
                    try {
                        WebElement getADemo = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='recommended_items']//div[1]//a")).below(recoPR));
                        getADemo.click();
                        log.info("Adding product to cart from list : " + recoPR.getText());
                    } catch (Exception e) {
                        JavascriptExecutor executor = (JavascriptExecutor) driver;
                        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@class='product-image-wrapper']//div[1]/a")));
                    }
                    break;
                }
           clickOnElement(continueAfterAddToCartElement);
    }
}


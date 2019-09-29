package AmazonMain;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AmazonMainTestCases extends CommonAPI {

    String user;
    String password;

    @FindBy(id = "twotabsearchtextbox") public static WebElement searchBox;
    @FindBy(className = "nav-input") public static WebElement search;
    @FindBy(xpath = "//a[@href='/gp/navigation/redirector.html/ref=sign-in-redirect?ie=UTF8&associationHandle=usflex&currentPageURL=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&pageType=Gateway&switchAccount=&yshURL=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_signin']") public static WebElement signInButton;
    @FindBy(id = "ap_email") public static WebElement inputUser;
    @FindBy(id = "ap_password") public static WebElement inputPass;
    @FindBy(xpath = "//a[@href='/gp/goldbox?ref_=nav_cs_gb_azl']") public static WebElement todaysDeals;
    @FindBy(xpath = "//a[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gift_cards']") public static WebElement giftCards;
    @FindBy(xpath = "//a[@href='https://www.amazon.com/gp/css/homepage.html?ref_=nav_youraccount_btn']") public static WebElement yourAccount;
    @FindBy(xpath = "//a[@href='/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_help']") public static WebElement getHelp;
    @FindBy(xpath = "//a[@href='/gp/browse.html?node=17235386011&ref_=nav_cs_whole_foods']") public static WebElement shopInWholeFoods;
    @FindBy(xpath = "//a[@href='/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell']")public static WebElement sellOnAmazon;
    @FindBy(xpath = "//a[@href='/gp/cart/view.html?ref_=nav_cart']") public static WebElement cart;
    @FindBy(id = "searchDropdownBox") public static WebElement categoriesDropDown;
    @FindBy(xpath = "//a[@href='/Vehicles/b/?ie=UTF8&node=10677469011&ref_=topnav_storetab_vehicles']") public static WebElement header;
    @FindBy (xpath = "//h2[@class='a-size-base-plus a-color-base a-text-normal' and contains(text(), \"Lenovo  130S-11IGM 11.6\")]") public static WebElement addingItemToCart;
    public void searchItem(){
        searchBox.sendKeys("Laptop");
        search.click();
    }
    public void testLoginWithValidUserNPass() {
        signInButton.click();
        inputUser.sendKeys(user, Keys.ENTER);
        inputPass.sendKeys(password, Keys.ENTER);
        String text = yourAccount.getText();
        Assert.assertEquals(text, "Hello, alejandro Account & Lists");
    }
    public void clickOnTodaysDeals() {
        todaysDeals.click();
        String text = todaysDeals.getText();
        Assert.assertEquals(text, "Today's Deals");
    }
    public void clickOnGiftCards() {
        giftCards.click();
        String text = giftCards.getText();
        Assert.assertEquals(text,"Gift Cards");
    }
    public void clickOnGetHelp() {
        getHelp.click();
        String text = getHelp.getText();
        Assert.assertEquals(text, "Help");
    }
    public void shopInWholeFoods() {
        shopInWholeFoods.click();
        String text = shopInWholeFoods.getText();
        Assert.assertEquals(text, "Whole Foods");
    }
    public void sellOnAmazon() {
        sellOnAmazon.click();
        String text = sellOnAmazon.getText();
        Assert.assertEquals(text, "Sell");
    }
    public void amazonCart() {
        cart.click();
        String text = cart.getText();
        Assert.assertEquals(text, "Cart");
        //Assert.assertTrue(cart.getText().equalsIgnoreCase("Cart"));
    }
    public void categoriesDropDown() {
        Select select = new Select(categoriesDropDown);
        select.selectByVisibleText("Vehicles");
        search.click();
        String text = header.getText();
        Assert.assertEquals(text, "Vehicles");
    }
    public void selectVehicleBrand() {
        categoriesDropDown();
        searchBox.sendKeys("Chevrolet", Keys.ENTER);
    }
    public void addingItemToCart() {
        searchItem();
        addingItemToCart.click();

    }










}

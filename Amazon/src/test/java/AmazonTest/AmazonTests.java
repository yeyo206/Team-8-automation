package AmazonTest;

import AmazonMain.AmazonMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTests extends AmazonMainTestCases {
    AmazonMainTestCases amazonMainTestCases;

    @BeforeMethod
    public void initElements() {
        amazonMainTestCases = PageFactory.initElements(driver,AmazonMainTestCases.class);
    }

    @Test
    public void testSearch() {
        searchItem();
    }
    @Test
    public void loginWithValidUserName(){
        testLoginWithValidUserNPass();
    }
    @Test
    public void testTodaysDeals() {
        clickOnTodaysDeals();
    }
    @Test
    public void testGiftCards() {
        clickOnGiftCards();
    }
    @Test
    public void testGetHelp() {
        clickOnGetHelp();
    }
    @Test
    public void testWholeFoods() {
        shopInWholeFoods();
    }
    @Test
    public void testSell() {
        sellOnAmazon();
    }
    @Test
    public void testAmazonCart() {
        amazonCart();
    }
    @Test
    public void testCategories() {
        categoriesDropDown();
    }
    @Test
    public void testVehicleBrand() {
        selectVehicleBrand();
    }
    @Test
    public void testAddingItemToCart() {
        addingItemToCart();
    }
    @Test
    public void testZipCode() {
        enterYourZipCode();
    }
    @Test
    public void testDealOfTheDay() {
        dealOfTheDay();
    }
    @Test
    public void testShopByCategories() {
        shopGolfBagBestSeller();
    }
    @Test
    public void testReturnItem() {
        returnItem();
    }
    @Test
    public void buyBestSeller() {
        buyBestSellerElectronicItem();
    }
}

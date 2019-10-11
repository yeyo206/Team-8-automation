package EbayMainTestCases;

import Base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class EbayMainTestCases extends CommonAPI {

    JavascriptExecutor js;

    @FindBy(id = "gh-ac")
    public static WebElement searchBar;
    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']")
    public static WebElement testSearchBar;
    @FindBy(id = "gh-cat")
    public static WebElement allCategoriesDropDown;
    @FindBy(xpath = "//h1")
    public static WebElement header;
    @FindBy(id = "gh-btn")
    public static WebElement searchButton;
    @FindBy(xpath = "//section[@id='w2-w3']/ul/li")
    public static List<WebElement> byAgesCategories;
    @FindBy(xpath = "//a[@title='Your shopping cart']")
    public static WebElement shoppingCartButton;
    @FindBy(xpath = "//a[contains(text() ,'Sign in')]")
    public static WebElement signInButton;
    @FindBy(id = "userid")
    public static WebElement emailButton;
    @FindBy(id = "pass")
    public static WebElement password;
    @FindBy(xpath = "(//button[@class='btn btn--primary btn--large btn--fluid'])[2]")
    public static WebElement signInFromLoginButton;
    @FindBy(xpath = "(//span[@class= 'b-accordion-text'])[1]")
    public static WebElement actionFiguresButton;
    @FindBy(xpath = "//a[contains(text(), 'Fantasy Action Figures')]")
    public static WebElement fantasyButton;
    @FindBy(xpath = "//span[contains(text(), 'Funko')]")
    public static WebElement funkoButton;
    @FindBy(xpath = "//h3[contains(text(), 'NFL: Bills - Josh Allen Pop! Vinyl - FunKo Free Shipping!')]")
    public static WebElement joshAllenItem;
    @FindBy(xpath = "//span[contains(text() ,'1 day shipping')]")
    public static WebElement oneDayShippingButton;
    @FindBy(xpath = "//span[contains(text(), '(279)')]")
    public static WebElement newButton;
    @FindBy(xpath = "(//span[@class = 'cbx x-refine__multi-select-cbx'])[11]")
    public static WebElement buyNowButton;
    @FindBy(name = "_sadis")
    public static WebElement radioOfMiles;
    @FindBy(id = "w4-w17-zipcode-validator-x-zipcode-validator__input")
    public static WebElement zipCodeButton;
    @FindBy(xpath = "(//span[contains(text() ,'Free Shipping')])[1]")
    public static WebElement freeShipping;
    @FindBy(xpath = "//h3[contains(text() ,'No exact matches found')]")
    public static WebElement noFoundHeader;
    @FindBy(id = "srp-river-results-universal_finder_answer1-w0-2-input")
    public static WebElement yearFromButton;
    @FindBy(id = "srp-river-results-universal_finder_answer1-w0-3-input")
    public static WebElement yearToButton;
    @FindBy(name = "Distance")
    public static WebElement radioOfMilesOnEbayMotors;
    @FindBy(xpath = "//button[contains(text() ,'Find Vehicles')]")
    public static WebElement findVehiclesButton;
    @FindBy(xpath = "//span[contains(text() ,'More than 7.0L')]")
    public static WebElement cylinderButton;
    @FindBy(xpath = "(//h3[@class = 's-item__title'])[3]")
    public static WebElement shelbyButton;
    @FindBy(id = "gh-as-td")
    public static WebElement advancedSearch;
    @FindBy(xpath = "//label[@for ='LH_TitleDesc']")
    public static WebElement descriptionOptionButton;
    @FindBy(id = "_nkw")
    public static WebElement searchBarFromAdvancedSearch;
    @FindBy(xpath = "//span[@class ='kwcat']")
    public static WebElement resultsForAdidas;
    @FindBy(xpath = "(//input[@class ='price'])[1]")
    public static WebElement priceFromAdvancedSearch;
    @FindBy(xpath = "(//input[@class ='price'])[2]")
    public static WebElement priceToAdvancedSearch;
    @FindBy(name = "_ftrt")
    public static WebElement endingButton;
    @FindBy(name = "_ftrv")
    public static WebElement hoursButton;
    @FindBy(id = "LH_SORT_BY") public static WebElement sortByButton;
    @FindBy(xpath = "(//a[contains(text(), 'Business & Industrial')])[1]")
    public static WebElement businessButton;
    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']/li") public static List <WebElement> middleBar;
    @FindBy(xpath = "//span[contains(text() , 'Agriculture & Forestry Equipment')]")
    public static WebElement forestryButton;
    @FindBy(xpath = "//a[contains(text() , 'See all in Agriculture and Forestry Equipment')]")
    public static WebElement allAgricultureButton;
    @FindBy(xpath = "//a[contains(text() , 'Agriculture & Forestry GPS & Guidance Equipment')]")
    public static WebElement agricultureButton;
    @FindBy(xpath = "//a[contains(text() , 'Car & Truck Parts')]") public static WebElement carsAndTruckButton;
    @FindBy(xpath = "//a[contains(text() , 'Motorcycle Parts')]") public static WebElement motorcyclesButton;
    @FindBy (xpath = "//a[contains(text() , 'Classic Cars')]") public static WebElement classicCarsButton;
    @FindBy(xpath = "//a[contains(text() , 'Exotic Cars')]") public static WebElement exoticCarsButton;



    public void searchForMustangParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBar.sendKeys("mustang parts");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(testSearchBar.getText().contains("mustang parts"));
    }

    public void clickToysAndHobbies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Toys & Hobbies");
        searchButton.click();
        explicitlyWait(5).until(ExpectedConditions.visibilityOf(header));
        Assert.assertTrue(header.getText().equalsIgnoreCase("Toys & Hobbies"));
    }

    public void clickByAgesCatogories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickToysAndHobbies();
        for (WebElement element : byAgesCategories) {
            if (element.getText().contains("1-2 Years")) {
                scrollElementIntoView(element);
                element.click();
                break;
            }
        }
        explicitlyWait(5).until(ExpectedConditions.visibilityOf(header));
        Assert.assertTrue(header.getText().contains("1-2 Years"));
    }

    public void clickShoppingCar() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        shoppingCartButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Shopping cart"));
    }

    public void clickEbayMotors() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("eBay Motors");
        searchButton.click();
        explicitlyWait(5).until(ExpectedConditions.visibilityOf(header));
        Assert.assertTrue(header.getText().equalsIgnoreCase("eBay Motors"));
    }

    public void signInUser() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInButton.click();
        emailButton.sendKeys("rosamelano2021@outlook.com");
        password.sendKeys("Rosita0231");
        signInFromLoginButton.click();
    }

    public void lookingForActionsFigures() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickToysAndHobbies();
        actionFiguresButton.click();
        fantasyButton.click();
        funkoButton.click();
        joshAllenItem.click();
        Assert.assertTrue(header.getText()
                .equalsIgnoreCase("NFL Josh Allen Buffalo Bills Wave 5 Pop Vinyl Figure by Funko"));
    }

    public void searchItemsFromSearchBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBar.sendKeys("iphone 11 pro max 256gb");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        oneDayShippingButton.click();
        Select select = new Select(radioOfMiles);
        select.selectByVisibleText("75 miles");
        if (zipCodeButton.getAttribute("value").isEmpty()) {
            zipCodeButton.sendKeys("33068");
        }
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        freeShipping.click();
        Assert.assertTrue(noFoundHeader.getText().equalsIgnoreCase("No exact matches found"));
    }

    public void searchOnEbayMotors() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickEbayMotors();
        String key = "ford mustang";
        searchBar.sendKeys(key);
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Select select = new Select(radioOfMilesOnEbayMotors);
        select.selectByVisibleText("100 Miles");
        sendKeysByChar("2013", yearFromButton);
        sendKeysByChar("2014", yearToButton);
        findVehiclesButton.click();
        cylinderButton.click();
        explicitlyWait(5).until(ExpectedConditions.visibilityOf(header));
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", shelbyButton);
    }

    public void advancedSearchForShoes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearch.click();
        descriptionOptionButton.click();
        searchBarFromAdvancedSearch.sendKeys("adidas shoes");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(resultsForAdidas.getText().contains("adidas"));
    }

    public void advancedSearchFilterByPrice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearch.click();
        descriptionOptionButton.click();
        priceFromAdvancedSearch.sendKeys("100");
        priceToAdvancedSearch.sendKeys("300");
        searchBarFromAdvancedSearch.sendKeys("sound bars");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(resultsForAdidas.getText().contains("sound bars"));
    }

    public void advancedSearchUsingTimeFilter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearch.click();
        descriptionOptionButton.click();
        priceFromAdvancedSearch.sendKeys("100");
        priceToAdvancedSearch.sendKeys("300");
        Select select = new Select(endingButton);
        select.selectByVisibleText("Ending in more than");
        Select select1 = new Select(hoursButton);
        select1.selectByVisibleText("3 hours");
        searchBarFromAdvancedSearch.sendKeys("hair treatment");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(resultsForAdidas.getText().contains("hair treatment"));
    }
    public void advancedSearchUsingMileRange(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearch.click();
        descriptionOptionButton.click();
        priceFromAdvancedSearch.sendKeys("100");
        priceToAdvancedSearch.sendKeys("300");
        Select select = new Select(endingButton);
        select.selectByVisibleText("Ending in more than");
        Select select1 = new Select(hoursButton);
        select1.selectByVisibleText("3 hours");
        Select select2 = new Select(radioOfMiles);
        select2.selectByVisibleText("100");
        searchBarFromAdvancedSearch.sendKeys("phones");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(resultsForAdidas.getText().contains("phones"));
    }
    public void advancedSearchUsingSorting(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearch.click();
        descriptionOptionButton.click();
        priceFromAdvancedSearch.sendKeys("100");
        priceToAdvancedSearch.sendKeys("300");
        Select select = new Select(endingButton);
        select.selectByVisibleText("Ending in more than");
        Select select1 = new Select(hoursButton);
        select1.selectByVisibleText("3 hours");
        Select select2 = new Select(radioOfMiles);
        select2.selectByVisibleText("100");
        Select select3 = new Select(sortByButton);
        select3.selectByVisibleText("Price + Shipping: lowest first");
        searchBarFromAdvancedSearch.sendKeys("orange juice");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(resultsForAdidas.getText().contains("orange juice"));
    }
    public void clickBusinessButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Business & Industrial"));
    }
    public void clickMusicButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element: middleBar
             ) {
            if(element.getText().contains("Music")){
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Music"));
    }
    public void clickDealsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element: middleBar
        ) {
            if(element.getText().contains("Deals")){
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Deals"));
    }
    public void clickHomeAndGardenButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element: middleBar
        ) {
            if(element.getText().contains("Home & Garden")){
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Home & Garden"));
    }
    public void clickFashionButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element: middleBar
        ) {
            if(element.getText().contains("Fashion")){
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Fashion"));
    }
    public void clickElectronicsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element: middleBar
        ) {
            if(element.getText().contains("Electronics")){
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Electronics"));
    }
    public void clickSportingGoodsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element: middleBar
        ) {
            if(element.getText().contains("Sporting Goods")){
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().contains("Sporting Goods"));
    }
    public void clickAgrecultureAndForesty(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBusinessButton();
        forestryButton.click();
        allAgricultureButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Agriculture & Forestry Equipment"));
    }
    public void checkAgricultureGpsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBusinessButton();
        forestryButton.click();
        agricultureButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Agriculture & Forestry GPS & Guidance Equipment"));
    }
    public void checkEbayMotorsButtonFrom(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element: middleBar
        ) {
            if(element.getText().contains("Motors")){
                element.click();
                break;
            }
        }

        Assert.assertTrue(header.getText().contains("Motors"));
    }
    public void checkCarsAndTruckButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkEbayMotorsButtonFrom();
        carsAndTruckButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Car & Truck Parts"));
    }
    public void checkForMotorcycle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkEbayMotorsButtonFrom();
        motorcyclesButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Motorcycle Parts"));
    }
    public void checkForClassicCars(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkEbayMotorsButtonFrom();
        classicCarsButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Classic Cars & Trucks"));
    }
    public void checkForExoticCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkEbayMotorsButtonFrom();
        exoticCarsButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Exotic Cars & Trucks"));
    }
}



package GeicoMainTestCases;

import Base.CommonAPI;
import KeywordDriven.KeyWord;
import datadriven.ExcelReader;
import datadriven.DatabaseReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class GeicoTestCases extends CommonAPI {

    KeyWord keyword = new KeyWord();

    @FindBy(xpath = "//span[@class='icon-search right-icons-separator']") public static WebElement search;
    @FindBy(xpath = "//input[@aria-label='Search geico.com']") public static WebElement searchBar;
    @FindBy(xpath = "//h1") public static WebElement header;
    @FindBy(xpath = "//input[@placeholder='Please enter a word or phrase']") public static WebElement scondSearch;
    @FindBy(xpath = "//input[@id='zip']") public static WebElement zipCode;
    @FindBy(xpath = "//span[contains(text(),'START QUOTE')]") public static WebElement zipCodeHeader;
    @FindBy(xpath = "//a[@class='skip-collect-intent link--primary']") public static WebElement skipButton;
    @FindBy(xpath = "//h2[@class='font--bold']") public static WebElement yourInfo;

    public void searchUsingMongo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        search.click();
        sendKeysByChar(DatabaseReader.itemsList().get(0), searchBar);
        searchBar.sendKeys(Keys.ENTER);
        for(String item : DatabaseReader.itemsList()
        ) {
            scondSearch.sendKeys(item);
            new Actions(driver).sendKeys(Keys.ENTER).perform();
            scondSearch.clear();
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Site Search"));
    }

    public void searchUsingExcelData() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        search.click();
        sendKeysByChar(ExcelReader.getItems().get(0), searchBar);
        searchBar.sendKeys(Keys.ENTER);
        for (String item : ExcelReader.getItems()
        ) {
            sendKeysByChar(item, scondSearch);
            scondSearch.sendKeys(Keys.ENTER);
            scondSearch.clear();
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Site Search"));
    }
    public void zipCode() {
        zipCode.sendKeys("33186", Keys.ENTER);
        skipButton.click();
        Assert.assertTrue(yourInfo.getText().contains("Your Info"));
    }
    public void searchUsingKeywordDriven() throws Exception {
        keyword.perform(KeyWord.ActionsToDo.search,search,"asaroso");
        keyword.perform(KeyWord.ActionsToDo.searchBar, searchBar, "Home Insurance");
    }
}

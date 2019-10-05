package CnnMainTestCases;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class CnnTestCases extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'US')]") public static WebElement usButton;
    @FindBy(xpath = "//a[starts-with (@href,'/world')]") public static WebElement worldButton;
    @FindBy(xpath = "//a[starts-with (@href,'/politics')]") public static WebElement politicsButton;
    @FindBy(xpath = "//a[@href='/business']") public static WebElement businessButton;
    @FindBy(xpath = "//a[@href='/opinions']") public static WebElement opinionButton;
    @FindBy(xpath = "//a[@href='/health']") public static WebElement healthButton;
    @FindBy(xpath = "//a[@href='/entertainment']") public static WebElement entertainmentButton;
    @FindBy(xpath = "//a[@href='/style']") public static WebElement styleButton;
    @FindBy(xpath = "//a[@href='/travel']") public static WebElement travelButton;
    @FindBy(xpath = "//a[@href='http://bleacherreport.com']") public static WebElement sportsButton;
    @FindBy(xpath = "//a[@href='/videos']") public static WebElement videosButton;
    @FindBy(xpath = "//input[@id='footer-search-bar']") public static WebElement searchBar1;
    @FindBy(xpath = "//strong[contains(text(),'Donald Trump')]") public static WebElement searchHeader;
    @FindBy(xpath = "//a[@href='http://www.cnn.com/specials/last-50-stories']") public static WebElement lastestUsStories;
    @FindBy(xpath = "//h1[contains(text(),'Latest News')]") public static WebElement lastestUsStoriesHeader;
    @FindBy(xpath = "//article[@class='cd cd--card cd--article cd--idx-0 cd--extra-small cd--has-siblings cd--media__image']") public static WebElement selectFirstLastNews;
    @FindBy(xpath = "//h2[contains(text(),'Europe')]") public static WebElement europeNews;
    @FindBy(xpath = "//h1[contains(text(),'Europe')]") public static WebElement europeHeader;
    @FindBy(xpath = "//a[@href='https://edition.cnn.com/uk']") public static WebElement ukLatest;
    @FindBy(xpath = "//button[@tabindex='0']") public static WebElement searchButton;
    @FindBy(id = "header-search-bar") public static WebElement searchBar;
    @FindBy(xpath = "//div[@class ='cnn-search__results-count']") public static WebElement searchResult;
    @FindBy(xpath = "//a[@name='terms-of-use']") public static WebElement termsOfUse;
    @FindBy(xpath = "//h1[text()='CNN Terms of Use']") public static WebElement termsOfUseHeader;
    @FindBy(xpath = "//span[text()='TRENDING:  ']") public static WebElement trendingbutton;
    @FindBy(xpath = "//h1[@class='pg-headline']") public static WebElement trendingTitle;
    @FindBy(xpath = "//nav/ul[@type='collapsed']//li") public static List<WebElement> topLinksList;
    @FindBy(xpath = "//h1") public static WebElement header;

    public void usButton() {
        usButton.click();
        String text = usButton.getText();
        Assert.assertEquals(text, "US");
    }
    public void worldButton() {
        worldButton.click();
        String text = usButton.getText();
        Assert.assertEquals(text, "");
    }
    public void politicsButton() {
        politicsButton.click();
        String text = usButton.getText();
        Assert.assertEquals(text, "SCOTUS");
    }
    public void businessButton() {
        businessButton.click();
        String text = businessButton.getText();
        Assert.assertEquals(text, "");
    }
    public void opinionButton() {
        opinionButton.click();
        String text = opinionButton.getText();
        Assert.assertEquals(text, "Opinion");
    }
    public void healthButton() {
        healthButton.click();
        String text = healthButton.getText();
        Assert.assertEquals(text, "");
    }
    public void entertainmentButton() {
        entertainmentButton.click();
        String text = entertainmentButton.getText();
        Assert.assertEquals(text, "");
    }
    public void styleButton() {
        styleButton.click();
        String text = styleButton.getText();
        Assert.assertEquals(text, "");
    }
    public void travelButton() {
        travelButton.click();
        String text = travelButton.getText();
        Assert.assertEquals(text, "");
    }
    public void sportsButton() {
        sportsButton.click();
        String text = sportsButton.getText();
        Assert.assertEquals(text, "Sports");
    }
    public void videosButton() {
        videosButton.click();
        String text = videosButton.getText();
        Assert.assertEquals(text, "Videos");
    }
    public void search() {
        searchBar1.sendKeys("Donald Trump", Keys.ENTER);
        String text = searchHeader.getText();
        Assert.assertEquals(text, "Donald Trump");
    }
    public void lastestUsStories() {
        usButton();
        lastestUsStories.click();
        String text = lastestUsStoriesHeader.getText();
        Assert.assertEquals(text, "Latest News");
        selectFirstLastNews.click();
    }
    public void europeLastNews() {
        worldButton();
        europeNews.click();
        Assert.assertTrue(europeHeader.getText().contains("Europe"));
        ukLatest.click();
    }
    public void checkForTodaysNews(){
        searchButton.click();
        searchBar.sendKeys("today news");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(searchResult.getText().contains("today news"));
    }

    public void openTermsOfUse(){
        waitUntilClickAble(By.xpath("//a[@name='terms-of-use']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", termsOfUse);
        Assert.assertTrue(termsOfUseHeader.getText().equals( "CNN Terms of Use"));
    }
    public void openTrendingButton(){
        trendingbutton.click();
        Assert.assertTrue(trendingTitle.isDisplayed());

    }

    public void openWorldbutton(){
        for (WebElement button : topLinksList){
            if (button.getText().equalsIgnoreCase("world")){
                button.click();
                break;
            }
        }
        waitUntilVisible(By.xpath("//h1"));
        Assert.assertTrue(header.getText().equalsIgnoreCase("world"));
    }

    public void openUsButton(){
        for (WebElement button : topLinksList){
            if (button.getText().equalsIgnoreCase("us")){
                button.click();
                break;
            }
        }
        waitUntilVisible(By.xpath("//h1"));
        Assert.assertTrue(header.getText().equalsIgnoreCase("us"));
    }


}

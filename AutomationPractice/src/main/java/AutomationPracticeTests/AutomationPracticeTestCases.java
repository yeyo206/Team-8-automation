package AutomationPracticeTests;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AutomationPracticeTestCases extends CommonAPI {

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=order']") public static WebElement cartButton;
    @FindBy(id = "search_query_top") public static WebElement searchBar;
    @FindBy(xpath = "//span[contains(text(),'shirts')]") public static WebElement shirtsHeader;
    @FindBy(className = "blockbestsellers") public static WebElement bestSellersButton;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]") public static WebElement signInButton;
    @FindBy(xpath = "//input[@id='email']") public static WebElement inputEmail;
    @FindBy(xpath = "//input[@type='password']") public static WebElement inputPassword;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]") public static WebElement signInHeader;
    @FindBy(xpath = "//a[contains(text(),'Specials')]") public static WebElement specials;
    @FindBy(xpath = "//h1[contains(text(),'Price drop')]") public static WebElement specialsHeader;

    public void cartButton() {
        cartButton.click();
        Assert.assertTrue(cartButton.getText().contains("Cart"));
    }
    public void searchBar() {
        searchBar.sendKeys("shirts", Keys.ENTER);
        Assert.assertTrue(shirtsHeader.getText().contains("SHIRTS"));
    }
    public void bestSellers() {
        bestSellersButton.click();
        String text = bestSellersButton.getText();
        Assert.assertEquals(text, "BEST SELLERS");
    }
    public void signInWithInvalidUser() {
        signInButton.click();
        inputEmail.sendKeys("pnt@gmail.com");
        inputPassword.sendKeys("123456", Keys.ENTER);
        String text = signInHeader.getText();
        Assert.assertEquals(text, "AUTHENTICATION");
    }
    public void shopSpecials() {
        specials.click();
        String text = specialsHeader.getText();
        Assert.assertEquals(text, "PRICE DROP");

    }






}

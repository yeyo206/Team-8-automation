package CignaMain;

import Base.CommonAPI;
import Base.UrlSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class CignaMainTestCases extends CommonAPI {


    @BeforeMethod
    public void cignaSetup(){
        setUp(UrlSetup.Cigna);
    }

    @FindBy(xpath = "//a[contains(text() , 'Privacy')]") public static WebElement privacyButton;
    @FindBy(xpath = "//h1") public static WebElement header;
    @FindBy(xpath = "//ul[@class = 'navbar-nav align-items-center ml-auto universal-navigation-buttons']/li/a")
    public static List<WebElement> topLinks;
    public void clickPrivacyButton(){
        privacyButton.click();
        Assert.assertTrue(header.getText().toLowerCase().contains("privacy"));
    }

}

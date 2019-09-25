package CignaMain;

import Base.CommonAPI;
import Base.UrlSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class CignaMainTestCases extends CommonAPI {


    @BeforeMethod
    public void cignaSetup(){
        setUp(UrlSetup.Cigna);
    }

    @FindBy(xpath = "//a[contains(text() , 'Privacy')]") public static WebElement privacyButton;
    @FindBy(xpath = "//h1") public static WebElement header;
    @FindBy(xpath = )
    public void clickPrivacyButton(){
        privacyButton.click();
        Assert.assertTrue(header.getText().toLowerCase().contains("privacy"));
    }

}

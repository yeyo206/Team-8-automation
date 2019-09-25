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
    //@FindBy(xpath = "//div/p[contains(text(), 'About')]") public static WebElement aboutHeader;
    @FindBy(xpath = "//h2[@class = 'homepage-h2']") public static WebElement espanolHeader;


    public void clickPrivacyButton()
    {
        privacyButton.click();
        Assert.assertTrue(header.getText().toLowerCase().contains("privacy"));
    }
    public void clickCignaInternational()
    {
        for (WebElement element: topLinks
             ) {
            if (element.getText().equalsIgnoreCase("Cigna international")){
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("CIGNA INTERNATIONAL HEALTH INSURANCE"));
    }
    public void clickContactUs()
    {
        for (WebElement element: topLinks
        ) {
            if (element.getText().equalsIgnoreCase("contact us")){
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("contact us"));
    }
    public void clickEspanolButton()
    {
        for (WebElement element: topLinks
        ) {
            if (element.getText().contains("Español")){

                element.click();
                break;
            }
        }
        Assert.assertTrue(espanolHeader.getText().contains(
                "En Cigna, somos tu socio en salud integral y bienestar."));
    }
}

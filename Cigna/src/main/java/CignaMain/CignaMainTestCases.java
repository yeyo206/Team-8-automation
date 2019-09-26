package CignaMain;

import Base.CommonAPI;
import Base.UrlSetup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import javax.swing.*;
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
    @FindBy(xpath = "(//input[@placeholder='Search Cigna.com'])[1]")
    public static WebElement searchBar;
    @FindBy(xpath = "//div[@class ='csng-search-key']") public static WebElement searchBarResult;
    @FindBy(xpath = "(//a[@class = 'btn btn-sm btn-primary'])[1]") public static WebElement findDoctorButton;
    @FindBy(xpath = "(//a[@class = 'btn btn-sm btn-primary'])[2]") public static WebElement signInButton;
    @FindBy(xpath = "//ul[@class='nav mr-auto']/li") public static List<WebElement> middleButtonBar;
    @FindBy(xpath = "//ul[@class='navbar-nav mr-auto']/li") public static List<WebElement> individualsAndFamilyOptions;
    @FindBy(xpath = "(//a[contains(text() , 'Dental Insurance Plans')])[1]") public static WebElement dentalPlanButton;
    @FindBy(xpath = "(//a[contains(text() , 'Other Supplemental Insurance')])[1]")
    public static WebElement otherSuplementalInsuranceButton;
    @FindBy (xpath = "//a[contains(text() , 'International Health Insurance')]")
    public static WebElement internationalInsuranceButton;
    @FindBy (xpath = "//a[contains(text() , 'Buying Insurance: How to Choose the Right Plan')]")
    public static WebElement buyingInsuranceButton;
    @FindBy(xpath = "//a[contains(text() , 'Health Care Reform: What It Means For You')]")
    public static WebElement healthcareReformButton;
    @FindBy (xpath = "//a[contains(text() , 'How to Shop the Health Insurance Marketplace')]")
    public static WebElement howToShopButton;
    @FindBy(xpath = "//a[contains(text() , 'Copays, Deductibles, and Coinsurance')]")
    public static WebElement copayButton;
    @FindBy (xpath = "(//a[contains(text() , 'Understanding Provider Networks')])[1]")
    public static WebElement providersButton;
    @FindBy(xpath = "//a[contains(text() , 'Common Insurance Plan Types: HMO, PPO, EPO')]")
    public static WebElement commonInsruanceButon;

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
    public void searchBarSearch(){
        searchBar.click();
        new Actions(driver).sendKeys(searchBar,"health plans" + Keys.ENTER).build().perform();
        Assert.assertTrue(searchBarResult.getText().contains("health plans"));
    }
    public void clickFindDoctor(){
      findDoctorButton.click();
      Assert.assertTrue(header.getText().contains("Find a Doctor, Dentist, or Facility"));
    }
    public void clickSignIn(){
        signInButton.click();
    }
    public void clickIndividualsAndFamily(){
        for (WebElement element: middleButtonBar
             ) {
            if (element.getText().contains("Individuals and Families")){
                element.click();
                break;
            }
        }
        //assert
    }
    public void clickPlansAndServices(){
        middleButtonBar.get(0).click();
        for (WebElement element : individualsAndFamilyOptions
             ) {
            if(element.getText().contains("Plans")){
                element.click();
                break;
            }
        }
    }
    public void clickDentalPLan(){
        clickPlansAndServices();
        dentalPlanButton.click();
        Assert.assertTrue(header.getText().contains("Cigna Dental insurance can help you save."));
    }
    public void clickOtherSuplementalInsurance(){
        clickPlansAndServices();
        otherSuplementalInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Supplemental Insurance Policies"));
    }
    public void clickInternationalInsuranceButton(){
        clickPlansAndServices();
        internationalInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("CIGNA INTERNATIONAL HEALTH INSURANCE"));
    }
    public void clickUnderstandingInsurance(){
        middleButtonBar.get(0).click();
        for (WebElement element : individualsAndFamilyOptions
        ) {
            if(element.getText().contains("Understanding Insurance")){
                element.click();
                break;
            }
        }
    //assert
    }
    public void clickBuyingInsurance(){
        clickUnderstandingInsurance();
        buyingInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Buying Health Insurance: How to Choose the Right Plan"));
    }
    public void clickHealthcareReformClick(){
        clickUnderstandingInsurance();
        healthcareReformButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Health Care Reform and What it Means for You"));
    }
    public void clickHowToShop(){
        clickUnderstandingInsurance();
        howToShopButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("How to Shop the Health Insurance Marketplace"));
    }
    public void clickCopayButton(){
        clickUnderstandingInsurance();
        copayButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Copays, Deductibles and Coinsurance"));
    }
    public void clickProvidersNetwork(){
        clickUnderstandingInsurance();
        providersButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Understanding Provider Networks"));
    }
    public void clickCommonInsurancePlan(){
        clickUnderstandingInsurance();
        commonInsruanceButon.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("What's the Difference Between an HMO, EPO, and PPO?"));
    }


}

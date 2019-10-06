package UHCMain;

import Base.CommonAPI;
import DataDriven.DatabaseReader;
import DataDriven.ExcelReader;
import KeywordDriven.KeyWord;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reporting.TestLogger;

import java.awt.image.Kernel;
import java.util.List;

public class UHCTestCases extends CommonAPI {

    @FindBy(xpath = "//li[@class='display-inlineBlock sm-display-block m-0 pr-9']//following-sibling::a[contains(text(),'Home')]")
    public static WebElement homeButton;
    @FindBy(xpath = "//a[contains(text(),'Individuals & Families')]")
    public static WebElement insForIndividualsNFamilies;
    @FindBy(xpath = "//a[contains(text(),'Employers')]")
    public static WebElement insForEmployers;
    @FindBy(xpath = "//li[@class='display-inlineBlock sm-display-block m-0 pr-9']//following-sibling::a[contains(text(),'Medicare')]")
    public static WebElement medicareButton;
    @FindBy(xpath = "//input[@id='search']")
    public static WebElement searchBar;
    @FindBy(xpath = "//b[contains(text(),'accident insurance')]")
    public static WebElement accidentInsuranceHeader;
    @FindBy(xpath = "//a[contains(text(),'Find a Doctor')]")
    public static WebElement findADoctorButton;
    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    public static WebElement contactUsButton;
    @FindBy(xpath = "//a[contains(text(),'View Medicare plans')]")
    public static WebElement medicarePlans;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#?LeadsourceName=UHC-Website']")
    public static WebElement individualNFamiliesPlans;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#?LeadSourceName=UHC-Website-STM']")
    public static WebElement shortTermPlans;
    @FindBy(xpath = "//a[contains(text(),'View small business plans')]")
    public static WebElement smallBusinessPlans;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#/census?LeadSourceName=UHC-Website-Dental']")
    public static WebElement dentalPlans;
    @FindBy(xpath = "//a[@href='https://www.uhccommunityplan.com']")
    public static WebElement medicaidPlans;
    @FindBy(xpath = "//a[@href='/employer']")
    public static WebElement smallBusinessPlansHeader;
    @FindBy(xpath = "//input[@class='ng-pristine ng-valid ng-valid-maxlength']")
    public static WebElement medicarePlansZipCode;
    @FindBy(xpath = "//a[@class='trigger-closed']")
    public static WebElement shopMedicareSupplementPlansButton;
    @FindBy(xpath = "//button[contains(text(),'No, thanks')]")
    public static WebElement noThanksButton;
    @FindBy(xpath = "//input[@name='zipCode']")
    public static WebElement zipCodeInput;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    public static WebElement male;
    @FindBy(xpath = "//input[@name='primary_birthday']")
    public static WebElement DOB;
    @FindBy(xpath = "//div[@class='gridColumn ms-gridColumn-1']/li")
    public static List<WebElement> bottomList;
    @FindBy(xpath = "//h1")
    public static WebElement header;
    @FindBy(xpath = "//div[@class='page-spinner-message overlay-message']")
    public static WebElement Processing;

    KeyWord keyword = new KeyWord();

    public void homeButton() {
        homeButton.click();
        Assert.assertTrue(homeButton.getText().equalsIgnoreCase("Home"));
    }

    public void insForIndividualsNFamilies() {
        insForIndividualsNFamilies.click();
        String text = insForIndividualsNFamilies.getText();
        Assert.assertEquals(text, "Individuals & Families");
    }

    public void insForEmployers() {
        insForEmployers.click();
        Assert.assertTrue(insForEmployers.getText().contains("Employers"));
    }

    public void medicare() {
        medicareButton.click();
        String text = medicareButton.getText();
        Assert.assertEquals(text, "Medicare");
    }

    public void searchBar() {
        searchBar.sendKeys("accident insurance", Keys.ENTER);
        String text = accidentInsuranceHeader.getText();
        Assert.assertEquals(text, "accident insurance");
    }

    public void findADoctor() {
        findADoctorButton.click();
        String text = findADoctorButton.getText();
        Assert.assertEquals(text, "Find a Doctor");
    }

    public void contactUs() {
        contactUsButton.click();
        Assert.assertTrue(contactUsButton.getText().contains("Contact us"));
    }

    public void medicarePlans() {
        medicarePlans.click();
        String text = medicarePlans.getText();
        Assert.assertEquals(text, "View Medicare plans");
    }

    public void individualOrFamiliesPlans() {
        individualNFamiliesPlans.click();
        Assert.assertTrue(individualNFamiliesPlans.getText().contains("individual or family plans"));
    }

    public void shortTermPlans() {
        shortTermPlans.click();
        Assert.assertTrue(shortTermPlans.getText().contains("short term plans"));
    }

    public void smallBuisinessPlans() {
        waitUntilClickAble(By.xpath("//a[contains(text(),'View small business plans')]"));
        Assert.assertTrue(smallBusinessPlans.getText().contains("small business"));
    }

    public void dentalPlans() {
        dentalPlans.click();
        Assert.assertTrue(dentalPlans.getText().contains("dental plans"));
    }

    public void medicaidPlans() {
        medicaidPlans.click();
        String text = smallBusinessPlansHeader.getText();
        Assert.assertEquals(text, "Employers");
    }

    public void shopMedicareSupplementPlans() {
        medicarePlans();
        handleNewTab(driver);
        medicarePlansZipCode.sendKeys("33186", Keys.ENTER);
    }

    public void shopIndividualOrFamilyPlans() {
        individualOrFamiliesPlans();
        handleNewTab(driver);
        zipCodeInput.sendKeys("33186");
        waitUnitIsNotVisible(Processing);
        male.click();
        DOB.sendKeys("06121997", Keys.ENTER);
    }

    public void marketPlaceInsurancePlans() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Marketplace insurance plans")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Marketplace plans made clear"));
    }

    public void Medicare() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Medicare")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("The Medicare Annual Enrollment Period (AEP) for Medicare Advantage and Prescription Drug plans starts October 15."));
    }

    public void Medicaid() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Medicaid")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("What is Medicaid?"));
    }

    public void employerGroupPlans() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Employer group plans")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().contains("Health insurance for employers"));
    }

    public void dentalInsurance() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Dental Insurance")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Dental insurance plans"));
    }

    public void visionInsurance() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Vision Insurance")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("Vision insurance plans"));
    }

    public void shortTermHealthInsurance() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Short term health insurance")) {
                element.click();
                break;
            }
        }
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(header));
        System.out.println(header.getText());
        Assert.assertTrue(header.getText().equalsIgnoreCase("Marketplace plans made clear"));
    }

    public void Fitness() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Fitness")) {
                element.click();
                break;
            }
        }
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(header));
        System.out.println(header.getText());
        Assert.assertTrue(header.getText().contains("Health Insurance Plans for Individuals & Families, Employers, Medicare"));
    }

    public void Nutrition() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Nutrition")) {
                element.click();
                break;
            }
        }
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(header));
        System.out.println(header.getText());
        Assert.assertTrue(header.getText().equalsIgnoreCase("Health Insurance Plans for Individuals & Families, Employers, Medicare"));
    }

    public void healthTopics() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Health topics")) {
                element.click();
                break;
            }
        }
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(header));
        System.out.println(header.getText());
        Assert.assertTrue(header.getText().equalsIgnoreCase("Health Insurance Plans for Individuals & Families, Employers, Medicare"));
    }
    public void takeControlOfYourHealth() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Take control of your care")) {
                element.click();
                break;
            }
        }
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(header));
        System.out.println(header.getText());
        Assert.assertTrue(header.getText().equalsIgnoreCase("Take control of your care"));
    }
    public void healthNWellness() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Health and wellness")) {
                element.click();
                break;
            }
        }
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(header));
        System.out.println(header.getText());
        Assert.assertTrue(header.getText().equalsIgnoreCase("Health and wellness"));
    }
    public void programsNTools() {
        for (WebElement element : bottomList
        ) {
            if (element.getText().contains("Programs & tools")) {
                element.click();
                break;
            }
        }
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(header));
        System.out.println(header.getText());
        Assert.assertTrue(header.getText().equalsIgnoreCase("UnitedHealthcare programs and tools"));
    }
    public void searchUsingExcelData() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBar.click();
        sendKeysByChar(ExcelReader.getItems().get(0), searchBar);
        searchBar.sendKeys(Keys.ENTER);
        for (String item : ExcelReader.getItems()
        ) {
            sendKeysByChar(item, searchBar);
            searchBar.sendKeys(Keys.ENTER);
            searchBar.clear();
        }
        Assert.assertTrue(header.getText().contains("results"));
    }
    public void searchUsingMongo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBar.click();
        sendKeysByChar(DatabaseReader.itemsList().get(0), searchBar);
        searchBar.sendKeys(Keys.ENTER);
        for(String item : DatabaseReader.itemsList()
        ) {
            searchBar.sendKeys(item);
            new Actions(driver).sendKeys(Keys.ENTER).perform();
            searchBar.clear();
        }
        Assert.assertTrue(header.getText().contains("results"));
    }
    public void searchUsingKeywordDriven() throws Exception {
        keyword.perform(KeyWord.ActionsToDo.searchBar,searchBar,"Home Insurance");
    }

}



















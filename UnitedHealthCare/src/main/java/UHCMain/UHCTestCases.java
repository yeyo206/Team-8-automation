package UHCMain;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.image.Kernel;

public class UHCTestCases extends CommonAPI {

    @FindBy(xpath = "//li[@class='display-inlineBlock sm-display-block m-0 pr-9']//following-sibling::a[contains(text(),'Home')]") public static WebElement homeButton;
    @FindBy(xpath = "//a[contains(text(),'Individuals & Families')]") public static WebElement insForIndividualsNFamilies;
    @FindBy(xpath = "//a[contains(text(),'Employers')]") public static WebElement insForEmployers;
    @FindBy(xpath = "//li[@class='display-inlineBlock sm-display-block m-0 pr-9']//following-sibling::a[contains(text(),'Medicare')]") public static WebElement medicareButton;
    @FindBy(xpath = "//input[@id='search']") public static WebElement searchBar;
    @FindBy(xpath = "//b[contains(text(),'accident insurance')]") public static WebElement accidentInsuranceHeader;
    @FindBy(xpath = "//a[contains(text(),'Find a Doctor')]") public static WebElement findADoctorButton;
    @FindBy(xpath = "//a[contains(text(),'Contact us')]") public static WebElement contactUsButton;
    @FindBy(xpath = "//a[contains(text(),'View Medicare plans')]") public static WebElement medicarePlans;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#?LeadsourceName=UHC-Website']") public static WebElement individualNFamiliesPlans;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#?LeadSourceName=UHC-Website-STM']") public static WebElement shortTermPlans;
    @FindBy(xpath = "//a[contains(text(),'View small business plans')]") public static WebElement smallBusinessPlans;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#/census?LeadSourceName=UHC-Website-Dental']") public static WebElement dentalPlans;
    @FindBy(xpath = "//a[@href='https://www.uhccommunityplan.com']") public static WebElement medicaidPlans;
    @FindBy(xpath = "//a[@href='/employer']") public static WebElement smallBusinessPlansHeader;
    @FindBy(xpath = "//input[@class='ng-pristine ng-valid ng-valid-maxlength']") public static WebElement medicarePlansZipCode;
    @FindBy(xpath = "//a[@class='trigger-closed']") public static WebElement shopMedicareSupplementPlansButton;
    @FindBy(xpath = "//button[contains(text(),'No, thanks')]") public static WebElement noThanksButton;
    @FindBy(xpath = "//input[@name='zipCode']") public static WebElement zipCodeInput;
    @FindBy(xpath = "//label[contains(text(),'Male')]") public static WebElement male;
    @FindBy(className = "form-control mc-input-short ng-pristine ng-valid ng-not-empty ng-valid-age-not-in-range ng-valid-date-invalid ng-valid-required ng-valid-maxlength ng-valid-mask ng-touched") public static WebElement DOB;

    public void homeButton() {
        homeButton.click();
        String text = homeButton.getText();
        Assert.assertEquals(text, "Home");
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
        smallBusinessPlans.click();
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
        noThanksButton.click();
        medicarePlansZipCode.sendKeys("33186", Keys.ENTER);
        shopMedicareSupplementPlansButton.click();
    }
    public void shopIndividualOrFamilyPlans() {
        individualOrFamiliesPlans();
        zipCodeInput.sendKeys("33186");
        male.click();
        DOB.sendKeys("06121997", Keys.ENTER);
    }
}

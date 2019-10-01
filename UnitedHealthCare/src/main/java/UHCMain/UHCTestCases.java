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
    @FindBy(xpath = "//a[@href='https://www.aarpmedicareplans.com/health-plans.html?WT.mc_id=8009511']") public static WebElement medicarePlans;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#?LeadsourceName=UHC-Website']") public static WebElement individualNFamiliesPlans;

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
        Assert.assertEquals(text, "Medicare Plans");
    }
    public void individualNFamiliesPlans() {
        individualNFamiliesPlans.click();
        Assert.assertTrue(individualNFamiliesPlans.getText().contains("individual or family plans"));
    }


}

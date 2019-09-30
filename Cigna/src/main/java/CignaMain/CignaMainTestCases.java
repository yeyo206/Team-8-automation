package CignaMain;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import javax.xml.xpath.XPath;
import java.util.List;

public class CignaMainTestCases extends CommonAPI {

    @FindBy(xpath = "//a[contains(text() , 'Privacy')]")
    public static WebElement privacyButton;
    @FindBy(xpath = "//h1")
    public static WebElement header;
    @FindBy(xpath = "//ul[@class = 'navbar-nav align-items-center ml-auto universal-navigation-buttons']/li/a")
    public static List<WebElement> topLinks;
    //@FindBy(xpath = "//div/p[contains(text(), 'About')]") public static WebElement aboutHeader;
    @FindBy(xpath = "//h2[@class = 'homepage-h2']")
    public static WebElement espanolHeader;
    @FindBy(xpath = "(//input[@placeholder='Search Cigna.com'])[1]")
    public static WebElement searchBar;
    @FindBy(xpath = "//div[@class ='csng-search-key']")
    public static WebElement searchBarResult;
    @FindBy(xpath = "(//a[@class = 'btn btn-sm btn-primary'])[1]")
    public static WebElement findDoctorButton;
    @FindBy(xpath = "(//a[@class = 'btn btn-sm btn-primary'])[2]")
    public static WebElement signInButton;
    @FindBy(xpath = "//ul[@class='nav mr-auto']/li")
    public static List<WebElement> middleButtonBar;
    @FindBy(xpath = "//ul[@class='navbar-nav mr-auto']/li")
    public static List<WebElement> individualsAndFamilyOptions;
    @FindBy(xpath = "(//a[contains(text() , 'Dental Insurance Plans')])[1]")
    public static WebElement dentalPlanButton;
    @FindBy(xpath = "(//a[contains(text() , 'Other Supplemental Insurance')])[1]")
    public static WebElement otherSuplementalInsuranceButton;
    @FindBy(xpath = "//a[contains(text() , 'International Health Insurance')]")
    public static WebElement internationalInsuranceButton;
    @FindBy(xpath = "//a[contains(text() , 'Buying Insurance: How to Choose the Right Plan')]")
    public static WebElement buyingInsuranceButton;
    @FindBy(xpath = "//a[contains(text() , 'Health Care Reform: What It Means For You')]")
    public static WebElement healthcareReformButton;
    @FindBy(xpath = "//a[contains(text() , 'How to Shop the Health Insurance Marketplace')]")
    public static WebElement howToShopButton;
    @FindBy(xpath = "//a[contains(text() , 'Copays, Deductibles, and Coinsurance')]")
    public static WebElement copayButton;
    @FindBy(xpath = "(//a[contains(text() , 'Understanding Provider Networks')])[1]")
    public static WebElement providersButton;
    @FindBy(xpath = "//a[contains(text() , 'Common Insurance Plan Types: HMO, PPO, EPO')]")
    public static WebElement commonInsruanceButon;
    @FindBy(xpath = "//a[contains(text() , 'Finding or Changing Doctors')]")
    public static WebElement findingDoctorButton;
    @FindBy(xpath = "//a[contains(text() , 'HSA, FSA, and HRA Reimbursements')]") public static WebElement hsaButton;
    @FindBy(xpath = "//a[contains(text() , 'Prescription Drug Lists')]") public static WebElement prescriptionButton;
    @FindBy(xpath = "//a[contains(text() , 'Claims and EOBs')]") public static WebElement claimsButton;
    @FindBy(xpath = "//a[contains(text() , 'Request an ID Card')]") public static WebElement requestIdCardButton;
    @FindBy(xpath = "(//a[contains(text() , 'Cigna Mobile Apps')])[1]") public static WebElement cignaMobileApp;
    @FindBy(xpath = "//a[contains(text() , 'Customer Services')]") public static WebElement customerServicesButton;
    @FindBy(xpath = "//a[contains(text() , 'Programs for Members')]") public static WebElement programsForMmbersButton;
    @FindBy(xpath = "//a[contains(text() , 'Autism')]") public static WebElement autismButton;
    @FindBy(xpath = "//a[contains(text() , 'Dental Health')]") public static WebElement dentalHealthButton;
    @FindBy(xpath = "//a[contains(text() , 'Disaster Resource Center')]") public static WebElement disasterResourceButton;
    @FindBy (xpath = "//a[contains(text() , 'Eating Disorders')]") public static WebElement  eatingDisordersButton;
    @FindBy (xpath = "//a[contains(text() , 'Eating Well')]") public static WebElement eatingWellbutton;
    @FindBy(xpath = "//a[contains(text() , 'Exercise and Fitness')]") public static WebElement exerciseButton;
    @FindBy(xpath = "//a[contains(text() , 'Family Care')]") public static WebElement familyCareButton;
    @FindBy(xpath = "//a[contains(text() , 'Healthy Aging')]") public static WebElement healthyAgingButton;
    @FindBy(xpath = "//a[contains(text() , 'LGBT Health')]") public static WebElement lgbtHealthButton;
    @FindBy(xpath = "//a[contains(text() , 'Mental Health')]") public static WebElement mentalHealthButton;
    @FindBy(xpath = "//a[contains(text() , 'Military and Veteran Support')]") public static WebElement militaryButton;
    @FindBy(xpath = "//a[contains(text() , 'Substance Use Disorders')]") public static WebElement substanceButton;
    @FindBy(xpath = "//a[contains(text() , 'Suicide Awareness and Prevention')]")public static WebElement suicideButton;
    @FindBy(xpath = "//a[contains(text() , 'Diseases and Conditions')]") public static WebElement diseasesButton;
    @FindBy(xpath = "//a[contains(text() , 'Medical Tests')]") public static WebElement medicalTestButton;
    @FindBy(xpath = "//a[contains(text() , 'Medications')]") public static WebElement medicationButton;
    @FindBy(xpath = "//a[contains(text() , 'HRA and HSA Plans')]") public static WebElement hraAndHsaPlans;
    @FindBy(xpath = "//a[contains(text() , 'Cigna SureFit® Plans')]") public static WebElement cignaSurefitButton;

    public void clickPrivacyButton() {
        privacyButton.click();
        Assert.assertTrue(header.getText().toLowerCase().contains("privacy"));
    }
    public void clickCignaInternational() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element : topLinks
        ) {
            if (element.getText().equalsIgnoreCase("Cigna international")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("CIGNA INTERNATIONAL HEALTH INSURANCE"));
    }
    public void clickContactUs() {
        for (WebElement element : topLinks
        ) {
            if (element.getText().equalsIgnoreCase("contact us")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(header.getText().equalsIgnoreCase("contact us"));
    }
    public void clickEspanolButton() {
        for (WebElement element : topLinks
        ) {
            if (element.getText().contains("Español")) {

                element.click();
                break;
            }
        }
        Assert.assertTrue(espanolHeader.getText().contains(
                "En Cigna, somos tu socio en salud integral y bienestar."));
    }
    public void searchBarSearch() {
        searchBar.click();
        new Actions(driver).sendKeys(searchBar, "health plans" + Keys.ENTER).build().perform();
        Assert.assertTrue(searchBarResult.getText().contains("health plans"));
    }
    public void clickFindDoctor() {
        findDoctorButton.click();
        Assert.assertTrue(header.getText().contains("Find a Doctor, Dentist, or Facility"));
    }
    public void clickSignIn() {
        signInButton.click();
    }
    public void clickIndividualsAndFamily() {
        for (WebElement element : middleButtonBar
        ) {
            if (element.getText().contains("Individuals and Families")) {
                element.click();
                break;
            }
        }
    }
    public void clickPlansAndServices() {
        middleButtonBar.get(0).click();
        for (WebElement element : individualsAndFamilyOptions
        ) {
            if (element.getText().contains("Plans")) {
                element.click();
                break;
            }
        }
    }

    public void clickDentalPLan() {
        clickPlansAndServices();
        dentalPlanButton.click();
        Assert.assertTrue(header.getText().contains("Cigna Dental insurance can help you save."));
    }

    public void clickOtherSuplementalInsurance() {
        clickPlansAndServices();
        otherSuplementalInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Supplemental Insurance Policies"));
    }

    public void clickInternationalInsuranceButton() {
        clickPlansAndServices();
        internationalInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("CIGNA INTERNATIONAL HEALTH INSURANCE"));
    }

    public void clickUnderstandingInsurance() {
        middleButtonBar.get(0).click();
        for (WebElement element : individualsAndFamilyOptions
        ) {
            if (element.getText().contains("Understanding Insurance")) {
                element.click();
                break;
            }
        }
        //assert
    }

    public void clickBuyingInsurance() {
        clickUnderstandingInsurance();
        buyingInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Buying Health Insurance: How to Choose the Right Plan"));
    }

    public void clickHealthcareReformClick() {
        clickUnderstandingInsurance();
        healthcareReformButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Health Care Reform and What it Means for You"));
    }

    public void clickHowToShop() {
        clickUnderstandingInsurance();
        howToShopButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("How to Shop the Health Insurance Marketplace"));
    }

    public void clickCopayButton() {
        clickUnderstandingInsurance();
        copayButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Copays, Deductibles and Coinsurance"));
    }

    public void clickProvidersNetwork() {
        clickUnderstandingInsurance();
        providersButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Understanding Provider Networks"));
    }

    public void clickCommonInsurancePlan() {
        clickUnderstandingInsurance();
        commonInsruanceButon.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("What's the Difference Between an HMO, EPO, and PPO?"));
    }

    public void memberResources() {
        middleButtonBar.get(0).click();
        for (WebElement element : individualsAndFamilyOptions
        ) {
            if (element.getText().contains("Member Resources")) {
                element.click();
                break;
            }
        }
    }
    public void clickFindingDoctors(){
        memberResources();
        findingDoctorButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Choosing or Changing Doctors"));
    }
    public void clickHsaButton(){
        memberResources();
        hsaButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("How to Use Your HSA, HRA, or FSA"));
    }
    public void clickPrescriptionAndDrugButton(){
        memberResources();
        prescriptionButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Prescription Drug Lists and Coverage"));
    }
    public void clickClaimsButton(){
        memberResources();
        claimsButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Claims, Authorizations, and Explanations of Benefits (EOBs)"));
    }
    public void clickRequestIdCard(){
        memberResources();
        requestIdCardButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Request an ID Card"));
    }
    public void clickCignaMobileApp(){
        memberResources();
        cignaMobileApp.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Manage Your Health with Cigna Mobile Apps"));

    }
    public void clickCustomerServices(){
        memberResources();
        customerServicesButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Contact Us"));

    }
    public void clickProgramsButton(){
        memberResources();
        programsForMmbersButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Always by your side"));
    }
    public void clickHealthAndWellnessButton() {
        middleButtonBar.get(0).click();
        for (WebElement element : individualsAndFamilyOptions
        ) {
            if (element.getText().contains("Health and Wellness")) {
                element.click();
                break;
            }
        }
    }
    public void clickAutismButton(){
        clickHealthAndWellnessButton();
        autismButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Autism"));
    }
    public void clickDentalHelthButton(){
        clickHealthAndWellnessButton();
        dentalHealthButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Dental Health"));
    }
    public void clickDisasterResourcesButton(){
        clickHealthAndWellnessButton();
        disasterResourceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Disaster Resource Center"));
    }
    public void clickEatingDisordersButton(){
        clickHealthAndWellnessButton();
        eatingDisordersButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Eating Disorders"));
    }
    public void clickEatingWellButton(){
        clickHealthAndWellnessButton();
        eatingWellbutton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Eating Well"));
    }
    public void clickExercisesButton(){
        clickHealthAndWellnessButton();
        exerciseButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Exercise and Fitness"));
    }
    public void clickFamilyCareButton(){
        clickHealthAndWellnessButton();
        familyCareButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Family Care"));
    }
    public void clickHealthyAgingButton(){
        clickHealthAndWellnessButton();
        healthyAgingButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Healthy Aging"));
    }
    public void clickLgbtButton(){
        clickHealthAndWellnessButton();
        lgbtHealthButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("LGBT Health"));
    }
    public void clickMentalHealthButton(){
        clickHealthAndWellnessButton();
        mentalHealthButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Mental Health"));
    }
    public void clickMilitaryButton(){
        clickHealthAndWellnessButton();
        militaryButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Military and Veteran Resources"));
    }
    public void clickSubstanceButton(){
        clickHealthAndWellnessButton();
        substanceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Substance Use Disorders"));
    }
    public void clickSuicideButton(){
        clickHealthAndWellnessButton();
        suicideButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Suicide Awareness and Prevention"));
    }
    public void clickDiseaseButton(){
        clickHealthAndWellnessButton();
        diseasesButton.click();
        Assert.assertTrue(header.getText().contains("Wellness and Medical Topics"));
    }
    public void clickMedicalTestButton(){
        clickHealthAndWellnessButton();
        medicalTestButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Medical Tests: A"));
    }
    public void clickMedicationButton(){
        clickHealthAndWellnessButton();
        medicationButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Medications: A"));
    }
    public void clickEmployersAndBrokers() {
        middleButtonBar.get(1).click();

    }
    public void clickPlanAndServicesForEmployers(){
        middleButtonBar.get(1).click();
        for (WebElement element : individualsAndFamilyOptions
        ) {
            if (element.getText().contains("Plans and Services")) {
                element.click();
                break;
            }
        }
    }
    public void clickHsaAndHraButton(){
        clickPlanAndServicesForEmployers();
        hraAndHsaPlans.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Health Savings Account (HSA) and Health Reimbursement Account (HRA)"));
    }
    public void clickCignaSurefit(){
        clickPlanAndServicesForEmployers();
        cignaSurefitButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna SureFit Medical Plans"));
    }


}

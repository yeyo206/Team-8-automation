package CignaMain;

import Base.CommonAPI;
import KeywordDriven.ActionsToDo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public static WebElement otherSupplementalInsuranceButton;
    @FindBy(xpath = "//a[contains(text() , 'International Health Insurance')]")
    public static WebElement internationalInsuranceButton;
    @FindBy(xpath = "//a[contains(text() , 'Buying Insurance: How to Choose the Right Plan')]")
    public static WebElement buyingInsuranceButton;
    @FindBy(xpath = "//a[contains(text() , 'Health Care Reform: What It Means For You')]")
    public static WebElement healthCareReformButton;
    @FindBy(xpath = "//a[contains(text() , 'How to Shop the Health Insurance Marketplace')]")
    public static WebElement howToShopButton;
    @FindBy(xpath = "//a[contains(text() , 'Copays, Deductibles, and Coinsurance')]")
    public static WebElement copayButton;
    @FindBy(xpath = "(//a[contains(text() , 'Understanding Provider Networks')])[1]")
    public static WebElement providersButton;
    @FindBy(xpath = "//a[contains(text() , 'Common Insurance Plan Types: HMO, PPO, EPO')]")
    public static WebElement commonInsuranceButton;
    @FindBy(xpath = "//a[contains(text() , 'Finding or Changing Doctors')]")
    public static WebElement findingDoctorButton;
    @FindBy(xpath = "//a[contains(text() , 'HSA, FSA, and HRA Reimbursements')]") public static WebElement hsaButton;
    @FindBy(xpath = "//a[contains(text() , 'Prescription Drug Lists')]") public static WebElement prescriptionButton;
    @FindBy(xpath = "//a[contains(text() , 'Claims and EOBs')]") public static WebElement claimsButton;
    @FindBy(xpath = "//a[contains(text() , 'Request an ID Card')]") public static WebElement requestIdCardButton;
    @FindBy(xpath = "(//a[contains(text() , 'Cigna Mobile Apps')])[1]") public static WebElement cignaMobileApp;
    @FindBy(xpath = "//a[contains(text() , 'Customer Services')]") public static WebElement customerServicesButton;
    @FindBy(xpath = "//a[contains(text() , 'Programs for Members')]") public static WebElement programsForMembersButton;
    @FindBy(xpath = "//a[contains(text() , 'Autism')]") public static WebElement autismButton;
    @FindBy(xpath = "//a[contains(text() , 'Dental Health')]") public static WebElement dentalHealthButton;
    @FindBy(xpath = "//a[contains(text() , 'Disaster Resource Center')]")
    public static WebElement disasterResourceButton;
    @FindBy (xpath = "//a[contains(text() , 'Eating Disorders')]") public static WebElement  eatingDisordersButton;
    @FindBy (xpath = "//a[contains(text() , 'Eating Well')]") public static WebElement eatingWellButton;
    @FindBy(xpath = "//a[contains(text() , 'Exercise and Fitness')]") public static WebElement exerciseButton;
    @FindBy(xpath = "//a[contains(text() , 'Family Care')]") public static WebElement familyCareButton;
    @FindBy(xpath = "//a[contains(text() , 'Healthy Aging')]") public static WebElement healthyAgingButton;
    @FindBy(xpath = "//a[contains(text() , 'LGBT Health')]") public static WebElement lgbtHealthButton;
    @FindBy(xpath = "//a[contains(text() , 'Mental Health')]") public static WebElement mentalHealthButton;
    @FindBy(xpath = "//a[contains(text() , 'Military and Veteran Support')]") public static WebElement militaryButton;
    @FindBy(xpath = "//a[contains(text() , 'Substance Use Disorders')]") public static WebElement substanceButton;
    @FindBy(xpath = "//a[contains(text() , 'Suicide Awareness and Prevention')]")
    public static WebElement suicideButton;
    @FindBy(xpath = "//a[contains(text() , 'Diseases and Conditions')]") public static WebElement diseasesButton;
    @FindBy(xpath = "//a[contains(text() , 'Medical Tests')]") public static WebElement medicalTestButton;
    @FindBy(xpath = "//a[contains(text() , 'Medications')]") public static WebElement medicationButton;
    @FindBy(xpath = "//a[contains(text() , 'HRA and HSA Plans')]") public static WebElement hraAndHsaPlans;
    @FindBy(xpath = "//a[contains(text() , 'Cigna SureFit® Plans')]") public static WebElement cignaSureFitButton;
    @FindBy(xpath = "//a[contains(text(), 'LocalPlus® Plans')]") public static WebElement localPlusButton;
    @FindBy(xpath = "//a[contains(text(), 'Open Access Plus Plans')]")
    public static WebElement openAccessPlusPLanButton;
    @FindBy(xpath = "//a[contains(text(), 'PPO Plans')]") public static WebElement ppoPlansButton;
    @FindBy(xpath = "//a[contains(text(), 'HMO Plans')]") public static WebElement hmoPlansButton;
    @FindBy(xpath = "//a[contains(text(), 'Network Plans')]") public static WebElement networkPlansButton;
    @FindBy(xpath = "//a[contains(text(), 'Indemnity Plans')]") public static WebElement indemnityButton;
    @FindBy(xpath = "//a[contains(text(), 'Dental Insurance')]") public static WebElement dentalInsuranceButton;
    @FindBy(xpath = "//a[contains(text(), 'Vision Insurance')]") public static WebElement visionInsuranceButton;
    @FindBy(xpath = "//a[contains(text(), 'Pharmacy Benefits')]") public static WebElement pharmacyBenefitsButton;
    @FindBy(xpath = "//a[contains(text(), 'Specialty Pharmacy Management')]")
    public static WebElement pharmacyManagement;
    @FindBy(xpath = "//a[contains(text(), 'Behavioral Health Benefits')]") public static WebElement behavioralButton;
    @FindBy(xpath = "//a[contains(text(), 'Population Health Management')]") public static WebElement populationButton;
    @FindBy(xpath = "//a[contains(text(), 'Cigna Onsite Health® Services')]")
    public static WebElement cignaOnsiteButton;
    @FindBy(xpath = "//a[contains(text(), 'Group Life Insurance')]") public static WebElement groupLifeButton;
    @FindBy(xpath = "(//a[contains(text(), 'Critical Illness Insurance')])[1]")
    public static WebElement criticalIllnessButton;
    @FindBy(xpath = "//a[contains(text(), 'AD&D Insurance')]") public static WebElement addInsuranceButton;
    @FindBy(xpath = "(//a[contains(text(), 'Accidental Injury Insurance')])[1]")
    public static WebElement accidentalButton;
    @FindBy(xpath = "//a[contains(text(), 'Hospital Care Insurance')]") public static WebElement hospitalCareButton;
    @FindBy(xpath = "//a[contains(text(), 'Group Disability Insurance')]")public static WebElement groupDisabilityButton;
    @FindBy(xpath = "//a[contains(text(), 'Cigna Leave Solutions®')]")public static WebElement cignaLeaveSolutions;
    @FindBy(xpath = "//a[contains(text(), 'Funding Solutions')]") public static WebElement fundingSolutionsButton;
    @FindBy(xpath = "//a[contains(text(), 'Stop Loss Solutions')]") public static WebElement stopLossSolutionsButton;
    @FindBy(xpath = "//a[contains(text(), 'Defined Contributions')]")public static  WebElement definedContributionButton;
    @FindBy(xpath = "(//a[contains(text(), 'Flexible Spending Accounts')])[1]")
    public static WebElement flexibleSpendingButton;
    @FindBy(xpath = "(//a[contains(text(), 'Small Employers (51-499)')])[1]")
    public static WebElement smallEmployersButton;

    ActionsToDo actionsToDo = new ActionsToDo();



    public void clickPrivacyButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        actionsToDo.perform(ActionsToDo.Actions.click,privacyButton,"ss");
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBar.click();
        new Actions(driver).sendKeys(searchBar, "health plans" + Keys.ENTER).build().perform();
        Assert.assertTrue(searchBarResult.getText().contains("health plans"));
    }
    public void clickFindDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findDoctorButton.click();
        Assert.assertTrue(header.getText().contains("Find a Doctor, Dentist, or Facility"));
    }
    public void clickSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInButton.click();
    }
    public void clickIndividualsAndFamily() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (WebElement element : middleButtonBar
        ) {
            if (element.getText().contains("Individuals and Families")) {
                element.click();
                break;
            }
        }
    }
    public void clickPlansAndServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlansAndServices();
        dentalPlanButton.click();
        Assert.assertTrue(header.getText().contains("Cigna Dental insurance can help you save."));
    }

    public void clickOtherSuplementalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlansAndServices();
        otherSupplementalInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Supplemental Insurance Policies"));
    }

    public void clickInternationalInsuranceButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlansAndServices();
        internationalInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("CIGNA INTERNATIONAL HEALTH INSURANCE"));
    }

    public void clickUnderstandingInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUnderstandingInsurance();
        buyingInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Buying Health Insurance: How to Choose the Right Plan"));
    }

    public void clickHealthcareReformClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUnderstandingInsurance();
        healthCareReformButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Health Care Reform and What it Means for You"));
    }

    public void clickHowToShop() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUnderstandingInsurance();
        howToShopButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("How to Shop the Health Insurance Marketplace"));
    }

    public void clickCopayButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUnderstandingInsurance();
        copayButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Copays, Deductibles and Coinsurance"));
    }

    public void clickProvidersNetwork() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUnderstandingInsurance();
        providersButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Understanding Provider Networks"));
    }

    public void clickCommonInsurancePlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickUnderstandingInsurance();
        commonInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("What's the Difference Between an HMO, EPO, and PPO?"));
    }

    public void memberResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
        findingDoctorButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Choosing or Changing Doctors"));
    }
    public void clickHsaButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
        hsaButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("How to Use Your HSA, HRA, or FSA"));
    }
    public void clickPrescriptionAndDrugButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
        prescriptionButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Prescription Drug Lists and Coverage"));
    }
    public void clickClaimsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
        claimsButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Claims, Authorizations, and Explanations of Benefits (EOBs)"));
    }
    public void clickRequestIdCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
        requestIdCardButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Request an ID Card"));
    }
    public void clickCignaMobileApp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
        cignaMobileApp.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Manage Your Health with Cigna Mobile Apps"));

    }
    public void clickCustomerServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
        customerServicesButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Contact Us"));

    }
    public void clickProgramsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
        programsForMembersButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Always by your side"));
    }
    public void clickHealthAndWellnessButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        autismButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Autism"));
    }
    public void clickDentalHelthButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        dentalHealthButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Dental Health"));
    }
    public void clickDisasterResourcesButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        disasterResourceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Disaster Resource Center"));
    }
    public void clickEatingDisordersButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        eatingDisordersButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Eating Disorders"));
    }
    public void clickEatingWellButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        eatingWellButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Eating Well"));
    }
    public void clickExercisesButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        exerciseButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Exercise and Fitness"));
    }
    public void clickFamilyCareButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        familyCareButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Family Care"));
    }
    public void clickHealthyAgingButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        healthyAgingButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Healthy Aging"));
    }
    public void clickLgbtButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        lgbtHealthButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("LGBT Health"));
    }
    public void clickMentalHealthButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        mentalHealthButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Mental Health"));
    }
    public void clickMilitaryButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        militaryButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Military and Veteran Resources"));
    }
    public void clickSubstanceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        substanceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Substance Use Disorders"));
    }
    public void clickSuicideButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        suicideButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Suicide Awareness and Prevention"));
    }
    public void clickDiseaseButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        diseasesButton.click();
        Assert.assertTrue(header.getText().contains("Wellness and Medical Topics"));
    }
    public void clickMedicalTestButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        medicalTestButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Medical Tests: A"));
    }
    public void clickMedicationButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthAndWellnessButton();
        medicationButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Medications: A"));
    }
    public void clickEmployersAndBrokers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        middleButtonBar.get(1).click();

    }
    public void clickPlanAndServicesForEmployers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        hraAndHsaPlans.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Health Savings Account (HSA) and Health Reimbursement Account (HRA)"));
    }
    public void clickCignaSurefit(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        cignaSureFitButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna SureFit Medical Plans"));
    }
    public void clickLocalPlus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        localPlusButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna LocalPlus® Plans"));
    }
    public void clickOpenAccessButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        openAccessPlusPLanButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna Open Access Plus Medical Plans"));
    }
    public void clickPPOPlansButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        ppoPlansButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna PPO Medical Plans"));
    }
    public void clickHmoPlansButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        hmoPlansButton.click();
        Assert.assertTrue(header.getText().contains("Cigna Health Maintenance Organization (HMO) Medical Plans"));
    }
    public void clickNetworkPlansButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        networkPlansButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna Medical Network Plans"));
    }
    public void clickIndenminityPlanButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        indemnityButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Medical Indemnity Plan"));
    }
    public void clickDentalInsuranceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        dentalInsuranceButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Group Dental Insurance for Employers"));
    }
    public void clickVisionInsuranceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        visionInsuranceButton.click();
        Assert.assertTrue(header.getText()
                .equalsIgnoreCase("Group Vision Plans for Employers and Organizations"));
    }
    public void clickPharmacyButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        pharmacyBenefitsButton.click();
        Assert.assertTrue(header.getText().
                equalsIgnoreCase("The Power of Cigna's Integrated Pharmacy Benefits"));
    }
    public void clickPharmacyManagement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        pharmacyManagement.click();
        Assert.assertTrue(header.getText()
                .equalsIgnoreCase("Accelerating a New Model in Specialty Pharmacy Management"));
    }
    public void clickBehavioralButton(){
        clickPlanAndServicesForEmployers();
        behavioralButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna Behavioral Health"));
    }
    public void clickPopulationHealthButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        populationButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna Health and Wellness Programs"));
    }
    public void clickCignaOnsiteButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        cignaOnsiteButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna Onsite Health Services"));
    }
    public void clickGroupLifeButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        groupLifeButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna Group Life Insurance"));
    }
    public void clickCriticalIllnessButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        criticalIllnessButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Critical Illness Insurance"));
    }
    public void clickADDInsuranceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        addInsuranceButton.click();
        Assert.assertTrue(header.getText()
                .equalsIgnoreCase("Accidental Death and Dismemberment (AD&D) Insurance"));
    }
    public void clickAccidentalInsuranceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        accidentalButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Accidental Injury Insurance"));
    }
    public void clickHospitalCareInsurance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        hospitalCareButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Hospital Care (Indemnity) Insurance"));
    }
    public void clickGroupDisabilityButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        groupDisabilityButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Disability Insurance"));
    }
    public void clickCignaLeaveSolutionsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        cignaLeaveSolutions.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna Leave Solutions® – FMLA/ADA/Leave Administration"));
    }
    public void clickFundingSolutionButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        fundingSolutionsButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Funding Solutions"));
    }
    public void clickStopLossSolutions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        stopLossSolutionsButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Medical Stop Loss Insurance"));
    }
    public void clickDefinedSolutionsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        definedContributionButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Defined Contribution Strategy"));
    }
    public void clickFlexibleSpendingButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlanAndServicesForEmployers();
        flexibleSpendingButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Cigna Flexible Spending Accounts"));
    }
    public void clickWhoWeServe(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        middleButtonBar.get(1).click();
        for (WebElement element : individualsAndFamilyOptions
        ) {
            if (element.getText().contains("Who We Serve")) {
                element.click();
                break;
            }
        }
    }
    public void clickSmallEmplyers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickWhoWeServe();
        smallEmployersButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Benefit Solutions for Small Business (51-499 employees)*"));
    }
}

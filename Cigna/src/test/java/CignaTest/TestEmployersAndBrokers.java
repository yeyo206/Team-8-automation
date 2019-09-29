package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEmployersAndBrokers extends CignaMainTestCases {

    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void testClickDiseaseButton(){
        clickDiseaseButton();
    }
    @Test
    public void testMedicalPlanButton(){
        clickMedicalTestButton();
    }
    @Test
    public void testMedicationButton(){
        clickMedicationButton();
    }
    @Test
    public void testEmployersAndBrokers(){
        clickEmployersAndBrokers();
    }
    @Test
    public void testPlansAndServicesForEmployers(){
        clickPlanAndServicesForEmployers();
    }
    @Test
    public void testClickHsaAndHraButton(){
        clickHsaAndHraButton();
    }
    @Test
    public void testClickCignaFitBitButton(){
        clickCignaSurefit();
    }
}

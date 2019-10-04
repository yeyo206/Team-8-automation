package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPlanAndServicesFromEmployersExtension extends CignaMainTestCases {
    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void clickVisionInsuranceButtonTest(){
        clickVisionInsuranceButton();
    }
    @Test
    public void clickPharmacyButtonTest(){
        clickPharmacyButton();
    }
    @Test
    public void clickPharmacyManagementTest(){
        clickPharmacyManagement();
    }
    @Test
    public void clickBehavioralButtonTest(){
        clickBehavioralButton();
    }
    @Test
    public void clickPopulationButton(){
        clickPopulationHealthButton();
    }
    @Test
    public void clickCignaOnsiteButtonT(){
        clickCignaOnsiteButton();
    }
    @Test
    public void clickGroupLifeInsurance(){
        clickGroupLifeButton();
    }
}

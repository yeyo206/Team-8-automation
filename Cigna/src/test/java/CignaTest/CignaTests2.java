package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaTests2 extends CignaMainTestCases {

    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void testIndividualsAndFamilyButton(){
        clickIndividualsAndFamily();
    }

    @Test
    public void testPlansAndServices(){
        clickPlansAndServices();
    }
    @Test
    public void testDentalPlanButton(){
        clickDentalPLan();
    }
    @Test
    public void testOtherSuplementalInsurance(){
        clickOtherSuplementalInsurance();
    }
    @Test
    public void testClickInternationalInsurance(){
        clickInternationalInsuranceButton();
    }
    @Test
    public void testMemberSources(){
        memberResources();
    }
    @Test
    public void testFindingButton(){
        clickFindingDoctors();
    }

}

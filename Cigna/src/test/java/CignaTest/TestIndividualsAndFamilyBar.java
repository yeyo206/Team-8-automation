package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestIndividualsAndFamilyBar extends CignaMainTestCases {

    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @org.testng.annotations.Test
    public void testIndividualsAndFamilyButton(){
        clickIndividualsAndFamily();
    }

    @org.testng.annotations.Test
    public void testPlansAndServices(){
        clickPlansAndServices();
    }
    @org.testng.annotations.Test
    public void testDentalPlanButton(){
        clickDentalPLan();
    }
    @org.testng.annotations.Test
    public void testOtherSuplementalInsurance(){
        clickOtherSuplementalInsurance();
    }
    @org.testng.annotations.Test
    public void testClickInternationalInsurance(){
        clickInternationalInsuranceButton();
    }
    @org.testng.annotations.Test
    public void testMemberSources(){
        memberResources();
    }
    @org.testng.annotations.Test
    public void testFindingButton(){
        clickFindingDoctors();
    }

}

package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestIndividualsAndFamilyBar extends CignaMainTestCases {

    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @org.testng.annotations.Test
    public void testIndividualsAndFamilyButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickIndividualsAndFamily();
    }

    @org.testng.annotations.Test
    public void testPlansAndServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPlansAndServices();
    }
    @org.testng.annotations.Test
    public void testDentalPlanButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickDentalPLan();
    }
    @org.testng.annotations.Test
    public void testOtherSuplementalInsurance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOtherSuplementalInsurance();
    }
    @org.testng.annotations.Test
    public void testClickInternationalInsurance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickInternationalInsuranceButton();
    }
    @org.testng.annotations.Test
    public void testMemberSources(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResources();
    }
    @org.testng.annotations.Test
    public void testFindingButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickFindingDoctors();
    }

}

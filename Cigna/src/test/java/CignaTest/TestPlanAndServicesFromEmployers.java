package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestPlanAndServicesFromEmployers extends CignaMainTestCases {

    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void clickLocalPlusButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickLocalPlus();
    }
    @Test
    public void clickOpenAccessButtonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOpenAccessButton();
    }
    @Test
    public void clickPPOPlansButtonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickPPOPlansButton();
    }
    @Test
    public void clickHmoPlansButtonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHmoPlansButton();
    }
    @Test
    public void clickNetworkPLansButtonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickNetworkPlansButton();
    }
    @Test
    public void clickIndemnityPlanButtonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickIndenminityPlanButton();
    }
    @Test
    public void clickDentalInsurancePlanButtonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickDentalInsuranceButton();
    }
}

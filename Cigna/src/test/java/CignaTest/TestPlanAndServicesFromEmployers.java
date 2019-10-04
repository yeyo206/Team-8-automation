package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPlanAndServicesFromEmployers extends CignaMainTestCases {

    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void clickLocalPlusButton(){
        clickLocalPlus();
    }
    @Test
    public void clickOpenAccessButtonTest(){
        clickOpenAccessButton();
    }
    @Test
    public void clickPPOPlansButton(){
        clickPPOPlansButton();
    }
    @Test
    public void clickHmoPlansButtonTest(){
        clickHmoPlansButton();
    }
    @Test
    public void clickNetworkPLansButtonTest(){
        clickNetworkPlansButton();
    }
    @Test
    public void clickIndemnityPlanButtonTest(){
        clickIndenminityPlanButton();
    }
    @Test
    public void clickDentalInsurancePlanButtonTest(){
        clickDentalInsuranceButton();
    }
}

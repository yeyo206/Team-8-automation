package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaTests3  extends CignaMainTestCases{
    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }
    @Test
    public void testUnderstandingInsurance(){
        clickUnderstandingInsurance();
    }
    @Test
    public void testBuyingInsuranceButton(){
        clickBuyingInsurance();
    }
    @Test
    public void testClickHealthcareReform(){
        clickHealthcareReformClick();
    }
    @Test
    public void testHowToShopButton(){
        clickHowToShop();
    }
    @Test
    public void testCopayButton(){
        clickCopayButton();
    }
    @Test
    public void testProviderButton(){
        clickProvidersNetwork();
    }
    @Test
    public void testCommonInsurance(){
        clickCommonInsurancePlan();
    }

}

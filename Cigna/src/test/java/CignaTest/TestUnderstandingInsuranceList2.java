package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUnderstandingInsuranceList2 extends CignaMainTestCases {
    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }
    @Test
    public void testClickHsaButton(){
        clickHsaButton();
    }
    @Test
    public void testPrescriptionButton(){
        clickPrescriptionAndDrugButton();
    }
    @Test
    public void testClaimsButton(){
        clickClaimsButton();
    }
    @Test
    public void testRequestIdCard(){
        clickRequestIdCard();
    }
    @Test
    public void testCignaMobileAppButton(){
        clickCignaMobileApp();
    }
    @Test
    public void testCustomerServicesButton(){
        clickCustomerServices();
    }
    @Test
    public void testProgramsButton(){
        clickProgramsButton();
    }
}

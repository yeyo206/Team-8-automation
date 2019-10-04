package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPlansAndServicesUsingSupplemental extends CignaMainTestCases {
    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void clickCriticalIllnessButtonT(){
        clickCriticalIllnessButton();
    }
    @Test
    public void clickADDInsuranceButtonT(){
        clickADDInsuranceButton();
    }
    @Test
    public void clickAccidentInjuryButtonT(){
        clickAccidentalInsuranceButton();
    }

}

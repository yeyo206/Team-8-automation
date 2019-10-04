package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestPlansAndServicesUsingSupplemental extends CignaMainTestCases {
    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void clickCriticalIllnessButtonT(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickCriticalIllnessButton();
    }
    @Test
    public void clickADDInsuranceButtonT(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickADDInsuranceButton();
    }
    @Test
    public void clickAccidentInjuryButtonT(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAccidentalInsuranceButton();
    }
    @Test
    public void clickHospitalInsuranceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHospitalCareInsurance();
    }
    @Test
    public void clickGroupDisabilityButtonT(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickGroupDisabilityButton();
    }
    @Test
    public void clickCignaLeaveSolutionsT(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickCignaLeaveSolutionsButton();
    }
    @Test
    public void clickFundingSolutionsT(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickFundingSolutionButton();
    }


}

package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestEmployersAndBrokersExtent extends CignaMainTestCases {
    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void clickStopLossSolutionsButtonT(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickStopLossSolutions();
    }
    @Test
    public void clickDefinedContributionsT(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickDefinedSolutionsButton();
    }
    @Test
    public void clickSpendingButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickFlexibleSpendingButton();
    }
    @Test
    public void clickWhoWeServet(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickWhoWeServe();
    }
    @Test
    public void clickSmallEmplyersTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSmallEmplyers();
    }

}

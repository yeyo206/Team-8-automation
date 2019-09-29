package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CignaTestsRightTopButtons extends CignaMainTestCases {

    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
       cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }

    @Test
    public void testClickPrivacy(){
        clickPrivacyButton();
    }
    @Test
    public void testClickCignaInternational(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickCignaInternational();
    }
    @Test
    public void testClickContactUs(){
        clickContactUs();
    }
    @Test
    public void testClickEspanol(){
        clickEspanolButton();
    }
    @Test
    public void testSearchBar(){
        searchBarSearch();
    }
    @Test
    public void testFindDoctor(){
        clickFindDoctor();
    }
    @Test
    public void testSignIn(){
        clickSignIn();
    }
}

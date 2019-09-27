package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaTests extends CignaMainTestCases {

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

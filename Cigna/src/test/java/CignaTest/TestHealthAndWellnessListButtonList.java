package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHealthAndWellnessListButtonList extends CignaMainTestCases {
    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }
    @Test
    public void testClickFamilyButton(){
        clickFamilyCareButton();
    }
    @Test
    public void testClickHealthyAging(){
        clickHealthyAgingButton();
    }
    @Test
    public void testClickLgbtButton(){
        clickLgbtButton();
    }
    @Test
    public void testClickMentalHealth(){
        clickMentalHealthButton();
    }
    @Test
    public void testClickMilitaryButton(){
        clickMilitaryButton();
    }
    @Test
    public void testClickSubstanceButton(){
        clickSubstanceButton();
    }
    @Test
    public void testClickSuicideButton(){
        clickSuicideButton();
    }
}

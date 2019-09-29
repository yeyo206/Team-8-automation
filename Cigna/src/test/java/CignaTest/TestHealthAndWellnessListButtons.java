package CignaTest;

import CignaMain.CignaMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHealthAndWellnessListButtons extends CignaMainTestCases {
    CignaMainTestCases cignaMainTestCases;

    @BeforeMethod
    public void initElements(){
        cignaMainTestCases =  PageFactory.initElements(driver,CignaMainTestCases.class);
    }
    @Test
    public void testHealthAndWellnessButton(){
       clickHealthAndWellnessButton();
    }
    @Test
    public void testAutismButton(){
        clickAutismButton();
    }
    @Test
    public void testDentalPlanButton(){
        clickDentalHelthButton();
    }
    @Test
    public void testDisasterResourcesButton(){
        clickDisasterResourcesButton();
    }
    @Test
    public void testEatingDisordersButon(){
        clickEatingDisordersButton();
    }
    @Test
    public void testEatingWellButton(){
        clickEatingWellButton();
    }
    @Test
    public void testExercisesButton(){
        clickExercisesButton();
    }
}

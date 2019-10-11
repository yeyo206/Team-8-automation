package EbayTest;

import EbayMainTestCases.EbayMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainButtons extends EbayMainTestCases {
    EbayMainTestCases ebayMainTestCases;

    @BeforeMethod
    public void initElements() {
        ebayMainTestCases = PageFactory.initElements(driver, EbayMainTestCases.class);
    }

    @Test
    public void testBusinessButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBusinessButton();
    }
    @Test
    public void testMusicButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickMusicButton();
    }
    @Test
    public void testDealsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickDealsButton();
    }
    @Test
    public void testHomeGardenButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHomeAndGardenButton();
    }
    @Test
    public void testFashionButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickFashionButton();
    }
    @Test
    public void testElectronicsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickElectronicsButton();
    }
    @Test
    public void testSportingGoodsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSportingGoodsButton();
    }
}

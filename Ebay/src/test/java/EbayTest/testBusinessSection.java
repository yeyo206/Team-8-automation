package EbayTest;

import EbayMainTestCases.EbayMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class testBusinessSection extends EbayMainTestCases {
    EbayMainTestCases ebayMainTestCases;

    @BeforeMethod
    public void initElements() {
        ebayMainTestCases = PageFactory.initElements(driver, EbayMainTestCases.class);
    }

    @Test
    public void tesAgricultureButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAgrecultureAndForesty();
    }
    @Test
    public void testAgricultureGpsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkAgricultureGpsButton();
    }
    @Test
    public void testMotorsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkEbayMotorsButtonFrom();
    }
    @Test
    public void testCheckCarsAndTrucksButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkCarsAndTruckButton();
    }
    @Test
    public void testMotorcylesButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkForMotorcycle();
    }
    @Test
    public void testForClassicCars(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkForClassicCars();
    }
    @Test
    public void testForExoticCars(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkForExoticCar();
    }


}

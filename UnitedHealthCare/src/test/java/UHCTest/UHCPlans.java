package UHCTest;

import UHCMain.UHCTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UHCPlans extends UHCTestCases {
    UHCTestCases uhcTestCases;

    @BeforeMethod
    public void initElements() {
        uhcTestCases = PageFactory.initElements(driver,UHCTestCases.class);
    }
    /*@Test
    public void testMedicarePlans() {
        medicarePlans();
    }*/
    @Test
    public void testIndividualNFamiliesPlans() {
        individualNFamiliesPlans();
    }
}

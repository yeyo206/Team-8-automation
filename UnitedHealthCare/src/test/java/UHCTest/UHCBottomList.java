package UHCTest;

import UHCMain.UHCTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UHCBottomList extends UHCTestCases {
    UHCTestCases uhcTestCases;

    @BeforeMethod
    public void initElements() {
        uhcTestCases = PageFactory.initElements(driver,UHCTestCases.class);
    }
    @Test
    public void testMarketplaceInsurancePlans() {
        marketPlaceInsurancePlans();
    }
    @Test
    public void testMedicare() {
        medicare();
    }
    @Test
    public void testMedicaid() {
        Medicaid();
    }
    @Test
    public void testEmployerGroupPlans() {
        employerGroupPlans();
    }
    @Test
    public void testDentalPlan() {
        dentalInsurance();
    }
    @Test
    public void testVisionInsurance() {
        visionInsurance();
    }
    @Test
    public void testShortTermHealthInsurance() {
        shortTermHealthInsurance();
    }
}

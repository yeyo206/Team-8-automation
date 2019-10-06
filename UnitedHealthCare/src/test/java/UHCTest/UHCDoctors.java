package UHCTest;

import UHCMain.UHCTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UHCDoctors extends UHCTestCases {
    UHCTestCases uhcTestCases;

    @BeforeMethod
    public void initElements() {
        uhcTestCases = PageFactory.initElements(driver, UHCTestCases.class);
    }

    @Test
    public void testFindAPhysician() {
        findAPhysician();
    }
    @Test
    public void testFindADentist() {
        findADentist();
    }
    @Test
    public void testFindAPharmacy() {
        findAPharmacy();
    }
    @Test
    public void testFindAMedicaidPhysician() {
        findAMedicaidPhysician();
    }

}

package UHCTest;

import UHCMain.UHCTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UHCHomePage extends UHCTestCases {
    UHCTestCases uhcTestCases;

    @BeforeMethod
    public void initElements() {
        uhcTestCases = PageFactory.initElements(driver,UHCTestCases.class);
    }

    @Test
    public void testHome() {
        homeButton();
    }
    @Test
    public void testInsForIndividualsNFamilies() {
        insForIndividualsNFamilies();
    }
    @Test
    public void testInsForEmployers() {
        insForEmployers();
    }
    @Test
    public void testMedicare() {
        medicare();
    }
    @Test
    public void testSearchBar() {
        searchBar();
    }
    @Test
    public void testFindADoctorButton() {
        findADoctor();
    }
    @Test
    public void testContactUsButton() {
        contactUs();
    }
}

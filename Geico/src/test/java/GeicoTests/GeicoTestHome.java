package GeicoTests;

import GeicoMainTestCases.GeicoTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeicoTestHome extends GeicoTestCases {
    GeicoTestCases geicoTestCases;

    @BeforeMethod
    public void initElements() {
        geicoTestCases = PageFactory.initElements(driver, GeicoTestCases.class);
    }
    @Test
    public void testZipCode() {
        zipCode();
    }



}

package GeicoTests;

import GeicoMainTestCases.GeicoTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchUsingDataBase extends GeicoTestCases {

    GeicoTestCases geicoTestCases;

    @BeforeMethod
    public void initElements() {
        geicoTestCases = PageFactory.initElements(driver, GeicoTestCases.class);
    }

    @Test
    public void testGeicoSearchBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchUsingMongo();
    }

}

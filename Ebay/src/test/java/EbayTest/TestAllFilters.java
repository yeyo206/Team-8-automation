package EbayTest;

import EbayMainTestCases.EbayMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAllFilters extends EbayMainTestCases {

    EbayMainTestCases ebayMainTestCases;

    @BeforeMethod
    public void initElements() {
        ebayMainTestCases = PageFactory.initElements(driver, EbayMainTestCases.class);
    }
    @Test
    public void testBuyingIphoneWithFilters(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchItemsFromSearchBar();
    }
    @Test
    public void testSearchesOnEbayMotors(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchOnEbayMotors();
    }
    @Test
    public void testAdvancedSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearchForShoes();
    }
    @Test
    public void testAdvancedSearchWithMonryFilter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearchFilterByPrice();
    }
    @Test
    public void testAdvancedSearchUsingTimeFilter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearchUsingTimeFilter();
    }
    @Test
    public void testAdvancedSearchUsingMileRange(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearchUsingMileRange();
    }
    @Test
    public void testAdvancedSearchUsingSorting(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearchUsingSorting();
    }

}

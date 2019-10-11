package EbayTest;

import EbayMainTestCases.EbayMainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class EbayTestCases extends EbayMainTestCases {

    EbayMainTestCases ebayMainTestCases;

    @BeforeMethod
    public void initElements() {
        ebayMainTestCases = PageFactory.initElements(driver, EbayMainTestCases.class);
    }

    @Test
    public void testSearchBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchForMustangParts();
    }
    @Test
    public void testAllCategories_Toys(){

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickToysAndHobbies();
    }
    @Test
    public void testByAgeCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByAgesCatogories();
    }
    @Test
    public void testShoppingCartButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickShoppingCar();
    }
    @Test
    public void testAllCategories_EbayMotors(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickEbayMotors();
    }
    @Test
    public void testSignupOption(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInUser();
    }
    @Test
    public void testLookingForItemInHobbys(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lookingForActionsFigures();
    }
}

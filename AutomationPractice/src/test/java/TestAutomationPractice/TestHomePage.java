package TestAutomationPractice;

import AutomationPracticeTests.AutomationPracticeTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends AutomationPracticeTestCases {
    AutomationPracticeTestCases automationPracticeTestCases;

    @BeforeMethod
    public void initElements() {
        automationPracticeTestCases = PageFactory.initElements(driver,AutomationPracticeTestCases.class);
    }
    @Test
    public void testCartButton() {
        cartButton();
    }
    @Test
    public void testSearchBar() {
        searchBar();
    }
    @Test
    public void testBestSellers() {
        bestSellers();
    }
    @Test
    public void testSignIn() {
        signInWithInvalidUser();
    }
    @Test
    public void testSpecials() {
        shopSpecials();
    }


}

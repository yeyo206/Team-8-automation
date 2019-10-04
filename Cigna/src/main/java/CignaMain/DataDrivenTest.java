package CignaMain;

import Base.CommonAPI;
import dataDriven.DataBaseTest;
import dataDriven.ExcelReader;
import database.ConnectToMongoDB;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class DataDrivenTest extends CommonAPI {
    @FindBy(xpath = "(//input[@placeholder='Search Cigna.com'])[1]") public static WebElement searchBar;
    @FindBy(xpath = "//search-results[summary-string[div]]") public static WebElement results;

    public void searchUsingExcelData() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for (String item : ExcelReader.getItems()
             ) {
            sendKeysByChar(item, searchBar);
            searchBar.sendKeys(Keys.ENTER);
            searchBar.clear();
            Assert.assertTrue(results.getText().contains(item));
        }
    }

    public void searchUsingMongoDB(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       List <String> items = ConnectToMongoDB.getValuesAsListItem("items", DataBaseTest.object, "item");
        for (String item: items
             ) {
            sendKeysByChar(item, searchBar);
            searchBar.sendKeys(Keys.ENTER);
            searchBar.clear();
            Assert.assertTrue(results.getText().contains(item));
        }
    }
}

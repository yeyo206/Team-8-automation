package DataDriven;

import CignaMain.DataDrivenTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenTests extends DataDrivenTest {

    DataDrivenTest dataDrivenTest;

    @BeforeMethod
    public void initElements(){
        dataDrivenTest =  PageFactory.initElements(driver, DataDrivenTest.class);
    }

    @Test
    public void searchForItemsExcel() throws Exception{
        searchUsingExcelData();
    }
    @Test
    public void searchForItemsMongoDB(){
        searchUsingMongoDB();
    }
}

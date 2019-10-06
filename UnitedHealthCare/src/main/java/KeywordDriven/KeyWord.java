package KeywordDriven;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;

public class KeyWord extends CommonAPI {
    public enum ActionsToDo {
        searchBar
    }

    public void perform(ActionsToDo actionsToDo, WebElement element, String value) throws Exception {
        System.out.println("");
        switch (actionsToDo) {
            case searchBar:
                //Set text on control
                element.sendKeys(value);
                break;
        }
    }
}

package KeywordDriven;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;

public class ActionsToDo extends CommonAPI {

    public enum Actions{
        sendKeys,
        click,
        getText,
        isDisplayed,
        clear,
    }

    public void perform(Actions actions, WebElement element, String value){
        switch(actions){
            case click:
                element.click();
                break;
            case sendKeys:
                element.sendKeys(value);
            case getText:
                element.getText();
            case isDisplayed:
                element.isDisplayed();
            case clear:
                element.clear();
        }
    }
}

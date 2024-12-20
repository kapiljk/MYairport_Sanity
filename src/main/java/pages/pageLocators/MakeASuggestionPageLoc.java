package pages.pageLocators;

import org.openqa.selenium.By;

public interface MakeASuggestionPageLoc {
    By lblHeading = By.xpath("//*[@text='MAKE A SUGGESTION']");
    By btnBack = By.xpath("//*[@text='MAKE A SUGGESTION']/preceding-sibling::*[1]/*");
    By lblTerminal = By.xpath("//*[contains(@text,'You have selected:')]");
    By txtSuggestion = By.xpath("//*[contains(@text,'You have selected:')]/following-sibling::*[1]");
    By lblRateOfExperience = By.xpath("//*[@text='Rate Your Experience']");

    default By giveRating(String num) {
        return By.xpath(String.format("//*[@text='Rate Your Experience']/following-sibling::*[%s]/*[1]", num));
    }

    By lblValuableSuggestion = By.xpath("//*[contains(@text,'THANK YOU FOR YOUR')]");
    By btnClose = By.xpath("//*[contains(@text,'THANK YOU FOR YOUR')]/preceding-sibling::*[1]");
}

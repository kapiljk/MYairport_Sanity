package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.PreLoginPageLoc;
import utils.MobileUtils;

public class PreLoginPage extends MobileUtils implements PreLoginPageLoc {

    private final AndroidDriver _driver;

    public PreLoginPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyPreLoginPage(){
        isElementVisible(lblPreLogin,"Pre Login Page");
    }

    public void changeLanguageToEng() {
        System.out.println("English clicking in Pre Login Page");
        click(ddLanguage, "Language Dropdown");
        click(btnEnglish, "Selecting English");
    }

    public void changeLanguageToMalay() {
        System.out.println("Malaysia Language clicking in Pre Login Page");
        click(ddLanguage, "Language Dropdown");
        click(btnMalaysia, "Selecting Malayasia");
    }

    public void changeLanguageToChina(){
        System.out.println("Chinese Language clicking in Pre Login Page");
        click(ddLanguage, "Language Dropdown");
        click(btnChina, "Selecting China");
    }

    public void changeTerminalToKCH() {
        System.out.println("Selecting KCH Terminal in Pre Login Page");
        click(ddAirport, "Termainal Dropdown");
        waitForElementPresence(ddSelAirKCH, "KCH Terminal");
        click(ddSelAirKCH, "KCH Terminal");
    }

    public void changeTerminalToBKI() {
        System.out.println("Selecting KCH Terminal in Pre Login Page");
        click(ddAirport, "Termainal Dropdown");
        waitForElementPresence(ddSelAirBKI, "BKI Terminal");
        click(ddSelAirBKI, "BKI Terminal");
    }

    public void changeTerminalToPEN() {
        System.out.println("Selecting KCH Terminal in Pre Login Page");
        click(ddAirport, "Termainal Dropdown");
        waitForElementPresence(ddSelAirPEN, "PEN Terminal");
        click(ddSelAirPEN, "PEN Terminal");
    }

    public void verifyLangChangeToEnglish() {
        System.out.println("Verifying English language");
        String text = _driver.findElement(btnSubmit).getText();
        Assert.assertTrue(text.contains("SUBMIT"), "Submit button in English Language in pre login page");
    }

    public void verifyLangChangeToMalasia() {
        System.out.println("Verifying Malaysia language");
        String text = _driver.findElement(btnSubmitMalayLang).getText();
        Assert.assertTrue(text.contains("HANTAR"), "Submit button in Malasia Language in pre login page");

    }

    public void verifyLangChangeToChina() {
        System.out.println("Verifying Chinese language");
        String text = _driver.findElement(btnSubmitChinaLang).getText();
        Assert.assertTrue(text.contains("提交"), "Submit button in Chines Language in pre login page");
    }

    public void clickOnSubmitButton() {
        System.out.println("Clicking on submit button in Pre Login page");
        click(btnSubmit, "Submit button");
    }
}

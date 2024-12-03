package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class OtherWelcomePageSteps {

    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@BKP")
    public void launchApplication() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }
    @After(value = "@BKP")
    public void closeApplication() {
        BaseSteps.closeDriver();
    }

    @When("the user clicks on select terminal dropdown and choose BKI-KotaKinabalu in the Prelogin Page")
    public void the_user_clicks_on_select_terminal_dropdown_and_choose_bki_kota_kinabalu_in_the_prelogin_page() {
        pm.preLoginPage().changeTerminalToBKI();
    }
    @Then("verifies that the user lands on the welcome page")
    public void verifies_that_the_user_lands_on_the_welcome_page() {
    pm.otherWelcomePage().verifyOtherWelcomePage();
    }
    @Then("the user clicks on BAHASA MALAYSIA in the welcome Page")
    public void the_user_clicks_on_bahasa_malaysia_in_the_welcome_page() {
        pm.otherWelcomePage().clickDDLanguage();
    pm.otherWelcomePage().clickMalaysiaLanguage();
    }
    @Then("verifies that the app language changes in malaysia language")
    public void verifies_that_the_app_language_changes_in_malaysia_language() {
        pm.otherWelcomePage().verifyMalaysiaLanguage();
    }
    @Then("the user clicks on CHINESE in the welcome Page")
    public void the_user_clicks_on_chinese_in_the_welcome_page() {
        pm.otherWelcomePage().clickDDLanguage();
        pm.otherWelcomePage().clickChineesLanguage();
    }
    @Then("verifies that the app language changes in Chinese language")
    public void verifies_that_the_app_language_changes_in_chinese_language() {
        pm.otherWelcomePage().verifyChineesLanguage();
    }
    @Then("the user clicks on ENGLISH in the welcome Page")
    public void the_user_clicks_on_english_in_the_welcome_page() {
        pm.otherWelcomePage().clickDDLanguage();
        pm.otherWelcomePage().clickEnglishLanguage();
    }
    @Then("verifies that the app language changes in English language")
    public void verifies_that_the_app_language_changes_in_english_language() {
        pm.otherWelcomePage().verifyEnglishLanguage();
    }
    @Then("the user clicks on the Submit button on the welcome Page")
    public void the_user_clicks_on_the_submit_button_on_the_welcome_page() {
        pm.otherWelcomePage().clickOnLoginOrSignup();
    }
    @Then("the user lands on the Login Page")
    public void the_user_lands_on_the_login_page() {
        pm.loginPage().verifyLoginPage();
    }
    @When("the user clicks on select terminal dropdown and choose PEN-Penang in the Prelogin Page")
    public void the_user_clicks_on_select_terminal_dropdown_and_choose_pen_penang_in_the_prelogin_page() {
        pm.preLoginPage().changeTerminalToPEN();
    }
}

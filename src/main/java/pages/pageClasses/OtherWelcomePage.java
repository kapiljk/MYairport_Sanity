package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.OtherWelcomePageLoc;
import utils.MobileUtils;

public class OtherWelcomePage extends MobileUtils implements OtherWelcomePageLoc {

    private AndroidDriver _driver;
    public OtherWelcomePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }
    public void verifyOtherWelcomePage() {
        waitForElementVisibility(btn3LoginOrSignup, "LOGIN/SIGNUP button", 30);
        isElementVisible(logo, "Other Welcome");
    }
    public void clickOnLoginOrSignup() {
        try {
            Thread.sleep(6000);
            waitForElementVisibility(btn3LoginOrSignup, "LOGIN/SIGNUP button", 30);
            click(btn3LoginOrSignup, "Login or Signup button");
        } catch (Exception ignored){

        }
    }
    public void verifyWelcomePageLogo(){
        isElementVisible(logo,"Malaysia Airports logo");
    }
    public void clickDDLanguage(){click(dd3Language,"Language Dropdown");}
    public void clickMalaysiaLanguage(){click(dd3Malay,"Malaysia language");}
    public void verifyMalaysiaLanguage(){
        String text = getText(btn3MalayLoginOrSignup);
        Assert.assertTrue(text.contains("LOG MASUK / DAFTAR"));
    }
    public void clickChineesLanguage(){click(dd3Chinees,"Chinees language");}
    public void verifyChineesLanguage(){
        String text = getText(btn3ChineesLoginOrSignup);
        Assert.assertTrue(text.contains("登录 / 注册"));
    }
    public void clickEnglishLanguage(){click(dd3English,"English language");}
    public void verifyEnglishLanguage(){
        String text = getText(btn3LoginOrSignup);
        Assert.assertTrue(text.contains("LOGIN / SIGN UP  "));
    }

}

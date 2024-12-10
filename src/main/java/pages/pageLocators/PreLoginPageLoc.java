package pages.pageLocators;

import org.openqa.selenium.By;

public interface PreLoginPageLoc {
    By lblPreLogin = By.xpath("//*[contains(@text,'Choose Airport')]");
    By ddLanguage = By.xpath("//*[contains(@text,'Choose Airport')]/preceding-sibling::*[3]");
    By btnEnglish = By.xpath("(//*[@text='English'])");
    By btnMalaysia = By.xpath("//*[@text='Bahasa Malaysia']");
    By btnChina = By.xpath("//*[@text='中文']");
    By ddAirport = By.xpath("//*[contains(@text,'Choose Airport')]/following-sibling::*[2]");
    By ddSelAir1 = By.xpath("(//*[@text='KUL - Terminal 1'])");
    By ddSelAir2 = By.xpath("(//*[@text='KUL - Terminal 2'])");
    By ddSelAirBKI = By.xpath("(//*[@text='BKI - Kota Kinabalu'])");
    By ddSelAirKCH = By.xpath("(//*[@text='KCH - Kuching'])");
    By ddSelAirPEN = By.xpath("(//*[@text='PEN - Penang'])");
    By btnSubmit = By.xpath("//*[@text='SUBMIT']");
    By btnSubmitMalayLang = By.xpath("//*[@text='HANTAR']");
    By btnSubmitChinaLang = By.xpath("//*[@text='提交']");

}

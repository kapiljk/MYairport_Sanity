package pages.pageLocators;

import org.openqa.selenium.By;

public interface StoresPageLoc {

    By lblHeading = By.xpath("(//*[@text='Stores'])[1]");
    By btnBack = By.xpath("//*[@text='Stores']/../*[1]/*");
    By ddTerminal = By.xpath("//*[@text='Stores']/following-sibling::*[1]/*[2]");
    By btnMenu = By.xpath("//*[@text='Stores']/following-sibling::*[2]/*");
    By txtSearch = By.xpath("(//*[@text='Stores'])[2]");
    // Search symbol locator => (//*[@text='Stores'])[2]/following-sibling::*[1]/*
    By allStores = By.xpath("//*[@text='Stores']/../../following-sibling::*[1]/*[1]/*[1]/*[1]");
    By ddTerminalOptions = By.xpath("((//*[@text='Stores'])[1]/following-sibling::*[1]/*)[1]");
    By storesList = By.xpath("//*[@text='Stores']/following-sibling::*[4]/*/*");

}

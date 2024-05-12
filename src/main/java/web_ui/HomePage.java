package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends WebPageBase{
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
private final By registerBtn = By.className("ico-register");

    public void clickRegisterBtn(){
        webDriver.findElement(registerBtn).click();
    }
}

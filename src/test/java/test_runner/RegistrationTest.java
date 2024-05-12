package test_runner;

import actions.WebActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.WebTestBase;
import web_ui.HomePage;
import web_ui.RegisterPage;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends WebTestBase {
    HomePage homePage;
    RegisterPage registerPage;

    WebActions webActions;


    @Test
    public void verifyRegistrationSuccess() {
        homePage = new HomePage(webDriver);
        registerPage = new RegisterPage(webDriver);
        webActions = new WebActions();
        homePage.clickRegisterBtn();
        registerPage.selectMaleBtn();
        registerPage.sentFirstName();
        registerPage.sentLastName();
        registerPage.selectDayOption();
        registerPage.selectMonthOption();
        registerPage.selectYearOption();
        registerPage.sentEmail();
        registerPage.scrollToPasswordField(webDriver);
        registerPage.sentCompanyName();
        registerPage.sentPassword();
        registerPage.sentConfirmationPassword();
        registerPage.clickRegisterBtn();
        Assert.assertTrue(registerPage.getRegistrationMsg().equalsIgnoreCase("your registration completed"));
    }
}

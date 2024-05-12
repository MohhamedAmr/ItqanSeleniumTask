package web_ui;

import actions.WebActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterPage extends WebPageBase {

    private RegisterPage registerPage;
    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By maleRadioBtn = By.id("gender-male");
    private final By firstNameTxtField = By.id("FirstName");
    private final By lastNameTxtField = By.id("LastName");
    private final By dateOfBirthDayPickerBtn = By.name("DateOfBirthDay");
    private final By monthOfBirthPickerBtn = By.name("DateOfBirthMonth");
    private final By yearOfBirthPickerBtn = By.name("DateOfBirthYear");
    private final By emailField = By.id("Email");
    private final By companyField = By.id("Company");
    private final By passwordField = By.id("Password");
    private final By confirmPasswordField = By.id("ConfirmPassword");

    private final By registerBtn = By.id("register-button");

    private final By registrationSuccessMsg = By.className("result");
    public void selectMaleBtn() {
        webDriver.findElement(maleRadioBtn).click();
    }
    public void clickRegisterBtn() {
        webDriver.findElement(registerBtn).click();

    }

    public void selectDayOption() {
        WebElement dayPicker = webDriver.findElement(dateOfBirthDayPickerBtn);
        Select option = new Select(dayPicker);
        option.selectByValue("25");

    }

    public void selectMonthOption() {
        WebElement monthPicker = webDriver.findElement(monthOfBirthPickerBtn);
        Select option = new Select(monthPicker);
        option.selectByValue("4");

    }

    public void selectYearOption() {
        WebElement yearPicker = webDriver.findElement(yearOfBirthPickerBtn);
        Select option = new Select(yearPicker);
        option.selectByValue("1996");

    }

    public void sentFirstName() {
        webDriver.findElement(firstNameTxtField).sendKeys("Mohamed");

    }

    public void sentLastName() {
        webDriver.findElement(lastNameTxtField).sendKeys("Elsarky");

    }

    public void sentCompanyName() {
        webDriver.findElement(firstNameTxtField).sendKeys("Itqan");

    }

    public void sentEmail() {
        String current = new SimpleDateFormat("SSS").format(new Date());
        String email = "muhamed.elsarky" + current + "@gmail.com";
        webDriver.findElement(emailField).sendKeys(email);

    }

    public void sentPassword() {
        webDriver.findElement(passwordField).sendKeys("123456");

    }

    public void sentConfirmationPassword() {
        webDriver.findElement(confirmPasswordField).sendKeys("123456");

    }
    public String getRegistrationMsg(){
        return webDriver.findElement(registrationSuccessMsg).getText();
    }
    public void scrollToPasswordField(WebDriver driver){
        WebElement webElement = webDriver.findElement(passwordField);
        new WebActions().scrollDownIntoView(driver,webElement);
    }

}

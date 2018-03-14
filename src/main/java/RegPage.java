import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Created by Anastasia on 26.01.2018.
 */
public class RegPage {
    private static final String URL = "http://demoqa.com/";
    private By buttonReg = By.id("menu-item-374");
    private By fieldFirstName = By.id("name_3_firstname");
    private By fieldLastName = By.id("name_3_lastname");
    private By radioMaritalStatus = By.xpath("//input[@value='single']");
    private By checkboxHobby = By.xpath("//input[@value='reading']");
    private By dropdownCountry = By.id("dropdown_7");
    private By country = By.xpath("//option[@value='Russia']");

    private By fieldMonth = By.id("mm_date_8");
    private By month = By.xpath("//option[@value='7']");

    private By fieldDay = By.id("dd_date_8");
    private By day = By.xpath("//option[@value='29']");

    private By fieldYear = By.id("yy_date_8");
    private By year = By.xpath("//option[@value='1996']");

    private By fieldPhoneNumber = By.id("phone_9");
    private By fieldUserName = By.id("username");
    private By fieldEmail = By.id("email_1");
    private By fieldPassword = By.id("password_2");
    private By fieldConfirmPassword = By.id("confirm_password_password_2");

    private By buttonSubmit = By.name("pie_submit");

    private By messageReg = By.className("piereg_message");
    private By messageRegExistUserName = By.className("piereg_login_error");
    private By messageRegWithoutEmail = By.xpath("//li[8]//div//div//span");

    private WebDriver driver;

    RegPage(WebDriver driver) {
        this.driver = driver;
        driver.get(URL);
    }


    public RegPage clickButtonReg() throws InterruptedException {
        WebElement buttonRegElement = driver.findElement(buttonReg);
        buttonRegElement.click();
        return this;
    }

    public RegPage fillFieldFirstName(String FirstName) throws InterruptedException {
        WebElement fieldFirstNameElement = driver.findElement(fieldFirstName);
        fieldFirstNameElement.sendKeys(FirstName);
        return this;
    }

    public RegPage fillFieldLastName(String LastName) throws InterruptedException {
        WebElement fieldLastNameElement = driver.findElement(fieldLastName);
        fieldLastNameElement.sendKeys(LastName);
        return this;
    }

    public RegPage clickRadioMaritalStatus() throws InterruptedException {
        WebElement radioMaritalStatusElement = driver.findElement(radioMaritalStatus);
        radioMaritalStatusElement.click();
        return this;
    }

    public RegPage clickCheckboxHobby() throws InterruptedException {
        WebElement checkboxHobbyElement = driver.findElement(checkboxHobby);
        checkboxHobbyElement.click();
        return this;
    }

    public RegPage clickDropdownCountry() throws InterruptedException {
        WebElement dropdownCountryElement = driver.findElement(dropdownCountry);
        dropdownCountryElement.click();
        return this;
    }

    public RegPage clickCountry() throws InterruptedException {
        WebElement countryElement = driver.findElement(country);
        countryElement.click();
        return this;
    }

    public RegPage clickFieldMonth() throws InterruptedException {
        WebElement fieldMonthElement = driver.findElement(fieldMonth);
        fieldMonthElement.click();
        return this;
    }

    public RegPage clickMonth() throws InterruptedException {
        WebElement monthElement = driver.findElement(month);
        monthElement.click();
        return this;
    }

    public RegPage clickFieldDay() throws InterruptedException {
        WebElement fieldDayElement = driver.findElement(fieldDay);
        fieldDayElement.click();
        return this;
    }

    public RegPage clickDay() throws InterruptedException {
        WebElement dayElement = driver.findElement(day);
        dayElement.click();
        return this;
    }

    public RegPage clickFieldYear() throws InterruptedException {
        WebElement fieldYearElement = driver.findElement(fieldYear);
        fieldYearElement.click();
        return this;
    }

    public RegPage clickYear() throws InterruptedException {
        WebElement yearElement = driver.findElement(year);
        yearElement.click();
        return this;
    }


    public RegPage fillFieldPhoneNumber(String PhoneNumber) throws InterruptedException {
        WebElement fieldPhoneNumberElement = driver.findElement(fieldPhoneNumber);
        fieldPhoneNumberElement.sendKeys(PhoneNumber);
        return this;
    }

    public RegPage fillFieldUserName(String UserName) throws InterruptedException {
        WebElement fieldUserNameElement = driver.findElement(fieldUserName);
        fieldUserNameElement.sendKeys(UserName);
        return this;
    }

    public RegPage fillFieldEmail(String Email) throws InterruptedException {
        WebElement fieldEmailElement = driver.findElement(fieldEmail);
        fieldEmailElement.sendKeys(Email);
        return this;
    }

    public RegPage fillFieldPassword(String Password) throws InterruptedException {
        WebElement fieldPasswordElement = driver.findElement(fieldPassword);
        fieldPasswordElement.sendKeys(Password);
        return this;
    }

    public RegPage fillFieldConfirmPassword(String Password) throws InterruptedException {
        WebElement fieldConfirmPasswordElement = driver.findElement(fieldConfirmPassword);
        fieldConfirmPasswordElement.sendKeys(Password);
        return this;
    }

    public RegPage clickButtonSubmit() throws InterruptedException {
        WebElement buttonSubmitElement = driver.findElement(buttonSubmit);
        buttonSubmitElement.click();
        return this;
    }

    public boolean isMessageRegDisplayed() throws InterruptedException {
        WebElement messageRegElement = driver.findElement(messageReg);
        return messageRegElement.isDisplayed();
    }

    public boolean isMessageRegExistUserName() throws InterruptedException {
        WebElement messageRegExistUserNameElement = driver.findElement(messageRegExistUserName);
        return messageRegExistUserNameElement.isDisplayed();
    }

    public boolean isMessageRegWithoutEmail() throws InterruptedException {
        WebElement messageRegWithoutEmailElement = driver.findElement(messageRegWithoutEmail);
        return messageRegWithoutEmailElement.isDisplayed();
    }
}
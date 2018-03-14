/**
 * Created by Anastasia on 25.01.2018.
 */

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestUI {

    private static FirefoxDriver driver;

    @BeforeClass
    public static void Init () {
        driver = new FirefoxDriver();
    }

    @Test
    public  void FillRegForm () throws InterruptedException {


        RegPage regPage=new RegPage(driver);
        regPage.clickButtonReg();
        regPage.fillFieldFirstName("Nastya");
        regPage.fillFieldLastName("Vozzhaeva");
        regPage.clickRadioMaritalStatus();
        regPage.clickCheckboxHobby();
        regPage.clickDropdownCountry();
        regPage.clickCountry();
        regPage.clickFieldMonth();
        regPage.clickMonth();
        regPage.clickFieldDay();
        regPage.clickDay();
        regPage.clickFieldYear();
        regPage.clickYear();
        regPage.fillFieldPhoneNumber("89375643456");
        regPage.fillFieldUserName("nastya7777");
        regPage.fillFieldEmail("nastya7777@yandex.ru");
        regPage.fillFieldPassword("qwerty1234");
        regPage.fillFieldConfirmPassword("qwerty1234");
        regPage.clickButtonSubmit();

        Assert.assertTrue(regPage.isMessageRegDisplayed());
    }

    @Test
    public  void RegExistUserName() throws InterruptedException {
        RegPage regPage=new RegPage(driver);
        regPage.clickButtonReg();
        regPage.fillFieldFirstName("Nastya");
        regPage.fillFieldLastName("Vozzhaeva");
        regPage.clickRadioMaritalStatus();
        regPage.clickCheckboxHobby();
        regPage.clickDropdownCountry();
        regPage.clickCountry();
        regPage.clickFieldMonth();
        regPage.clickMonth();
        regPage.clickFieldDay();
        regPage.clickDay();
        regPage.clickFieldYear();
        regPage.clickYear();
        regPage.fillFieldPhoneNumber("89375643456");
        regPage.fillFieldUserName("nastya4654");
        regPage.fillFieldEmail("nastya46542@yandex.ru");
        regPage.fillFieldPassword("qwerty1234");
        regPage.fillFieldConfirmPassword("qwerty1234");
        regPage.clickButtonSubmit();


        Assert.assertTrue(regPage.isMessageRegExistUserName());
    }
    @Test
    public  void RegWithoutEmail() throws InterruptedException {
        RegPage regPage=new RegPage(driver);
        regPage.clickButtonReg();
        regPage.fillFieldFirstName("Nastya");
        regPage.fillFieldLastName("Vozzhaeva");
        regPage.clickRadioMaritalStatus();
        regPage.clickCheckboxHobby();
        regPage.clickDropdownCountry();
        regPage.clickCountry();
        regPage.clickFieldMonth();
        regPage.clickMonth();
        regPage.clickFieldDay();
        regPage.clickDay();
        regPage.clickFieldYear();
        regPage.clickYear();
        regPage.fillFieldPhoneNumber("89375643456");
        regPage.fillFieldUserName("nastya4654");
        regPage.fillFieldPassword("qwerty1234");
        regPage.fillFieldConfirmPassword("qwerty1234");
        regPage.clickButtonSubmit();

        Assert.assertTrue(regPage.isMessageRegWithoutEmail());
    }

    @AfterClass
    public static void Termination () {
         driver.quit();
    }
}
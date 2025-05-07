package com.guru99.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class RegisterUserTest2 {

    WebDriver driver = null ;

    //creating obj of propertyfilereader
    PropertyFileReader prop = new PropertyFileReader();
    String baseURL = prop.getProperty("config","url");
    Home homePage = null;
    Register registerPage;
    RegisterSuccess registerSuccessPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(); // memory server, run on chrome browser
        driver.get(baseURL);
        driver.manage().window().maximize(); // maximize the window
        homePage = new Home();
        homePage.clickOnRegisterLink(driver);
        registerPage = new Register();
        registerSuccessPage = new RegisterSuccess();

    }

    @Test
    public void testRegisterNewUser() {
        registerPage.setFirstName(driver,"Imperial");
        registerPage.setLastName(driver,"College");
        registerPage.setPhoneNumber(driver,"1234567890");
        registerPage.setEmail(driver,"InfoImperial@gmail.lk");
        registerPage.selectCountry(driver,"AUSTRALIA");
        registerPage.setUserName(driver,"Admin001");
        registerPage.setPassword(driver,"demo@admin");
        registerPage.setConfirmPassword(driver,"demo@admin");
        registerPage.submit(driver);
        String actualSalutationMessage = registerSuccessPage.getSalutationMessage(driver);
        Assert.assertEquals(actualSalutationMessage,"Dear Imperial College,","Failed to register user:");


    }

    @Test
    public void test2(){
        registerPage.setFirstName(driver,"asdfghjk");
    }
}

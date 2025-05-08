package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest3 {

    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = new HomePage();
        homePage.clickOnRegisterLink();
        registerPage = new RegisterPage();
        registerSuccessPage = new RegisterSuccessPage();

    }

    @Test
    public void testRegisterNewUser() {
        registerPage.setFirstName("Imperial");
        registerPage.setLastName("College");
        registerPage.setPhoneNumber("1234567890");
        registerPage.setEmail("InfoImperial@gmail.lk");
        registerPage.selectCountry("AUSTRALIA");
        registerPage.setUserName("Admin001");
        registerPage.setPassword("demo@admin");
        registerPage.setConfirmPassword("demo@admin");
        registerPage.submit();
        String actualMessage= registerSuccessPage.getSalutationMessage();
        Assert.assertEquals(actualMessage,"Dear Imperial College,","Failed to register user:");
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();

    }
}

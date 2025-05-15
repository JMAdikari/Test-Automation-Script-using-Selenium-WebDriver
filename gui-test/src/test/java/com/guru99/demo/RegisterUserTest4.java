package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest4 {

    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;

    @BeforeMethod
    public void setUp() {
        TestApp .getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage=new HomePage();
        registerPage= homePage.clickOnRegisterLink();

    }

    @Test
    public void testRegisterNewUser() {
        registerSuccessPage = registerPage
                .setFirstName("Imperial")
                .setLastName("College")
                .setPhoneNumber("1234567890")
                .setEmail("InfoImperial@gmail.lk")
                .selectCountry("AUSTRALIA")
                .setUserName("Admin001")
                .setPassword("demo@admin")
                .setConfirmPassword("demo@admin")
                .submit();
        Assert.assertEquals(
                registerSuccessPage.getSalutationMessage(),"Dear Imperial College,","Failed to register new user:");


    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}

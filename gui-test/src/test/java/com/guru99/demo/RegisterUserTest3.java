package com.guru99.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest3 {

    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = new HomePage();
        homePage.clickOnRegisterLink();

    }

    @Test
    public void testRegisterNewUser() {
    }

    @AfterMethod
    public void tearDown() {

    }
}

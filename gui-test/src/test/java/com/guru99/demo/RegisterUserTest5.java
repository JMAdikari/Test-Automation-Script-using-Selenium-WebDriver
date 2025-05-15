package com.guru99.demo;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest5 {

    RegisterFactoryPage registerPage;

    HomeFactoryPage homePage;
    RegisterSuccessFactoryPage registerSuccessPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = PageFactory.initElements(TestApp.getInstance().getDriver(), HomeFactoryPage.class);
        registerPage= homePage.clickOnRegisterLink();

    }

    @Test
    public void testRegisterNewUser() {
        registerSuccessPage = registerPage
                .setFirstName("Imperial")
                .setLastName("College")
                .setPhone("1234567890")
                .setEmail("123@gmail.lk")
                .selectCountry("AUSTRALIA")
                .setUserName("Admin0001")
                .setPassword("DemoAdmin1")
                .setConfirmPassword("DemoAdmin1")
                .submit();
        Assert.assertEquals(
                registerSuccessPage.getSalutationMessage(),
                "Dear Imperial College,",
                "Failed to register new user:"
        );
    }
}

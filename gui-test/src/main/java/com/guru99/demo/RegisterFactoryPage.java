package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.TestApp;

public class RegisterFactoryPage {
    @FindBy(name="firstName") private WebElement firstNameElement;
    @FindBy(name="lastName") private WebElement lastNameElement;
    @FindBy(name="phone") private WebElement phoneElement;
    @FindBy(id="userName") private WebElement emailElement;
    @FindBy(id="email") private WebElement userNameElement;
    @FindBy(name="country") private WebElement countryElement;
    @FindBy(name="password") private WebElement passwordElement;
    @FindBy(name = "confirmPassword") private WebElement confirmPasswordElement;
    @FindBy(name = "submit") private WebElement submitButtonElement;

    public RegisterFactoryPage setFirstName(String firstName) {
        TestApp.getInstance().waitUntilNextElementAppears(By.name("firstName"), 10);
        firstNameElement.sendKeys(firstName);
        return this;
    }

    public RegisterFactoryPage setLastName(String lastName) {
        lastNameElement.sendKeys(lastName);
        return this;
    }

    public RegisterFactoryPage setPhone(String phone) {
        phoneElement.sendKeys(phone);
        return this;
    }

    public RegisterFactoryPage setEmail(String email) {
        emailElement.sendKeys(email);
        return this;
    }

    public RegisterFactoryPage setUserName(String userName) {
        userNameElement.sendKeys(userName);
        return this;
    }

    public RegisterFactoryPage setPassword(String password) {
        passwordElement.sendKeys(password);
        return this;
    }

    public RegisterFactoryPage setConfirmPassword(String Password) {
        confirmPasswordElement.sendKeys(Password);
        return this;
    }

    public RegisterFactoryPage selectCountry(String country) {
        Select countryDropdown = new Select(countryElement);
        countryDropdown.selectByVisibleText(country);
        return this;
    }

    public RegisterSuccessFactoryPage submit() {
        submitButtonElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(), RegisterSuccessFactoryPage.class);
    }
}

package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterPage {

    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop= new PropertyFileReader();
    String firstNameWebElement = prop.getProperty("RegisterPage","first.name.element");
    String lastNameWebElement = prop.getProperty("RegisterPage","last.name.element");
    String phoneNoWebElement= prop.getProperty("RegisterPage","phone.number.element");
    String emailWebElement = prop.getProperty("RegisterPage","email.element");
    String userNameWebElement = prop.getProperty("RegisterPage","user.name.element");
    String passwordWebElement = prop.getProperty("RegisterPage","password.element");
    String confirmPasswordWebElement = prop.getProperty("RegisterPage","confirm.password.element");
    String countryWebElement = prop.getProperty("RegisterPage","country.name.element");
    String submitWebElement = prop.getProperty("RegisterPage","submit.element");

    public  RegisterPage  setFirstName( String firstName){

        TestApp.getInstance().waitUntilNextElementAppears( By.name(firstNameWebElement),25);

        //Automating input textbox
        WebElement firstNameElement = driver.findElement(By.name(firstNameWebElement));
        firstNameElement.sendKeys(firstName); // value for first name text box
        return  this;//return in same page
    }

    public RegisterPage  setLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(lastNameWebElement),10);
        //Last Name
        WebElement lastNameElement = driver.findElement(By.name(lastNameWebElement));
        lastNameElement.sendKeys(lastName); // value for last name text box
        return this;

    }

    public RegisterPage setPhoneNumber(String phoneNo){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(phoneNoWebElement),10);
        WebElement phoneElement = driver.findElement(By.name(phoneNoWebElement));
        phoneElement.sendKeys(phoneNo);
        return this;

    }

    public RegisterPage setEmail(String email){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(emailWebElement),10);
        WebElement emailElement = driver.findElement(By.id(emailWebElement));
        emailElement.sendKeys(email);
        return this;
    }

    public RegisterPage  setUserName( String userName){
        TestApp.getInstance().waitUntilNextElementAppears( By.id(userNameWebElement),10);
        WebElement userNameElement = driver.findElement(By.id(userNameWebElement));
        userNameElement.sendKeys(userName);
        return this;
    }

    public RegisterPage  setPassword( String password){
        TestApp.getInstance().waitUntilNextElementAppears( By.name(passwordWebElement),10);
        WebElement passwordElement = driver.findElement(By.name(passwordWebElement));
        passwordElement.sendKeys(password);
        return this;
    }

    public RegisterPage  setConfirmPassword( String confirmPassword){
        TestApp.getInstance().waitUntilNextElementAppears( By.name(confirmPasswordWebElement),10);
        WebElement confirmPasswordElement = driver.findElement(By.name(confirmPasswordWebElement));
        confirmPasswordElement.sendKeys(confirmPassword);
        return this;
    }

    public RegisterPage selectCountry( String countryName){
        TestApp.getInstance().waitUntilNextElementAppears( By.name(countryWebElement),10);
        Select CountryDropDownElement = new Select(driver.findElement(By.name(countryWebElement)));
        CountryDropDownElement.selectByVisibleText(countryName);
        return this;
    }

    public RegisterSuccessPage submit( ){
        TestApp.getInstance().waitUntilNextElementAppears( By.name(submitWebElement),10);
        WebElement submitButtonElement = driver.findElement(By.name(submitWebElement));
        submitButtonElement.click();
        return new RegisterSuccessPage();//redirect to register success page
    }

}

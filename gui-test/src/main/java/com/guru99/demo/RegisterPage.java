package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.TestApp;

public class RegisterPage {

    WebDriver driver = TestApp.getInstance().getDriver();

    public  void  setFirstName( String firstName){

        TestApp.getInstance().waitUntilNextElementAppears( By.name("firstName"),25);

        //Automating input textbox
        WebElement firstNameElement = driver.findElement(By.name("firstName"));
        firstNameElement.sendKeys(firstName); // value for first name text box
    }

    public void  setLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("lastName"),10);
        //Last Name
        WebElement lastNameElement = driver.findElement(By.name("lastName"));
        lastNameElement.sendKeys(lastName); // value for last name text box

    }

    public void setPhoneNumber(String phoneNo){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("phone"),10);
        WebElement phoneElement = driver.findElement(By.name("phone"));
        phoneElement.sendKeys(phoneNo);

    }

    public void setEmail(String email){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("userName"),10);
        WebElement emailElement = driver.findElement(By.id("userName"));
        emailElement.sendKeys(email);
    }

    public void  setUserName( String userName){
        TestApp.getInstance().waitUntilNextElementAppears( By.id("email"),10);
        WebElement userNameElement = driver.findElement(By.id("email"));
        userNameElement.sendKeys(userName);
    }

    public void  setPassword( String password){
        TestApp.getInstance().waitUntilNextElementAppears( By.name("password"),10);
        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys(password);
    }

    public void  setConfirmPassword( String confirmPassword){
        TestApp.getInstance().waitUntilNextElementAppears( By.name("confirmPassword"),10);
        WebElement confirmPasswordElement = driver.findElement(By.name("confirmPassword"));
        confirmPasswordElement.sendKeys(confirmPassword);
    }

    public void selectCountry( String countryName){
        TestApp.getInstance().waitUntilNextElementAppears( By.name("country"),10);
        Select CountryDropDownElement = new Select(driver.findElement(By.name("country")));
        CountryDropDownElement.selectByVisibleText(countryName);
    }

    public void submit( ){
        TestApp.getInstance().waitUntilNextElementAppears( By.name("submit"),10);
        WebElement submitButtonElement = driver.findElement(By.name("submit"));
        submitButtonElement.click();
    }

}

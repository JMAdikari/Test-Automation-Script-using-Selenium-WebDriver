package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register {

    public  void  setFirstName(WebDriver driver,String firstName){

        waitUntilNextElementAppears(driver,By.name("firstName"),25);

        //Automating input textbox
        WebElement firstNameElement = driver.findElement(By.name("firstName"));
        firstNameElement.sendKeys(firstName); // value for first name text box
    }

    public void  setLastName(WebDriver driver,String lastName){
        waitUntilNextElementAppears(driver,By.name("lastName"),10);
        //Last Name
        WebElement lastNameElement = driver.findElement(By.name("lastName"));
        lastNameElement.sendKeys(lastName); // value for last name text box

    }

    public void setPhoneNumber(WebDriver driver,String phoneNo){
        waitUntilNextElementAppears(driver,By.name("phone"),10);
        WebElement phoneElement = driver.findElement(By.name("phone"));
        phoneElement.sendKeys(phoneNo);

    }

    public void setEmail(WebDriver driver,String email){
        waitUntilNextElementAppears(driver,By.name("userName"),10);
        WebElement emailElement = driver.findElement(By.id("userName"));
        emailElement.sendKeys(email);
    }

    public void  setUserName(WebDriver driver,String userName){
        waitUntilNextElementAppears(driver,By.id("email"),10);
        WebElement userNameElement = driver.findElement(By.id("email"));
        userNameElement.sendKeys(userName);
    }

    public void  setPassword(WebDriver driver,String password){
        waitUntilNextElementAppears(driver,By.name("password"),10);
        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys(password);
    }

    public void  setConfirmPassword(WebDriver driver,String confirmPassword){
        waitUntilNextElementAppears(driver,By.name("confirmPassword"),10);
        WebElement confirmPasswordElement = driver.findElement(By.name("confirmPassword"));
        confirmPasswordElement.sendKeys(confirmPassword);
    }

    public void selectCountry(WebDriver driver, String countryName){
        waitUntilNextElementAppears(driver,By.name("country"),10);
        Select CountryDropDownElement = new Select(driver.findElement(By.name("country")));
        CountryDropDownElement.selectByVisibleText(countryName);
    }

    public void submit(WebDriver driver){
        waitUntilNextElementAppears(driver,By.name("submit"),10);
        WebElement submitButtonElement = driver.findElement(By.name("submit"));
        submitButtonElement.click();
    }


    private WebElement waitUntilNextElementAppears(WebDriver driver, By locator , int maxTimeOut) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(maxTimeOut)).until(
                ExpectedConditions.presenceOfElementLocated(locator)
        );
        return element;
    }
}

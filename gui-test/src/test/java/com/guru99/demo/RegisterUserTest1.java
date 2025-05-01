package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

import javax.xml.stream.Location;
import java.time.Duration;
import java.util.List;

public class RegisterUserTest1 {

    WebDriver driver = null ;

    //creating obj of propertyfilereader
    PropertyFileReader prop = new PropertyFileReader();
    String baseURL = prop.getProperty("config","url");

    @Test
    public void testRegisterNewUser() throws InterruptedException {
        driver = new ChromeDriver(); // memory server, run on chrome browser
        driver.get(baseURL);
        driver.manage().window().maximize(); // maximize the window

        waitUntilNextElementAppears(By.linkText("REGISTER"), 30);

        /*WebElement registerMenuElement = driver.findElement(By.xpath("//*[@href=\"register.php\"]"));
        registerMenuElement.click(); // click on the register menu*/


        // Location statergy - text automation (ex- REGISTER text on register page)
        // link test is good for using when there is a hyper link
        WebElement registerMenuElement = driver.findElement(By.linkText("REGISTER"));
        registerMenuElement.click(); // click on the register menu


        /*List<WebElement> registerMenuElements = driver.findElements(By.xpath("//*[@href=\"register.php\"]"));
        registerMenuElements.get(0).click();*/

        waitUntilNextElementAppears(By.name("firstName"),25);

        //Automating input textbox
        WebElement firstNameElement = driver.findElement(By.name("firstName"));
        firstNameElement.sendKeys("Impirial"); // value for first name text box

        //Last Name
        WebElement lastNameElement = driver.findElement(By.name("lastName"));
        lastNameElement.sendKeys("College"); // value for last name text box

        //Phone
        WebElement phoneElement = driver.findElement(By.name("phone"));
        phoneElement.sendKeys("1234567890"); // value for phone text box

        // ID Attribute
        WebElement emailElement = driver.findElement(By.id("userName"));
        emailElement.sendKeys("123@gmail.lk");


        //username
        WebElement userNameElement = driver.findElement(By.id("email"));
        userNameElement.sendKeys("Admin0001"); // value for user name text box

        //password
        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys("DemoAdmin1");

        //confirm password
        WebElement confirmPasswordElement = driver.findElement(By.name("confirmPassword"));
        confirmPasswordElement.sendKeys("DemoAdmin1");



        // dealing with dropdowns
        Select CountryDropDownElement = new Select(driver.findElement(By.name("country")));
        CountryDropDownElement.selectByVisibleText("AUSTRALIA");
        /*Thread.sleep(1500); // wait for 1.5 seconds ,forcefull delay/ removes this thread becuase of waitUntilNext...method*/
        CountryDropDownElement.selectByValue("AUSTRALIA");
        /*Thread.sleep(1500);*/
        CountryDropDownElement.selectByIndex(1);

        //SUBMIT BUTTON
        WebElement submitButtonElement = driver.findElement(By.name("submit"));
        submitButtonElement.click(); // click on the register menu

        /*Thread.sleep(3000);*/
        /*waitUntilElementAppears(location, maxTimeOut);// reducing execution time */
        waitUntilNextElementAppears(By.xpath("//*[contains(text(),\"Dear\")]"),30);



        WebElement salutationMessageElement = driver.findElement(By.xpath("//*[contains(text(),\"Dear\")]"));
        String salutationMessageText = salutationMessageElement.getText();

        Assert.assertEquals(salutationMessageText, "Dear Impirial College,", "Failed to register user:" );

        //close the browser
        driver.quit();

    }

    private WebElement waitUntilNextElementAppears(By locator , int maxTimeOut) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(maxTimeOut)).until(
                ExpectedConditions.presenceOfElementLocated(locator)
        );
        return element;
    }
}

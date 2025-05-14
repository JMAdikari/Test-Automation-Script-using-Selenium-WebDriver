package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class HomePage {

    WebDriver driver = TestApp.getInstance().getDriver();//pass web  driver instance to the class
    PropertyFileReader prop = new PropertyFileReader();
    String registerMenuWebElement = prop.getProperty("HomePage" ,"register.menu.element");

    public void clickOnRegisterLink() {
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText(registerMenuWebElement), 30);
        WebElement registerMenuElement = driver.findElement(By.linkText(registerMenuWebElement));
        registerMenuElement.click();// click on the register menu
    }
}

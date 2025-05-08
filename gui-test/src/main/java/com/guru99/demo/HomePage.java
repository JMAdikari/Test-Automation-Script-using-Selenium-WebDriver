package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TestApp;

public class HomePage {

    WebDriver driver = TestApp.getInstance().getDriver();//pass web  driver instance to the class

    public void clickOnRegisterLink() {
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText("REGISTER"), 30);
        WebElement registerMenuElement = driver.findElement(By.linkText("REGISTER"));
        registerMenuElement.click();// click on the register menu
    }
}

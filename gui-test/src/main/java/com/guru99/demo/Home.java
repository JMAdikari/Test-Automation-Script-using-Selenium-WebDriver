package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {

    /*WebDriver driver;*/

    public void clickOnRegisterLink(WebDriver driver) {

        waitUntilNextElementAppears(driver, By.linkText("REGISTER"), 30);
        WebElement registerMenuElement = driver.findElement(By.linkText("REGISTER"));
        registerMenuElement.click();// click on the register menu
    }

    private WebElement waitUntilNextElementAppears(WebDriver driver, By locator , int maxTimeOut) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(maxTimeOut)).until(
                ExpectedConditions.presenceOfElementLocated(locator)
        );
        return element;
    }


}

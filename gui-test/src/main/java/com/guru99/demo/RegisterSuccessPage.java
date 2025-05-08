package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class RegisterSuccessPage {

    WebDriver driver= TestApp.getInstance().getDriver();

    public String getSalutationMessage( ) {
        TestApp.getInstance().waitUntilNextElementAppears(  By.xpath("//*[contains(text(),\"Dear\")]"), 10);
        return driver.findElement(By.xpath("//*[contains(text(),\"Dear\")]")).getText();
    }
}

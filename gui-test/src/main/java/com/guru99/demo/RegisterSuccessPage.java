package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterSuccessPage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader prop=new PropertyFileReader();
    String messageWebElement= prop.getProperty("RegisterSuccessPage","salutation.message.element");

    public String getSalutationMessage( ) {
        TestApp.getInstance().waitUntilNextElementAppears(  By.xpath(messageWebElement), 10);
        return driver.findElement(By.xpath(messageWebElement)).getText();
    }
}

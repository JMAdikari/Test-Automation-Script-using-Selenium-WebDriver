package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestApp;

public class RegisterSuccessFactoryPage {

    @FindBy(xpath = "//*[contains(text(),\"Dear\")]") private WebElement salutationMessageElement;

    public String getSalutationMessage() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[contains(text(),\"Dear\")]"),10);
        return salutationMessageElement.getText();
    }
}

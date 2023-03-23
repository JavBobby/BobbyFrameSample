package com.facebook.pages;

import com.facebook.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.facebook.com
public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement royalEmail;

    @FindBy(id = "pass")
    public WebElement passContainer;

    @FindBy(name = "login")
    public WebElement royalLoginButton;

    @FindBy(className = "_9ay7")
    public WebElement element;



}
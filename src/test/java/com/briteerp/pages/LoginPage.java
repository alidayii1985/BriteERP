package com.briteerp.pages;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signInButton;

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[.='Log in']")
    public WebElement loginButton;


    public void login(String username,String password){

        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }

    public void open(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }







}


package com.loop.test.day11_utils_practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoopPracticeDynamicLoadingPage1 {

   @FindBy(xpath="//a[@href='dynamic_loading/1.html']")
public WebElement dynamicLoading1;

    @FindBy(xpath = "/button[.='Start']")
    public WebElement startButton;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(css = "#username")
    public WebElement username;

    @FindBy(id = "pwd")
    public WebElement password;

    @FindBy(xpath = "/button[.='Submit']")
    public WebElement submitButton;
    @FindBy(id ="flash-messages")
    public WebElement errorMessage;

}


package com.loop.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.InputMismatchException;

public class DocuportUtils {
    /**
     *  logins to the docuport
     * @param driver, which initilaized in test base
     * @param role, comes from docuport constants
     */
    public static void loginDocuport(WebDriver driver,String role) {
        driver.get(ConfigurationReader.getProperty("env"));
        WebElement userName = driver.findElement(By.id("input-14"));
        WebElement password = driver.findElement(By.id("input-15"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        switch (role.toLowerCase()) {
            case "client":
                userName.sendKeys(ConfigurationReader.getProperty("client"));
                password.sendKeys(ConfigurationReader.getProperty("password"));
                break;
            case "supervisor":
                userName.sendKeys(ConfigurationReader.getProperty("supervisor "));
                password.sendKeys(ConfigurationReader.getProperty("password"));

                break;
            case "advisor":
                userName.sendKeys(ConfigurationReader.getProperty("advisor"));
                password.sendKeys(ConfigurationReader.getProperty("password"));

                break;
            case "employee":
                userName.sendKeys(ConfigurationReader.getProperty("employee"));
                password.sendKeys(ConfigurationReader.getProperty("password"));
                break;
            default:
                throw new InputMismatchException("There is not suc a role: " + role);
        }
        loginButton.click();
    }

   public static void logOut(WebDriver driver){
        WebElement userIcon = driver.findElement(By.xpath("//div[@class='v-avatar primary']"));
        userIcon.click();
        WebElement logOut = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();
    }
    /**
     * logsout from the application
     * @param driver
     * @author nadir
     */
    }


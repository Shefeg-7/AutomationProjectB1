package com.loop.test.utilities;

import com.loop.test.base.TestBase;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.util.Set;

import static org.testng.Assert.assertTrue;


public class BrowserUtils extends TestBase {


    /**
     * validate if driver switched to expected Url and title
     * @param driver
     * @param
     * @param
     *
     *
     */

    public static void switchToWindow(WebDriver driver, String targetTitle){
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)){
                return;
            }
        }
        driver.switchTo().window(origin);
    }
    /**
    * @param driver
     * @param expectedTitle
     * returns void,assertions is implemented
     * @auther nadir
     */

    public static void validateTitle(WebDriver driver,String expectedTitle){
        assertTrue(driver.getTitle().contains(expectedTitle));

    }

}
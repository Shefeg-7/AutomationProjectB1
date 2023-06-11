package com.loop.test.utilities;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static org.testng.Assert.assertTrue;


public class BrowserUtils extends TestBase {


    /**
     * validate if driver switched to expected Url and title
     *
     * @param driver
     * @param
     * @param
     */

    public static void switchToWindow(WebDriver driver, String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)) {
                return;
            }
        }
        driver.switchTo().window(origin);
    }

    /**
     * @param driver
     * @param expectedTitle returns void,assertions is implemented
     * @auther nadir
     */

    public static void validateTitle(WebDriver driver, String expectedTitle) {
        assertTrue(driver.getTitle().contains(expectedTitle));

    }

    /**
     * Click any link from loop practice
     *
     * @param nameOfPage
     * @author nsh
     */
    public static void loopLinkClick(String nameOfPage) {
        WebElement element = com.loop.test.utilities.Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfPage + "']"));
        WebDriverWait wait = new WebDriverWait(com.loop.test.utilities.Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    /**

     method that will hover over*
     @param element*/
    public static void hoverOverAnyElement(WebElement element) {
         Actions actions = new Actions(Driver.getDriver());
       actions.moveToElement(element).perform();

    }
    /**
     * method which scroll to element and click js
     *
     * @param element
     */
    public static void scrollAndClick (WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoVie(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    /**
     * Clicks on an element using JavaScript
     * @param element
     * @author nsh
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }
    /**

     this method will double click any given element
     @param element
     **/
    public static  void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick().perform();
    }
    /**
     * waits for providing element to be visible
     * @param element
     * @param timeToWaitSec
     * return element
     * @author Nadir
     */
    public static WebElement waitForVisibility(WebElement element,int timeToWaitSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(timeToWaitSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    /**
     * Waits for the provided element to be invisible on the page
     * @param element
     * @param timeToWaitInSec
     * @return
     * @author nsh
     */
    public static void waitForInVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    /**
     * Waits for provided element to be clickable
     * @param element
     * @param timeout
     * @return
     * @author nsh
     */
    public static WebElement waitForClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    /**
     * performs a pause
     * @param seconds
     * @author nsh
     */
    public static void justWait(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}


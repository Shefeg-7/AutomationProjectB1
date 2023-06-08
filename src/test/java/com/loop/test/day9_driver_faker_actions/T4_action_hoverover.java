package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T4_action_hoverover {
    @Test
    public void drag_drop_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.drag"));
        WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));

        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(bank, debitAccount).perform();

        WebElement fiveK = Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']"));
        WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));

        action.dragAndDrop(fiveK, debitAmount).perform();

        WebElement sales = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'SALES')]"));
        WebElement creditAccount = Driver.getDriver().findElement(By.xpath("//*[@id='loan']/li"));

        action.dragAndDrop(sales,creditAccount).perform();

        WebElement creditAmount = Driver.getDriver().findElement(By.id("amt8"));

        action.dragAndDrop(fiveK, creditAmount).perform();

        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//a[contains(.,'Perfect')]"));
        String expected = "Perfect!";
        String actual = successMessage.getText();

       assertEquals(actual, expected, "actual: " + actual + " does not match expected: " + expected);




    }
}


package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DemoQaConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T2_getText_getAttribute {
    // got ot the url

    /*
     * go to url: https://demoqa.com/automation-practice-form
     * verify header text expected
     * verify placeholder attribute value is expected
     */
    public static void main(String[] args) {

        // go to url


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        // WebElement headerForForm = driver.findElement(By.tagName("h5"));
        String actualHeaderForForm = driver.findElement(By.tagName("h5")).getText();

        if (actualHeaderForForm.equals(DemoQaConstants.EXPECTED_HEADER_FOR_FORM)) {
            System.out.println("Expected error message: \"" + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual error message: \"" + actualHeaderForForm + "\" = Test PASSED");
        } else {
            System.out.println("Expected error message: \"" + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual error message: \"" + actualHeaderForForm);
            System.err.println("TEST FAILED");
        }



    }
}
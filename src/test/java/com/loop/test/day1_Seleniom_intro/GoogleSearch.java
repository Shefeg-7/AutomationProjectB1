package com.loop.test.day1_Seleniom_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        /**
         * Navigate to google
         * get title of the page
         * get url of the page
         * validate the title expected title is"Google
         * validate to the url of the page expected url is
         * close the browser
         */
         // set up driver

        // create driver object

        WebDriver driver=new ChromeDriver();

        // navigate to google page
        driver.get("https://www.google.com");
        // maximize the window
        driver.manage().window().getPosition();

        String expectedTitle="Google";

        String expectedUrl="https://www.google.com";

         String actualTitle= driver.getTitle();
        System.out.println(" actualTitle="+actualTitle);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ", =. TEST PASS");
        } else {
            System.err.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ", =. TEST FAIL");
        }
           String actualUrl= driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

        // quit the browser
        driver.quit();

        if (expectedUrl.contains(expectedUrl )) {
            System.out.println("Actual Url : " + actualUrl + ", matched expected Url: " + expectedUrl + ", =>TEST PASS");
        } else {
            {
                System.err.println("Actual Url: " +actualUrl  + ", DOES NOT match expected Url: " + expectedUrl  + ", => TEST FAIL");
            }

        }

    }
}

package com.loop.test.day1_Seleniom_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAmazon {
    /*
    navigate to amazon
    navigate back
    navigate forward
    refresh
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
    }

    }

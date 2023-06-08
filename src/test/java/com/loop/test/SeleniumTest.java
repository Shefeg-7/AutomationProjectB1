package com.loop.test;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {


    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
       // driver.get("https://www.etsy.com");
        // maximize
        driver.manage().window().maximize();
        Thread.sleep(3000);
       // driver.manage().window().fullscreen();
     // navigate to
        driver.navigate().to("https://www.etsy.com");
        Thread.sleep(3000);
        // let's slow
        Thread.sleep(3000);
        // navigate. back take us to previous
        driver.navigate().back();
        // navigate forward
        driver.navigate().forward();
        // navigate refresh
        driver.navigate().refresh();
       // driver. close();
        driver.quit();





    }


    public static class HomeWork_Task1 {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("https://beta.docuport.app");

    //       1. login to docuport application
            WebElement userName = driver.findElement(By.id("input-14"));
            userName.sendKeys("b1g3_advisor@gmail.com");
            WebElement password = driver.findElement(By.id("input-15"));
            password.sendKeys("Group3");
            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
            loginButton.click();
            Thread.sleep(3000);

    //        3. Validate successful login
            WebElement profileLogo = driver.findElement(By.cssSelector("div[class='v-avatar primary']"));
            System.out.println(profileLogo.getText());
            System.out.println(profileLogo.isDisplayed() ? "Login was successful" : "Login failed");

    //        2. logout from docuport application
            profileLogo.click();
            WebElement logout = driver.findElement(By.cssSelector("div#list-item-108"));
            logout.click();
            Thread.sleep(3000);

    //        4. Validate successful logout
            System.out.println((driver.findElement(By.cssSelector("div[class='login-layout--right h-md-100'")).isDisplayed())?"Logout was successful":"Logout failed");

        }
    }
}







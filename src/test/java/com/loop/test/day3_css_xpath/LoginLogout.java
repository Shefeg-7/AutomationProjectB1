package com.loop.test.day3_css_xpath;


import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {


public static void main(String[] args) throws InterruptedException {
        /*
        1. login to docuport application
         2. logout from docuport application
         3. Validate successful login
         4. Validate successful logout

         */




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



 


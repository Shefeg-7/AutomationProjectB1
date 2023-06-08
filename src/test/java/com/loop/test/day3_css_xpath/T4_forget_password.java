package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_forget_password {
        public static void main(String[] args) {



                /*
                 *verify forget passvord
                 * identify reset passward heading using css and go from parent to child
                 */

                        WebDriver driver = WebDriverFactory.getDriver("chrome");
                        driver.manage().window().maximize();
                        driver.get("https://beta.docuport.app");

                        // forget password link
                        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
                        forgetPasswordLink.click();

                        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
                        System.out.println(forgetPasswordHeading.getText());

                }

                }










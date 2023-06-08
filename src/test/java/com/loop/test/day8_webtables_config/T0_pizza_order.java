package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class T0_pizza_order extends TestBase {
    /*
    validate that card number for Alexandra Gray
    go to https://loopcamp.vercel.app/web-table.html
    create a method t test given field for a given name

     */

        @Test
        public void validate_card_for_alexandra(){


            driver.get("https://loopcamp.vercel.app/web-tables.html");
            String name = "Alexandra Gray";
            String expectedCardNumber = "321456789012";
            String actualCardNumber = driver.findElement(By.xpath("//td[.='Alexandra Gray']/following-sibling::td[9]")).getText();
            assertEquals(actualCardNumber, expectedCardNumber);
           



        }




    @Test
    public void test_pizza_type(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";

    }


  // @Test
    public void test_amount(){
        String name = "John Doe";
        String expectedAccount = "3";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Amount"), expectedAccount);
    }
   // @Test
    public void test_date(){

    }

   // @Test
    public void test_street(){

    }

  //  @Test
    public void test_city(){

    }

   // @Test
    public void test_state(){

    }

   // @Test
    public void test_zip(){

    }

   // @Test
    public void test_card(){

    }

   // @Test
    public void test_card_number(){

    }

   // @Test
    public void test_exp(){

    }


}



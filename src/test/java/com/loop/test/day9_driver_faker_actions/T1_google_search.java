package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class T1_google_search{

  /*
    1. go to "https://www.google.com"
    2. write "Loop Academy" and search
    3. validate title: Loop Academy - Google Search
     */
  @Test
  public void google_search(){
      Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
      System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
  }

    @Test
    public void docuport_search(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        DocuportUtils.loginDocuport(Driver.getDriver(), "client");
    }
    @AfterClass
    public void tearDown(){

    }

    }






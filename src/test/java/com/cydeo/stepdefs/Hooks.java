package com.cydeo.stepdefs;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks {


    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }



    @After
    public void tearDown(){
        Driver.closeDriver();

    }


}

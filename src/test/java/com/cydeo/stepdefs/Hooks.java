package com.cydeo.stepdefs;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));


    }



    @After
    public void tearDown(){

        Driver.closeDriver();

    }


}

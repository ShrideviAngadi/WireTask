package com.wireassignment.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * An abstract base for all of the Web tests within this package
 * Responsible for setting up the Selenium WebDriver
 */
public abstract class BaseTest {

    /**
     * Make the driver static. This allows it to be created only once
     * and used across all of the test classes.
     */
    protected static WebDriver driver;

    @BeforeClass
    public static void setupClass() throws InterruptedException, IOException {
        //Check the state of driver
        if(driver ==null){

            /**
             * Configure log4j.xml for logging
             */
            DOMConfigurator.configure("log4j.xml");

            /**
             * Set log4j config file in the system properties
             */
            System.setProperty("log4j2.configurationFile", Constants.PATH_ROOT.concat("/log4j2.properties"));

            /**
             * WebDriverManager to manage the WebDriver binaries
             */
            WebDriverManager.chromedriver().setup();

            Log.info("=====Browser Session Started=====");

            /**
             * Implement chromeDriver interface
             */
            driver = new ChromeDriver();

            /**
             * Open the test URL
             */
            driver.get(Constants.URL);

            /**
             * Maximizes browser
             */
            driver.manage().window().maximize();
        }
    }
}


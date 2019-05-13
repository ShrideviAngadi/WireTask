package com.wire;

import com.wireassignment.utils.BaseTest;
import com.wireassignment.utils.Log;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Empty Class for initialising the test suite by using @RunWith annotation
 * @param SuiteClass name
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        WireSupportSearchTests.class
        // All other test classes come here
})

public class TestSuiteClass extends BaseTest{
    @SuppressWarnings("deprecation")

    @AfterClass
    public static void finishTests(){
        if (driver != null) {
            Log.info("=====Browser Session Ended=====");
            driver.quit();
        }
    }
}



package com.wire;

import com.wireassignment.pages.WireSupportPageObject;
import com.wireassignment.utils.BaseTest;
import com.wireassignment.utils.Log;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import com.wireassignment.utils.UtililtyFunctions;
import java.util.List;

public class WireSupportSearchTests extends BaseTest {

    static WireSupportPageObject supportpage = new WireSupportPageObject(driver);

    /**
     * Loading support page before starting the test
     */
    @Before
    public void setup() {
        Log.info("Entering into WireSupportSearchTests");
        supportpage.loadSupportPage();
    }

    /**
     * Tests 'Search' functionality in support page
     */
    @Test
    public void testSearchTextField() {
        Log.startTestCase(UtililtyFunctions.getCurrentMethodName());
        supportpage.fillSearchTextfield("password");
        supportpage.clickSearchIcon();
        boolean isResultsDisplayed = supportpage.isSearchResultSectionDisplayed();
        Assert.assertTrue(isResultsDisplayed);
        Log.endTestCase(UtililtyFunctions.getCurrentMethodName());
    }

    /**
     * Tests whether all 8 tabs are present and can be clickable
     */
    @Test
    public void testTabClicking() {
        Log.startTestCase(UtililtyFunctions.getCurrentMethodName());
        List<WebElement> allTab = supportpage.getAllSupportSections();
        int totalSections = supportpage.getTotalNumberOfSections();
        Assert.assertTrue(allTab.size() == totalSections);

        for( int i = 0; i <allTab.size();i++ ) {
            allTab.get(i).click();
            driver.navigate().back();
        }
        Log.endTestCase(UtililtyFunctions.getCurrentMethodName());
    }

    /**
     * Tests 'Ask Support' button functionality
     */
    @Test
    public void testAskSupportButtton(){
        Log.startTestCase(UtililtyFunctions.getCurrentMethodName());
        supportpage.clickAskSupportButton();
        boolean isSupportPageTextDisplayed = supportpage.isAskSupportPageDisplayed();
        Assert.assertTrue(isSupportPageTextDisplayed);
        Log.endTestCase(UtililtyFunctions.getCurrentMethodName());
    }

    /**
     * Tests 'Recently Viewed' feature in support page
     */
    @Test
    public void testRecentlyViewed() {
        Log.startTestCase(UtililtyFunctions.getCurrentMethodName());
        supportpage.clickProSection();
        supportpage.clickProArticleNumber3();
        String protext=supportpage.getProArticleNumber3Text();

        //Clicking on Messaging
        supportpage.clickMessagingSection();
        supportpage.clickMessagingArticleNumber6();

        //verify in recent articles
        String recentarticle= supportpage.getRecentArticleText();
        Assert.assertEquals("text not found",protext,recentarticle);
        Log.endTestCase(UtililtyFunctions.getCurrentMethodName());
    }

    /**
     * Tests 'Pro: Get started with Wire Pro' feature
     */
    @Test
    public void testProSection() {
        Log.startTestCase(UtililtyFunctions.getCurrentMethodName());
        supportpage.clickProTab();
        supportpage.clickProArticleNumber1();

       //How to Invite team members by switching iframe
        driver.switchTo().frame(0);
        supportpage.clickArrowIcon1();
        supportpage.clickArrowIcon2();
        driver.switchTo().defaultContent();
        Log.endTestCase(UtililtyFunctions.getCurrentMethodName());
    }
}

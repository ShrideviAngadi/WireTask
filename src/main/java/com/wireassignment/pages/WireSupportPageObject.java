package com.wireassignment.pages;

import com.wireassignment.utils.BaseTest;
import com.wireassignment.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.wireassignment.utils.UtililtyFunctions;

import java.util.List;

public class WireSupportPageObject extends BaseTest {

    public WireSupportPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Explicit wait of 10 secs
     */
    WebDriverWait wait = new WebDriverWait(driver, 10);

    /**
     * Creating util Object of class Utils
     */
    UtililtyFunctions util = new UtililtyFunctions(driver);

    private static final String ID_SEARCHFIELD = "query";
    private static final String NAME_SEARCHICON = "commit";
    private static final String XPATH_SEARCHRESULT = "//div[contains(@class, 'search-results clearfix')]/h1";
    private static final String XPATH_ALLTABS="//ul[contains(@class,'main-menu hide-on-mobile')]/li";
    private static final String ID_ASKSUPPORTBUTTON="askSupport";
    private static final String XPATH_ASKSUPPORTPAGETEXT="//section[contains(@class,'main-column')]/h1";
    private static final String XPATH_PROTAB="//ul[contains(@class,'main-menu hide-on-mobile')]/li[1]";
    private static final String XPATH_PROARTICLE3="//ul[contains(@class,'article-list')]/li[3]";
    private static final String XPATH_PROARTICLE1="//ul[contains(@class,'article-list')]/li[1]";
    private static final String XPATH_PROPAGETEXT="//header[contains(@class, 'article-header clearfix')]/h1";
    private static final String XPATH_MESSAGINGTAB="//ul[contains(@class,'category-list category-navigation hide-on-mobile')]/li[3]";
    private static final String XPATH_MESSAGINGARTICLE6="//ul[contains(@class,'article-list')]/li[6]";
    private static final String XPATH_RECENTARTICLE="//section[contains(@class,'recent-articles')]//li[1]";
    private static final String XPATH_CLICKONARROW1="//button[contains(@class, 'navigate-right highlight enabled')]/div[1]";
    private static final String XPATH_CLICKONARROW2="//aside[contains(@class, 'controls')]/button[2]/div[1]";

    private static final int totalSections = 8;

    @FindBy(id = ID_SEARCHFIELD)
    private WebElement searchfield;

    @FindBy(name = NAME_SEARCHICON)
    private WebElement searchicon;

    @FindBy(xpath = XPATH_SEARCHRESULT)
    private WebElement searchresult;

    @FindBy(xpath = XPATH_ALLTABS)
    private List<WebElement> alltabs;

    @FindBy(id = ID_ASKSUPPORTBUTTON)
    private WebElement asksupportbutton;

    @FindBy(xpath = XPATH_ASKSUPPORTPAGETEXT)
    private WebElement asksupportpage_text;

    @FindBy(xpath = XPATH_PROTAB)
    private WebElement protab;

    @FindBy(xpath = XPATH_PROARTICLE3)
    private WebElement proarticle3;

    @FindBy(xpath = XPATH_PROARTICLE1)
    private WebElement proarticle1;

    @FindBy(xpath = XPATH_PROPAGETEXT)
    private WebElement propagetext;

    @FindBy(xpath = XPATH_MESSAGINGTAB)
    private WebElement messagingtab;

    @FindBy(xpath = XPATH_MESSAGINGARTICLE6)
    private WebElement messagingarticle6;

    @FindBy(xpath = XPATH_RECENTARTICLE)
    private WebElement recentarticle;

    @FindBy(xpath = XPATH_CLICKONARROW1)
    private WebElement arrowbutton1;

    @FindBy(xpath = XPATH_CLICKONARROW2)
    private WebElement arrowbutton2;

    public void fillSearchTextfield(String text){
        searchfield.sendKeys(text);
    }

    public void clickSearchIcon(){
        searchicon.click();
    }

    public boolean isSearchResultSectionDisplayed(){
        boolean isResultsDisplayed = searchresult.isDisplayed();
        return isResultsDisplayed;
    }

    public List<WebElement> getAllSupportSections(){
        return alltabs;
    }

    public int getTotalNumberOfSections() {
        return totalSections;
    }

    public void clickAskSupportButton(){
        asksupportbutton.click();
    }

    public boolean isAskSupportPageDisplayed(){
        boolean isSupportPageTextDisplayed = asksupportpage_text.isDisplayed();
        return isSupportPageTextDisplayed;
    }

    public void clickProSection(){
        protab.click();
    }

    public void clickProArticleNumber3(){
        proarticle3.click();
    }

    public String getProArticleNumber3Text(){
       return propagetext.getText();
    }

    public void clickMessagingSection(){
        messagingtab.click();
    }

    public void clickMessagingArticleNumber6(){
        messagingarticle6.click();
    }

    public String getRecentArticleText(){
        return recentarticle.getText();
    }

    public void clickProTab(){
        protab.click();
    }

    public void clickProArticleNumber1(){
        proarticle1.click();
    }

    public void clickArrowIcon1(){
        arrowbutton1.click();
    }

    public void clickArrowIcon2(){
        arrowbutton2.click();
    }

    public void loadSupportPage() {
        driver.get(Constants.URL);
    }
}

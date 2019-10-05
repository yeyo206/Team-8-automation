package CnnTests;

import CnnMainTestCases.CnnTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnHome extends CnnTestCases {
    CnnTestCases cnnTestCases;

    @BeforeMethod
    public void initElements() {
        cnnTestCases = PageFactory.initElements(driver,CnnTestCases.class);
    }
    @Test
    public void testUsButton() {
        usButton();
    }
    @Test
    public void testWorldButton() {
        worldButton();
    }
    @Test
    public void testPolitics() {
        politicsButton();
    }
    @Test
    public void testBusiness() {
        businessButton();
    }
    @Test
    public void testOpinion() {
        opinionButton();
    }
    @Test
    public void testHealth() {
        healthButton();
    }
    @Test
    public void testEntertaiment() {
        entertainmentButton();
    }
    @Test
    public void testStyle() {
        styleButton();
    }
    @Test
    public void testTravel() {
        travelButton();
    }
    @Test
    public void testSports() {
        sportsButton();
    }
    @Test
    public void testVideos(){
        videosButton();
    }
    @Test
    public void testSearchBar() {
        search();
    }
    @Test
    public void testLastestNews() {
        lastestUsStories();
    }
    @Test
    public void testUKLastestNews() {
        europeLastNews();
    }
    @Test
    public void testTodayNews() {
        checkForTodaysNews();
    }

    @Test
    public void testTermsOfUse() {
        openTermsOfUse();
    }

    @Test
    public void testTrendingButton() {
        openTrendingButton();
    }
    @Test
    public void testWorld() {
        openWorldbutton();
    }
    @Test
    public void testUs() {
        openUsButton();
    }

}

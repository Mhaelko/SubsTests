package com.academy.project;

import com.academy.framework.test.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.academy.project.page.HomePage.startFromHome;

public class DemoTests extends BaseTest {
    private static final Logger LOG =  LogManager.getLogger(DemoTests.class);

    @Test(dataProvider = "testDataProvider")
    public void testFeature(String value) {
        String title = startFromHome(driver, baseUrl)
                .inputSearch(value)
                .clickSearch()
                .getTitle();

        Assert.assertTrue(title.contains(value));
    }

    @DataProvider(name="testDataProvider")
    public Object[][] testDataProvider() {
        return new Object[][] {
                {"Selenium Java"}
        };
    }
}

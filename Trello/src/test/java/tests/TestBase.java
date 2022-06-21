package tests;

import manager.AplicationManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected static AplicationManager app = new AplicationManager();
    WebDriver wd;

    @BeforeSuite
    public void setApp() {
        app.init();
    }

    @AfterSuite
    public void terDown() {
        app.stop();
    }


}

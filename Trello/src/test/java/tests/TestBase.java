package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// не явное ожидание в течение 10 сек ждет отрисовки элементов
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    public void type(By locator, String text) {
        if (text != null) {
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }
    public void clickE(By locator) {
        wd.findElement(locator).click();
    }

    public boolean isElementPresent(By locator)
    {
        return wd.findElements(locator).size()>0;
    }

}
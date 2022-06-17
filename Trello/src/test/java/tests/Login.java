package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {


    @Test
    public void loginSuccess() {
        WebElement loginItem = wd.findElement(By.xpath("//*[@href='/login']"));
        loginItem.click();

        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        emailInput.click();// очистить то что было
        emailInput.clear();
        emailInput.sendKeys("noa@gmail.com");
        WebElement passwordInput = wd.findElement(By.xpath("//input[2]"));
        passwordInput.click();// очистить то что было
        passwordInput.clear();
        passwordInput.sendKeys("Nnoa12345$");
        // WebElement loginBtm=wd.findElement(By.xpath("//*[text()=' Login']"));// можно так
        wd.findElement(By.xpath("//*[text()=' Login']")).click();
        Assert.assertTrue(wd.findElements(By.xpath("//*[text()='Sign Out']")).size() > 0);

    }
    @Test
    public void loginSuccessNew()
    {
        clickE(By.xpath("//*[@href='/login']"));
        type(By.xpath("//input[1]"),"noa@gmail.com");
        type(By.xpath("//input[2]"),"Nnoa12345$");
        clickE(By.xpath("//*[text()=' Login']"));
        Assert.assertTrue(isElementPresent(By.xpath("//*[text()='Sign Out']")));
    }
}

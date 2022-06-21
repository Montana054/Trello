package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {

@Test
public void loginSuccess() throws InterruptedException {
    click(By.cssSelector("[href='/login']"));
    type(By.cssSelector("#user"),"juliakliot.@jk@gmail.com");
    click(By.cssSelector("#login"));
    type(By.cssSelector("#password"),"misha240613");
    click(By.cssSelector("#login-submit"));
    Thread.sleep(5000);//так не нужно+ требует эксепшена
    Assert.assertTrue(wd.findElements(By.cssSelector("[data-test-id='data-test-id']")).size()>0);
}

}

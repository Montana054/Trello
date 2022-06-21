package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperUser extends HelperBase {

    public HelperUser(WebDriver wd)
    {
        super(wd);
        //super();
    }

    public void inItLogin() {
        click(By.cssSelector("[href='/login']"));
    }
    public void fillLoginForm(String email, String password) {
        type(By.cssSelector("#user"),email); //"juliakliot.@jk@gmail.com"
        click(By.cssSelector("#login"));
        type(By.cssSelector("#password"),password);//"misha240613"
    }
    public void submitLogin() {
        click(By.cssSelector("#login-submit"));
    }
    public boolean isLoggedSuccess()
    {

        WebDriverWait wait =new WebDriverWait(wd, 10);
        wait.until(ExpectedConditions.visibilityOf(wd.findElement(By.cssSelector(".2ft40Nx3NZII2i"))));
        return wd.findElement(By.cssSelector(".2ft40Nx3NZII2i")).isDisplayed();
    }
    public void logOut()
    {
        click(By.cssSelector("[data-test-id='header-member-menu-button']"));
        click(By.cssSelector("[data-test-id='header-member-menu-logout']"));
        click(By.xpath("//button[@id='logout-submit']"));
    }
    public boolean isLogged()
    {
        return wd.findElements(By.cssSelector("[data-test-id='header-member-menu-logout']")).size()>0;
    }
}

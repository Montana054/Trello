package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AplicationManager {
    WebDriver wd;
    HelperUser user;

//    public AplicationManager(WebDriver wd) {
//        this.wd = wd;
//    }


    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// не явное ожидание в течение 10 сек ждет отрисовки элементов
        wd.navigate().to("https://trello.com/");
        user = new HelperUser(wd);
    }

    public void stop() {

        wd.quit();
    }

    public HelperUser getUser() {
        return user;
    }
}

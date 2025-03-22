package window_or_tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverCommand {
    @Test
    public void command() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://facebook.com");
        Thread.sleep(3000);

        String title = driver.getTitle();
        Thread.sleep(3000);
        System.out.println(title);
        System.out.println("===================================");

        String handel = driver.getWindowHandle();

        System.out.println(handel);
        System.out.println("===================================");

        String currentUrl = driver.getCurrentUrl();

        System.out.println(currentUrl);
        System.out.println("===================================");

        String pageSource = driver.getPageSource();

        System.out.println(pageSource);
        System.out.println("===================================");

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);

//        driver.navigate().forward();

//        driver.close();

        driver.quit();




    }
}

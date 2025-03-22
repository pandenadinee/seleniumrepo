package navigateDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateDemo {
    @Test
    public void demo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.navigate().to("https://facebook.com");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();;
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.close();

    }


}

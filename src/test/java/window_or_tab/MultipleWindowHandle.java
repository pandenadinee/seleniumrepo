package window_or_tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Set;

public class MultipleWindowHandle {
    @Test
    public void window() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);

        String parent_window = driver.getWindowHandle();
        System.out.println("main window handle :" + parent_window);

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com/");

        Set<String> allWindow = driver.getWindowHandles();

        for (String window : allWindow) {

            if (!window.equals(parent_window)) {
                driver.switchTo().window(window);
                Thread.sleep(2000);
                String title = driver.getTitle();
                System.out.println(title);
                Thread.sleep(2000);
                driver.close();
            }

        }
        driver.switchTo().window(parent_window);
        String parentWindowTitle = driver.getTitle();
        System.out.println(parentWindowTitle);
        Thread.sleep(2000);
        driver.close();
    }
}

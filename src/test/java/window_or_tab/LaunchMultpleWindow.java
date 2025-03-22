package window_or_tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class LaunchMultpleWindow {
    @Test
    public void window() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");
        Thread.sleep(3000);
        String parentWindow = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.get("https://www.linkedIn.com");
        Thread.sleep(3000);

       Set<String> all_window =  driver.getWindowHandles();

       for(String windows :all_window){
           driver.switchTo().window(windows);
           String tiltles = driver.getTitle();
           System.out.println(tiltles);
           driver.close();
       }

//        driver.quit();




    }
}

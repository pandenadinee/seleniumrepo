package window_or_tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class LaunchMultipelTab {
    @Test
    public void tabs() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String paren_window = driver.getWindowHandle();

        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.facebook.com");

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.amazon.com");

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.myntra.com");

        Thread.sleep(3000);

        Set<String> allTAbs = driver.getWindowHandles();
       for (String tabs :allTAbs){
           if(!tabs.equals(paren_window)){
               driver.switchTo().window(tabs);
               String t = driver.getTitle();
               Thread.sleep(3000);
               System.out.println(t);
               driver.close();
           }
       }
       driver.switchTo().window(paren_window);
       driver.close();
    }
}

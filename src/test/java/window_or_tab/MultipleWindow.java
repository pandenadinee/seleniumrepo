package window_or_tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindow {
    @Test
    public void window() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        Thread.sleep(3000);
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.get("https://www.linkedin.com/feed/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.get("https://www.youtube.com/?app=desktop");

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.get("https://www.netflix.com");

       Set<String> set =  driver.getWindowHandles();
       for(String allHandles:set){
           driver.switchTo().window(allHandles);
           if(driver.getTitle().contains("Netflix")){
               driver.close();
               break;
           }
       }
       driver.switchTo().window(mainWindow);
        System.out.println("Netflix window closed succesfully");


        Thread.sleep(3000);
//        driver.close();
    }
}

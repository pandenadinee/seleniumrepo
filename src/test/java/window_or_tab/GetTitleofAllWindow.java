package window_or_tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class GetTitleofAllWindow {

    @Test
    public void allWindowTitle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String parentWindow =  driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.facebook.com");

        // Open another new tab and switch to it (Netflix)
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(5000);
        driver.get("https://www.netflix.com");
        driver.switchTo().window(parentWindow);

        // all windows title
//        Set<String> allWidow = driver.getWindowHandles();
//        System.out.println(allWidow);
//        for( String window : allWidow){
//             driver.switchTo().window(window);
//             String title = driver.getTitle();
//             Thread.sleep(5000);
//             System.out.println(title);
//             driver.close();
//         }


        // Switch to child only and then get title and close child window
        Set<String> allWidow = driver.getWindowHandles();
        System.out.println(allWidow);
        for( String window : allWidow){
            if( !window.equals(parentWindow)){
                driver.switchTo().window(window);
                String title = driver.getTitle();
                Thread.sleep(5000);
                System.out.println(title);
                driver.close();
            }

        }

















    }
}

package window_or_tab;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Open the first tab (Google)
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        // Open a new tab and switch to it (Facebook)
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());

        // Open another new tab and switch to it (Netflix)
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(5000);
        driver.get("https://www.netflix.com");
        System.out.println(driver.getTitle());

        // Keep the browser open for a while (adjust as needed)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close all tabs
        driver.quit();
    }
}


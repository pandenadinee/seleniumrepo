package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.youtube.com/?app=desktop");
        driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("funny video");
        driver.findElement(By.xpath(""));

//        Thread.sleep(4000);
//        driver.close();
    }
}

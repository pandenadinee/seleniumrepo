package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingDemo {
    @Test
    public void scroll() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//div[text()='Book Store Application']"));

        js.executeScript("window.scrollBy(0,500);");

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0 , -500);");

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(500,0);");

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(-500,0);");

        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,0);");

        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        Thread.sleep(2000);
        driver.close();
    }
}

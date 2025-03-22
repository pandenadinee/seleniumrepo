package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JavaScriptDemo {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

//        Thread.sleep(4000);
//        jse.executeScript("window.scrollBy,(0,10000)");

        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(0,0)");

        Thread.sleep(4000);
        jse.executeScript("window.scrollBy(500, 0)");

        Thread.sleep(4000);
        jse.executeScript("window.scrollBy(-500,0)");


        Thread.sleep(4000);
        driver.close();


    }
}

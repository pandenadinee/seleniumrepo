package ActionsClassDemo;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollUshingJavaScript {
    @Test
    public void scrolL() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(-500, 0)");
        Thread.sleep(4000);
        js.executeScript("window.scrollTo(-500, 0)");
//
//        js.executeScript("window.scrollTo(0, 500)");
//        Thread.sleep(4000);
//
//        js.executeScript("window.scrollTo(0, -500)");
//        Thread.sleep(4000);
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        Thread.sleep(4000);
//
//        js.executeScript("window.scrollTo(0, 0)");

        Thread.sleep(4000);
        driver.close();


    }
}

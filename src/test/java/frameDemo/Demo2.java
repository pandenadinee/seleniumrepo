package frameDemo;

import org.openqa.selenium.BuildInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
    @Test
    public void frame() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");

        WebElement ele = driver.findElement(By.id("sampleHeading"));
        String frame_text = ele.getText();
        System.out.println(frame_text);

        Thread.sleep(3000);
        driver.close();


    }
}

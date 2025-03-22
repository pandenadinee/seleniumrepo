package alertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.TreeMap;

public class PromptAlertDemo {
    @Test
    public  void promptDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("prompt")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);

        System.out.println(alert.getText());

        alert.sendKeys("nandini");

        Thread.sleep(2000);

//        alert.accept();
        alert.dismiss();


        Thread.sleep(2000);
        driver.close();

    }
}

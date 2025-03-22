package alertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.TreeMap;

public class ConfirmationAlert {
    @Test
    public void confirmationAlert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("confirm")).click();
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
//        alert.accept();
//        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);
        driver.close();
    }
}

package alertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertWaitDemo {
    @Test
    public void alert(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://omayo.blogspot.com/");

        driver.findElement(By.id("alert2")).click();
//        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Alert until = wait.until(ExpectedConditions.alertIsPresent());
//
//        until.accept();
    }
}

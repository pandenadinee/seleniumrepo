package waitsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitPractice {
    @Test
    public void fluentWait(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement link = driver.findElement(By.xpath("//button[text()='Dropdown']"));
        link.click();

        FluentWait<WebDriver> fwait = new FluentWait<>(driver);
        fwait.pollingEvery(Duration.ofSeconds(2));

        fwait.withTimeout(Duration.ofSeconds(10));
        fwait.withMessage("finding");
        fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
        driver.findElement(By.xpath("//a[text()='Flipkart']")).click();





    }
}

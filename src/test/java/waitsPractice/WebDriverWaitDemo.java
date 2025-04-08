package waitsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWaitDemo {
    @Test
    public void waitDemo(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
       WebElement dd_button =  driver.findElement(By.xpath("//button[text()='Dropdown']"));
       dd_button.click();

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));

       WebElement link = driver.findElement(By.xpath("//a[text()='Flipkart']"));
       link.click();

       driver.close();

    }
}

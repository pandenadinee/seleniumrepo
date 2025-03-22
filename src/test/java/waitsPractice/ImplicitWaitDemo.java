package waitsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaitDemo {
    @Test
            public void implicitWait() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement link = driver.findElement(By.xpath("//button[text()='Dropdown']"));
        link.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Facebook']")).click();

        Thread.sleep(3000);
        driver.close();

    }
}

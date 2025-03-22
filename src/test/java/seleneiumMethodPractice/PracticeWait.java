package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeWait {

    @Test
    public void demo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://omayo.blogspot.com/");
       WebElement dd =  driver.findElement(By.xpath("//button[text()='Dropdown']"));
       dd.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
        wait.ignoring(NoSuchWindowException.class);
        wait.pollingEvery(Duration.ofMillis(200));

        WebElement facebook_link = driver.findElement(By.xpath("//a[text()='Facebook']"));

        FluentWait<WebDriver> wait1 = new FluentWait<>(driver);
        wait1.withTimeout(Duration.ofSeconds(20));
        wait1.pollingEvery(Duration.ofMillis(200));
        wait1.ignoring(NoSuchWindowException.class);
        wait1.withMessage("finding");
        wait1.until(ExpectedConditions.numberOfWindowsToBe(2));


        facebook_link.click();
        //


    }
}

package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitPractice {
    @Test
    public void waitprctice() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement dd = driver.findElement(By.xpath("//button[text()='Dropdown']"));
        dd.click();

//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
//
//        WebElement link = driver.findElement(By.xpath("//a[text()='Facebook']"));
//        link.click();

        FluentWait<WebDriver> fw = new FluentWait<>(driver);
        fw.pollingEvery(Duration.ofSeconds(10));

        fw.ignoring(NoSuchElementException.class);

        fw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));

        WebElement flifcart_link = driver.findElement(By.xpath("//a[text()='Flipkart']"));
        flifcart_link.click();

        
    }
}

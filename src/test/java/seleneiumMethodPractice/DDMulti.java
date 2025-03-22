package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class DDMulti {

    @Test
    public void multidd() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement multidd = driver.findElement(By.id("multiselect1"));
        Select sc = new Select(multidd);
        sc.selectByIndex(0);
        sc.selectByIndex(3);
        sc.selectByContainsVisibleText("Swift");
        Thread.sleep(10000);

        sc.deselectAll();
        Thread.sleep(10000);
        driver.quit();

    }

}

package waitsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitlyWaitDemo {
    @Test
    public void implicitWait(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       WebElement dropdown =  driver.findElement(By.xpath("//button[text()='Dropdown']"));
        dropdown.click();

        WebElement facebook_link = driver.findElement(By.xpath("//a[text()='Facebook']"));
        facebook_link.click();

        driver.close();
    }
}

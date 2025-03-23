package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClassDemo {

    @Test
    public void m1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        WebElement faishon_menu = driver.findElement(By.xpath("//*[text()='Fashion']"));

        Actions act = new Actions(driver);
        act.moveToElement(faishon_menu).perform();

//        WebElement wfw =  driver.findElement(By.xpath("//a[text()='Women Footwear']"));
//        act.click(wfw).perform();
//        act.contextClick().perform();
//         act.moveToElement(wfw).contextClick().build().perform();
//         act.contextClick(wfw).sendKeys("t").perform();
        Thread.sleep(4000);
        driver.close();

    }
}

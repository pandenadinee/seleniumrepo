package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BaisicMethod {
    @Test
    public void basic() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement ele = driver.findElement(By.xpath("//div [@class='_1wE2Px']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        Thread.sleep(3000);
//        actions.click(ele).perform();

        Thread.sleep(3000);
        driver.close();
    }
}

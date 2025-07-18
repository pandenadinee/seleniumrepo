package ActionsClassDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScrollDemo {
    @Test
    public void scroll() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");

        Actions actions = new Actions(driver);

        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_RIGHT).perform();

        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_LEFT).perform();

        WebElement down = driver.findElement(By.xpath("//*[text()='Book Store Application']"));

        Thread.sleep(3000);
//        actions.scrollToElement(scroll_down).perform();
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        Thread.sleep(3000);
//        actions.sendKeys(Keys.PAGE_UP).perform();




        Thread.sleep(3000);
        driver.close();
    }
}

package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scroll {

    @Test
    public void m2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dragabble");
        WebElement ts = driver.findElement(By.xpath("//*[text()='Book Store Application']"));
        Actions actions = new Actions(driver);
//        act.scrollToElement(ts).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(4000);

        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(4000);
        actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();


        Thread.sleep(4000);
        driver.close();
    }

}

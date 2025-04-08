package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardShortcuts1 {
    @Test
    public void keyButton() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Actions actions = new Actions(driver);

         WebElement email = driver.findElement(By.id("email"));

//         actions.sendKeys(email,"nandini").perform();

         actions.sendKeys(email,"pandey").perform();
        Thread.sleep(3000);

         actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
        Thread.sleep(3000);

         actions.keyDown(Keys.COMMAND).sendKeys("delete").keyUp(Keys.COMMAND).perform();
        Thread.sleep(3000);

         actions.keyDown(Keys.SHIFT).sendKeys("nandini").keyUp(Keys.SHIFT).perform();

         Thread.sleep(3000);




         driver.close();
    }
}

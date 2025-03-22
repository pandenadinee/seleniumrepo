package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PressAndHold {
    @Test
    public void m1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       WebElement email_text = driver.findElement(By.id("email"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(email_text,"nandini").keyUp(Keys.SHIFT).perform();
        actions.keyDown(Keys.COMMAND).sendKeys("a").sendKeys("c").keyUp(Keys.COMMAND).perform();

        WebElement pass_input = driver.findElement(By.id("pass"));

        Thread.sleep(3000);
        actions.keyDown(Keys.COMMAND).sendKeys(pass_input,"v").keyUp(Keys.COMMAND).perform();


        Thread.sleep(3000);
        driver.close();
    }
}


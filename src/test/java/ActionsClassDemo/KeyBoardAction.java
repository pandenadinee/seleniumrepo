package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardAction {
    @Test
    public void keyBoardMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        Actions actions = new Actions(driver);

        WebElement email_box = driver.findElement(By.id("email"));

        actions.sendKeys(email_box, "nandini@gmail.com").perform();
        Thread.sleep(3000);

        actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
        Thread.sleep(3000);
        actions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
        Thread.sleep(3000);
        actions.sendKeys(email_box, "puja@gmail.com").perform();

        Thread.sleep(3000);

        WebElement password_box = driver.findElement(By.id("passContainer"));
        Thread.sleep(3000);

        actions.sendKeys(password_box, "test&123").perform();

        WebElement login_button = driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]"));
        actions.click(login_button).perform();

        Thread.sleep(3000);
        driver.close();
    }
}

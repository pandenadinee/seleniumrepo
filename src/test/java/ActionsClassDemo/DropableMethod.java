package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropableMethod {
    @Test
    public void dragonDrop() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement destination = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        Thread.sleep(4000);

        act.clickAndHold(source).perform();
        act.release(destination).perform();

        Thread.sleep(4000);
        driver.close();
    }
}

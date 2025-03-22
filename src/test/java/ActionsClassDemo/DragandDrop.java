package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {

    @Test
    public void m1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
      WebElement source =  driver.findElement(By.id("draggable"));
      WebElement dest = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
//        act.dragAndDrop(source,dest).perform();
        act.clickAndHold(source).perform();
        act.release(dest).perform();


        Thread.sleep(5000);
        driver.close();
    }
}

package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropMethod1 {
    @Test
    public void method(){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);

        WebElement droppable_bu = driver.findElement(By.xpath("//span[text()='Droppable']"));
//
        actions.click(droppable_bu).perform();

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droppable"));


        actions.dragAndDrop(source,target).perform();




    }
}

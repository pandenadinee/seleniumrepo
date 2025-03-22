package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClassDemo2 {
    @Test
    public void demo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");

        WebElement HAndF = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));

        Actions act = new Actions(driver);
        act.moveToElement(HAndF).perform();
        act.moveToElement(HAndF).doubleClick().build().perform();;
        act.doubleClick(HAndF);


        WebElement furniture = driver.findElement(By.xpath("//a[text()='Furniture'][1]"));
        act.contextClick(furniture).perform();
        act.moveToElement(furniture).contextClick();




        Thread.sleep(2000);
        driver.close();

    }
}

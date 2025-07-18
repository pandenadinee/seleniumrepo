package ActionsClassDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClassBsicM {
    @Test
    public void basic() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com");
        WebElement elctronics = driver.findElement(By.xpath("//*[text()='Electronics']"));

        Actions act = new Actions(driver);
        act.moveToElement(elctronics).perform();
        Thread.sleep(3000);

        WebElement ele = driver.findElement(By.xpath("//a[text()='Electronics GST Store']"));
//        act.click(ele).perform();
//        act.contextClick(ele).perform();
        act.doubleClick(ele).perform();

        Thread.sleep(3000);
        driver.close();
    }
}

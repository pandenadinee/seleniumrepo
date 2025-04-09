package frameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class NestedFrameDemo {
    @Test
    public void nestedFrame() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1");

        WebElement child_Frame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        Thread.sleep(2000);
        driver.switchTo().frame(child_Frame);

        WebElement child_element = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        Thread.sleep(2000);
        String child_name = child_element.getText();
        System.out.println(child_name);

        driver.switchTo().parentFrame();

       WebElement parent_element = driver.findElement(By.xpath("//body[text()='Parent frame']"));
        Thread.sleep(2000);
       String parent_name = parent_element.getText();
        System.out.println(parent_name);

        Thread.sleep(2000);

        driver.close();



    }
}

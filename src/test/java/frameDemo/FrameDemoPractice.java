package frameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemoPractice {
    @Test
    public void frame(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        WebElement ele = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//        driver.switchTo().frame(ele);
        WebElement element = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
       String s =  element.getText();
        System.out.println(s);




    }
}

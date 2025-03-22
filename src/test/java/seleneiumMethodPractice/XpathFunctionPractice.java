package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctionPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

       WebElement email =  driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
       email.sendKeys("aarushi");

        Thread.sleep(2000);
        email.clear();
        Thread.sleep(2000);

       WebElement email2 = driver.findElement(By.xpath("//input[@type='text' or @class='inputtext']"));
       email2.sendKeys("appu");
       Thread.sleep(2000);

       driver.findElement(By.xpath("//div[@class='_6luy _55r1 _1kbt']/child::input")).sendKeys("12356");


       driver.findElement(By.xpath("//div[@class='_6ltg']/button")).click();







    }
}

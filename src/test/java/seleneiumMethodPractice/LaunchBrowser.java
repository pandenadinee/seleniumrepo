package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
//        WebElement email_txtbox =driver.findElement(By.id("email"));
//        email_txtbox.sendKeys("uday@facebook.com");
//        WebElement pass_txtbox = driver.findElement(By.name("pass"));
//        pass_txtbox.sendKeys("1234");
////        WebElement link_txt = driver.findElement(By.linkText("Forgotten password?"));
////        link_txt.click();
//        WebElement fp_link = driver.findElement(By.partialLinkText("Forgotten pa"));
//        fp_link.click();
       WebElement email =  driver.findElement(By.className("inputtext"));
       email.sendKeys("uday");
        Thread.sleep(2000);
       email.clear();
        Thread.sleep(2000);

        email.sendKeys("raj");
        Thread.sleep(2000);

        email.clear();
        Thread.sleep(2000);

        email.sendKeys("mohit");








    }
}

package alertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptAlertHandle {
    @Test
    public void prompt() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("hello");
        Thread.sleep(3000);

        String text = alert.getText();
        System.out.println(text);

        alert.accept();
        Thread.sleep(3000);
//        alert.dismiss();
        Thread.sleep(3000);
        driver.close();

    }
}

package alertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class SingleAlertDemo {
    @Test
    public void alert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        WebElement simple_alert = driver.findElement(By.id("alert1"));

        simple_alert.click();

        Alert al = driver.switchTo().alert();

        Thread.sleep(2000);

        System.out.println(al.getText());

        al.accept();


        Thread.sleep(2000);

        driver.close();

    }
}

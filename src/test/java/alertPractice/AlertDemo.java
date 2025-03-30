package alertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {

    @Test(priority =  2, description = "this is updated code")
    public void m1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
//        driver.findElement(By.id("prompt")).click();
        Alert alt =  driver.switchTo().alert();
        System.out.println(alt.getText());
        Thread.sleep(3000);
        alt.sendKeys("uday");
        Thread.sleep(3000);

//        alt.dismiss();
        alt.accept();

        driver.close();



    }
}

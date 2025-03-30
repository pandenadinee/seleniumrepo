package dropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SingleDrompD {
    @Test
    public void dropDown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

       WebElement single_dd =  driver.findElement(By.id("drop1"));

        Select s = new Select(single_dd);

//        s.selectByIndex(1);
//        s.selectByValue("ghi");

//        s.selectByVisibleText("doc 3");
        s.selectByIndex(3);

       boolean result =  s.isMultiple();

        System.out.println(result);
        s.getOptions();
        Thread.sleep(3000);
        driver.close();
    }
}

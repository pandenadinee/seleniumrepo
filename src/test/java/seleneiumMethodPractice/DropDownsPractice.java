package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownsPractice {

//    @Test
    public void MultiDd() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement multibox = driver.findElement(By.xpath("//select[@id='multiselect1']"));
        Select s = new Select(multibox);
        s.selectByIndex(0);
        s.selectByValue("swiftx");
        s.selectByContainsVisibleText("Audi");


//        s.deSelectByContainsVisibleText("Audi");

//        List<WebElement> options = s.getOptions();
//        for(int i = 0; i<options.size(); i++){
//            WebElement ele = options.get(i);
//            System.out.println(ele.getText());
//        }

        List<WebElement> ele_name = s.getAllSelectedOptions();
        for(int i = 0; i<ele_name.size(); i++){
            WebElement result = ele_name.get(i);
            System.out.println(result.getText());
        }

        Thread.sleep(3000);
        driver.close();
    }

    @Test

    public void singleSelectDd() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

       WebElement single_dd =  driver.findElement(By.xpath("//select[@id='drop1']"));

       Select s1 = new Select(single_dd);
//       s1.selectByVisibleText("doc 1");
       s1.selectByIndex(2);
//       s1.selectByValue("jkl");

        Thread.sleep(3000);
        driver.close();


    }
}

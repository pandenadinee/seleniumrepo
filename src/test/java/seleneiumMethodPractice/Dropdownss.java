package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Dropdownss {

    @Test
    public void dropdownhandle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement dd = driver.findElement(By.xpath("//select[@id='drop1']"));
        Select sc = new Select(dd);
//        sc.selectByIndex(2);
//         sc.selectByValue("jkl");
//        sc.selectByVisibleText("doc 4");
        List<WebElement> options = sc.getOptions();
//        for(int i = 0; i < options.size(); i++ ){
//          WebElement ele =   options.get(i);
//            System.out.println(ele.getText());
//        }
//        for( WebElement ele :options){
//            System.out.println(ele.getText());
////        }
        sc.selectByContainsVisibleText("4");
        sc.deselectAll();
        boolean res = sc.isMultiple();

        System.out.println(res);
        Thread.sleep(10000);
        driver.close();
    }
}

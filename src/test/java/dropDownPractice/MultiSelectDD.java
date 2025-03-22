package dropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiSelectDD {
    @Test
    public void multiSelect() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        WebElement single_dd =  driver.findElement(By.id("multiselect1"));

        Select s = new Select(single_dd);

        s.selectByIndex(0);
        s.selectByValue("swiftx");
        s.selectByVisibleText("Audi");
        s.selectByContainsVisibleText("Hyundai");

        List<WebElement> opt = s.getAllSelectedOptions();
        for(int i = 0; i<opt.size(); i++){
            WebElement element = opt.get(i);
            System.out.println(element.getText());

        }

        List<String> original = new ArrayList<>();

//        for(int i = 0; i<=opt.size(); i++){
//            original.add(opt.get(i));
//        }
        Thread.sleep(3000);
        driver.close();

    }
}

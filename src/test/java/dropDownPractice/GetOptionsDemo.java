package dropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class GetOptionsDemo {
    @Test
    public void options() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement multi_optiona = driver.findElement(By.id("multiselect1"));

        Select select = new Select(multi_optiona);

        List<WebElement> list = select.getOptions();

        List<String> original = new ArrayList<>();

        for(WebElement ele :list){
            original.add(ele.getText());

        }
        System.out.println(original);

        List<String> duplicate = new ArrayList<>(original);
        duplicate.sort(Comparator.naturalOrder());

        System.out.println(duplicate);

        boolean result=  duplicate.equals(original);
        if(result){
            System.out.println("it is sorted");
        }
        else {
            System.out.println("it is not sorted");
        }

//        Thread.sleep(3000);
        driver.close();



    }
}

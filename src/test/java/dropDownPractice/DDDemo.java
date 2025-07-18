package dropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import testngPractice.MultiTestCases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DDDemo {


    @Test
    public void demo() throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
       WebElement multiDD =  driver.findElement(By.id("multiselect1"));
//       multiDD.click();
//       Thread.sleep(2000);

        Select select = new Select(multiDD);

        select.selectByValue("volvox");
        select.selectByIndex(1);
        select.selectByVisibleText("Audi");
        select.selectByIndex(2);
        Thread.sleep(2000);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText());

        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

        for(WebElement ele :allSelectedOptions){
            String result = ele.getText();
            System.out.println(result);

        }
       List<WebElement> options =  select.getOptions();

        List<String> original = new ArrayList<>();
        for (WebElement ele1 : options){
            original.add(ele1.getText());
        }

        List<String> duplicate = new ArrayList<>(original);
        duplicate.sort(Comparator.naturalOrder());

        boolean check = duplicate.equals(original);
        if (check){
            System.out.println("sorted order");
        }
        else {
            System.out.println("unsorted order");
        }

        driver.close();
    }
}

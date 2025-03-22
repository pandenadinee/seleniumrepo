package dropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class MultiSelectDropDownHandele {
    @Test
    public void multiDropDown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement multiselectDD = driver.findElement(By.id("multiselect1"));

        Select select = new Select(multiselectDD);
        select.selectByIndex(0);
        Thread.sleep(3000);
        select.selectByValue("swiftx");
        Thread.sleep(3000);
        select.selectByVisibleText("Hyundai");
        Thread.sleep(3000);
        select.selectByContainsVisibleText("Audi");
        Thread.sleep(3000);

        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        for(WebElement optionName :allSelectedOptions){
            String name = optionName.getText();
            System.out.println(name);
        }

        WebElement firstOption = select.getFirstSelectedOption();
        System.out.println("first selected option is :" +firstOption);


        select.deselectByIndex(0);
        Thread.sleep(3000);
        select.deselectByValue("swiftx");
        Thread.sleep(3000);
        select.deselectByVisibleText("Hyundai");
        Thread.sleep(3000);
        select.deSelectByContainsVisibleText("Audi");


        Thread.sleep(3000);
        driver.close();
    }
}

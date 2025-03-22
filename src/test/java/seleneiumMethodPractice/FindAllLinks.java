package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAllLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
//       List<WebElement> list =  driver.findElements(By.xpath("//a"));
//        System.out.println(list.size());
//       for( int i = 0; i < list.size(); i++ ){
//          WebElement ele =  list.get(i);
//          String attValue =    ele.getAttribute("href");
//           System.out.println(attValue);
//           String text = ele.getText();
//           System.out.println(text);

        List<WebElement> value = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
        for(int i =0; i< value.size(); i++){
           WebElement ele =  value.get(i);
           String  e = ele.getText();
            System.out.println(e);
        }

    }
}

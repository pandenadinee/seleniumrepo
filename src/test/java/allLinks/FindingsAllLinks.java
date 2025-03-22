package allLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class FindingsAllLinks {
    @Test
    public void findingLinks() throws InterruptedException {
        ChromeOptions options  = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");


        WebElement element = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

                element.sendKeys("selenium");
                element.sendKeys(Keys.ENTER);
//                element.submit();

                Thread.sleep(2000);
//                driver.findElement(By.xpath("//ul[@role='listbox']//li[1]")).click();
        List<WebElement> element_links = driver.findElements(By.xpath("//a"));
        System.out.println(element_links.size());
       for(int i = 0; i<element_links.size(); i++){
           WebElement element1 = element_links.get(i);
           String href_name = element1.getAttribute("href");
           System.out.println(href_name);

       }




        Thread.sleep(3000);
        driver.close();




    }

}

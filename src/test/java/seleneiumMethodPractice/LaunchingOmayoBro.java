package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class LaunchingOmayoBro {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement box = driver.findElement(By.xpath("//select[@id='multiselect1']"));
        box.click();
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//select[@id='multiselect1']/option[1]"));
        element.click();
        Thread.sleep(2000);

       boolean isEnable =  driver.findElement(By.xpath("//button[@id='but2']")).isEnabled();
        System.out.println(isEnable);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("hi i am nandini ,i am inspecting the omayo blog for practice");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//textarea[@rows='10' and @cols='30']")).sendKeys("this text area is not empty");
         Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nandini@123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input [@Type='password']")).sendKeys("nd@15555");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='button' and @value='LogIn']")).submit();
        Thread.sleep(2000);
        Set<Integer> sh = new HashSet<>();
        sh.add(10);
        Iterator<Integer> iter = sh.iterator();
        while (iter.hasNext()){
           int i=  iter.next();
        }
        HashMap<Integer,String> map = new HashMap<>();
        map.put(10, "uday");
        map.put(20,"rohit");
       Set<Map.Entry<Integer, String>>  set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()){
        Map.Entry<Integer,String > e =     iterator.next();
        }
        driver.close();
    }
}

package seleneiumMethodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

       driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

//       WebElement mail = driver.findElement(By.id("email"));
//       mail.sendKeys("nandini@123");
//        Thread.sleep(2000);
//
//
//        WebElement p =  driver.findElement(By.name("pass"));
//        p.sendKeys("1234");
//        Thread.sleep(2000);
//
//        WebElement logInButton = driver.findElement(By.className("_42ft"));
//        logInButton.submit();
//        Thread.sleep(2000);
//
//        driver.navigate().back();
//        Thread.sleep(200);
//
//        driver.findElement(By.linkText("Forgotten password?")).click();
//        Thread.sleep(200);
//
//        driver.navigate().back();
//        Thread.sleep(2000);
//
//        driver.findElement(By.partialLinkText("Forgotten")).click();
//        Thread.sleep(200);
//        driver.navigate().back();

//        WebElement ele =  driver.findElement(By.tagName("input"));

        List<WebElement> links = driver.findElements(By.xpath("//input"));
        System.out.println(links.size());
        for(int i = 0; i< links.size(); i++){
            WebElement element = links.get(i);
           String text =  element.getText();
//            System.out.println(element);
//            System.out.println(text);
            String tag = element.getTagName();
            System.out.println(tag);
        }
//        driver.close();

    }
}

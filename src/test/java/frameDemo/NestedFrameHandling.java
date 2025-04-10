package frameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrameHandling {
    @Test
    public void frame() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1");
        WebElement childIFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(childIFrame);

        WebElement child_frame = driver.findElement(By.xpath("//p[text()='Child Iframe']"));

        String childName = child_frame.getText();
        System.out.println(childName);

        driver.switchTo().parentFrame();

        WebElement parent_frame = driver.findElement(By.xpath("//body[text()='Parent frame']"));
        String parentName = parent_frame.getText();
        System.out.println(parentName);

        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        driver.close();
    }
}

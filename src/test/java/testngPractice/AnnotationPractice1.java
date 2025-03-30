package testngPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AnnotationPractice1 {

    @BeforeMethod
    public void before(){
        System.out.println(" before method");


    }


    @AfterMethod
    public void after(){
        System.out.println("After method");
    }

    @Test
    public void m1(){
        System.out.println("m1 method");
    }

    @Test
    public void m2(){
        System.out.println("m1 method");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }
}

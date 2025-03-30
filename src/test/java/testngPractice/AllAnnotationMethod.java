package testngPractice;

import org.testng.annotations.*;
import org.testng.internal.annotations.IBeforeSuite;

public class AllAnnotationMethod {
    @Test
    public void m1(){
        System.out.println("m1 method");
    }
    @BeforeMethod
    public void before(){
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("agter class method");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite mehtod");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite mehtod");
    }
}

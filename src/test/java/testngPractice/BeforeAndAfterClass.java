package testngPractice;

import org.testng.annotations.*;

public class BeforeAndAfterClass {
    @Test
    public void a1(){
        System.out.println("a1 method");
    }
    @Test
    public void a2(){
        System.out.println("a2 method");
    }

    @BeforeMethod
    public void before(){
        System.out.println("before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("after method");
    }

    @BeforeClass
    public void beforClass(){
        System.out.println("befor class method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class method");
    }
}

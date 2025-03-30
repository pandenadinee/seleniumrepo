package testngPractice;

import org.testng.annotations.*;

public class Demo1 {

    @Test
    public void demo1(){
        System.out.println("demo1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }



    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("before suit");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
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

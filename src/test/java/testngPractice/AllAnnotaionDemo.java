package testngPractice;

import org.testng.annotations.*;

public class AllAnnotaionDemo {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("execute before suit");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("execute BeforeTest");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("execute BeforeClass");
    }
    @BeforeMethod
    public void beforeMehtod(){
        System.out.println("execute BeforeMethod");
    }
    @Test
    public void m1(){
        System.out.println(" test method -1");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("execute AfterMethod");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("execute AfterClass");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("execute AfterTest");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("execute AfterSuite");
    }

}

package testngPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterAndBeforeMethod {
    @Test
    public void m1(){
        System.out.println("this is m1 method");
    }
    @BeforeMethod()
    public void before(){
        System.out.println("this is before annotation method");

    }
    @AfterMethod
    public void after(){
        System.out.println("this is after annotaion method");
    }
    @Test
    public void a2(){
        System.out.println("this is a2 method");
    }
}

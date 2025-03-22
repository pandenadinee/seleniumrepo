package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class MultiTestCases {

    @Test(priority = 5,invocationCount = 2,enabled = false)
    public void eat(){

        System.out.println("i can eat");
    }

    @Test(priority = 2,timeOut = 2000)
    public void sleep() throws InterruptedException {
//        Thread.sleep(4000);
        System.out.println("i am sleeping");
    }

    @Test(priority = 4)
    public void run(){

        System.out.println("i can run");

    }
    @Test(priority = 1)
    public void play(){
        System.out.println("i am playing");
    }
}

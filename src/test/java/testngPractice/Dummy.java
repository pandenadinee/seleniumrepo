package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dummy {

    @Test(dependsOnMethods = {"eat","display"}, alwaysRun = true)
    public void run(){
        System.out.println("run");
    }

    @Test()
    public void display() throws InterruptedException {
        System.out.println("display");
        Assert.assertEquals(true,false);
    }

    @Test
    public void eat(){
        System.out.println("eat");
//        Assert.assertEquals(true,false);
    }
}

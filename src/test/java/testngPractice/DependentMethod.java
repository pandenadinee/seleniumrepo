package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethod {

    @Test(dependsOnMethods = "X" , alwaysRun = true)
    public void A(){
        System.out.println("i am A method");
    }

    @Test
    public void B(){

        System.out.println(" i am B method");
    }

    @Test
    public void X(){
        Assert.assertEquals(true,false);
        System.out.println("i am x method");
    }

    @Test
    public void D(){
        System.out.println("i am D method ");
    }
}

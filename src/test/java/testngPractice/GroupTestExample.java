package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupTestExample {

  @Test(dependsOnGroups = "smoke")
  public void demo(){
      System.out.println("demo");
  }

    // Smoke Test
    @Test(groups = {"smoke"})
    public void testLogin() {
        Assert.assertEquals(true,false);
        System.out.println("Executing Smoke Test: Login");
    }

    // Smoke Test
    @Test(groups = {"smoke"})
    public void testHomePageLoad() {
        System.out.println("Executing Smoke Test: Home Page Load");
    }

    // Sanity Test
    @Test(groups = "sanity")
    public void testUserProfile() {
        System.out.println("Executing Sanity Test: User Profile");
    }

    // Sanity & Smoke Test
    @Test(groups = {"smoke", "sanity"})
    public void testSearchFunctionality() {
        System.out.println("Executing Smoke & Sanity Test: Search");
    }
}

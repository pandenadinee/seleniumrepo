package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @Test(dataProvider = "logindata")
    public void login(String username, String password ) throws InterruptedException {
        System.out.println("Entered username " + username);
        System.out.println("Entered password " + password);
        System.out.println("clicked on login button");
        System.out.println("=====================");
        Thread.sleep(3000);
    }

    @DataProvider(name = "logindata", parallel = true)
    public Object[][] loinprovider(){

        Object[][] data = new Object[3][2];
        data[0][0] = "uday";
        data[0][1] = "123";

        data[1][0] = "akash";
        data[1][1] = "234";

        data[2][0] = "mohit";
        data[2][1] = "567";

        return  data;

    }

}

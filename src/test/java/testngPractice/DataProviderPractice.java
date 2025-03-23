package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

    @Test(dataProvider = "logInData")
    public void homePage(String userName , String password) throws InterruptedException {
        System.out.println("enter user name " +userName);
        System.out.println("enter user password " + password );
        System.out.println("click on logIn button");
        Thread.sleep(3000);

    }

    @DataProvider(name ="logInData" , parallel = true)
    public Object[][] data(){

        Object[][] arr = new Object[3][2];

        arr[0][0] = "nandini";
        arr[0][1] = "10";

        arr[1][0] = "uday";
        arr[1][1] = "20";

        arr[2][0] = "aarushi";
        arr[2][1] = "30";

        return arr;
    }
}

package testngPractice;

import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "LogIn_data")
    public void logIn(String userName, String password) {

        System.out.println("Enter user name " + userName);
        System.out.println("Enter password " + password);
        System.out.println("Click on LogIn button");
        System.out.println("******************************");

    }

    @org.testng.annotations.DataProvider(name = "LogIn_data")
    public Object[][] dataProvider() {
        Object[][] data = new Object[3][2];
        data[0][0] = "Riya";
        data[0][1] = "123";

        data[1][0] = "Puja";
        data[1][1] = "111";

        data[2][0] = "Naman";
        data[2][1] = "100";

        return data;
    }
}

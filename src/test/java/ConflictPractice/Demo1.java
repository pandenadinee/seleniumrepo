package ConflictPractice;

import org.testng.annotations.Test;

public class Demo1 {
    @Test
    public void m1(){
        System.out.println("conflict demo practice");
        int n = 20;
        for(int i = 2; i<=n; i;){
            System.out.println(i);
        }

    }
}

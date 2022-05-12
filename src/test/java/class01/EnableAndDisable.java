package class01;

import org.testng.annotations.Test;

// by default enable is TRUE
public class EnableAndDisable {
    @Test(enabled = false)
    public void FirstTest(){
        System.out.println("1st");
    }

    @Test()
    public void SecondTest(){
        System.out.println("2nd");
    }

    @Test()
    public void ThirdTest(){
        System.out.println("3rd");
    }
    // USE: if a test case failed and while it's being fixed by devs you can disable them
    // so they won't run in the meantime

}

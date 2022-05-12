package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class BasicAnnotations {

    // these execute in alphabetical order
    @Test
    public void cfirstTest(){
        System.out.println("This is my first test case");
    }
    @Test
    public void asecondTest(){
        System.out.println("This is my second test");
    }

    @Test
    public void bthirdTest(){
        System.out.println("This is my third test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("----------------- I am a precondition -----------------");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("******************* I Am Postcondition ********************");
    }
}

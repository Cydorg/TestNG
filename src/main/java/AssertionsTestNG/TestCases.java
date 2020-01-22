package AssertionsTestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases
{

    @Test
    public void test1()
    {
        System.out.println("Open Browser");
        Assert.assertEquals(true,true);

        System.out.println("enter username");
        System.out.println("enter password");
        System.out.println("click on sign in button");


        System.out.println("validate Home page");
        Assert.assertEquals(true,false); // HARD ASSERTION

        System.out.println("go to deals page");
        System.out.println("create a deal");

        System.out.println("go to contacts page");
        System.out.println("create a contact");
    }
}

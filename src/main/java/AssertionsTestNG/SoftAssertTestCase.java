package AssertionsTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestCase
{
    //SoftAssert softAssert=new SoftAssert();GLOBALLY CREATED
    @Test
    public void test1()
    {
        SoftAssert softAssert1=new SoftAssert(); //LOCALLY CREATED
        System.out.println("Open the Browser");
        Assert.assertEquals(true,true);

        System.out.println("enter username");
        System.out.println("enter password");
        System.out.println("click on sign in button");


        System.out.println("validate Home page");
        softAssert1.assertEquals(true,false,"home page title is missing"); // SOFT ASSERTION

        System.out.println("go to deals page");
        System.out.println("create a deal");
        softAssert1.assertEquals(true,false,"not able to create a deal"); // SOFT ASSERTION

        System.out.println("go to contacts page");
        System.out.println("create a contact");
        softAssert1.assertEquals(true,false,"not able to create a contact");

        softAssert1.assertAll();
    }

        @Test
        public void test2()
        {
            SoftAssert softAssert2=new SoftAssert();
            System.out.println("logout");
            softAssert2.assertEquals(true,false);
            softAssert2.assertAll();
        }
        @AfterClass
        public void tearDown()
        {

        }
}

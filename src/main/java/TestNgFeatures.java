import org.testng.annotations.Test;

public class TestNgFeatures
{
    @Test
    public void loginTest()
    {
        //throw new SkipException("skipping all tests");
        //
        System.out.println("login test");
    }
    @Test(dependsOnMethods = "loginTest")
    public void HomePageTest()
    {
        System.out.println("Home Page Test");
    }
    @Test(dependsOnMethods = "loginTest")
    public void SearchPageTest()
    {
        System.out.println("Search Page Test");
    }
    @Test(dependsOnMethods = "loginTest")
    public void RegPageTest()
    {
        System.out.println("Reg Test");
    }

}

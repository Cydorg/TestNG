import org.testng.annotations.*;

public class testngBasics
{
    //PRE-CONDITIONS ANNOTATIONS --- STARTING WITH @Before
   @BeforeSuite //1
   public void setup()
   {
       System.out.println("setup system property for chrome");
   }
    @BeforeTest //2
    public void launchBrowser()
    {
        System.out.println("launch the browser");
    }
    @BeforeClass //3
    public void login()
    {
        System.out.println("login to app");
    }

    @BeforeMethod //4
   public void enterURL()
   {
       System.out.println("enter url");
   }

 //TEST CASES --- STARTING WITH @Test
    @Test //5
   public void googleTitleTest()
   {
     System.out.println("Google Title Test");
   }

   @Test
   public void searchTest()
   {
       System.out.println("search test");
   }

   //POST CONDITIONS --- STARTING WITH @After
   @AfterMethod //6
    public void logout()
   {
       System.out.println("logout from app");
   }

   @AfterTest //8
    public void deleteAllCookies()
   {
       System.out.println("delete all cookies");
   }

   @AfterClass //7
    public void closeBrowser()
   {
       System.out.println("close browser");
   }

   @AfterSuite //9
    public void generateTestReport()
   {
       System.out.println("generate Test Report");
   }

}

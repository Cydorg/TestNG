import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest
{
    WebDriver driver;

    @BeforeMethod
    public void setup()
    {
      System.setProperty("webdriver.chrome.driver","./chromedriver_78.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("https://www.google.com/");
    }

    @Test
    public void googleTitleTest()
    {
        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(title,"Google");
    }

    @Test
    public void googleLogoTest()
    {
        boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
        Assert.assertTrue(b);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}

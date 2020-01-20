package TakeScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class Base {
    public static WebDriver driver;

    public static void initialization()
    {
        System.setProperty("webdriver.chrome.driver", "./chromedriver_78.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    public void failed(String testMethodName)
    {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("C:/Users/Mac/Cydorg-automation/TestNG/src/main/java/screenshots/"+testMethodName+"_"+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

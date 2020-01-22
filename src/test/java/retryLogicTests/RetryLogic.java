package retryLogicTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogic
{
    String log4jConfPath="C:/Users/Mac/Cydorg-automation/TestNG/src/test/java/retryLogicTests/log4j.properties";
    @Test
    public void RetryTest()
    {
        PropertyConfigurator.configure(log4jConfPath);

        Logger log = Logger.getRootLogger();
        log.info("starting test cases");

        Assert.assertTrue(true);
    }

    @Test
    public void RetryTest1()
    {
        Assert.assertTrue(false);
    }

}

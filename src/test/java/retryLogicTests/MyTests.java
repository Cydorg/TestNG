package retryLogicTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests
{
    @Test(retryAnalyzer = retryLogicAnalyzer.RetryAnalyzer.class) //THIS IS HOW RETRY LOGIC IS IMPLEMENTED AT TEST LEVEL
    public void Test1()
    {
        Assert.assertEquals(false,true);
    }
    @Test
    public void Test2()
    {
        Assert.assertEquals(true,true);
    }
}

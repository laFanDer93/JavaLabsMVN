package lab1;

import org.junit.Assert;
import org.junit.Test;

public class DeployTest {

    @Test
    public void DeployTestShouldWork(){
        String s = "1,2-5,6-8,9,10";
        Assert.assertEquals("1,2,3,4,5,6,7,8,9,10",Task3.deploy(s));
    }


}

package lab1;

import org.junit.Assert;
import org.junit.Test;

public class RollUpTest {

    @Test
    public void rollUpTest(){
        String s = "1,2,3,4,5,6,7,8,9";
        Assert.assertEquals("1-9",Task4.rollUp(s));
    }
}

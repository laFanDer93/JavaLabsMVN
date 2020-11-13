package lab1;

import org.junit.Test;
import org.junit.*;

public class CollatzTest {

    @Test
    public void CollatzTest(){
        Assert.assertEquals(20,Task1.collatz(19));
        Assert.assertEquals(111,Task1.collatz(27));
    }
}

package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SqrtTest {

    private final double delta = 1e-4;
    private Sqrt sqrt;


    @Before
    public void CreateSqrtObject() {
        sqrt = new Sqrt(4);
    }

//    @Test
//    public void SqrtAverageTest() {
//        Assert.assertEquals(3, sqrt.average(2, 4), 1e-4);
//    }

    @Test
    public void SqrtGoodTest() {
        Assert.assertEquals(2.0,sqrt.calc(),delta);
    }
}

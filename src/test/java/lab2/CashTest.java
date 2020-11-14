package lab2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CashTest {
    Automata automata;

    @Before
    public void createObject(){
        automata = new Automata();
    }

    //правильно ли принимает деньги
    @Test
    public void cashShouldBe200(){
        int cash = 200;
        automata.on();
        automata.coin(cash);
        Assert.assertEquals(200,automata.getCash());
    }

    //правильно ли выдает сдачу
    @Test
    public void takeChangeShouldReturn70(){
        int cash = 100;
        automata.on();
        automata.coin(cash);
        automata.choice(1);
        Assert.assertEquals(70,automata.getChange());
    }

}

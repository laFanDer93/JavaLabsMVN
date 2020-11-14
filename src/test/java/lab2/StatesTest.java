package lab2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StatesTest {
    Automata automata;
    @Before
    public void createObject(){
        automata = new Automata();
    }

    @Test
    public void stateShouldBeOff(){
        Assert.assertEquals(States.OFF,automata.getState());
    }

    @Test
    public void stateShouldBeWait(){
        automata.on();
        Assert.assertEquals(States.WAIT,automata.getState());
        automata.coin(2);
        automata.choice(6);
        Assert.assertEquals(States.WAIT,automata.getState());
        automata.coin(2000);
        automata.choice(4);
        Assert.assertEquals(States.WAIT,automata.getState());
    }

    @Test
    public void stateShouldBeAccept(){
        automata.on();
        automata.coin(200);
        Assert.assertEquals(States.ACCEPT,automata.getState());
    }


    @Test
    public void stateShouldBeCheck(){
        automata.on();
        automata.coin(200);
        automata.choice(4);
        Assert.assertEquals(States.CHECK,automata.getState());
    }


}

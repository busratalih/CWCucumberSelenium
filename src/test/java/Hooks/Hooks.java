package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.checkerframework.checker.index.qual.PolyUpperBound;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Before methodu calisti");
    }

    @After
    public void teardown(){
        System.out.println("After methodu calisit");
    }
}

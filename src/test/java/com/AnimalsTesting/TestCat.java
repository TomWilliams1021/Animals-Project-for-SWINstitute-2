package com.AnimalsTesting;

import com.animals.mammals.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCat {
/////
    @Test
    public void testCatSetSize(){
        Cat testCat = new Cat();
        assertEquals( 14, testCat.setSize(14), "The set size method for cat did not return the correct size.");
    }

    @Test
    public void testBreathe(){
        Cat testCat = new Cat();
        assertEquals("I am breathing", testCat.breathe(), "The breathe method for cat did not return the correct string fora cat object.");
    }

    @Test
    public void testCatReproduce(){
        Cat testCat = new Cat();
        assertEquals(12, testCat.reproduce().getSize(), "The reproduce method for cat did not return the correct size for a new cat object." );
    }

}

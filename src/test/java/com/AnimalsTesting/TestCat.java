package com.AnimalsTesting;

import com.Animals.Mammals.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCat {

    @Test
    public void testCatSetSize(){
        Cat testCat = new Cat();
        assertEquals(testCat.setSize(14), 14, "The set size method for cat did not return the correct size.");

    }

    @Test
    public void testCatReproduce(){
        Cat testCat = new Cat();
        assertEquals(testCat.reproduce().getSize(), 12, "The reproduce method for cat did not return the correct size for a new cat object." );
    }
}

package com.AnimalsTesting.Mammals;

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

    @Test
    public void testCatEat(){
        Cat testCat = new Cat();
        int testSize = testCat.getSize() + 1;
        testCat.eat("cat food");
        assertEquals(testSize, testCat.getSize(), "The cat eat method did not increase the size value as expected.");
    }

    @Test
    public void testCatExcrete(){
        Cat testCat = new Cat();
        assertEquals("poop", testCat.excrete(), "The cat excrete method did not return the expected string\"poop\".");
    }

    @Test
    public void testCatDie(){
        Cat testCat = new Cat();
        assertEquals("dead", testCat.die(), "The cat die method did not return the expected string\"dead\".");
    }

    @Test
    public void testCatGetAge(){
        Cat testCat = new Cat();
        assertEquals(1, testCat.getAge(), "The cat age get method did not return the expected default age integer.");
    }

    @Test
    public void testCatSetAge(){
        Cat testCat = new Cat();
        testCat.setAge(3);
        assertEquals(3, testCat.getAge(), "The cat set age method did not update the age field to be the expected value.");
    }
}

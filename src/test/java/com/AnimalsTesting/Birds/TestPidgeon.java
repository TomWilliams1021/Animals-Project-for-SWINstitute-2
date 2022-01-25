package com.AnimalsTesting.Birds;

import com.animals.birds.Pidgeon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPidgeon {

    @Test
    public void testPidgeonGetSize(){
        Pidgeon testPidgeon = new Pidgeon();
        assertEquals(4, testPidgeon.getSize(), "The pidgeon get size method did not return the expected size value.");
    }

    @Test
    public void testPidgeonSetSize(){
        Pidgeon testPidgeon = new Pidgeon();
        testPidgeon.setSize(6);
        assertEquals(6, testPidgeon.getSize() , "The set size method for class pidgeon did not set the new size correctly");
    }

    @Test
    public void testPidgeonBreathe(){
        Pidgeon testPidgeon = new Pidgeon();
        assertEquals("I am breathing very quickly.", testPidgeon.breathe(), "The pidgeon breathe method did not return the expected string.");
    }

    @Test
    public void testPidgeonReproduce(){
        Pidgeon testPidgeon = new Pidgeon();
        assertEquals(4, testPidgeon.reproduce().getSize(), "The reproduce method or Pidgeon did not return the expected size value for anew pidgeon object.");
    }

    @Test
    public void testPidgeonEat(){
        Pidgeon testPidgeon = new Pidgeon();
        int testSize = testPidgeon.getSize() + 1;
        testPidgeon.eat("Scraps");
        assertEquals(testSize, testPidgeon.getSize(), "The pidgeon eat method did not increase the size value as expected.");
    }

    @Test
    public void testPidgeonExcrete(){
        Pidgeon testPidgeon = new Pidgeon();
        assertEquals("poop", testPidgeon.excrete(), "The Pidgeon excrete method did not return the expected string.");
    }

    @Test
    public void testPidgeonDie(){
        Pidgeon testPidgeon = new Pidgeon();
        assertEquals("dead", testPidgeon.die(), "The Pidgeon die method did not return the expected string.");
    }

    @Test
    public void testPidgeonGetAge(){
        Pidgeon testPidgeon = new Pidgeon();
        assertEquals(1, testPidgeon.getAge(), "The pidgeon get age method did not return the expected default age integer.");
    }

    @Test
    public void testPidgeonSetAge(){
        Pidgeon testPidgeon = new Pidgeon();
        testPidgeon.setAge(3);
        assertEquals(3, testPidgeon.getAge(), "The cat set age method did not update the age field to be the expected value.");
    }
}

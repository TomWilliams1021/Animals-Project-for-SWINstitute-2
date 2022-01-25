package com.AnimalsTesting.Mammals;

import com.animals.mammals.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDog {

    @Test
    public void testDogEat(){
        Dog testDog = new Dog();
        int testSize= testDog.getSize() + 1;
        testDog.eat("dog food");
        assertEquals(testSize, testDog.getSize(), "The dog eat method did not increase the size value as expected.");
    }

    @Test
    public void testDogReproduce(){
        Dog testDog = new Dog();
        assertEquals(12, testDog.reproduce().getSize(), "The reproduce method for dog did not return the correct size for a new dog object." );
    }
}

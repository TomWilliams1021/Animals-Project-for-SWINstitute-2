package com.animals.mammals;

import com.animals.Animals;

public abstract class Mammal extends Animals {
    ////Attributes////
    private int size;

    ////Constructors////
    public Mammal(){
        this.size = 12;
    }
    ////Methods////
    public String breathe(){
        return "I am breathing";
    }

    public int getSize(){
        return size;
    }

    public int setSize(int size){
        this.size = size;
        return size;
    }

    public abstract Mammal reproduce();
}

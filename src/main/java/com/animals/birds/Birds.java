package com.animals.birds;

import com.animals.Animals;

public abstract class Birds extends Animals {
    //Attributes//
    private int size = 4;

    //Constructors//

    //Methods//
    public abstract Birds reproduce();

    public String breathe() {
        return "I am breathing very quickly.";
    }

    public int getSize(){
        return size;
    }

    public int setSize(int size){
        this.size = size;
        return size;
    }
}

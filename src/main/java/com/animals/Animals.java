package com.animals;

public abstract class Animals {

    ///////Attributes///////
    private int age;

    ///////Constructors///////

    ///////Methods////////
    public abstract void eat(String food);

    public void sleep(int sleepTime) {
        //this.wait(sleepTime);
    }

    public abstract Animals reproduce();

    public abstract String breathe();

    public String excrete(){
        return "poop";
    }

    public void die(){
        //Dead
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

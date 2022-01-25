package com.animals;

public abstract class Animals {

    ///////Attributes///////
    private int age = 1;
    private String die = "dead";
    private String excrete = "poop";
    ///////Constructors///////

    ///////Methods////////
    public abstract void eat(String food);

    public void sleep(int sleepTime) {
        //this.wait(sleepTime);
    }

    public abstract Animals reproduce();

    public abstract String breathe();

    public String excrete(){
        return excrete;
    }

    public String die(){
        return die;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

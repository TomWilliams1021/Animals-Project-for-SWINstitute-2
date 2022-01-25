package com.animals;

public abstract class Animals {

    ///////Attributes///////
    private int age;
    private String die;
    private String excrete;
    ///////Constructors///////
    public Animals(){
        this.age = 1;
        this.die = "dead";
        this.excrete = "poop";
    }
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

    public void setAge(int newAge){
        age = newAge;
    }
}

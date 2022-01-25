package com.animals.mammals;

public class Cat extends Mammal {
    ////Attributes////

    ////Constructors////
    public Cat(){
        this.setAge(2);
        this.setSize(8);
    }
    ////Methods//////
    public void eat(String food){

        this.setSize(this.getSize() + 1);
    }

    public Cat reproduce(){

        return new Cat();
    }
}

package com.animals.mammals;

public class Dog extends Mammal{
    //Attributes//

    //Constructors//

    //Methods//
    public void eat(String food){

        this.setSize(this.getSize() + 1);
    }

    public Dog reproduce(){

        return new Dog();
    }
}

package com.animals.birds;

public class Pidgeon extends Birds {
    //Attributes//

    //Constructors//

    //Methods//
    public void eat(String food){
        this.setSize(this.getSize() + 1);
    }

    public Pidgeon reproduce(){
        return new Pidgeon();
    }
}

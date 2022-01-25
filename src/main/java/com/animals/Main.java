package com.animals;
import com.animals.mammals.Cat;

public class Main {

    public static void main(String[] args){
        Cat cat1 = createCat();
    }

    public static Cat createCat(){
        return new Cat();
    }
}

package com.example;

import java.util.List;

public class Lion extends Animal implements InterfaceFeline{

    boolean hasMane;
private InterfaceFeline feline;
    public Lion(String sex, InterfaceFeline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.feline=feline;
    }


    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }
    @Override
    public int getKittens() {
        return getKittens(1);
    }
    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}

package com.example;

import java.util.List;

import static com.example.utils.TextConstants.SEX_EXCEPTION_MESSAGE;

public class Lion {

    private final Feline feline;
    private final boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception(SEX_EXCEPTION_MESSAGE);
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }
}

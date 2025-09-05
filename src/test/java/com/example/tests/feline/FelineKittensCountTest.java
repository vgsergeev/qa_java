package com.example.tests.feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineKittensCountTest {

    private final int kittensCount;

    public FelineKittensCountTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensQuantity(){
        return new Object[][] {
                {-1},
                {0},
                {1},
                {2}
        };
    }

    @Test
    public void testKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
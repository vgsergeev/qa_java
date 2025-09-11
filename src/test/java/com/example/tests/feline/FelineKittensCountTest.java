package com.example.tests.feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineKittensCountTest {

    private final int kittensCountExpected;
    private final int kittensCountActual;
    Feline feline = new Feline();

    public FelineKittensCountTest(int kittensCountExpected, int kittensCountActual) {
        this.kittensCountExpected = kittensCountExpected;
        this.kittensCountActual = kittensCountActual;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getKittensQuantity(){
        return new Object[][] {
                {0, 0},
                {1, 1},
                {12, 12}
        };
    }

    @Test
    public void testKittens() {
        Assert.assertEquals("Количество котят не совпадает с ожиданием", kittensCountExpected, feline.getKittens(kittensCountActual));
    }
}
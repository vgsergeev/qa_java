package com.example.tests.feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import static com.example.utils.TextConstants.PREDATOR_DIET;

public class FelineFamilyAndDietTest {

    @Test
    public void testFamilyIsFeline() {
        Feline feline = new Feline();
        Assert.assertEquals("Семейство не Кошачьи","Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineDiet() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Набор еды не для Кошачьих", PREDATOR_DIET, feline.eatMeat());
    }
}
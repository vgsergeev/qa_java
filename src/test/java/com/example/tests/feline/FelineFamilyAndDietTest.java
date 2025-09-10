package com.example.tests.feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.example.utils.TextConstants.PREDATOR_DIET;

public class FelineFamilyAndDietTest {

    private Feline feline;

    @Before
    public void setUpTest() {
        feline = new Feline();
    }

    @Test
    public void testFamilyIsFeline() {
        Assert.assertEquals("Семейство не Кошачьи","Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineDiet() throws Exception {
        Assert.assertEquals("Набор еды не для Кошачьих", PREDATOR_DIET, feline.eatMeat());
    }
}
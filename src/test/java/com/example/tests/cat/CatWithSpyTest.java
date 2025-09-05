package com.example.tests.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.utils.TextConstants.PREDATOR_DIET;

@RunWith(MockitoJUnitRunner.class)
public class CatWithSpyTest {

    @Spy
    private Feline felineSpy;

    @InjectMocks
    private Cat cat;

    @Test
    public void testCatSound() {
        Assert.assertEquals("Кот не говорит Мяу","Мяу", cat.getSound());
    }

    @Test
    public void testCatDietWithSpy() throws Exception {
        cat.getFood();
        Mockito.verify(felineSpy,Mockito.times(1)).eatMeat();
        Assert.assertEquals("Набор еды не для Кота", PREDATOR_DIET, cat.getFood());
    }
}
package com.example.tests.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.utils.TextConstants.PREDATOR_DIET;


@RunWith(MockitoJUnitRunner.class)
public class LionWithSpyTest {

    @Spy
    private Feline felineSpy;

    @InjectMocks
    private Lion lion;

    @Test
    public void testLionKittensWithSpy() {
        int result = lion.getKittens();
        Assert.assertEquals(1, result);
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void testLionDietWithSpy() throws Exception {
        lion.getFood();
        Mockito.verify(felineSpy, Mockito.times(1)).eatMeat();
        Assert.assertEquals("Набор еды не для Льва", PREDATOR_DIET, lion.getFood());
    }
}

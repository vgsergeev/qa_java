package com.example.tests.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.utils.TextConstants.PREDATOR_DIET;

@RunWith(MockitoJUnitRunner.class)
public class CatWithMockTest {

    private Cat cat;

    @Mock
    private Feline felineMock;

    @Before
    public void setUpTest() {
        cat = new Cat(felineMock);
    }

    @Test
    public void testCatSound() {
        Assert.assertEquals("Кот не говорит Мяу","Мяу", cat.getSound());
    }

    @Test
    public void testCatDietWithMock() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(PREDATOR_DIET);
        Assert.assertEquals("Набор еды не для Кота", PREDATOR_DIET, cat.getFood());
    }
}
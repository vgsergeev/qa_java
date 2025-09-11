package com.example.tests.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.utils.TextConstants.PREDATOR_DIET;


@RunWith(MockitoJUnitRunner.class)
public class LionWithMockTest {

    private Lion lion;

    @Mock
    private Feline felineMock;

    @Before
    public void setUpTest() throws Exception {
        lion = new Lion("Самец", felineMock);
    }

    @Test
    public void testLionKittensWithMock() {
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testLionDietWithMock() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(PREDATOR_DIET);
        Assert.assertEquals("Набор еды не для Льва", PREDATOR_DIET, lion.getFood());
    }
}
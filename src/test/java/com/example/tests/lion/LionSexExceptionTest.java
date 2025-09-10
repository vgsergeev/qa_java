package com.example.tests.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static com.example.utils.TextConstants.SEX_EXCEPTION_MESSAGE;

public class LionSexExceptionTest {

    @Test
    public void invalidSexThrowsException() {
        try {
          new Lion("Самей", new Feline());
        } catch (Exception e) {
            Assert.assertEquals(SEX_EXCEPTION_MESSAGE,e.getMessage());
        }
    }
}
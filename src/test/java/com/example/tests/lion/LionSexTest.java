package com.example.tests.lion;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final String sex;
    private final boolean result;

    public LionSexTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSex(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testLionSexCheck() throws Exception {
        Lion lion = new Lion(sex);
        Assert.assertEquals(result,lion.doesHaveMane());
    }
}
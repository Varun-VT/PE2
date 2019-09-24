package com.stackroute.practiseexrcise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberIsPowerOfFourTest {
    private NumberIsPowerOfFour numberispoweroffour;
    @Before
    public void setup(){
        numberispoweroffour= new NumberIsPowerOfFour();
        System.out.println("Inside before");
    }
    @After
    public void tearDowm(){
        numberispoweroffour= null;
        System.out.println("Inside After");
    }
    @Test
    public void numberispartoffour() {
        assertEquals(false, numberispoweroffour.numberIsPowerOfFour(123));
    }
}
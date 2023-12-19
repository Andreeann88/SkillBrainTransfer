package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumere {

    @Test
    public void isPrime(){
        int nr = 11;
        boolean result =  Main.isPrime(nr);
        Assertions.assertTrue(result);
    }

    @Test
    public void isNotPrime(){
        int nr = 8;
        boolean result =  Main.isPrime(nr);
        Assertions.assertFalse(result);
    }
}

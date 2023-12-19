package org.example;

import org.example.oop.lasagna.Lasagna;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Teste {
    /*@Test
    public void testpozitiv(){
        boolean rezultat= Main.isCharacterPresent("Ana are mere si pere", 'c');
        assertFalse(rezultat);
    }
    @Test
    public void stringIsPalindrom(){
        boolean rez = Main.isStringPalindrom("ana");
        assertTrue(rez);
    }
    @Test
    public void verificareGrade(){
        int rez = Main.schimbareGrade(12);
        assertEquals(53, rez);
    }
    @Test
    public void testnegativ(){
        boolean rezultat= Main.isCharacterPresent("Ana are mere si pere",'b');
        assertFalse(rezultat);
    }
    */
    @Test
    public void testUnu() {
        Lasagna lasagna = new Lasagna();
        int rezultat = lasagna.returneazaUnu();
        assertEquals(rezultat, 1);
        assertTrue(rezultat == 1);

    }

    
    @Test
    public void verificaNume() {
        Lasagna bolognese = new Lasagna();
        bolognese.name = "Paste";
        assertEquals(bolognese.name, "Paste:");
    }
}

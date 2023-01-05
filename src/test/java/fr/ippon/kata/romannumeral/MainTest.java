package fr.ippon.kata.romannumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MainTest {

    @Test
    void should_convert_1_to_I() {
        Main main = new Main();
        String romanNumeral = main.compute(1);
        Assertions.assertEquals("I",romanNumeral);
    }


    @Test
    void should_convert_3_to_III() {
        Main main = new Main();
        String romanNumeral = main.compute(3);
        Assertions.assertEquals("III",romanNumeral);
    }

    @Test
    void should_convert_4_to_IV() {
        Main main = new Main();
        String romanNumeral = main.compute(4);
        Assertions.assertEquals("IV",romanNumeral);
    }

    @Test
    void should_convert_9_to_IX() {
        Main main = new Main();
        String romanNumeral = main.compute(9);
        Assertions.assertEquals("IX",romanNumeral);
    }

}
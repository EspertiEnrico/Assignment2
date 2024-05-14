////////////////////////////////////////////////////////////////////
// ENRICO ESPERTI 2075534
// DAVIDE COLABOVE 2084622
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    void convert1() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    void convert2() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    void convert3() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    void convert4() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    void convert5() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    void convert6() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    void convert7() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    void convert8() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    void convert9() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    void convert10() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    void convert11() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    void convert12() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    void convert13() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    void convert14() {
        assertEquals("MMXXIV", IntegerToRoman.convert(2024));
    }

    @Test
    void convert15() {
        assertEquals("MMMCMXCIX", IntegerToRoman.convert(3999));
    }
}

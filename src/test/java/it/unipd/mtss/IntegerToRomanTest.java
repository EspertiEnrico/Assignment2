////////////////////////////////////////////////////////////////////
// ENRICO ESPERTI 2075534
// DAVIDE COLABOVE 2084622
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    void convert_Number1_ShouldReturnI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    void convert_Number4_ShouldReturnIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    void convert_Number5_ShouldReturnV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    void convert_Number9_ShouldReturnIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    void convert_Number10_ShouldReturnX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    void convert_Number40_ShouldReturnXL() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    void convert_Number50_ShouldReturnL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    void convert_Number90_ShouldReturnXC() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    void convert_Number100_ShouldReturnC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    void convert_Number400_ShouldReturnCD() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    void convert_Number500_ShouldReturnD() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    void convert_Number900_ShouldReturnCM() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    void convert_Number1000_ShouldReturnM() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    void convert_Number2024_ShouldReturnMMXXIV() {
        assertEquals("MMXXIV", IntegerToRoman.convert(2024));
    }

    @Test
    void convert_Number0_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
    }

    @Test
    void convert_NumberNegative_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(-1);
        });
    }

    @Test
    void convert_Number1000_ShouldPerformUnder1Second() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            IntegerToRoman.convert(1000);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        assertTrue(duration < 1000); 
    }
}
////////////////////////////////////////////////////////////////////
// ENRICO ESPERTI 2075534
// DAVIDE COLABOVE 2084622
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    void print_Number1_ShouldReturnAsciiArtForI() {
        String expected = 
              "  _____ \n"
            + " |_   _|\n"
            + "   | |  \n"
            + "   | |  \n"
            + "  _| |_ \n"
            + " |_____|\n";
        assertEquals(expected, RomanPrinter.print(1));
    }

    @Test
    void print_Number4_ShouldReturnAsciiArtForIV() {
        String expected = 
              "  _____  __      __\n"
            + " |_   _| \\ \\    / /\n"
            + "   | |    \\ \\  / / \n"
            + "   | |     \\ \\/ /  \n"
            + "  _| |_     \\  /   \n"
            + " |_____|     \\/    \n";
        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    void print_Number9_ShouldReturnAsciiArtForIX() {
        String expected = 
              "  _____  __   __\n"
            + " |_   _| \\ \\ / /\n"
            + "   | |    \\ V / \n"
            + "   | |     > <  \n"
            + "  _| |_   / . \\ \n"
            + " |_____| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(9));
    }

    @Test
    void print_Number40_ShouldReturnAsciiArtForXL() {
        String expected = 
              " __   __  _      \n"
            + " \\ \\ / / | |     \n"
            + "  \\ V /  | |     \n"
            + "   > <   | |     \n"
            + "  / . \\  | |____ \n"
            + " /_/ \\_\\ |______|\n";
        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    void print_Number90_ShouldReturnAsciiArtForXC() {
        String expected = 
              " __   __   _____ \n"
            + " \\ \\ / /  / ____|\n"
            + "  \\ V /  | |     \n"
            + "   > <   | |     \n"
            + "  / . \\  | |____ \n"
            + " /_/ \\_\\  \\_____|\n";
        assertEquals(expected, RomanPrinter.print(90));
    }

    @Test
    void print_Number400_ShouldReturnAsciiArtForCD() {
        String expected = 
              "   _____   _____  \n"
            + "  / ____| |  __ \\ \n"
            + " | |      | |  | |\n"
            + " | |      | |  | |\n"
            + " | |____  | |__| |\n"
            + "  \\_____| |_____/ \n";
        assertEquals(expected, RomanPrinter.print(400));
    }

    @Test
    void print_Number900_ShouldReturnAsciiArtForCM() {
        String expected = 
              "   _____   __  __ \n"
            + "  / ____| |  \\/  |\n"
            + " | |      | \\  / |\n"
            + " | |      | |\\/| |\n"
            + " | |____  | |  | |\n"
            + "  \\_____| |_|  |_|\n";
        assertEquals(expected, RomanPrinter.print(900));
    }

    @Test
    void print_Number1000_ShouldReturnAsciiArtForM() {
        String expected = 
              "  __  __ \n"
            + " |  \\/  |\n"
            + " | \\  / |\n"
            + " | |\\/| |\n"
            + " | |  | |\n"
            + " |_|  |_|\n";
        assertEquals(expected, RomanPrinter.print(1000));
    }

    @Test
    void print_Number2024_ShouldReturnAsciiArtForMMXXIV() {
        String expected = 
              "  __  __   __  __  __   __ __   __  _____  __      __\n"
            + " |  \\/  | |  \\/  | \\ \\ / / \\ \\ / / |_   _| \\ \\    / /\n"
            + " | \\  / | | \\  / |  \\ V /   \\ V /    | |    \\ \\  / / \n"
            + " | |\\/| | | |\\/| |   > <     > <     | |     \\ \\/ /  \n"
            + " | |  | | | |  | |  / . \\   / . \\   _| |_     \\  /   \n"
            + " |_|  |_| |_|  |_| /_/ \\_\\ /_/ \\_\\ |_____|     \\/    \n";
        assertEquals(expected, RomanPrinter.print(2024));
    }

    @Test
    void print_Number3999_ShouldReturnAsciiArtForMMMCMXCIX() {
        String expected = 
              "  __  __   __  __   __  __    _____   __  __  __   __   _____   _____  __   __\n"
            + " |  \\/  | |  \\/  | |  \\/  |  / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /\n"
            + " | \\  / | | \\  / | | \\  / | | |      | \\  / |  \\ V /  | |        | |    \\ V / \n"
            + " | |\\/| | | |\\/| | | |\\/| | | |      | |\\/| |   > <   | |        | |     > <  \n"
            + " | |  | | | |  | | | |  | | | |____  | |  | |  / . \\  | |____   _| |_   / . \\ \n"
            + " |_|  |_| |_|  |_| |_|  |_|  \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(3999));
    }

    @Test
    void print_Number0_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(0);
        });
    }

    @Test
    void print_NumberNegative_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(-1);
        });
    }

    @Test
    void print_Number1000_ShouldPerformUnder1Second() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            RomanPrinter.print(1000);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        assertTrue(duration < 1000);
    }
}
////////////////////////////////////////////////////////////////////
// ENRICO ESPERTI 2075534
// DAVIDE COLABOVE 2084622
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder riga1 = new StringBuilder();
        StringBuilder riga2 = new StringBuilder();
        StringBuilder riga3 = new StringBuilder();
        StringBuilder riga4 = new StringBuilder();
        StringBuilder riga5 = new StringBuilder();
        StringBuilder riga6 = new StringBuilder();

        for (char c : romanNumber.toCharArray()) {
            switch (c) {
                case 'I':
                    riga1.append("  _____ ");
                    riga2.append(" |_   _|");
                    riga3.append("   | |  ");
                    riga4.append("   | |  ");
                    riga5.append("  _| |_ ");
                    riga6.append(" |_____|");
                    break;
                case 'V':
                    riga1.append(" __      __");
                    riga2.append(" \\ \\    / /");
                    riga3.append("  \\ \\  / / ");
                    riga4.append("   \\ \\/ /  ");
                    riga5.append("    \\  /   ");
                    riga6.append("     \\/    ");
                    break;
                case 'X':
                    riga1.append(" __   __");
                    riga2.append(" \\ \\ / /");
                    riga3.append("  \\ V / ");
                    riga4.append("   > <  ");
                    riga5.append("  / . \\ ");
                    riga6.append(" /_/ \\_\\");
                    break;
                case 'L':
                    riga1.append("  _      ");
                    riga2.append(" | |     ");
                    riga3.append(" | |     ");
                    riga4.append(" | |     ");
                    riga5.append(" | |____ ");
                    riga6.append(" |______|");
                    break;
                case 'C':
                    riga1.append("   _____ ");
                    riga2.append("  / ____|");
                    riga3.append(" | |     ");
                    riga4.append(" | |     ");
                    riga5.append(" | |____ ");
                    riga6.append("  \\_____|");
                    break;
                case 'D':
                    riga1.append("  _____  ");
                    riga2.append(" |  __ \\ ");
                    riga3.append(" | |  | |");
                    riga4.append(" | |  | |");
                    riga5.append(" | |__| |");
                    riga6.append(" |_____/ ");
                    break;
                case 'M':
                    riga1.append("  __  __ ");
                    riga2.append(" |  \\/  |");
                    riga3.append(" | \\  / |");
                    riga4.append(" | |\\/| |");
                    riga5.append(" | |  | |");
                    riga6.append(" |_|  |_|");
                    break;
                default:
                    throw new IllegalArgumentException("Il carattere romano '" + c + "' non Ã¨ supportato");
            }
        }

        return riga1.toString() + "\n" +
               riga2.toString() + "\n" +
               riga3.toString() + "\n" +
               riga4.toString() + "\n" +
               riga5.toString() + "\n" +
               riga6.toString() + "\n";       
    }  
}
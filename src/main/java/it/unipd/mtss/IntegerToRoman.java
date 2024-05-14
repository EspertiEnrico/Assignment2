////////////////////////////////////////////////////////////////////
// ENRICO ESPERTI 2075534
// DAVIDE COLABOVE 2084622
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {
    private final static TreeMap<Integer, String> simboli = new TreeMap<Integer, String>();

    static {
        simboli.put(1000, "M");
        simboli.put(900, "CM");
        simboli.put(500, "D");
        simboli.put(400, "CD");
        simboli.put(100, "C");
        simboli.put(90, "XC");
        simboli.put(50, "L");
        simboli.put(40, "XL");
        simboli.put(10, "X");
        simboli.put(9, "IX");
        simboli.put(5, "V");
        simboli.put(4, "IV");
        simboli.put(1, "I");
    }

    public final static String convert(int n) {
        int i=simboli.floorKey(n);
        if (n==i) {
            return simboli.get(n);
        }
        return simboli.get(i) + convert(n-i);
    }
}
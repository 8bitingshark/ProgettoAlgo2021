package ProgettoAlgo2021.Utils;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ThreadLocalRandom;

import ProgettoAlgo2021.FirstProjet.Period;

public class TestingUtils {

    public static void DefinedTests(Period p) {
        //Example tests taken from elearning page
        assertEquals(3, p.minimalFractionaryPeriod("abcabcab"));
        assertEquals(2, p.minimalFractionaryPeriod("aba"));
        assertEquals(3, p.minimalFractionaryPeriod("abca"));
        assertEquals(1, p.minimalFractionaryPeriod("aaaa"));
        assertEquals(1, p.minimalFractionaryPeriod("aaaaa"));
        assertEquals(-1, p.minimalFractionaryPeriod("ac"));
    }

    public static String[] GenerateStrings(int amount, char[] alphabet, int minLength, int maxLength) {

        double A = minLength;
        double B = Math.pow(((float)maxLength/(float)A), 1.0/99.0);

        String[] randomStrings = new String[amount];

        for (int i = 0; i < amount; i++) {
            int r = ThreadLocalRandom.current().nextInt(0, 100);
            int len = (int)Math.floor(A*Math.pow(B, r));

            String randomString = "";

            for (int j = 0; j < len; j++) {
                randomString += alphabet[ThreadLocalRandom.current().nextInt(0, alphabet.length)];
            }

            randomStrings[i] = randomString;
        }

        return randomStrings;

    }

    
}

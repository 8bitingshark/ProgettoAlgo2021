package ProgettoAlgo2021.Utils;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ThreadLocalRandom;

import ProgettoAlgo2021.FirstProjet.Period;

public class TestingUtils {

    public static void DefinedTests(Period p) {
        //Example tests taken from elearning page
        assertEquals(p.minimalFractionaryPeriod("abcabcab"), 3);
        assertEquals(p.minimalFractionaryPeriod("aba"), 2);
        assertEquals(p.minimalFractionaryPeriod("abca"), 3);
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

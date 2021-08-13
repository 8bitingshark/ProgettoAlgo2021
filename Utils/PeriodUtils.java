package ProgettoAlgo2021.Utils;

public class PeriodUtils {

    public static boolean SatisfiesCondition(String s, int p) {

        for (int i = 0; i < s.length() - p; i++) {
            if (s.charAt(i) != s.charAt(i + p)) return false;
        }
        return true;
        
    }
    
}

package ProgettoAlgo2021.Utils;

public class PeriodUtils {

    public static boolean SatisfiesCondition(String s, int p) {

        for (int i = 0; i < s.length() - p; i++) {
            if (s.charAt(i) != s.charAt(i + p)) return false;
        }
        return true;
        
    }

    public static double[] Slice(double[][] original, int index) {

        double[] slice = new double[original[0].length];

        for (int i = 0; i < slice.length; i++) {
            slice[i] = original[i][index];
        }

        return slice;
    }

    public static double[][] Transpose(double[][] original) {

        double[][] transposed = new double[original[0].length][original.length];

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                transposed[i][j] = original[j][i];
            }
        }

        return transposed;

    }
    
}

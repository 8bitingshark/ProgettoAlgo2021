package ProgettoAlgo2021.Utils;

public class PerformanceUtils {
    
    public static double getResolution() {
        double start = System.nanoTime();
        double end;
        do {
            end = System.nanoTime();
        } while (start == end);
        return end - start;
    }

    public static double getMinimumTime(double maxError) {
        return getResolution() * (1.0/maxError + 1);
    }

}

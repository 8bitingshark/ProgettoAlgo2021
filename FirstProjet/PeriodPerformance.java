package ProgettoAlgo2021.FirstProjet;

import ProgettoAlgo2021.Utils.PerformanceUtils;
import ProgettoAlgo2021.Utils.TestingUtils;

public class PeriodPerformance {

    /**
     * Runs the given fractionary period function and returns the matrix of the times taken to execute it over an exponential distribution of string lengths.
     * The first column indicates the string length used for the corresponding row
     * @param p             the algorithm to evaluta
     * @param granularity   how many different string lengths should be tested
     * @param minLen        minimum string length
     * @param maxLen        maximum string length
     * @param numerosity    how many times should the function be tested on the same string length
     * @return  a matrix where the first index determines the index of the exponential distribution while the second index stores the various iterations over a single string length.
     *          The first column is the string length
     */
    public static double[][] GetTimes(Period p, int granularity, int minLen, int maxLen, int numerosity) {

        //The matrix will store all times obtained for each iteration of each string length tested
        double[][] times = new double[granularity][numerosity+1];

        //Math wizardry to obtain an esponential distribution of string lengths from @minLen to @maxLen with @granularity lengths
        double A = minLen;
        double B = Math.pow(((float)maxLen/(float)A), 1.0/(double)(granularity - 1.0));

        double totalTests = granularity * numerosity;

        for (int i = 0; i < granularity; i++) {
            
            //Evaluate length of string based on iteration
            int len = (int)Math.floor(A*Math.pow(B, i));

            times[i][0] = len;

            String[] s = TestingUtils.GenerateStrings(numerosity, new char[]{'a','b','c'}, len);

            for (int j = 0; j < numerosity; j++) {

                double minTime = PerformanceUtils.getMinimumTime(0.001);

                double start = System.nanoTime();
                double now = System.nanoTime();
                int iterations = 0;

                while (now - start < minTime) {
                    p.minimalFractionaryPeriod(s[j]);
                    now = System.nanoTime();
                    iterations++;
                }

                times[i][j+1] = (now - start)/(double)iterations;

                System.out.println("Progress: " + (((double)j + (double)i*(double)numerosity)/totalTests)*100 + "%");

            }

        }

        return times;

    }
    
}

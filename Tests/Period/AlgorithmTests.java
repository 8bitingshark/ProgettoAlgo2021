package ProgettoAlgo2021.Tests.Period;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ProgettoAlgo2021.FirstProjet.*;
import ProgettoAlgo2021.Utils.TestingUtils;

public class AlgorithmTests {

    /**
     * Tests naive period over a bunch of strings
     */
    @Test
    public void TestNaivePeriodStandalone() {
        TestingUtils.DefinedTests(new PeriodNaive());
    }

    /**
     * Tests smart period over a bunch of strings
     */
    @Test
    public void TestSmartPeriodStandalone() {
        TestingUtils.DefinedTests(new PeriodSmart());
    }

    /**
     * Tests that naive and smart period always return the same values
     */
    @Test
    public void PeriodSmartAndNaiveShouldBeEquivalent() {
        String[] testStrings = TestingUtils.GenerateStrings(1000, new char[]{'a', 'b', 'c'}, 500, 10000);

        Period naive = new PeriodNaive();
        Period smart = new PeriodSmart();

        for (int i = 0; i < testStrings.length; i++) {
            int n = naive.minimalFractionaryPeriod(testStrings[i]); 
            int s = smart.minimalFractionaryPeriod(testStrings[i]);
            if (n != s) {
                System.out.println("Tested on:");
                System.out.println(testStrings[i]);
            }
            assertEquals(n, s);
        }
    }

}

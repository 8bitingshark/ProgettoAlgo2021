package ProgettoAlgo2021.Tests.Period;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;
import ProgettoAlgo2021.Utils.PeriodUtils;

public class UtilTests {

    /**
     * TODO extend this test, it's garbage right now
     */
    @Test
    public void TestSatisfiesCondition() {

        assertTrue(PeriodUtils.SatisfiesCondition("abcabcab", 3));
        assertTrue(PeriodUtils.SatisfiesCondition("aba", 2));
        assertTrue(PeriodUtils.SatisfiesCondition("abca", 3));
        
    }

}

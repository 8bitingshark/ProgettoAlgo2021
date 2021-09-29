package ProgettoAlgo2021.FirstProjet;

import ProgettoAlgo2021.Utils.*;

public class PeriodNaive implements Period {

    @Override
    public int minimalFractionaryPeriod(String s) {
        
        for (int i = 1; i < s.length(); i++) {
            if (PeriodUtils.SatisfiesCondition(s, i)) return i;
        }

        return -1;
 
    }
    
}

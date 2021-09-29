package ProgettoAlgo2021.FirstProjet;

public class PeriodSmart implements Period {

    @Override
    public int minimalFractionaryPeriod(String s) {
        
        int len = s.length();

        int[] support = new int[len];

        support[0] = 0;

        for (int i = 1; i < len; i++) {

            int rj = support[i - 1];

            char ext = s.charAt(i);

            while (rj > 0 && ext != s.charAt(rj)) {
                    rj = support[rj - 1];
            }

            if ( s.charAt(i) == s.charAt(rj) ) rj++;

            support[i] = rj;

        }

        if (support[len-1] == 0) return -1;

        return len - support[len-1];

    }
    
}

package ProgettoAlgo2021;

import ProgettoAlgo2021.FirstProjet.*;
import ProgettoAlgo2021.Utils.IOUtils;

class Main {

    public static void main(String[] args) {

        //Here it is possible to choose what algorithm will be used for calculating the period
        Period p = new PeriodNaive();

        //Get input string from System.in and print the minimal fractionary period of the given string
        IOUtils.RunIOFunction((s) -> {
            return ((Integer)p.minimalFractionaryPeriod(s)).toString();
        });

    }

}
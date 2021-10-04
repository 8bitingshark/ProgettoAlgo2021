package ProgettoAlgo2021;

import ProgettoAlgo2021.FirstProjet.*;
import ProgettoAlgo2021.Utils.IOUtils;
import ProgettoAlgo2021.Utils.TestingUtils;

class Main {

    public static void main(String[] args) {

        //Here it is possible to choose what algorithm will be used for calculating the period
        Period p = new PeriodSmart();

        //Get input string from System.in and print the minimal fractionary period of the given string
        IOUtils.RunIOFunction((s) -> {
            return ((Integer)p.minimalFractionaryPeriod(s)).toString();
        });

        double[][] naive = PeriodPerformance.BetterGetTimes(new PeriodNaive(), (int l) -> TestingUtils.GenerateStrings(1, new char[]{'a','b','c'}, l)[0], 100, 1000, 500000, 20);
        IOUtils.saveAsCSV(naive, "random naive test");

        double[][] smart = PeriodPerformance.BetterGetTimes(new PeriodSmart(), (int l) -> TestingUtils.GenerateStrings(1, new char[]{'a','b','c'}, l)[0], 100, 1000, 500000, 20);
        IOUtils.saveAsCSV(smart, "random smart test");

        double[][] wNaive = PeriodPerformance.BetterGetTimes(new PeriodNaive(), (int l) -> TestingUtils.GenerateWorstCaseNaive(l), 100, 1000, 500000, 5);
        IOUtils.saveAsCSV(wNaive, "worst for naive naive test");

        double[][] wSmart = PeriodPerformance.BetterGetTimes(new PeriodSmart(), (int l) -> TestingUtils.GenerateWorstCaseNaive(l), 100, 1000, 500000, 5);
        IOUtils.saveAsCSV(wSmart, "worst for naive smart test");

    }

}
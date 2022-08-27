package BasicArithmetic;

import java.util.ArrayList;

public class DoStatistics {
    public static void calcSumAndCountAllNumbersDivBy_2_Or_7(int maximum){
        ArrayList<Integer> divisibleBy2 = new ArrayList<>();
        ArrayList<Integer> divisibleBy7 = new ArrayList<>();
        int amountDivisible = 0;
        for (int i = 0; i < maximum; i++){
            if (i % 2 == 0){
                divisibleBy2.add(i);
            }
            if (i % 7 == 0){
                divisibleBy7.add(i);
            }
        }
        amountDivisible = divisibleBy2.size() + divisibleBy7.size();
        int sumOfDivisible = 0;
        for (var number :
                divisibleBy2) {
            amountDivisible += number;
        }
        for (var number :
                divisibleBy7) {
            amountDivisible += number;
        }

        System.out.println("Total divisible were " + amountDivisible + " and sum of divisible were " + sumOfDivisible);
    }
}

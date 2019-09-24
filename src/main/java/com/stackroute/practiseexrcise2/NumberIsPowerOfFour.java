package com.stackroute.practiseexrcise2;

public class NumberIsPowerOfFour {
    public static boolean numberIsPowerOfFour(int n) {
        int x= (int)(Math.log(n) /Math.log(4));
        double q= (Math.log(n) /Math.log(4));
        if ((q-x)==0){
            return true;
        }
        return false;

    }
}

package com.stackroute.practiseexrcise2;

import java.util.ArrayList;
import java.util.List;

public class IntAndLongFactorial {

    public static int factorial(int n) {
        int fact= 1;
        if (n==0){
            return 1;
        }
        while (fact< Integer.MAX_VALUE && fact>0) {
            for (int i=1; i<=n; i++){
                fact= fact* i;
            }
            return fact;
        }
        return -1;
    }
    public static long longFactorial(int n) {
        long fact= 1;
        if (n==0){
            return 1;
        }
        while (fact< Integer.MAX_VALUE && fact>0) {
            for (int i=1; i<=n; i++){
                fact= fact* i;
            }
            return fact;
        }
        return -1;
    }

    public static  void main(String[] args) {
        int int_limit=1;
        int[] arr= new int[20];
        for(int i=0; i<20; i++){
            arr[i]= factorial(i);
        }
        for(int i=1; i<20; i++){
            if(arr[i]/ arr[i-1] != i){
                System.out.println(i);
                int_limit= i-1;
                break;
            }
        }
        int long_limit=1;
        long[] lrr= new long[30];
        for(int i=0; i<30; i++){
            lrr[i]= longFactorial(i);
        }
        for(int i=1; i<30; i++){
            if(lrr[i]/ lrr[i-1] != i){
                System.out.println(i);
                long_limit= i-1;
                break;
            }
        }
        for(int i=0;i<=int_limit;i++){
            System.out.println("The factorial of "+i+" is "+arr[i]);
        }
        for(int i=0;i<=long_limit;i++){
            System.out.println("The factorial of "+i+" is "+lrr[i]);
        }

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(int_limit);
        System.out.println(long_limit);

    }
}

package com.stackroute.practiseexrcise2;

import java.util.Scanner;

public class AvgMinMaxOfStudents {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n= scanner.nextInt();
        int[] grades= new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Enter the grade for student"+" "+(i+1)+":");
            grades[i]= scanner.nextInt();
        }
        int min= grades[0];
        int max=0;
        double avg;
        int sum=0;
        for (int i=0; i<n; i++){
            if (max<grades[i]){
                max=grades[i];
            }
            if (min>grades[i]){
                min=grades[i];
            }
            sum+=grades[i];
        }
        avg= sum/n;
        System.out.println("The average is"+avg);
        System.out.println("The minimum is"+min);
        System.out.println("The maximum is"+max);
    }
}

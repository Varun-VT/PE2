package com.stackroute.practiseexrcise2;

import java.util.Scanner;

public class CheckPalindrome {
    public boolean palindrome()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean is_pal =false;
        String s1= new StringBuilder(s).reverse().toString();
        is_pal= s.equals(s1);
        sc.close();
        return is_pal;

    }
}

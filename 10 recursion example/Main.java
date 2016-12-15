package ru.itis.kpfu.group11601.utibaeva;

import java.util.Scanner;

public class Main {

    private static int digitSumRec(int n) {
        if (n > 0) {
            return n % 10 + digitSumRec(n / 10);
        }
        else {
            return 0;
        }
    }

    private static int digitSum(int n) {
        int s = 0;
        while (n > 0) {
            s = s + n % 10;
            n = n / 10;
        }
        return s;
    }


    public static void main(String[] args) {
        int n = 12345;
        int s = digitSum(n);
        int s2 = digitSumRec(n);
        System.out.println(s);
        System.out.println(s2);
    }


}
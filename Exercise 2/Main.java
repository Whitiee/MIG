package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution s = new Solution();
        int A = -1, B = -1, K = -1;
        while (A < 0 || A > 2000000000){
            System.out.print("A: ");
            while (!scan.hasNextInt())
                scan.next();
            A = scan.nextInt();
        }
        while (B < 0 || B > 2000000000 || B < A){
            System.out.print("B: ");
            while (!scan.hasNextInt())
                scan.next();
            B = scan.nextInt();
        }
        while (K < 1 || K > 2000000000){
            System.out.print("K: ");
            while (!scan.hasNextInt())
                scan.next();
            K = scan.nextInt();
        }
        System.out.println(s.solution(A, B, K));
    }
}

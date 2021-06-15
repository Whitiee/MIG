package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution s = new Solution();
        System.out.print("N: ");
        while (!scan.hasNextInt())
            scan.next();
        int N = scan.nextInt();
        System.out.println(s.solution(N));

    }
}

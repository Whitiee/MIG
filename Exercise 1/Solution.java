package com.company;

import static java.lang.Math.abs;

public class Solution {

    public int solution(int N){
        String n = String.valueOf(abs(N));
        String[] digits = n.split("");
        boolean isDone[] = new boolean[10];
        int counter = 0, digit;
        for (int i = 0; i < digits.length; i++) {
            digit = Integer.valueOf(digits[i]);
            if(!isDone[digit])
                isDone[digit] = true;
        }
        for (int i = 0; i < 10; i++){
            if(isDone[i])
                counter++;
        }
        return counter;
    }
}

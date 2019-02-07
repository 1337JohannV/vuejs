package com.vuejs.vuejs.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class FibonacciCalc {

    /**
     * Find the n-th number of the sequence.
     */

    public String calculate(String n) {

        int num = Integer.parseInt(n);

        BigInteger answer = BigInteger.valueOf(0);
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);

        if (num == 0) {
            return "0";
        }
        if (num == 1 || num == 2) {
            return "1";
        }

        for (int i = 2; i < num; i++) {

            answer = a.add(b);
            a = b;
            b = answer;

        }

        return String.valueOf(answer);

    }

}

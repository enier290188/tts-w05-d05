package com.tts.lab.pet;

import java.lang.Math;
import java.math.BigInteger;

public class MagicCalculator extends Calculator {
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double sin(double num) {
        return Math.sin(num);
    }

    public double cos(double num) {
        return Math.cos(num);
    }

    public double tan(double num) {
        return Math.tan(num);
    }

    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

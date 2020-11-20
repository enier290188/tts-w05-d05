package com.tts.lab.prime;

/*
    Challenge 1:
    Write a Java program to print out all the prime numbers between 1 and 100.

    Challenge 2:
    Students who enter college in a year that is a prime number and graduate, four years later, in a year that is also a prime number are considered in a Prime Class.
    For example, the class of 1997 is a Prime Class as both 1993 and 1997 are prime numbers.
    Write a program to compute and print out all the prime classes between 1900 and 2100.

    Required: Write and use a method **isPrime()** to tell if a number is prime or not.
 */

public class Prime {
    public static void main(String[] args) {
        printPrimeNumbers(1900, 2100);
    }

    public static void printPrimeNumbers(int startNumber, int endNumber) {
        System.out.println();
        System.out.println("Prime numbers from " + startNumber + " to " + endNumber + " are:");
        System.out.printf("%10s %10s %n", "Position", "Prime");
        if (startNumber < 2) {
            startNumber = 2;
        }
        int counter = 0;
        for (int number = startNumber; number <= endNumber; number++) {
            if (isPrime(number)) {
                counter++;
                System.out.printf("%10d: %10d %n", counter, number);
            }
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

package com.company;

import java.util.Scanner;

public class Prime_T {

    /**
     *
     * PRIME_T - Liczby Pierwsze
     *
     * Sprawdź, które spośród danych liczb są liczbami pierwszymi
     * Input
     *
     * n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]
     * Output
     *
     * Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.
     * Example
     *
     * Input:
     * 3
     * 11
     * 1
     * 4
     *
     * Output:
     * TAK
     * NIE
     * NIE
     *
     */

    public void prime_T(){
        int n = 10001;

        String[] isPrime = new String[n];

        for (int i = 0; i < n; i++) {
            isPrime[i] = "TAK";
        }

        isPrime[0] = "NIE";
        isPrime[1] = "NIE";

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i].equals("TAK")) {
                for (int j = i + i; j < n; j = j + i) {
                    isPrime[j] = "NIE";
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int ileTestow = sc.nextInt();


        for (int i = 0; i < ileTestow; i++) {

            int checkIfPrime = sc.nextInt();

            if (isPrime[checkIfPrime].equals("TAK")) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

}

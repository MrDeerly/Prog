package Uebungsblatt2;

import java.math.BigInteger;
import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        // BigInteger a = 1234567890987654321;
        //   BigInteger b = 34567890123456789;
        // System.out.println(a.multiply(b));

        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
        System.out.println((x.multiply(y)));
    }
}

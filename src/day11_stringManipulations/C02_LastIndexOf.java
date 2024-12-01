package day11_stringManipulations;

import java.security.spec.RSAOtherPrimeInfo;

public class C02_LastIndexOf {

    public static void main(String[] args) {


        String metin = "Bu java halledilecek.";

        // ilk a'nin index'i

        System.out.println(metin.indexOf('a')); // 4

        // cumlede gecen son a'nin index'i

        System.out.println(metin.lastIndexOf("a")); // 9

        // a'nin ikinci kullaniminin indexi
        System.out.println(metin.indexOf('a', metin.indexOf('a') +1)); // 6

        // a'nin sondan 2. kullaniminin indexi

        int aninsonIndexi = metin.lastIndexOf("a"); // 9
        System.out.println(metin.lastIndexOf(aninsonIndexi-1)); // 6

        // java nin ilk kullaniminin indexi

        System.out.println(metin.indexOf("java")); // 3

        // java nin son kullaniminin indexi

        System.out.println(metin.lastIndexOf("java")); // 3

        // h nin ilk kullaniminin indexi

        System.out.println(metin.indexOf("h")); // 8

        // h nin son kullaniminin indexi

        System.out.println(metin.lastIndexOf("h")); // 8

        // Java nin ilk kullaniminin indexi
        System.out.println(metin.indexOf("Java")); // -1

        // Java nin son kullaniminin indexi
        System.out.println(metin.lastIndexOf("Java")); // -1






    }
}

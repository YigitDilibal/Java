package day10_stringManipulations;

public class C04_substring_ikiParametre {

    public static void main(String[] args) {


        /*
        Java'da genel olarak
        baslangic indexleri dahil (inclusive)
        bitis index'leri haric (exlusive)dir.
         */

        String str = "Java candir";

        System.out.println(str.substring(2, 8)); // va can

        System.out.println(str.substring(5,9)); // cand

        // bastan n t ane karakteri yazdirmak icin index olarak (0,n) yazabiliriz.

        System.out.println(str.substring(0, 7)); // Java ca

        System.out.println(str.substring(0,3)); // Jav

        System.out.println(str.substring(1,2)); // a 1. indexteki karakter
        System.out.println(str.substring(0,1)); // J 0. indexteki karakter

        System.out.println(str.substring(7,8).toUpperCase()); // N 7. indexteki karakter String
        System.out.println(Character.toUpperCase(str.charAt(7))); // N char

        // biri String biri char getirir.

        System.out.println(str.substring(2, 2)); //bos satir (hiclik)
        System.out.println("deneme");

        // System.out.println(str.substring(5, 2));
        // StringIndexOutOfBoundsException: begin 5 end 2
    }

}

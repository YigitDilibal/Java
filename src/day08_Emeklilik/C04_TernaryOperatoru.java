package day08_Emeklilik;

import java.util.Scanner;

public class C04_TernaryOperatoru {

    public static void main(String[] args) {

        //kullanicidan pozitif bir tam sayi isteyin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz..");
        int sayi = scanner.nextInt();




        // sayinin tek veya cift oldugunu yazdirin

        if (sayi%2==0){
            System.out.println("Sayi cift");
        }else {
            System.out.println("Sayi tek");
        }


        // ternary ile
        System.out.println( sayi%2==0 ? "Sayi Cift" : "Sayi tek"  );


        // sayinin 3 basamakli bir pozitif sayi olup olmadigini yazdirin

        if (sayi>=100 & sayi<1000){
            System.out.println("Sayi 3 basamakli pozitif bir sayi");
        } else {
            System.out.println("Sayi 3 basamakli pozitif bir sayi degil");
        }

        // ternary ile
        System.out.println( sayi>=100 & sayi<1000 ? "Sayi 3 basamakli pozitif bir sayi" : "Sayi 3 basamakli pozitif bir sayi degil" );



    }
}

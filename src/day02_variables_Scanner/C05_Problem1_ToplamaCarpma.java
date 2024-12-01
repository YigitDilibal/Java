package day02_variables_Scanner;

import java.util.Scanner;

public class C05_Problem1_ToplamaCarpma {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen once ondalikli bir sayi, ardindan tam bir sayi yazin");

        double ondalikliSayi = scanner.nextDouble();
        int tamSayi = scanner.nextInt();


        System.out.println("Girdiginiz sayilarin toplami : " + (tamSayi+ondalikliSayi)  );
        System.out.println("Girdiginiz sayilarin carpimi : " + (tamSayi*ondalikliSayi)   );





    }
}

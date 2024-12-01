package day06_ifStatements;

import java.util.Scanner;

public class C04_eskenarUcgen {

    public static void main(String[] args) {

 // kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise "Eskenar Ucgen" yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini sirasiyla yaziniz..");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 & kenar1 == kenar3){
            System.out.println("Eskenar Ucgen");
        }

    }
}

package _KendiCozdugumProblemler;

import java.util.Scanner;

public class Problem2_VariableAndScanner {

    // Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen daire'nin yaricapini giriniz..");
        double yariCap = scanner.nextDouble();

        System.out.println("Yari capi "+yariCap+" olan bir dairenin cevresi: " + (2*Math.PI*yariCap));
        System.out.println("Yari capi "+yariCap+" olan bir dairenin alani : " + (Math.PI*yariCap*yariCap));

    }




}

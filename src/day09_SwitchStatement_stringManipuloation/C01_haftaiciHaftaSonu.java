package day09_SwitchStatement_stringManipuloation;

import java.util.Scanner;

public class C01_haftaiciHaftaSonu {

    public static void main(String[] args) {

        // kullanicidan gun numarasini alin.
        // girilen gun numarasi haftaici ise
        // haftasonuna kadar kalan gunleri yazdirin.
        // en sonuna "vee haftasonu" yazdirin
        // girilen gun hafta sonu ise
        // "bugun haftasonu yan geeel yat" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini yaziniz.. (1-7)");
        int gun = scanner.nextInt();


        switch (gun) {

            case 1:
                System.out.println("Pazartesi");
            case 2:
                System.out.println("Sali");
            case 3:
                System.out.println("Carsamba");
            case 4:
                System.out.println("Persembe");
            case 5:
                System.out.println("Cuma");
                System.out.println("veee haftasonu");
                break;
            case 6:
            case 7:
                System.out.println("bugun haftasonu yan geeel yat");
                break;

            default:
                System.out.println("Girilen gun numarasi 1-7 arasinda olmalidir..");

        }




    }
}

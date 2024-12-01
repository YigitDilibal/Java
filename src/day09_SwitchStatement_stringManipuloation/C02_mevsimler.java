package day09_SwitchStatement_stringManipuloation;

import java.util.Scanner;

public class C02_mevsimler {

    public static void main(String[] args) {

        // kullanicidan ay numarasini alin.
        // 12,1,2. aylar icin kis
        // 3,4,5. aylar icin ilkbahar
        // 6 7 8 icin yaz
        // 9 10 11 icin sonbahar

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ay numarasini yaziniz.. (1-12)");
        int ay = scanner.nextInt();


        switch (ay){
            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("lutfen gecerli ay numarasi giriniz..");
        }



    }
}

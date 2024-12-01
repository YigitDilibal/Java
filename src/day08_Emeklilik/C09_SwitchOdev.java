package day08_Emeklilik;

import java.util.Scanner;

public class C09_SwitchOdev {

    public static void main(String[] args) {

        // kullanicidan bir rakam isteyin
        // kullanicinin rakam olarak girdigi degeri metin olarka yazdirin
        // orn : kullanici 7'ye basarsa "girilen rakam : yedi" yazdirin

        /*
        Switch statements
        olasi durum sayisi cok oldugunda if, else if, ... yerine tercih edilir

        switch statement, verilen degere uygun case'den baslar
        break gorunceye veya switch statement bitinceye kadar calisir.

        switch statement da case olarak deger yazilmalidir
        ama bu deger || veya && gibi operatorler icermemelidir.

        eger birlestirmemiz gereken case'ler olursa
        break'i kullanarak gruplayabiliriz.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz..");
        int rakam = scanner.nextInt();

        if (rakam == 0) {System.out.println("Sifir");
        } else if (rakam == 1) {System.out.println("Bir");
        } else if (rakam == 2) {System.out.println("iki");
        } else if (rakam == 3) {System.out.println("uc");
        } else if (rakam == 4) {System.out.println("dort");
        } else if (rakam == 5) {System.out.println("bes");
        } else if (rakam == 6) {System.out.println("alti");
        } else if (rakam == 7) {System.out.println("yedi");
        } else if (rakam == 8) {System.out.println("sekiz");
        } else if (rakam == 9) {System.out.println("dokuz");
        } else System.out.println( rakam + " Bir rakam degildir.10 tane rakam vardır: 0-9.");


        switch (rakam){

            case 0: System.out.println("Sifir"); break;
            case 1: System.out.println("Bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("uc"); break;
            case 4: System.out.println("dort"); break;
            case 5: System.out.println("bes"); break;
            case 6: System.out.println("alti"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz"); break;
            case 9: System.out.println("dokuz"); break;
            default: System.out.println( rakam + " Bir rakam degildir.10 tane rakam vardır: 0-9.");

        }






    }
}

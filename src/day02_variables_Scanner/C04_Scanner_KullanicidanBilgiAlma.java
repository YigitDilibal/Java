package day02_variables_Scanner;

import java.util.Scanner;

public class C04_Scanner_KullanicidanBilgiAlma {

    public static void main(String[] args) {

        // kullanicidan ismini isteyip
        // girilen ismi buyuk harflerle yazdirin


        // 1. adim Scanner olusturma
        Scanner scanner = new Scanner(System.in);

        // 2. adim : Kullaniciya ne istdigimizi soyleme

        System.out.println("Lutfen isminizi giriniz..");

        // 3. adim : Uygun method kullanarak, kullanicinin girdigi degeri alip
        //           bilginin icerigine uygun bir variable'a kaydetme

        // scanner.next() sadece ilk kelimeyi alir scanner.nextLine() tamamini alir.

        String girilenIsim = scanner.nextLine();
        // String girilenIsim = scanner.nextInt();


        System.out.println("Girilen ismin buyuk harflerle yazilmis hali : " + girilenIsim.toUpperCase());








    }
}

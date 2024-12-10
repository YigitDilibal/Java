package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        //kullanicidan iki sayi alin
        // birinci sayiyi ikinci sayiya bolup
        // bolum sonucunun tam sayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz");

        int sayi1 = 0;
        int sayi2 = 0;
        try {
            /*
                 try blogu: rislki kodlarin oldugu bolumdur
                            Java'ya bu kodlari calistirmaya gayret et
                            sorun olursa biz halledecegiz diyoruz
             */
            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                System.out.println("2. sayi 0 olamaz");
            }else {
                System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
            }

        } catch (InputMismatchException e) {

            /*
                catch (InputMismatchException e)
                Eger try bolumundeki kodlari calistirirken
                InputMismatchException olusursa
                bu bolum o exceptionu yakalar
                ve e objesine kaydeder
             */

            /*
                catch blogu { } arasindaki bolum
                exception yakalandiginda yapmak istediginiz islem
             */

            System.out.println("Tamsayi girmelisiniz.");



        }



        // String str = 5; // CTE





    }
}

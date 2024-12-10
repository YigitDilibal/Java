package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_CatchBlogundakiEninGorevi {

    public static void main(String[] args) {

        /*
               Try bolumunde bir exception olusursa
               o exception yakalanip kontrol altina alinincaya kadar
               Java butun kodlari ignore eder

               Catch blogunda exception yakalanirsa
               parantez icerisindeki e objesine exception'i kaydeder
               ve hayat normale doner

               Catch blogu hata kontrol altina alindiktan sonra
               ne yapmak isterseniz o kodlari yazacaginiz yerdir.
               sadece bir uyari yapabilecegimiz gibi
               tamamen farkli bir kod da yazilabilir
               bu bize verilen goreve baglidir

               Hata mesaji verirken
               isterseniz kendi hata mesajinizi yazabilirsiniz
               ya da e objesini kullanarak hazir hata mesajlari da verebilirsiniz.

               ornegin e.printStackTrace();
               tum hata kodlarini yazdirir
               boylece hem tum hata kodlarini yazdirip
               hem de kodu normal calistirmaya devam edebiliriz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz");

        int sayi1 = 0;
        int sayi2 = 0;
        try {

            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                System.out.println("2. sayi 0 olamaz");
            }else {
                System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
            }

        } catch (InputMismatchException e) {

            System.out.println("Tamsayi girmelisiniz.");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();


        }








    }
}

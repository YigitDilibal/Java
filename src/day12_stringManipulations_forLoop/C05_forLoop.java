package day12_stringManipulations_forLoop;

public class C05_forLoop {

    public static void main(String[] args) {


        // 1'den 10 a kadar (sinirlar dahil) olan sayilari yan yana
        // aralarinda bir bosluk birakarak yazdirin.

        System.out.println("1 2 3 4 5 6 7 8 9 10");

        int toplam = 0;

        // 2 basamakli pozitif tam sayilari yan yana
        // aralarinda bir bosluk birakarak yazdirin.

        for (int i = 10; i < 100 ; i++) {
            //int i = 10 ile bir variable olusturulmus olur
            // i < 100 olusturulan i variable'i bu sarti sagladikca loop devam eder
            // i++ her loop tekrarinda i nasil degisecek

            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 100; i > 10 ; i--) {

            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 1220; i < 1445 ; i++) {

            toplam += i;

        }

        System.out.println(toplam);

        System.out.println("");

        for (int i = 100; i <= 250 ; i+=5) {
            System.out.print(i + " ");

        }

        System.out.println("");

        for (int i = 100; i <= 250 ; i+=17) {
            System.out.print(i + " ");

        }

        System.out.println("");

        // 100 den baslayarak 3'er 3'er geriye dogru gidip
        // pozitif sayilari yazin


        for (int i = 100; i > 0 ; i-=3) {

            System.out.print(i + " ");
        }

        System.out.println("");

        // 3 basamakli sayilardan 137 ile bolunebilenleri yazdirin

        for (int i = 100; i < 1000 ; i++) {

            if (i % 137 == 0){
                System.out.print(i + " ");
            }

        }

        System.out.println("");

        for (int i = 23457; i < 29854 ; i++) {

            if (i % 113 == 0){
                System.out.print(i + " ");
            }

        }



    }
}

package day12_stringManipulations_forLoop;

public class C06_DikkatEdilecekler {

    public static void main(String[] args) {

        // 1- sonucla ilgili yazdirma islemi vb. loop icerisine yazilmamali

        // 3 basamakli sayilardan 17 ile bolunebilenlerin toplamini yazdirin

        int toplam = 0;

        for (int i = 100; i < 1000 ; i++) {

            if (i%17==0){
                toplam+=i;
            }
        }


        System.out.println("3 basamakli sayilardan 17 ile bolunebilenlerin toplami: " + toplam);

        // 2- Eger i'nin ilk degeri bile devam sartini saglamiyorsa
        // loop calismis olur ama loop hic devreye girmez

        for (int i = 10; i < 0; i++) {

            System.out.println("Yasasin "+ i);

        }

        // 3- eger i'nin tum degerleri icin devam sarti true olursa
        // teknik olarak sonsuz loop olustu deriz

        for (int i = 10; i > 0; i++) {

            System.out.println("Yasasin "+ i);

        }





    }
}

package day15_methodOlusturmaVeKullanma;

public class C05_faktoriyelDondur {

    public static void main(String[] args) {

        //verilen 17'den kucuk pozitif bir tamsayinin
        //faktoriyel degerini donduren bir method olusturun

        faktoriyelDondur(6);

        // method calisir ama yazdirmadigimiz ve kaydetmedigimiz icin bi ise yaramaz

        System.out.println(faktoriyelDondur(5)); // 120

        long faktoriyel7 = faktoriyelDondur(7);

        System.out.println(faktoriyel7); // 5040


    }

    public static long faktoriyelDondur (int sayi){
        long carpim = 1;

        for (int i = sayi; i >=1 ; i--) {

            carpim *= i;

        }

        return carpim;
    }
}

package day19_arrays;

public class C04_PozitifSayilariToplama {

    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu yazdirin

        int[] sayilar = {3,5,6,7,8,9,6,-5,4,6,3,4,-3,4,6,-7,6,0};

        System.out.println(pozitifSayilariTopla(sayilar));

        // // Verilen bir array'deki pozitif tamsayilari toplayip
        //// sonucu yazdiran bir method olusturun




    }

    public static int pozitifSayilariTopla(int[] sayilar){

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]<=0){

            }else {
                toplam+=sayilar[i];
            }

        }

        return toplam;

    }

}

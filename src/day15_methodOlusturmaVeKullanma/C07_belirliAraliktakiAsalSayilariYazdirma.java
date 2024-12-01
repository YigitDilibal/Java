package day15_methodOlusturmaVeKullanma;

public class C07_belirliAraliktakiAsalSayilariYazdirma {

    public static void main(String[] args) {

        // 3 basamakli asal sayilari yazdirin

        for (int i = 100; i < 1000; i++) {

            if (C06_isAsal.isAsal(i) == true){
                System.out.print(i + " ");
            }



        }


    }
}

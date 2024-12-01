package day15_methodOlusturmaVeKullanma;

public class C06_isAsal {

    public static void main(String[] args) {


        System.out.println(isAsal(2)); // true

        System.out.println(isAsal(4)); // false


    }





    public static boolean isAsal(int sayi){


        boolean sonuc = true;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                sonuc = false;
                break;
            }

            if (i == sayi-1){
                sonuc = true;
            }
        }
        return sonuc;

    }






}

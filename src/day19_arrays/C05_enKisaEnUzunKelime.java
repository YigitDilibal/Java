package day19_arrays;

public class C05_enKisaEnUzunKelime {

    public static void main(String[] args) {

        String[] isimler = {"Nihad", "Sumeyra","Yigit","Tugba","Ali"};

        enUzunEnKisaKelimeler(isimler);
    }

    public static void enUzunEnKisaKelimeler(String[] isimler){

        String enKisa= isimler[0];
        String enUzun= isimler[0];


        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].length()<enKisa.length()){

                enKisa=isimler[i];
            }

            if (isimler[i].length()>enUzun.length()){

                enUzun=isimler[i];
            }

        }

        System.out.println("En kisa isim: " + enKisa);
        System.out.println("En uzun isim: " + enUzun);

    }
}

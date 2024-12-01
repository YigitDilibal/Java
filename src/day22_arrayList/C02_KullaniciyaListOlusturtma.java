package day22_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullaniciyaListOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(listeOlustur());


    }

    public static List<String> listeOlustur(){
        Scanner scanner = new Scanner(System.in);
        List<String> isimList = new ArrayList<>();
        String girilenIsim = "";

        while ( ! girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Lusteye eklemek icin bir isim girin.\nBitirmek icin Q'ya basin.");

            girilenIsim = scanner.nextLine();

            if ( ! girilenIsim.equalsIgnoreCase("q")){
                isimList.add(girilenIsim);
            }

        }

        return isimList;


    }

}

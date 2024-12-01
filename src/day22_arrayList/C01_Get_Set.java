package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Get_Set {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,4,5,6,7,7,54,3,3,6));

        // sayilar listesindeki tum sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam += sayilar.get(i);
            
        }

        System.out.println(toplam); // 97


        // sayilar arrayindeki 2. ve 5. elementlerin carpimini yazdirin

        System.out.println(sayilar.get(2)* sayilar.get(5)); // 35

        // sayilar listesindeki 4 ve 5in arasina 13 ekleyin

        sayilar.add(2,13);

        System.out.println(sayilar); // [2, 4, 13, 5, 6, 7, 7, 54, 3, 3, 6]

        // 5. indextexi elementi 20 yapin

        sayilar.set(5,20);

        System.out.println(sayilar);

        /*
        add() araya elemen ekler,
        eklenen elemandan sonraki elementler bir geriye kaydirilir
        ve list'in uzunlugu 1 artar

        set() var olan bir elementi update eder
        yeni element eklemedigi icin listenin uzunlugu degismez.
         */



    }

}

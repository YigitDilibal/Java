package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.util.*;

public class C03_KullanimSayilari {

    public static void main(String[] args) {

        // Verilen harfler listesinde
        // herbir harfi ve kacar defa kullanildigini bir map olarak yazdirin
        List<String> harfler = new ArrayList<>(Arrays.asList("a", "b", "b", "z", "k", "z", "k", "b", "k"));
        // a=1, b=3, z=2, k=3

        Map<String,Integer> kullanimSayilariMap = new TreeMap<>();

        for (String each: harfler){

            kullanimSayilariMap.computeIfPresent(each, (k,v) -> v+1);
            kullanimSayilariMap.computeIfAbsent(each,v-> 1);

        }

        System.out.println(kullanimSayilariMap);



    }


}

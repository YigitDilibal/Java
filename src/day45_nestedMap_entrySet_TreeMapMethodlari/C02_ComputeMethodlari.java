package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C02_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",34);
        harfler.put("T",25);
        harfler.put("L",15);
        harfler.put("S",97);
        harfler.put("E",20);

        System.out.println(harfler);

        // E'nin degerini 10 artirin
        harfler.replace("E",harfler.get("E")+10);
        System.out.println(harfler.get("E"));

        // map'de K varsa degerini 2 katina cikarin

        if (harfler.containsKey("K")){
            harfler.replace("K",harfler.get("K")*2);
        }

        // map'de L varsa degerini 2 katina cikarin

        if (harfler.containsKey("L")){
            harfler.replace("L",harfler.get("L")*2);
        }
        System.out.println(harfler);

        // map'de "H" yoksa, degeri 75 olarak map'e ekleyin

        if (!harfler.containsKey("H")){
            harfler.put("H",75);
        }

        // map'de "S" yoksa, degeri 45 olarak map'e ekleyin - Diger yontem

        harfler.putIfAbsent("S", 45);

        System.out.println(harfler);

        // Compute

        // E'nin degerini 10 arttirin.
        harfler.compute("E",(k,v) -> v+10);
        System.out.println(harfler);

        // R'nin degerini 10 arttirin.

        // harfler.compute("R", (k,v) -> v+10); NullPointerException

        // map'de K varsa degerini 2 katina cikarin

        harfler.computeIfPresent("K", (a,b) -> b*2); // K yok, calismaz

        // map'de L varsa degerini 2 katina cikarin

        harfler.computeIfPresent("L", (a,b) -> b*2);

        // map'de "C" yoksa, degeri 54 olarak map'e ekleyin

        harfler.computeIfAbsent("C", v-> 15);

        System.out.println(harfler);










    }

}

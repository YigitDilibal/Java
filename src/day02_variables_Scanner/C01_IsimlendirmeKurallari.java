package day02_variables_Scanner;

public class C01_IsimlendirmeKurallari {

    public static void main(String[] args) {
        // int declaration'dur
        int not = 34;

        // int not = 45; // Variable 'not' is already defined in the scope

        int nOt = 45;
        int nOT = 76;
        int NOT = 54;
        int Not = 21;

        System.out.println(nOT); // 76

        System.out.println(Not); // 21

        // System.out.println(NOt); // Cannot resolve symbol 'NOt'
        // Java'da variable isimleri buyuk-kucuk harf duyarlidir. Case sensitive

        int n_o_t$ = 12;
        // int n#o%t = 32;
        // int n o t = 24;

        int not1 = 65;
        // int 1not = 54;
        int _not = 37; // tavsiye edilmez
        int $d = 10;
        System.out.println($d);

        System.out.println(_not);

        // int int = 5;
        // int class = 55;

        // camelCase kullanmak lazim, ilk kelime kucuk baslar sonraki kelimeler buyuk harfle baslar.

        int notOrtalamasi = 45;
        char isminIlkHarfi = 'd';





    }
}

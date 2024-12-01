package day09_SwitchStatement_stringManipuloation;

public class C04_charAt {

    public static void main(String[] args) {


        String str = "Java guzeldir";

        // charAt(index) : verilen index'deki karakteri getirir
        // index'in 0'dan basladigini unutmamak gerekir.

        System.out.println(str.charAt(3)); // a

        //strdaki 5. karakteri yazdirin
        System.out.println(str.charAt(4)); // space

        //str'da kac karakter var ? 13
        // str'daki son harfin indexi kactir ? 12

        //"Java guzeldir"
        //15. indexteki karakteri yazdirin

        // System.out.println(str.charAt(15));
        // Java hata vermez ama intellij sariya boyayarak bizi uyarir

        /*
        Java compile time'da
        variable'lerin degerlerine bakmaz
        sadece syntax acisindan atanan degerin uygun olup olmadigina bakar

        String s = 2 ;
        String k = null;
        String l = "";
        String m = "uzunkavaklaraltindayataruyumazoglu"
         */



        // str'in karakter sayisinin 13 oldugunu biliyorsak
        // son karakteri yazdirin.

        System.out.println(str.charAt(13-1));

        // sondan 4. karakteri yazdirin

        System.out.println(str.charAt(13-4));


    }
}

package day09_SwitchStatement_stringManipuloation;

public class C07_length {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        // str'in karakter sayisini yazdirin



        System.out.println(str.length()); // 30

        // str'in son karakterini yazdirin

        int sayi = str.length();
        System.out.println(str.charAt(sayi-1)); // r
        //veya
        System.out.println(str.charAt(str.length()-1)); // r

        // sondan 3. karakter

        System.out.println(str.charAt(str.length()-3)); // y

        // sondan 5. karakter

        System.out.println(str.charAt(str.length()-5)); //s

       // System.out.println(str.charAt(str.length())); // Out of bounds.

        // son harfin index inin str.length() - 1 oldugunu biliyoruz
        // bu index'den buyuk olan her index icin java IndexOutOfBounds hatasi verir.


    }
}

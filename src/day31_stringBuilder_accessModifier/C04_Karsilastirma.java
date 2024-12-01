package day31_stringBuilder_accessModifier;

public class C04_Karsilastirma {

    public static void main(String[] args) {



    StringBuilder sb1 = new StringBuilder("Ali");
    StringBuilder sb2 = new StringBuilder("Ali");

    String str = "Ali";

    // == ile karsilastirma

      //  System.out.println(sb1 == str);

        System.out.println(sb1==sb1);

        System.out.println(sb1.toString().equals(sb2.toString())); // true
        System.out.println(sb1.toString().equals(str)); // true
        StringBuilder sb = new StringBuilder(5 + 7 + "Java" + 4 + 5);
        System.out.println(sb);

        StringBuilder sb3 = new StringBuilder("Ali Veli baba");

        System.out.println(sb1.compareTo(sb3)); // -10
        System.out.println(sb3.compareTo(sb1)); // 10


    }
}

package day17_doWhileLoop_scope;

public class C06_InstanceVariablelar {

    /*
    Class level variable'larda
    ister static olsun isterse Instance olsun
    deger atama mecburiyeti yoktur

    biz deger atamazsak
    Java default degerler atayacaktir

    non primitive ==> null
    sayisal primitive ==> 0
    char ==> hiclik
    boolean ==> false

     */

    static String strS = "Hava";
    static int sayiS;
    static char chrS = 't';
    static boolean blS ;

    String strI;
    int sayiI = 45;
    char chrI ;
    boolean blI= true;

    public static void main(String[] args) {

        System.out.println(strS); // Hava
        System.out.println(sayiS); // 0
        System.out.println(chrS); // t
        System.out.println(blS); // false

        // static olmayan variable'lar static method'larda direkt kullanilamazlar
        // ancak obje olusturularak obje uzerinden kullanilabilirler
//       System.out.println(strI); // Hava
//        System.out.println(sayiI); // 0
//        System.out.println(chrI); // t
//        System.out.println(blI); // false

        C06_InstanceVariablelar obj = new C06_InstanceVariablelar();

               System.out.println(obj.strI); // null
            System.out.println(obj.sayiI); // 45
            System.out.println(obj.chrI); //
            System.out.println(obj.blI); // true
    }
}

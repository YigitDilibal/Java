package day30_dateTime_varargs;

public class C05_Varargs {

    public static void main(String[] args) {
        topla(5,7);
        topla(1,3,5);

    }

    public static void topla (int a, int b){
        System.out.println("Iki tam sayinin toplami: " + (a+b) );
    }

    public static void topla(int... a){

        int toplam = 0;
        for (int i = 0; i < a.length; i++) {
            toplam += a[i];
        }
        System.out.println("Verilen " + a.length + " adet sayinin toplami: = " + toplam);
    }


}

package day30_dateTime_varargs;

public class C06_Varargs_KodOkuma {

    public static void main(String[] args) {

        elemanYazdir("Ali", 2,3,4,5,6,7);

    }

    public static void elemanYazdir(String s, int... v){
        System.out.println(v[s.length()-1]);
    }

}

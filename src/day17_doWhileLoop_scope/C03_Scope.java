package day17_doWhileLoop_scope;

public class C03_Scope {

    String s = "Super";
    static int k = 20;
    static String ss = "Ahmet";

    public static void main(String[] args) {

        String str = "Java candir";
        System.out.println(k);
        // System.out.println(s);



    }

    public static void method1(){
       // System.out.println(str);
        int a = 10;
        k = 25;
       // System.out.println(s);
    }

    public void method2()   {

        String str = "Java candir";
        // str = "Tava";
        k=30;
        System.out.println(s);

    }

}

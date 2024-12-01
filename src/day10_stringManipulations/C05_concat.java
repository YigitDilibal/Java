package day10_stringManipulations;

public class C05_concat {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";

        System.out.println(s1.concat(s2.concat(s3)));

        int a = 3;
        int b = 4;

        // sadece variablelari kullanarak Java Candir 34 yazdirin

        System.out.println(s1.concat(s2.concat(s3.concat(s2)))+a+b);



    }
}

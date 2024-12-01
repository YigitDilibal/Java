package day31_stringBuilder_accessModifier;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 length: " + sb1.length());//0
        System.out.println("sb1 capacity: " + sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder(5);
        System.out.println("sb2 length: " + sb2.length());//0
        System.out.println("sb2 capacity: " + sb2.capacity()); // 5

        StringBuilder sb3 = new StringBuilder("Ali");
        System.out.println("sb3 length: " + sb3.length());//3
        System.out.println("sb3 capacity: " + sb3.capacity()); // 16+3= 19

        sb3.append(" Yanbatar");
        System.out.println("sb3 length: " + sb3.length());//12
        System.out.println("sb3 capacity: " + sb3.capacity()); // 19

        sb3.append(" ama geri kalkar");

        System.out.println(sb3);
        System.out.println("sb3 length: " + sb3.length());//28
        System.out.println("sb3 capacity: " + sb3.capacity()); // 19*2+2=40

        sb3.trimToSize();
        System.out.println("sb3 length: " + sb3.length());//28
        System.out.println("sb3 capacity: " + sb3.capacity()); // 28





    }
}

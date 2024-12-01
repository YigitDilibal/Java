package day31_stringBuilder_accessModifier;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ali");

        sb.append(" Can");
        sb.append(" Yataruyumaz");

        System.out.println(sb); // Ali Can Yataruyumaz

        String str = "Java candir";
        sb.append(str,4,11);

        System.out.println(sb); // Ali Can Yataruyumaz candir

        sb.deleteCharAt(20);
//        System.out.println(sb); // Ali Can Yataruyumaz andir

        sb.delete(19,25);
        System.out.println(sb); // Ali Can Yataruyumaz

        sb.insert(7,"er");
        System.out.println(sb); // Ali Caner Yataruyumaz

        sb.insert(9,str,4,5);
        System.out.println(sb); // Ali Caner  Yataruyumaz

        sb.reverse();
        System.out.println(sb);



    }
}

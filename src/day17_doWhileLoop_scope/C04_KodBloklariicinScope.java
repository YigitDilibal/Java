package day17_doWhileLoop_scope;

public class C04_KodBloklariicinScope {


    public static void main(String[] args) {

        int sayi = 10;

        /*
       Bir kod blogu icin (method, loop vb..) scope'u
       o kod blogunun suslu parantezlerinin arasidir

       Java'da bir variable'lar ise scope acisinden 2 ye ayrilir.
       1- eger bir kod blogunun icerisinde olusturulmussa
          bu variable'lara local variable denir.
          ve scope'lari (gecerli olduklari alan)
          icinde olusturulduklari kod blogudur
          ve o kod blogunun disinda KULLANILAMAZLAR


         */

        for (int i = 0; i < 10 ; i++) {

            String a = "ahmet";
            System.out.println(a);

        }

    }

}

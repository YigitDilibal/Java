package day32_encapsulation;

public class C04_Runner {

    public static void main(String[] args) {


        C04_EncapsuleDatalar obj = new C04_EncapsuleDatalar();

//        System.out.println(obj.satisTutari); // read
//        obj.satisTutari = 500; // write
//
//        System.out.println(obj.toplamSatisTutari); // read
//        obj.toplamSatisTutari = 4000; // write


        System.out.println(obj.getToplamSatisTutari());
        //  obj.getToplamSatisTutari() = 45;
        // methodCall bize deger getiriyor, deger'e atama olmaz
        // esitligin sol tarafinda sadece variable olabilir.

        obj.setSatisTutari(500);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(1000);

        // System.out.println(obj.setSatisTutari());

        System.out.println(obj.getToplamSatisTutari());


    }
}

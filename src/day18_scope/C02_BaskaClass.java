package day18_scope;

public class C02_BaskaClass {

    public static void main(String[] args) {

        // Baska class'dan methodlara ve
        // class level variable'lara ulasmak isterseniz
        // yike static keywordune dikkat etmelisiniz.

        // static olarak isaretlenen her sey
        // class'la ilintilidir ve class ismi ile kullanilabilir.

        // instance variable'lar ve
        // static olmayan methodlar
        // obje ile ilintilidir


        System.out.println(C01_Hastane.hastaneAdresi);

        C01_Hastane per1 = new C01_Hastane();
        System.out.println(per1.persAdresi);

    }

    public void test (int sayi) {

        
    }

}

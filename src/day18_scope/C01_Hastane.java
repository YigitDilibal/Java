package day18_scope;

public class C01_Hastane {


    static String hastaneIsmi ="Java Hastanesi";
    static String hastaneTel = "03122343434";
    static String hastaneAdresi = "Cankaya";
    static String basHekim = "Dr. Yusuf";

    // Personel bilgileri kisiye ozeldir
    // ve sadece o kisiyi ilgilendirir

    String persIsmi = "IsimAtanmadi";
    String persTel = "Tel atanmadi";
    String persAdresi= "Adres atanmadi";





    public static void main(String[] args) {

        System.out.println(hastaneIsmi); // Java Hastanesi
        System.out.println(hastaneTel); // 03122343434
        System.out.println(hastaneAdresi); // Cankaya
        System.out.println(basHekim); // Dr. Yusuf


        // personel bilgileri Instance olarak olusturuldu
        // yani objeye baglidir
        // obje olmadan kullanilamaz.
        // System.out.println(perIsmi);
        // System.out.println(perTel);
        // System.out.println(perAdresi);

        C01_Hastane per1 = new C01_Hastane();

        System.out.println(per1.persIsmi); // IsimAtanmadi
        System.out.println(per1.persTel); // Tel atanmadi
        System.out.println(per1.persAdresi); // Adres atanmadi

        per1.persIsmi = "ahmet";
        per1.persTel = "5365412118";
        per1.persAdresi = "Arapcesme";

        System.out.println(per1.persIsmi); // ahmet
        System.out.println(per1.persTel); // 5365412118
        System.out.println(per1.persAdresi); // Arapcesme

        C01_Hastane per2 = new C01_Hastane();

        System.out.println(per2.persIsmi); // IsimAtanmadi

        per2.persIsmi = "mehmet";

        System.out.println(per2.persIsmi); // mehmet

        per1.basHekim = "Dr. Canan";
        System.out.println(basHekim);
        System.out.println(per1.basHekim);


    }



}

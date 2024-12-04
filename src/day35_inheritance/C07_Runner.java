package day35_inheritance;

public class C07_Runner {

    public static void main(String[] args) {


    // C06_AvciKuslar class'indan bir obje olusturun

    C06_AvciKuslar avciKartal = new C06_AvciKuslar();

    avciKartal.omur(); // Grandparent => yasar ve olurler
    avciKartal.solunum();// Parent ==> akcigerle nefes alirlar
    avciKartal.cogalma();// Parent ==> yumurtayla cogalirlar
    avciKartal.kanat();// Parent ==> kanatlidirlar
    avciKartal.hareket();// Current Class ==> ucarlar
    avciKartal.beslenme();// Current Class ==> et yerler
    avciKartal.pence();//  Current Class ==> pencelidir
    avciKartal.gaga();// Current Class ==> sivri gagali
        System.out.println("===");


    C05_Kuslar kusKartal = new C06_AvciKuslar();

        kusKartal.omur(); // Grandparent => yasar ve olurler
        kusKartal.solunum();// Parent ==> akcigerle nefes alirlar
        kusKartal.cogalma();// Parent ==> yumurtayla cogalirlar
        kusKartal.kanat();// Parent ==> kanatlidirlar
        kusKartal.hareket();// Current Class ==> ucarlar
        kusKartal.beslenme();// Current Class ==> et yerler
        // kusKartal.pence();// Parent ve Grandparentte olmadigi icin kullanamaz
        kusKartal.gaga();// Current Class ==> sivri gagali
        System.out.println("===");

    C04_Hayvanlar hayvanKartal = new C06_AvciKuslar();

        hayvanKartal.omur(); // Grandparent => yasar ve olurler
        hayvanKartal.solunum();// Parent ==> akcigerle nefes alirlar
        hayvanKartal.cogalma();// Parent ==> yumurtayla cogalirlar
       // hayvanKartal.kanat();// Grandparentte olmadigi icin kullanamaz
        hayvanKartal.hareket();// Current Class ==> ucarlar
        hayvanKartal.beslenme();// Current Class ==> et yerler
       // hayvanKartal.pence();// Grandparentte olmadigi icin kullanamaz
       // hayvanKartal.gaga();// Grandparentte olmadigi icin kullanamaz
        System.out.println("===");

        // C05_Kuslar class'indan bir obje olusturun

        C05_Kuslar kus1 = new C05_Kuslar(); // <=== C05_Kuslar Classinin objesi

        kus1.omur(); // Parent => yasar ve olurler
        kus1.solunum();// Kendi Classindan ==> akcigerle nefes alirlar
        kus1.cogalma();// Kendi Classindan ==> yumurtayla cogalirlar
        kus1.kanat();// Kendi Classindan ==> kanatlidirlar
        kus1.hareket();// Parent  ==> hareket ederler
        kus1.beslenme();// Parent ==> beslenirler
        //kus1.pence();// Obje kuslar objesi oldugundan ve asagi bakamayacagindan pence hic yok
        kus1.gaga();// Kendi Classindan ==> gagalidir

        C04_Hayvanlar kusHayvani = new C05_Kuslar(); // <=== C05_Kuslar Classinin objesi

        kusHayvani.omur(); // Parent => yasar ve olurler
        kusHayvani.solunum();// Kendi Classindan ==> akcigerle nefes alirlar
        kusHayvani.cogalma();// Kendi Classindan ==> yumurtayla cogalirlar
        //kusHayvani.kanat();// Aramaya hayvanlar classindan baslar ve sadece oradaki ozellikleri veya guncel hallerini gorebilir.
        kusHayvani.hareket();// Parent  ==> hareket ederler
        kusHayvani.beslenme();// Parent ==> beslenirler
        //kusHayvani.pence();// Aramaya hayvanlar classindan baslar ve sadece oradaki ozellikleri veya guncel hallerini gorebilir.
        //kusHayvani.gaga();// Aramaya hayvanlar classindan baslar ve sadece oradaki ozellikleri veya guncel hallerini gorebilir.

        // C04_Hayvanlar Classindan bir obje olusturun

        C04_Hayvanlar hayvan1 = new C04_Hayvanlar();
        // Hem Constructor hem data type C04 oldugundan sadece oradaki bilgileri olduklari haliyle alabilir
        hayvan1.omur(); // H Yasar ve olurler
        hayvan1.solunum();// H nefes alirlar
        hayvan1.cogalma();// H cogalirlar
        // hayvan1.kanat();// Aramaya hayvanlar classindan baslar ve objesi de ayni yer oldugu icinsadece oradaki ozelliklerin o hallerini gorebilir
        hayvan1.hareket();// H haraket ederler
        hayvan1.beslenme();// H beslenirler
        //hayvan1.pence();//Aramaya hayvanlar classindan baslar ve objesi de ayni yer oldugu icinsadece oradaki ozelliklerin o hallerini gorebilir
        //hayvan1.gaga();//Aramaya hayvanlar classindan baslar ve objesi de ayni yer oldugu icinsadece oradaki ozelliklerin o hallerini gorebilir



    }
}

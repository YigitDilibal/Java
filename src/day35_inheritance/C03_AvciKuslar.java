package day35_inheritance;

public class C03_AvciKuslar extends C02_Kuslar{

    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        /*
            Bir objenin data turu olarak parent class'lar secilebilir

            Bunu child class'daki bir objenin
            parent class'in tum child'lari ile birlikte
            ortak olarak sahip oldugu ozellikleri
            gormek icin kullaniriz

            Java'da bir ozelligin variable veya method olarak olusturulmasi
            Objeler acisindan buyuk farkliliklar olusturur.

            1- Eger ozellikler variable olarak olusturulursa
            objeler DATA TURU secilen Class'daki tum objeler ile ortak ozelliklere sahip olurlar
            guncel bilgilerle ilgilenmezler.

            2- Eger ozellikler method olarak olusturulursa
            objeler DATA TURU secilen Class'daki tum objeler ile ortak ozelliklere sahip olurlar
            AMA o ozelligin daha guncel hali varsa
            guncel haline gider
         */

        //Avci kuslar class'indan bir obje olusturun

        C03_AvciKuslar avciKartal = new C03_AvciKuslar();

        System.out.println(avciKartal.omur); // Grandparent => yasar ve olurler
        System.out.println(avciKartal.solunum); // Parent ==> akcigerle nefes alirlar
        System.out.println(avciKartal.cogalma); // Parent ==> yumurtayla cogalirlar
        System.out.println(avciKartal.kanat); // Parent ==> kanatlidirlar
        System.out.println(avciKartal.hareket); // Current Class ==> ucarlar
        System.out.println(avciKartal.pence); //  Current Class ==> pencelidir
        System.out.println(avciKartal.gaga);  // Current Class ==> sivri gagali
        System.out.println(avciKartal.beslenme); // Current Class ==> et yerler
        System.out.println("===");

        C02_Kuslar kusKartal = new C03_AvciKuslar();

        System.out.println(kusKartal.solunum); // Parent ==> akcigerle nefes alirlar
        System.out.println(kusKartal.cogalma); // Parent ==> yumurtayla cogalirlar
        System.out.println(kusKartal.kanat); // Parent ==> kanatlidirlar
        System.out.println(kusKartal.gaga);  // Parent ==> gagalari vardir
        System.out.println(kusKartal.hareket); //Grandparent ==> haraket ederler
        System.out.println(kusKartal.omur); // Grandparent => yasar ve olurler
//        System.out.println(kusKartal.pence); //  Grandparent ve parentte yok, CTE verir ve kullanamaz.
        System.out.println(kusKartal.beslenme); // Grandparent ==> beslenirler
        System.out.println("===");

        C01_Hayvanlar hayvanKartal = new C03_AvciKuslar();

        System.out.println(hayvanKartal.solunum); // Grandparent ==> nefes alirlar
        System.out.println(hayvanKartal.cogalma); // Grandparent ==> cogalirlar
        System.out.println(hayvanKartal.hareket); //Grandparent ==> haraket ederler
        System.out.println(hayvanKartal.omur); // Grandparent => yasar ve olurler
        System.out.println(hayvanKartal.beslenme); // Grandparent ==> beslenirler
//        System.out.println(hayvanKartal.kanat); // Parent'da var, C01'de yani Grandparent'de yok, kullanamaz.
//        System.out.println(hayvanKartal.gaga);  // Hayvanlar Class'inda yok. CTE verir, kullanilamaz.
//        System.out.println(hayvanKartal.pence); // Hayvanlar Class'inda yok. CTE verir, kullanilamaz.
        System.out.println("===");

        // C02_Kuslar class'indan bir obje olusturun

        C02_Kuslar kus1 = new C02_Kuslar();

        System.out.println(kus1.solunum); // Parent ==> akcigerle nefes alirlar
        System.out.println(kus1.cogalma); // Parent ==> yumurtayla cogalirlar
        System.out.println(kus1.kanat); // Parent ==> kanatlidirlar
        System.out.println(kus1.gaga);  // Parent ==> gagalari vardir
        System.out.println(kus1.hareket); //Grandparent ==> haraket ederler
        System.out.println(kus1.omur); // Grandparent => yasar ve olurler
//        System.out.println(kus1.pence); //  Grandparent ve parentte yok, CTE verir ve kullanamaz.
        System.out.println(kus1.beslenme); // Grandparent ==> beslenirler
        System.out.println("===");


        C01_Hayvanlar hayvanKus = new C02_Kuslar();

        System.out.println(hayvanKus.solunum); // Grandparent ==> nefes alirlar
        System.out.println(hayvanKus.cogalma); // Grandparent ==> cogalirlar
        System.out.println(hayvanKus.hareket); //Grandparent ==> haraket ederler
        System.out.println(hayvanKus.omur); // Grandparent => yasar ve olurler
        System.out.println(hayvanKus.beslenme); // Grandparent ==> beslenirler
//        System.out.println(hayvanKus.kanat); // Parent'da var, C01'de yani Grandparent'de yok, kullanamaz.
//        System.out.println(hayvanKus.gaga);  // Hayvanlar Class'inda yok. CTE verir, kullanilamaz.
//        System.out.println(hayvanKus.pence); // Hayvanlar Class'inda yok. CTE verir, kullanilamaz.
        System.out.println("===");

       // C01_Hayvanlar Class'indan bir obje olusturun

        C01_Hayvanlar hayvan1 = new C01_Hayvanlar();

        System.out.println(hayvan1.solunum); // Grandparent ==> nefes alirlar
        System.out.println(hayvan1.cogalma); // Grandparent ==> cogalirlar
        System.out.println(hayvan1.hareket); //Grandparent ==> haraket ederler
        System.out.println(hayvan1.omur); // Grandparent => yasar ve olurler
        System.out.println(hayvan1.beslenme); // Grandparent ==> beslenirler
//        System.out.println(hayvan1.kanat); // Parent'da var, C01'de yani Grandparent'de yok, kullanamaz.
//        System.out.println(hayvan1.gaga);  // Hayvanlar Class'inda yok. CTE verir, kullanilamaz.
//        System.out.println(hayvan1.pence); // Hayvanlar Class'inda yok. CTE verir, kullanilamaz.









    }

}

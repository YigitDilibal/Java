package day27_staticKeyword_passByValue;

public class C02_HemsireRunner {

    public static void main(String[] args) {

        /*
            Bir variable'i static olarak isaretlemek
            variable'a erisimi cok kolaylastirir

            static variable'lara classIsmi.VariableIsmi
            seklinde static yolla erismek mumkun oldugu gibi

            objeIsmi.static variable ismi seklinde de erisilebilir.

         */

        C01_Hemsire hemsire1 = new C01_Hemsire();
        System.out.println(hemsire1.isim);
        System.out.println(hemsire1.hastaneIsmi); // Yildiz hastanesi
        System.out.println(C01_Hemsire.hastaneIsmi); // Yildiz hastanesi

        hemsire1.isim =  "Yildiz";
        hemsire1.adres=  "Balgat";
        hemsire1.tel  =  "5272852";

        C01_Hemsire hemsire2 = new C01_Hemsire();

        hemsire2.isim = "Tugba";
        hemsire2.adres= "Yenimahalle";
        hemsire2.hastaneAdresi = "YeniMahalle";
        hemsire2.basHekim = "Dr Yigit";

        System.out.println();

        System.out.println(hemsire1.adres);
        System.out.println(hemsire2.adres);
        System.out.println(hemsire1.hastaneAdresi);
        System.out.println(hemsire2.hastaneAdresi);

        C01_Hemsire hemsire3 = new C01_Hemsire();

        hemsire3.adres = "Altindag";
        hemsire3.hastaneAdresi = "Mamak";
        hemsire3.basHekim = "Dr Ahmet";

        System.out.println(hemsire1.adres);
        System.out.println(hemsire2.adres);
        System.out.println(hemsire3.adres);
        System.out.println(hemsire1.hastaneAdresi);
        System.out.println(hemsire2.hastaneAdresi);
        System.out.println(hemsire3.hastaneAdresi);

        // C01_Hemsire.hastaneIsmi = "Java hastanesi";
        // Cannot assign a value to final variable 'hastaneIsmi'


    }

}

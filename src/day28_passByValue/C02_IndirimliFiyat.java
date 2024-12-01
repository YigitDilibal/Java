package day28_passByValue;

public class C02_IndirimliFiyat {

    //Main method’da verilen fiyat degerine
    // %10, %20 ve %30 indirim yaparak,
    // indirimli fiyati bize döndüren 3 method olusturun.

    public static void main(String[] args) {

        int fiyat = 200;

        System.out.println(yuzde10Indirim(fiyat));


    }

    public static double yuzde10Indirim(double fiyat){

        fiyat=fiyat*90/100;
        return fiyat;
    }

}

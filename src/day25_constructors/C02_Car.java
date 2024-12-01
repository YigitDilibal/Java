package day25_constructors;

public class C02_Car {

    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    String yakit = "Yakit atanmadi";
    int yil = 1900;
    int fiyat;

    /*

    Java her class'dan obje olusturulabilmesi icin
    her class'a default bir constructor koyar

    Bu default constructor gorunmez parametresizdir
    ve bodysinde kod yoktur

    Kod yazan kisi gorunur bir constructor olusturursa
    Java default constructor'u siler

    Biz yeni costructor olusturdugumuzda
    daha once default constructor kullanarak
    olusturulan objeler CTE verir

    O zaman bir class'da gorunur parametreli bir constructor olusturdugumuzda
    daha once olusturulan objelere zarar vermemek icin
    bir tane de default constructor yerine
    parametresiz bir constructor olusturmaliyiz.
     */


    public C02_Car(){

    }

    public C02_Car(String mrk, String mdl, String ykt, int yl, int fyt) {

        marka = mrk;
        model = mdl;
        yakit = ykt;
        yil = yl;
        fiyat = fyt;

    }


    public C02_Car(String marka, String model, String yakit, int yil) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Ozellikler : " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }

}

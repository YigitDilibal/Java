package day32_encapsulation;

public class C04_EncapsuleDatalar {

    // atama yapilabilsin (write ok)
    // atanan degerler gorulemesin (read yasak)
    private int satisTutari = 100;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }

    // atama yapilamasin (write yasak)
    // deger gorulebilsin (read ok)
    private int toplamSatisTutari = 0;

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }
    // Read ve Write yetkilerini ayirmak icin
    // 1. adim access modifier ile erisimi yasaklayin
    //        (encapsule edin)

    // 2. adim : baska classlarin sadece gorebilmesini
    //          (read) istedigimiz variable'lar icin
    //           getter() olusturun

    // 3. adim : baska classlarin sadece deger atamasini
    //        (write) istedigimiz variable'lar icin
    //        setter() olusturun



}

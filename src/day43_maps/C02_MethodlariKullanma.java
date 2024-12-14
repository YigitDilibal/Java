package day43_maps;

import java.util.Map;

public class C02_MethodlariKullanma extends MapDepo{

    public static void main(String[] args) {

        // 104 numarali ogrencinin ismini yazdirin

        MapDepo.numaradanIsimYazdirma(104); // 104 numarali ogrencinin ismi : Ayse

        // 106 numarali ogrencinin isim ve soyismini yazdirin

        MapDepo.numaradanIsimSoyisimYazdirma(106); // 106 numarali ogrencinin ismi ve soyismi : Sevgi Can

        // 103 numarali ogrencinin soyismini Onal
        // 104 numarali ogrencinin soyismini Celik yapsin

        MapDepo.numaraIleSoyisimUpdateEt(103,"Onal");
        MapDepo.numaraIleSoyisimUpdateEt(104,"Celik");

        System.out.println(ogrenciMap);

        // 10. siniftaki ogrencileri yazdir

        MapDepo.sinifListesiYazdir(10);

        // MF bolumundeki ogrencileri yazdir

        MapDepo.bolumListesiOlustur("MF");

        // Ali Can isimli ogrenciyi yazdir

        MapDepo.isimVeSoyisimIleOgrenciBulma("Ali","Can");

        // Can soyisimli ogrencileri yazdir

        MapDepo.SoyisimIleOgrenciBulma("Can");






    }

}

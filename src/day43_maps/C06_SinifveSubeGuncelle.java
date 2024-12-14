package day43_maps;

public class C06_SinifveSubeGuncelle extends MapDepo {

    public static void main(String[] args) {

        // // numarasi verilen ogrencinin sinifini ve Subesini guncelleyin

        int ogrenciNo = 105;
        String yeniSube = "P";
        int yeniSinif = 11;

        String eskiValue = ogrenciMap.get(ogrenciNo);

        String[] eskiValuearr = eskiValue.split("-");

        eskiValuearr[2] = yeniSinif + "";
        eskiValuearr[3] = yeniSube;

        String yeniValue = String.join("-",eskiValuearr);

        ogrenciMap.put(ogrenciNo,yeniValue);


    }
}

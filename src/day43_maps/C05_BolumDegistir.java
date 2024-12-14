package day43_maps;

public class C05_BolumDegistir extends MapDepo {

    public static void main(String[] args) {

        // numarasi verilen ogrencinin bolumu verilen yeni bolum yapin

        int ogrenciNo = 105;
        String yeniBolum = "MF";

        String eskiValue = ogrenciMap.get(ogrenciNo);

        String[] eskiValuearr = eskiValue.split("-");

        eskiValuearr[4] = yeniBolum;

        String yeniValue = String.join("-",eskiValuearr);

        ogrenciMap.put(ogrenciNo,yeniValue);






    }

}
